//RegForm

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RegForm extends JPanel
{

	JTextField nameField, addressField, emailField, dobField;
	JButton regButton, cancelButton;
	JLabel nameLbl, addressLbl, emailLbl, dobLbl;
	
	public RegForm(){
		
		setLayout(new GridLayout(3,2));
		
		JLabel nameLbl = new JLabel("Name:");
		add(nameLbl);
	    JTextField nameField = new JTextField(10);
	    add(nameField);
	    
	    JLabel addressLbl = new JLabel("Address:");
		add(addressLbl);
	    JTextField addressField = new JTextField(10);
	    add(addressField);
	    
	    JLabel emailLbl = new JLabel("Email:");
		add(emailLbl);
	    JTextField emailField = new JTextField(10);
	    add(emailField);
	    
	    JLabel dobLbl = new JLabel("D.O.B:");
		add(dobLbl);
	    JTextField dobField = new JTextField(10);
	    add(dobField);
	    
	    JButton regButton = new JButton ("Register");
	    add(regButton);
	    JButton cancelButton = new JButton ("Cancel");
	    add(cancelButton);
	    
	    ButtonEventHandler handler = new ButtonEventHandler();
	    
	    regButton.addActionListener(handler);
 	    cancelButton.addActionListener(handler);
	    }
	    
	    private class ButtonEventHandler implements ActionListener{
	    	
		public void actionPerformed(ActionEvent e){
			
		}

	    }
	    	
	 }
