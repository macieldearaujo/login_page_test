package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{

	private HashMap<String, String> logininfo = new HashMap<>();
	
	JFrame frame = new JFrame();
	JTextField username = new JTextField();
	JPasswordField userpassword = new JPasswordField();
	JLabel usernameField = new JLabel();
	JLabel userPasswordField = new JLabel();
	JButton loginButton = new JButton("Sign in");
	JButton resetButton = new JButton("Reset");
	JLabel messageLabel = new JLabel();
	
	public LoginPage(HashMap<String, String> loginInfoOriginal) {
		logininfo = loginInfoOriginal;
		
		JLabel loginTitle = new JLabel("Username:");
		loginTitle.setFont(new Font("Arial", Font.PLAIN, 14));
		loginTitle.setBounds(40, 39, 77, 25);
		
		messageLabel.setBounds(200,220,200,35);
		messageLabel.setFont(new Font(null,Font.BOLD,20));
		
		JLabel passwordTitle = new JLabel("Password:");
		passwordTitle.setFont(new Font("Arial", Font.PLAIN, 14));
		passwordTitle.setBounds(40, 109, 77, 25);
		
		username.setBounds(40, 69, 318, 25);
		userpassword.setBounds(40, 141, 318, 25);
		
		loginButton.setBackground(new Color(232, 232, 232));
		loginButton.setBounds(40, 190, 127, 30);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBackground(new Color(232, 232, 232));
		resetButton.setBounds(223, 190, 139, 30);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(passwordTitle);
		frame.add(loginTitle);
		frame.add(username);
		frame.add(userpassword);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(messageLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tela de login");
		frame.setSize(420, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resetButton) {
			username.setText("");
			userpassword.setText("Login successful");
		}
		if(e.getSource()==loginButton) {
			String login_username = username.getText();
			String login_password = String.valueOf(userpassword.getPassword());
			if(logininfo.get(login_username).equals(login_password)) {
				messageLabel.setForeground(Color.GREEN);
				messageLabel.setText("Login successful");
				frame.dispose();
				WelcomePage welcomePage = new WelcomePage(login_username);
			}
		}
		
	}
	
	
}
