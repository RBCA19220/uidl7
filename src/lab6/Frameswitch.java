package lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frameswitch {

	private JFrame frame,tframe;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frameswitch window = new Frameswitch();
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
	public Frameswitch() {
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
		t1.setBounds(210, 50, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		// 
		JButton submit = new JButton("DISPLAY");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tframe = new JFrame();
				tframe.setBounds(100, 100, 450, 300);
				tframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				tframe.getContentPane().setLayout(null);
				tframe.setVisible(true);
				
				JLabel l1 = new JLabel("l1");
				l1.setBounds(156, 51, 76, 14);
				l1.setText(t1.getText());
				tframe.getContentPane().add(l1);
			}
		});
		submit.setBounds(154, 144, 89, 23);
		frame.getContentPane().add(submit);
		
		JLabel l1 = new JLabel("name");
		l1.setBounds(86, 53, 46, 14);
		frame.getContentPane().add(l1);
	}
}
