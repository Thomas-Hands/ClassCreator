package classCreator;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class FirstView {

	public Button btnConfirm;
	public JLabel questionLabel;
	public TextField inputtedText;
	public JLabel nTeachers;
	public JLabel nClassrooms;
	public JLabel nClasses;
	public JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	public JFrame theFrame;
	private JPanel panelOutput;
	private JPanel thePanel;
	
	
	
	public FirstView() {
		
		
		
		theFrame = new JFrame();
		thePanel = new JPanel();
		inputtedText = new TextField();
		btnConfirm = new Button();
		panelOutput = new JPanel();
		nClasses = new JLabel("Number of classes = ");
		nClassrooms = new JLabel("Number of Rooms = ");
		nTeachers = new JLabel("Number of Teachers = ");
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_3 = new JLabel("passed");
		questionLabel = new JLabel("Question Here");
		
		
		theFrame.setSize(1000, 1000);
		theFrame.getContentPane().add(thePanel);
		
		
		inputtedText.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		questionLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnConfirm.setFont(new Font("Arial Black", Font.PLAIN, 22));
		nClasses.setFont(new Font("Arial Black", Font.PLAIN, 22));
		nClassrooms.setFont(new Font("Arial Black", Font.PLAIN, 22));
		nTeachers.setFont(new Font("Arial Black", Font.PLAIN, 22));
		
		


		btnConfirm.setLabel("Press to Confirm");
		btnConfirm.setBackground(Color.YELLOW);
		thePanel.setLayout(new GridLayout(2, 3, 0, 0));
		panelOutput.setLayout(new GridLayout(3, 1, 0, 0));
		questionLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		nClasses.setBorder(new LineBorder(new Color(0, 0, 0)));
		nClassrooms.setBorder(new LineBorder(new Color(0, 0, 0)));
		nTeachers.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel_3.setBackground(Color.ORANGE);
		btnConfirm.setBackground(Color.YELLOW);
		
		
		thePanel.add(questionLabel);
		thePanel.add(inputtedText);
		thePanel.add(btnConfirm);
		thePanel.add(panelOutput);
		panelOutput.add(nClasses);
		panelOutput.add(nClassrooms);
		panelOutput.add(nTeachers);
		thePanel.add(lblNewLabel_2);
		thePanel.add(lblNewLabel_3);

		
		
		
		theFrame.setVisible(true);
		thePanel.setVisible(true);
	}
	
	
	
	public void failedSanitation() {
		lblNewLabel_3.setBackground(Color.RED);
		lblNewLabel_3.setText("Failed, please fill box");
	}
	public void passedSanitation() {
		lblNewLabel_3.setBackground(Color.GREEN);
		lblNewLabel_3.setText("Passed");
	}
	public void clearView(){
		lblNewLabel_3.setText("");
		questionLabel.setText("");
		inputtedText.setText("");
		nTeachers.setText("");
		nClassrooms.setText("");
		nClasses.setText("");
		
	}

}
