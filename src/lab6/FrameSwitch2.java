package lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameSwitch2 {

	private JFrame frame;
	private JTextField t1;
	String pname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSwitch2 window = new FrameSwitch2();
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
	public FrameSwitch2() {
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
		t1.setBounds(161, 51, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton submit = new JButton("DISPLAY");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pname=t1.getText();
				
				Frameswitchdisplay newFrame = new Frameswitchdisplay(pname); // creating an object
				
			}
		});
		submit.setBounds(161, 160, 89, 23);
		frame.getContentPane().add(submit);
	}

}
