import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guibuilder2 
{
	
	int x,y,z;
	
	// Build the buttons for the Calculator.
	JButton b1 = new JButton("Get num");
	JButton b2 = new JButton("+");
	JButton b3 = new JButton("-");
	JButton b4 = new JButton("*");
	
	// Build the Text Display.
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JTextField text3 = new JTextField(10);
	

	// Constructor - Builds the frame, buttons, and text fields.
	public guibuilder2()
	{
				// these are for doing the math on the numbers inputed by user.		
				

				JFrame frame = new JFrame();
				frame.setSize(300,400);
				frame.setTitle("GUI Frame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// Build the Panel for the buttons.	
				
				JPanel panel;
				panel = new JPanel();
				panel.setLayout(new GridLayout(2,2));
				
				JPanel panel2;
				panel2 = new JPanel();
				panel2.setLayout(new GridLayout(3,1));
				
				panel.add(b1);
				panel.add(b2);
				panel.add(b3);
				panel.add(b4);
				
				panel2.add(text1);
				panel2.add(text2);
				panel2.add(text3);
							
				// Add everything to the frame.
				frame.add(panel, BorderLayout.SOUTH);
				frame.add(panel2, BorderLayout.CENTER);
				
				frame.setVisible(true);
					
			//The following is the inner class where we write the code to be performed when the
	                //Button is pressed
			
				class BL2 implements ActionListener
				{
					String str1;
					String str2;
					String str3;
					
					public void actionPerformed(ActionEvent event)
					{
						if(event.getSource() == b1)
						{
							// Get the numbers and convert to int for computer.
						    
			    			str1 = text1.getText();
			    			x = Integer.parseInt(str1);	
			    			str2 = text2.getText();
			    			y = Integer.parseInt(str2);
			    			/*		    			
			    			z = x + y;
							str3 = Integer.toString(z);
							text3.setText(str3);
							*/
			    			}						
						if(event.getSource() == b2)
						{
								// add the numbers and display it in the 3rd text field.
								z = x + y;
								str3 = Integer.toString(z);
								text3.setText(str3);
						}
							if(event.getSource() == b3)
							{
								// add the numbers and display it in the 3rd text field.
								z = x - y;
								str3 = Integer.toString(z);
								text3.setText(str3);
							}
							if(event.getSource() == b4)
							{
								// add the numbers and display it in the 3rd text field.
								z = x * y;
								str3 = Integer.toString(z);
								text3.setText(str3);
							}
						
					}
				}
				//Create an object of the above inner class and register it with the event source (i.e. the button)
						
						BL2 listener = new BL2();
						b1.addActionListener(listener);
						b2.addActionListener(listener);
						b3.addActionListener(listener);
						b4.addActionListener(listener);
					}
}

