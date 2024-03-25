package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Teste extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTypeYourLogin;
	private JTextField txtTypeYourPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(66, 39, 77, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPassword.setBounds(66, 109, 77, 25);
		contentPane.add(lblPassword);
		
		txtTypeYourLogin = new JTextField();
		txtTypeYourLogin.setToolTipText("");
		txtTypeYourLogin.setBounds(66, 69, 318, 25);
		contentPane.add(txtTypeYourLogin);
		txtTypeYourLogin.setColumns(10);
		
		txtTypeYourPassword = new JTextField();
		txtTypeYourPassword.setColumns(10);
		txtTypeYourPassword.setBounds(66, 141, 318, 25);
		contentPane.add(txtTypeYourPassword);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setBackground(new Color(232, 232, 232));
		btnNewButton.setBounds(66, 190, 127, 30);
		btnNewButton.setFocusable(false);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(232, 232, 232));
		btnReset.setBounds(245, 190, 139, 30);
		btnReset.setFocusable(false);
		contentPane.add(btnReset);
	}
}
