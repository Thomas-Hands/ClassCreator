package classCreator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialQuiz {
	
	private static int nStudentGroups;
	private static int nClassrooms;
	private static int nTeachers;
	private static int questionNumber;
	private static FirstView theView;
	private static Teacher[] arrTeachers;
	
	public InitialQuiz() {
		// launch view and update stage
		createWindow();
		initialQuestions();
		InputTaker.progresStage();
		
}
	private void initialQuestions() {
		// Load up initial questions on a view, add listener
		theView.btnConfirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//add sanitiser
				if (!theView.inputtedText.getText().toString().equals("")) {
					theView.passedSanitation();
				
				if(questionNumber == 1) {
					nStudentGroups = Integer.parseInt(theView.inputtedText.getText().toString().toLowerCase().trim());
					updateView();
					
				}else if(questionNumber == 2) {
					nClassrooms = Integer.parseInt(theView.inputtedText.getText().toString().toLowerCase().trim());
					updateView();
				}else {
					nTeachers = Integer.parseInt(theView.inputtedText.getText().toString().toLowerCase().trim());
					updateView();
					theView.btnConfirm.removeActionListener(this);
					theView.clearView();
					theView.theFrame.dispose();
					
					InputTaker.updateInitialResults(nStudentGroups, nClassrooms, nTeachers);
					InputTaker.launchNextQuiz();
				}
				
				questionNumber++;
				theView.inputtedText.setText("");
				displayQuestion();
			}else {
				System.out.println("please fill the text box");
				theView.failedSanitation();
				
			}
		}	
		private void updateView() {
				// TODO Update the question
				if (questionNumber ==1){
					theView.nClasses.setText("Number of courses = " + nStudentGroups);
				}else if(questionNumber == 2) {
					theView.nClassrooms.setText("Number of classrooms = " + nClassrooms);
				}else {
					theView.nTeachers.setText("Number of teachers = " + nTeachers);
				}
			}
		});
	}
	private void displayQuestion() {
		// display the current question on the view
		if(questionNumber == 1) {
			theView.questionLabel.setText("INPUT N.O COURSES -->");
		}else if(questionNumber == 2) {
			theView.questionLabel.setText("INPUT N.O ROOMS -->");
		}else {
			theView.questionLabel.setText("INPUT N.O TEACHERS -->");
		}
	}
	private void createWindow() {
		// create the view
		theView = new FirstView();
		questionNumber = 1;
		displayQuestion();
	}
	private void clearFrame() {
		theView.clearView();
		theView.theFrame.dispose();
	}
}
