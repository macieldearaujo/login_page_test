package application;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{

	private HashMap<String, String> logininfo = new HashMap<>();
	
	JFrame frame = new JFrame();
	JTextField username = new JTextField();
	JPasswordField userpassword = new JPasswordField();
	JLabel usernameLabel = new JLabel();
	JLabel userpasswordLabel = new JLabel();
	
	public LoginPage(HashMap<String, String> loginInfoOriginal) {
		logininfo = loginInfoOriginal;
		usernameLabel.setFont(new Font(null, Font.ITALIC, 20));
		usernameLabel.setBounds(30, 20, 100, 25);
		username.setBounds(150, 20, 200, 25);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(username);
		frame.add(userpassword);
		frame.add(usernameLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
