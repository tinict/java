package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VieJTextArea extends JFrame {

	private JPanel contentPane;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VieJTextArea frame = new VieJTextArea();
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
	public VieJTextArea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea InputTextArea = new JTextArea();
		InputTextArea.setRows(5);
		InputTextArea.setBounds(98, 73, 234, 51);
		contentPane.add(InputTextArea);
		
		JButton Counter = new JButton("Counter");
		Counter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int counter = InputTextArea.getText().length();
				result.setText(counter + "");
			}
		});
		Counter.setBounds(163, 163, 101, 21);
		contentPane.add(Counter);
		
		result = new JTextField();
		result.setBounds(168, 217, 20, 16);
		contentPane.add(result);
		result.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("S\u1ED1 k\u00FD t\u1EF1 :");
		lblNewLabel.setBounds(98, 217, 60, 13);
		contentPane.add(lblNewLabel);
	}
}
