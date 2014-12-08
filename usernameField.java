//usernameField


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class usernameField extends JPanel
{

	JTextField usernameField, passwordField;
	JButton cancelButton,loginButton;
	JLabel passwordLabel,usernameLabel;
	
	public usernameField()
		{
			 		
			 
			 setLayout(null);

			 JLabel usernameLabel = new JLabel("Username:");
			 add(usernameLabel);	
			 setBounds(157,80,76,16);				
			 
			  
 			 usernameField = new JTextField(9);
 			 add(usernameField);
 			 setBounds(265,77,116,22);
 			 		 
 			 passwordLabel = new JLabel("Password:");
 			 add(passwordLabel);
 			 setBounds(157,124,76,16);
 			
 			 
 			 passwordField = new JTextField(9);
 			 add(passwordField);
 			 setBounds(265,121,116,22);
 			 	 
 			 
 			 loginButton = new JButton("Login");
 			 cancelButton = new JButton("Cancel");
 			 add(loginButton);
 			 add(cancelButton);
 			 
 			 
			 ButtonEventHandler handler = new ButtonEventHandler();
 			 
 			 loginButton.addActionListener(handler);
 			 cancelButton.addActionListener(handler);
 			 
			 
		}
	
	 	 			 			 	
		
	private class ButtonEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == loginButton){
				
				if(usernameField.getText().equals("admin") && passwordField.getText().equals("admin"))
					{
					
						JOptionPane.showMessageDialog(null,"Welcome to your page admin"
						JOptionPane.INFORMATION_MESSAGE);
											} else
					{
						if(e.getSource() == cancelButton)
								System.exit(0);
								
								

		}	   	  	
		}				
		}
		}
		}
	







