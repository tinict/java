package GUI_TIENHANG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.Label;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Ch\u1ECDn h\u00E0ng");
	private JTextField cost;
	private JTextField SL;
	private JTextField result;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Calculator() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(24, 60, 74, 19);
		contentPane.add(lblNewLabel);
		
		Choice Choice_MH = new Choice();
		getDataText gdt = new getDataText();
		gdt.ReadLine();
		for(int i = 0; i < gdt.getCount(); ++i)
			Choice_MH.add(gdt.getMatHang()[i]);
		Choice_MH.setBounds(130, 60, 59, 18);
		contentPane.add(Choice_MH);
		
		cost = new JTextField();
		cost.setBounds(130, 84, 96, 19);
		contentPane.add(cost);
		cost.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nh\u1EADp s\u1ED1 l\u01B0\u1EE3ng");
		lblNewLabel_1.setBounds(24, 119, 85, 13);
		contentPane.add(lblNewLabel_1);
		
		SL = new JTextField();
		SL.setBounds(130, 113, 96, 19);
		contentPane.add(SL);
		SL.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Th\u00E0nh ti\u1EC1n");
		lblNewLabel_2.setBounds(24, 145, 85, 13);
		contentPane.add(lblNewLabel_2);
		
		result = new JTextField();
		result.setBounds(130, 142, 96, 19);
		contentPane.add(result);
		result.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("B\u1EA3ng ch\u1EEF");
		lblNewLabel_3.setBounds(24, 174, 74, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 171, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("B\u00E1n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < gdt.getCount(); i++)
				{
					if((Choice_MH.getItem(Choice_MH.getSelectedIndex())).equals(gdt.getMatHang()[i]))
					{
						cost.setText(gdt.getMoney()[i]);
						result.setText((Integer.parseInt(SL.getText()) * Integer.parseInt(gdt.getMoney()[i]))+"");
						break;
					}
				}
			}
		});
		btnNewButton.setBounds(44, 221, 112, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Th\u1ED1ng k\u00EA");
		btnNewButton_1.setBounds(254, 221, 127, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Gi\u00E1");
		lblNewLabel_4.setBounds(24, 89, 45, 13);
		contentPane.add(lblNewLabel_4);
	}
}
