import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class myMenuGui extends JFrame {
	
		private JMenuBar MyJMenuBar;
		static Member user;
		private RegForm signUp;
		JPanel logIn;
		JTextField usernameField, passwordField;
		JButton cancelButton,loginButton;
		JLabel passwordLabel,usernameLabel;
		
		
		JMenuItem login, signup, history, betslip, close, other;
		JMenuItem transfers, phone, email, store, chat, money, four, cashout, moneyback;
		
	public myMenuGui(){
		setTitle("Football Accumulator Betting and Calculator");
		setSize(1000,1000);
		setLayout(null);
		setLocation(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		ButtonEventHandler handler = new ButtonEventHandler();
		MyJMenuBar = new JMenuBar();
		setJMenuBar(MyJMenuBar);
		createMenus(handler);
		MyJMenuBar.setVisible (true);
		
		
		
		
		logIn = new JPanel();
		createLogIn(handler);
		logIn.setSize(200,200);
		add(logIn);
		
		logIn.setVisible (true);
		
		RegForm signUp = new RegForm();
		signUp = new RegForm();
		signUp.setVisible (false);
		
	
	}///end constructor
	
	public static void main(String args[]){
		
		myMenuGui johnnysMenu = new myMenuGui();
		
	
		
		
		
	}///in main
	public void createMenus(ButtonEventHandler handler){
		JMenu myaccount = new JMenu("My Account");
		JMenu settings = new JMenu("Settings");
		JMenu contact = new JMenu("Contacts Us");
		JMenu live = new JMenu("Live Support");
		JMenu promos = new JMenu("Promos");

		MyJMenuBar.add(myaccount);
		MyJMenuBar.add(settings);
	    MyJMenuBar.add(contact);
		MyJMenuBar.add(live);
		MyJMenuBar.add(promos);
		

		login = new JMenuItem("Login");
		myaccount.add(login);
		login.addActionListener(handler);
		signup = new JMenuItem("Sign Up");
		myaccount.add(signup);
		signup.addActionListener(handler);
		betslip = new JMenuItem("BetSlip");
		myaccount.add(betslip);
		betslip.addActionListener(handler);
		myaccount.addSeparator();
		close = new JMenuItem("Close");
		myaccount.add(close);
		close.addActionListener(handler);
		
		history = new JMenuItem("History");
		settings.add(history);
		history.addActionListener(handler);
		transfers = new JMenuItem("Transfers");
		settings.add(transfers);
		transfers.addActionListener(handler);
		other = new JMenuItem("Other");
		settings.add(other);
		
		phone = new JMenuItem("Phone");
		contact.add(phone);
		phone.addActionListener(handler);
		email = new JMenuItem("Email");
		contact.add(email);
		email.addActionListener(handler);
		store = new JMenuItem("Store Locator");
		contact.add(store);
		store.addActionListener(handler);
		
		chat = new JMenuItem("Click Here For Live Chat");
		live.add(chat);
		chat.addActionListener(handler);
		
		moneyback = new JMenuItem("Money Back Specials");
		promos.add(moneyback);
		moneyback.addActionListener(handler);
		four = new JMenuItem("4 out of 5");
		promos.add(four);
		four.addActionListener(handler);
		cashout = new JMenuItem("Cash Out!");
		promos.add(cashout);
		cashout.addActionListener(handler);


	}
	public void createLogIn(ButtonEventHandler handler)
		{
			 		
			 
			 

			 JLabel usernameLabel = new JLabel("Username:");
			 logIn.add(usernameLabel);	
			 setBounds(157,80,76,16);				
			 
			  
 			 usernameField = new JTextField(9);
 			 logIn.add(usernameField);
 			 setBounds(265,77,116,22);
 			 		 
 			 passwordLabel = new JLabel("Password:");
 			 logIn.add(passwordLabel);
 			 setBounds(157,124,76,16);
 			
 			 
 			 passwordField = new JTextField(9);
 			 logIn.add(passwordField);
 			 setBounds(265,121,116,22);
 			 	 
 			 
 			 loginButton = new JButton("Login");
 			 cancelButton = new JButton("Cancel");
 			 logIn.add(loginButton);
 			 logIn.add(cancelButton);
 			 
 			 
			 
 			 
 			 loginButton.addActionListener(handler);
 			 cancelButton.addActionListener(handler);
 			 
			 
		}
	public class ButtonEventHandler implements ActionListener{
		
	public void actionPerformed(ActionEvent event){
			if(event.getSource() == loginButton){
				JOptionPane.showMessageDialog(null,"FF");
				if(usernameField.getText().equals("admin") && passwordField.getText().equals("admin"))
					{
			
						JOptionPane.showMessageDialog(null,"Welcome to your page admin" +
						JOptionPane.INFORMATION_MESSAGE);
					}
					
			}
			else if(event.getSource() == cancelButton){
					 JOptionPane.showMessageDialog(null,"YIYO");
								
			}	 
			else 	if(event.getSource()==close);
		{
		JOptionPane.showMessageDialog(null,"FF");
		//	System.exit(0);
		}
		
			else if (event.getSource()==login){
					logIn.setVisible(true);
	
		}
			else if (event.getSource()==history){
			JOptionPane.showMessageDialog(null,"You need to make a history before I show you a History");	
		}
		
				else if (event.getSource()==signup){
			JOptionPane.showMessageDialog(null,"Cant ");
		}
				else if (event.getSource()==betslip){
			JOptionPane.showMessageDialog(null,"login");
		}
			
				else if (event.getSource()==transfers){
			JOptionPane.showMessageDialog(null,"No transfer history at this time");
        }
        				else if (event.getSource()==phone){
			JOptionPane.showMessageDialog(null,"Call us for free on 1800221321");
        }
        				else if (event.getSource()==email){
			JOptionPane.showMessageDialog(null,"Email us any queries on info@bet.com");
        }
        				else if (event.getSource()==store){
			JOptionPane.showMessageDialog(null,"The nearest store to you in Main St Killarney");
        }
        				else if (event.getSource()==chat){
			JOptionPane.showMessageDialog(null,"OOOPS! Live chat option is currently under maintenance");
        }
        				else if (event.getSource()==moneyback){
			JOptionPane.showMessageDialog(null,"No specials currently available, please check back later");
        }
        				else if (event.getSource()==four){
			JOptionPane.showMessageDialog(null,"If 4 of your predictions come in and one leaves you down we will refund your stake as a free bet!");
        }
        				else if (event.getSource()==cashout){
			JOptionPane.showMessageDialog(null,"You can avail of a cash out method! The ball is in your court");
        }	
}
}
}
