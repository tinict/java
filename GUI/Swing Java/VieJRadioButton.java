package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JRadioButtonMenuItem;

public class VieJRadioButton extends JFrame {

	private JPanel contentPane;
	private JTextField result;
	private JRadioButton bttnNam;
	private ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VieJRadioButton frame = new VieJRadioButton();
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
	public VieJRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bttnNam = new JRadioButton("Nam");
		bttnNam.setBounds(59, 92, 103, 21);
		contentPane.add(bttnNam);
		
		JRadioButton bttnNu = new JRadioButton("Nữ");
		bttnNu.setBounds(293, 92, 103, 21);
		contentPane.add(bttnNu);
		
		JButton kq = new JButton("Kết quả");
		kq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = null;
				if(bttnNam.isSelected())
					gender = "Nam";
				if(bttnNu.isSelected())
					gender = "Nữ";
				result.setText(gender);
			}
		});
		kq.setBounds(161, 150, 85, 21);
		contentPane.add(kq);
		
		result = new JTextField();
		result.setBounds(161, 197, 38, 19);
		contentPane.add(result);
		result.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Giới tính :");
		lblNewLabel.setBounds(88, 200, 74, 13);
		contentPane.add(lblNewLabel);
		bg.add(bttnNu);
		bg.add(bttnNam);
	}
}
