package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VieJTextField extends JFrame {

	private JPanel contentPane;
	private JTextField gia;
	private JTextField sl;
	private JTextField thanhtien;
	private JTextField bangchu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VieJTextField frame = new VieJTextField();
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
	public VieJTextField() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ch\u1ECDn h\u00E0ng");
		lblNewLabel.setBounds(24, 37, 68, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gi\u00E1");
		lblNewLabel_1.setBounds(24, 60, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nh\u1EADp SL");
		lblNewLabel_2.setBounds(24, 83, 51, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Th\u00E0nh ti\u1EC1n");
		lblNewLabel_3.setBounds(24, 106, 68, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("B\u1EB1ng ch\u1EEF");
		lblNewLabel_4.setBounds(24, 129, 68, 13);
		contentPane.add(lblNewLabel_4);
		
		JButton thanhtoan = new JButton("Thanh to\u00E1n");
		thanhtoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(gia.getText());
				int b = Integer.parseInt(sl.getText());
				int sum = a * b;
				thanhtien.setText(sum + "");
			}
		});
		thanhtoan.setBounds(60, 174, 102, 21);
		contentPane.add(thanhtoan);
		
		JButton thongke = new JButton("Th\u1ED1ng k\u00EA");
		thongke.setBounds(252, 174, 102, 21);
		contentPane.add(thongke);
		
		gia = new JTextField();
		gia.setBounds(114, 57, 120, 19);
		contentPane.add(gia);
		gia.setColumns(10);
		
		sl = new JTextField();
		sl.setBounds(114, 80, 120, 19);
		contentPane.add(sl);
		sl.setColumns(10);
		
		thanhtien = new JTextField();
		thanhtien.setBounds(114, 103, 120, 19);
		contentPane.add(thanhtien);
		thanhtien.setColumns(10);
		
		bangchu = new JTextField();
		bangchu.setBounds(114, 126, 120, 19);
		contentPane.add(bangchu);
		bangchu.setColumns(10);
	}
}
