package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Choice;

public class VieJTable extends JFrame {

	private final class DefaultTableModelExtension extends DefaultTableModel {
		Class[] columnTypes = new Class[] {
			String.class, String.class
		};

		private DefaultTableModelExtension(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		public Class getColumnClass(int columnIndex) {
			return columnTypes[columnIndex];
		}
	}

	private JPanel contentPane;
	private final JTable table = new JTable();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VieJTable frame = new VieJTable();
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
	public VieJTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		DefaultTableModel dftm = new DefaultTableModel();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(dftm);
		dftm.addColumn("Mã Quốc Gia");
		dftm.addColumn("Tên Quốc Gia");
		
		dftm.addRow(new Object[] {"VN" , "Việt Nam"});
		dftm.addRow(new Object[] {"Sg", "Singapore"});
		
		ListSelectionModel lsm = table.getSelectionModel();
		lsm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lsm.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int[] rows = table.getSelectedRows();
				int[] cols = table.getSelectedColumns();
				
				String code = (String)table.getValueAt(rows[0], 0);
				
			}
		}); 
//		table.setModel(new DefaultTableModelExtension(new Object[][] {
//			{"VN", "Vie"},
//			{"Sg", "Singapor"},
//		}, new String[] {
//			"M\u00E3 Qu\u1ED1c Gia", "T\u00EAn Qu\u1ED1c Gia"
//		}));
		table.setBounds(36, 39, 349, 157);
		contentPane.add(table);
		
		Choice choice = new Choice();
		choice.add("Hello");
		choice.setBounds(329, 219, 45, 18);
		contentPane.add(choice);
	}
}
