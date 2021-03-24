package lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frameswitchdisplay {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frameswitchdisplay window = new Frameswitchdisplay();
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
	public Frameswitchdisplay() {
		initialize();
	}
	
	public Frameswitchdisplay(String name) //creating a copy of the contructor 
	{
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(String name) // creating copy of initialize method
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setBounds(166, 41, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(name);
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setBounds(166, 41, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
