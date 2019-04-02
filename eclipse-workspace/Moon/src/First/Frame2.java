package First;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Button;

public class Frame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setTitle("\uB9E4\uCD9C\uAD00\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uC8FC\uAC04\uB9E4\uCD9C\uAD00\uB9AC");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBD84\uAE30\uBCC4\uB9E4\uCD9C\uAD00\uB9AC");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC5F0\uAC04\uB9E4\uCD9C\uAD00\uB9AC");
		panel.add(btnNewButton_2);
	}

}
