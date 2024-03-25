package application;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	private JFrame frame = new JFrame();
	JLabel messageLabel= new JLabel();
	
	WelcomePage(String username) {
		messageLabel.setFont(new Font(null, Font.BOLD, 20));
		messageLabel.setText("Welcome " + username);
		messageLabel.setBounds(200, 70, 200, 30);
		frame.add(messageLabel);
		
		frame.setLayout(null);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
}
