import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {

	public calculator(){

		JFrame frame = new JFrame();
		frame.setSize(800,800);
		frame.setTitle("Calculator Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// Build the Panel for the buttons.	
		
		JPanel panel;
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));
		
		// Build the buttons for the Calculator.
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("+");
		JButton b5 = new JButton("4");
		JButton b6 = new JButton("5");
		JButton b7 = new JButton("6");
		JButton b8 = new JButton("-");
		JButton b9 = new JButton("7");
		JButton b10 = new JButton("8");
		JButton b11 = new JButton("9");
		JButton b12 = new JButton("*");
		JButton b13 = new JButton("0");
		JButton b14 = new JButton("/");
		JButton b15 = new JButton(".");
		JButton b16 = new JButton("=");
		
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		
		// Build the Text Display.
		JTextField text1 = new JTextField(800);
		
		// Add everything to the frame.
		frame.add(text1,BorderLayout.NORTH);
		frame.add(panel, BorderLayout.CENTER);
	}
}
