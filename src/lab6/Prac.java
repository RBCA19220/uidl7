package lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class Prac {

	private JFrame frame;
	private JTextField t1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prac window = new Prac();
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
	public Prac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton submit = new JButton("New button");
		submit.setBounds(168, 190, 89, 23);
		frame.getContentPane().add(submit);
		
		t1 = new JTextField();
		t1.setBounds(168, 34, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BCA", "BBA", "BA ", "BCOM ", "MCOM"}));
		comboBox.setBounds(191, 126, 28, 20);
		frame.getContentPane().add(comboBox);
		
		JRadioButton radiobtn1 = new JRadioButton("New radio button");
		buttonGroup_1.add(radiobtn1);
		radiobtn1.setBounds(85, 75, 109, 23);
		frame.getContentPane().add(radiobtn1);
		
		JRadioButton radiobtn2 = new JRadioButton("New radio button");
		buttonGroup_1.add(radiobtn2);
		radiobtn2.setBounds(234, 75, 109, 23);
		frame.getContentPane().add(radiobtn2);
	}
}
