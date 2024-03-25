package application;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Teste extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	JTextField username = new JTextField();
	JPasswordField userpassword = new JPasswordField();
	JLabel usernameField = new JLabel();
	JLabel userPasswordField = new JLabel();
	JButton loginButton = new JButton("Sign in");
	JButton resetButton = new JButton("Reset");
	
	public Teste() {
		JLabel loginTitle = new JLabel("Username:");
		loginTitle.setFont(new Font("Arial", Font.PLAIN, 14));
		loginTitle.setBounds(66, 39, 77, 25);
		frame.add(loginTitle);
		
		JLabel passwordTitle = new JLabel("Password:");
		passwordTitle.setFont(new Font("Arial", Font.PLAIN, 14));
		passwordTitle.setBounds(66, 109, 77, 25);
		frame.add(passwordTitle);
		
		username.setBounds(66, 69, 318, 25);
		frame.add(username);
		
		userpassword.setBounds(66, 141, 318, 25);
		frame.add(userpassword);

		loginButton.setBackground(new Color(232, 232, 232));
		loginButton.setBounds(66, 190, 127, 30);
		loginButton.setFocusable(false);
		frame.add(loginButton);
		
		resetButton.setBackground(new Color(232, 232, 232));
		resetButton.setBounds(245, 190, 139, 30);
		resetButton.setFocusable(false);
		frame.add(resetButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
