package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VieJLabel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VieJLabel frame = new VieJLabel();
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
	public VieJLabel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ClickBT = new JButton("Click");
		ClickBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClickBT.setText("Hello word ");
			}
		});
		ClickBT.setBounds(141, 47, 85, 21);
		contentPane.add(ClickBT);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(71, 51, 45, 13);
		contentPane.add(lblNewLabel);
	}
}
