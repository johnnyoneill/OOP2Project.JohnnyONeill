//betSlip


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class betSlip extends JPanel{

	JTextField usernameField, passwordField;
	JButton confirmButton, cancelButton;
	JRadioButton homeButton, drawButton, awayButton;
	
	public betSlip(){			 
			 
//references oracle.com
		 
		 setLayout(null);
		     	     		 
	     setSize(500,500);
	     
	     ButtonGroup bet = new ButtonGroup();
		 add(homeButton);
		 add(drawButton);
		 add(awayButton);
		 
		 JRadioButton homeButton = new JRadioButton("home");
		 homeButton.setMnemonic(KeyEvent.VK_B);
		 homeButton.setSelected(true);
		  
		 JRadioButton drawButton = new JRadioButton("draw");
		 drawButton.setMnemonic(KeyEvent.VK_C);
		 


		 JRadioButton awayButton = new JRadioButton("away");
		 awayButton.setMnemonic(KeyEvent.VK_D);
		 
		 JButton confirmButton = new JButton("Confirm");
		 add(confirmButton);
		 
		 JButton cancelButton = new JButton("Cancel");
		 add(cancelButton);
	 

		 
		 //listener for button(s)
		 ActionEvent listener = new ActionEvent();
		 homeButton.addActionListener(listener);
		 drawButton.addActionListener(listener);
		 awayButton.addActionListener(listener);
		 
	     ButtonEventHandler handler = new ButtonEventHandler();
	    
	    confirmButton.addActionListener(handler);
 	    cancelButton.addActionListener(handler);
		 

		 	
		
	}
	private class ActionEvent implements ActionListener{

		 public void actionPerformed(ActionEvent e){
		 JOptionPane.showMessageDialog(null,"Bet");
		 }
		
	}
	}
	