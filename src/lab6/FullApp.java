package lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;

public class FullApp {

	private JFrame frame;
	private JTextField t1;
	String fname,lname,gender,dept;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FullApp window = new FullApp();
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
	public FullApp() {
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
		
		t1 = new JTextField();
		t1.setBounds(140, 50, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JRadioButton radiobtn1 = new JRadioButton("Male");
		radiobtn1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				gender="Male";
			}
		});
		buttonGroup.add(radiobtn1);
		radiobtn1.setBounds(140, 103, 109, 23);
		frame.getContentPane().add(radiobtn1);
		
		JRadioButton radiobtn2 = new JRadioButton("Female");
		radiobtn2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				gender="Female";
			}
		});
		buttonGroup.add(radiobtn2);
		radiobtn2.setBounds(278, 103, 109, 23);
		frame.getContentPane().add(radiobtn2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				dept = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "BCA", "BBA", "BA", "BCOM", "MCOM"}));
		comboBox.setBounds(221, 153, 28, 20);
		frame.getContentPane().add(comboBox);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                fname=t1.getText();
                lname=t2.getText();
                
				
				FullAppdisplay newFrame = new FullAppdisplay(fname,lname,gender,dept); 
			}
		});
		submit.setBounds(194, 207, 89, 23);
		frame.getContentPane().add(submit);
		
		JLabel lblNewLabel = new JLabel("Details");
		lblNewLabel.setBounds(212, 11, 101, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setBounds(27, 53, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(27, 107, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Department");
		lblNewLabel_3.setBounds(27, 156, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t2 = new JTextField();
		t2.setBounds(270, 50, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
	}

}
