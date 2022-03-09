package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VieCheckBox extends JFrame {

	private JPanel contentPane;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VieCheckBox frame = new VieCheckBox();
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
	public VieCheckBox() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox xemphim = new JCheckBox("Xem phim");
		xemphim.setBounds(34, 58, 93, 21);
		contentPane.add(xemphim);
		
		JCheckBox thethao = new JCheckBox("Th\u1EC3 thao");
		thethao.setBounds(171, 58, 93, 21);
		contentPane.add(thethao);
		
		JCheckBox choigame = new JCheckBox("Ch\u01A1i game");
		choigame.setBounds(311, 58, 93, 21);
		contentPane.add(choigame);
		
		JButton DK = new JButton("\u0110\u0103ng k\u00FD");
		DK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String favourite = null;
				if(xemphim.isSelected())
					favourite = "Xem phim";
				else if(thethao.isSelected())
					favourite = "Thể thao";
				else if(choigame.isSelected())
					favourite = "Chơi game";
				result.setText(favourite);
			}
		});
		DK.setBounds(171, 123, 102, 21);
		contentPane.add(DK);
		
		result = new JTextField();
		result.setBounds(168, 192, 96, 19);
		contentPane.add(result);
		result.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("S\u1EDF th\u00EDch c\u00E1 nh\u00E2n :");
		lblNewLabel.setBounds(34, 195, 109, 13);
		contentPane.add(lblNewLabel);
	}
}
