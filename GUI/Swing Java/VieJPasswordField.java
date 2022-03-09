package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VieJPasswordField extends JFrame {

	private JPanel contentPane;
	private JTextField TK;
	private JPasswordField MK;
	private JTextField showpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VieJPasswordField frame = new VieJPasswordField();
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
	public VieJPasswordField() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0110\u0103ng nh\u1EADp");
		lblNewLabel.setBounds(181, 24, 69, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00E0i kho\u1EA3n : ");
		lblNewLabel_1.setBounds(54, 80, 76, 13);
		contentPane.add(lblNewLabel_1);
		
		TK = new JTextField();
		TK.setBounds(134, 77, 184, 19);
		contentPane.add(TK);
		TK.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("M\u1EADt kh\u1EA9u :");
		lblNewLabel_2.setBounds(54, 124, 76, 13);
		contentPane.add(lblNewLabel_2);
		
		MK = new JPasswordField();
		MK.setBounds(134, 121, 184, 19);
		contentPane.add(MK);
		
		JButton DN = new JButton("\u0110\u0103ng nh\u1EADp");
		DN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass = String.valueOf(MK.getPassword());
				showpass.setText(pass);
			}
		});
		DN.setBounds(71, 184, 102, 21);
		contentPane.add(DN);
		
		showpass = new JTextField();
		showpass.setBounds(229, 185, 96, 19);
		contentPane.add(showpass);
		showpass.setColumns(10);
	}
}
