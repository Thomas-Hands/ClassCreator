package classCreator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputTaker {

	
	private static int nStudentGroups;
	private static int nClassrooms;
	private static int nTeachers;
	private static Teacher[] arrTeachers;
	private static String stage;
	
	
	public InputTaker() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stage = "initial";
		launchNextQuiz();
		
	}
	public static void progresStage() {
		// move to the next stage
		if(stage.equals("initial")) {
			stage = "teacher";
		}else if(stage.equals("teacher")) {
			stage = "idk";
		}
	}

	public static void updateInitialResults(int studGrp, int classrooms, int teachers) {
		// Update variables from initial questions
		nStudentGroups = studGrp;
		nClassrooms = classrooms;
		nTeachers = teachers;
		arrTeachers = new Teacher[nTeachers];
	}

	public static void launchNextQuiz() {
		// Decide which questions to launch
		if(stage.equals("initial")) {
			launchInitialQuiz();
		}else if(stage.equals("teacher")) {
			launchTeacherQuiz();
		}
	}

	private static void launchInitialQuiz() {
		// Load up initial questions
		InitialQuiz firstQuiz = new InitialQuiz();
	}

	private static void launchTeacherQuiz() {
		// Load up questions on a view about the teachers
		System.out.print("teacherQuiz, nStudGroups = "+nStudentGroups + " nClassrooms = "+nClassrooms+ " nTeachers = "+ nTeachers);
		
	}


	

}
