package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VieJComboBox extends JFrame {

	private JPanel contentPane;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VieJComboBox frame = new VieJComboBox();
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
	public VieJComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lựa chọn thành phố :");
		lblNewLabel.setBounds(70, 114, 135, 13);
		contentPane.add(lblNewLabel);
		JComboBox<Country> comboBox = new JComboBox<Country>();
		comboBox.addItem(new Country("1", "Huế"));
		comboBox.addItem(new Country("2", "Đà Nẵng"));
		comboBox.addItem(new Country("3", "Hà Nội"));
		comboBox.addItem(new Country("4", "Quãng Bình"));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText((String)comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setBounds(199, 110, 77, 21);
		contentPane.add(comboBox);
		
		JButton btttp = new JButton("Kết quả Tp :");
		btttp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText((String)comboBox.getSelectedItem().toString());
			}
		});
		btttp.setBounds(59, 177, 109, 21);
		contentPane.add(btttp);
		
		result = new JTextField();
		result.setBounds(178, 178, 96, 19);
		contentPane.add(result);
		result.setColumns(10);
	}
}
