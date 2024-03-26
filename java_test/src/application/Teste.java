package application;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Teste {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Teste window = new Teste();
                    window.frame.setVisible(true);
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
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Maximizar a janela
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Configurar o contentPane
        JPanel contentPane = new JPanel();
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 130, 172));
        panel.setBounds(0, 0, 625, 1057);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(98, 305, 410, 370);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Enhance impact in healthcare");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 35));
        lblNewLabel_1.setBounds(60, 733, 488, 49);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("<html><p>Your Impact in healthcare just got stronger.Enhance patient care\r\nthrough refined data control, seamless appointments, and impactful\r\ntask management.<p></html>");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
        lblNewLabel_1_1.setBounds(60, 787, 488, 74);
        panel.add(lblNewLabel_1_1);
        
        // Adicione seus componentes ao contentPane aqui
        
        // Definir a janela para ser visível
        frame.setVisible(true);
    }
}
