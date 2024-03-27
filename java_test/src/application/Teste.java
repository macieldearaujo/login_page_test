package application;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Teste {

    private JFrame frmUlifeHealth;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private Insets insets = new Insets(0, 20, 0, 0); // Margem de 20 pixels à esquerda

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Teste window = new Teste();
                    window.frmUlifeHealth.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Teste() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmUlifeHealth = new JFrame();
        frmUlifeHealth.setTitle("Ulife Health");
        frmUlifeHealth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Maximizar a janela
        frmUlifeHealth.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Configurar o contentPane
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(248, 248, 248));
        frmUlifeHealth.setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 130, 172));
        panel.setBounds(0, 0, 724, 1057);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dougl\\Downloads\\home-cartoon.png"));
        lblNewLabel.setBounds(192, 305, 410, 370);
        panel.add(lblNewLabel);
        
        JLabel login_label_title = new JLabel("Enhance impact in healthcare");
        login_label_title.setForeground(new Color(255, 255, 255));
        login_label_title.setFont(new Font("Arial", Font.BOLD, 35));
        login_label_title.setBounds(99, 733, 488, 49);
        panel.add(login_label_title);
        
        JLabel login_label_subtitle = new JLabel("<html><p>Your Impact in healthcare just got stronger.Enhance patient care\r\nthrough refined data control, seamless appointments, and impactful\r\ntask management.<p></html>");
        login_label_subtitle.setHorizontalAlignment(SwingConstants.TRAILING);
        login_label_subtitle.setForeground(Color.WHITE);
        login_label_subtitle.setFont(new Font("Arial", Font.PLAIN, 17));
        login_label_subtitle.setBounds(99, 787, 488, 74);
        panel.add(login_label_subtitle);
        
        JLabel login_menu_1 = new JLabel("About us");
        login_menu_1.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        	}
        });
        login_menu_1.setHorizontalAlignment(SwingConstants.LEFT);
        login_menu_1.setForeground(new Color(255, 255, 255));
        login_menu_1.setBounds(191, 51, 77, 30);
        panel.add(login_menu_1);
        
        JLabel login_menu_2 = new JLabel("Contact us");
        login_menu_2.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        	}
        });
        login_menu_2.setHorizontalAlignment(SwingConstants.LEFT);
        login_menu_2.setForeground(Color.WHITE);
        login_menu_2.setFont(new Font("Arial", Font.PLAIN, 19));
        login_menu_2.setBounds(478, 51, 88, 30);
        panel.add(login_menu_2);
        
        JLabel login_title = new JLabel("<html>Login to your account</html>");
        login_title.setBounds(1005, 166, 412, 95);
        contentPane.add(login_title);
        
        JLabel login_subtitle = new JLabel("<html><p>Login yo acess your healthcare dashboard. Explore appointments manages and patient records with ease.<p></html>");
        login_subtitle.setHorizontalAlignment(SwingConstants.TRAILING);
        login_subtitle.setForeground(new Color(128, 128, 128));
        login_subtitle.setFont(new Font("Arial", Font.PLAIN, 17));
        login_subtitle.setBounds(1005, 273, 460, 42);
        contentPane.add(login_subtitle);
        
        JLabel usernameTitleField = new JLabel("Username:");
        usernameTitleField.setHorizontalAlignment(SwingConstants.LEFT);
        usernameTitleField.setForeground(new Color(0, 0, 0));
        usernameTitleField.setFont(new Font("Arial", Font.BOLD, 17));
        usernameTitleField.setBounds(1005, 381, 98, 28);
        contentPane.add(usernameTitleField);
        
        usernameField = new JTextField();
        usernameField.setMargin(insets);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 17));
        usernameField.setBounds(1005, 423, 460, 42);
        contentPane.add(usernameField);
        usernameField.setColumns(10);
        
        JLabel passwordTitleField = new JLabel("Password:");
        passwordTitleField.setHorizontalAlignment(SwingConstants.LEFT);
        passwordTitleField.setForeground(Color.BLACK);
        passwordTitleField.setFont(new Font("Arial", Font.BOLD, 17));
        passwordTitleField.setBounds(1005, 506, 98, 28);
        contentPane.add(passwordTitleField);
        
        JLabel forget_password = new JLabel("Forget your password?");
        forget_password.setHorizontalAlignment(SwingConstants.LEFT);
        forget_password.setForeground(new Color(0, 210, 0));
        forget_password.setFont(new Font("Arial", Font.BOLD, 17));
        forget_password.setBounds(1280, 598, 185, 28);
        contentPane.add(forget_password);
        
        JButton signinButton = new JButton("Sign in");
        signinButton.setFont(new Font("Arial", Font.BOLD, 30));
        signinButton.setBackground(new Color(55, 88, 249));
        signinButton.setForeground(new Color(255, 255, 255));
        signinButton.setBounds(1005, 730, 495, 53);
        contentPane.add(signinButton);
        
        passwordField = new JPasswordField();
        passwordField.setMargin(insets);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 17));
        passwordField.setBounds(1005, 545, 460, 42);
        contentPane.add(passwordField);
        
        JLabel create_account_2 = new JLabel("Sign up");
        create_account_2.setHorizontalAlignment(SwingConstants.LEFT);
        create_account_2.setForeground(new Color(0, 210, 0));
        create_account_2.setFont(new Font("Arial", Font.BOLD, 17));
        create_account_2.setBounds(1427, 831, 73, 28);
        contentPane.add(create_account_2);
        
        JLabel create_account_1 = new JLabel("Don't have an account yet?");
        create_account_1.setHorizontalAlignment(SwingConstants.LEFT);
        create_account_1.setForeground(new Color(128, 128, 128));
        create_account_1.setFont(new Font("Arial", Font.BOLD, 17));
        create_account_1.setBounds(1178, 831, 239, 28);
        contentPane.add(create_account_1);
        
        JSeparator separator = new JSeparator();
        separator.setBackground(Color.LIGHT_GRAY);
        separator.setForeground(Color.LIGHT_GRAY);
        separator.setBounds(1005, 684, 495, 1);
        contentPane.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(Color.LIGHT_GRAY);
        separator_1.setBackground(Color.LIGHT_GRAY);
        separator_1.setBounds(1005, 820, 495, 1);
        contentPane.add(separator_1);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\dougl\\Downloads\\7c8dc5fa07ecae922195c78a356b845b-fotor-bg-remover-2024032217546 (1).png"));
        lblNewLabel_1.setBounds(1660, 69, 138, 95);
        contentPane.add(lblNewLabel_1);
        
        try {
        	Font font_openSans_regular = Font.createFont(Font.TRUETYPE_FONT, new File("font\\Open_Sans\\static\\OpenSans-Regular.ttf"));
        	Font font_openSans_semiBold = Font.createFont(Font.TRUETYPE_FONT, new File("font\\Open_Sans\\static\\OpenSans-ExtraBold.ttf"));
        	
        	login_menu_1.setFont(font_openSans_regular.deriveFont(16f));
        	login_menu_2.setFont(font_openSans_regular.deriveFont(16f));
        	login_title.setFont(new Font("Arial Black", Font.PLAIN, 35));
        	login_subtitle.setFont(font_openSans_semiBold.deriveFont(14f));
        }
        catch(IOException e) {
        	throw new RuntimeException(e.getMessage());
        }
        catch(FontFormatException e) {
        	throw new RuntimeException(e.getMessage());
        }
        
        // Adicione seus componentes ao contentPane aqui
        
        // Definir a janela para ser visível
        frmUlifeHealth.setVisible(true);
    }
}
