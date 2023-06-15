package EEE_STARS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_Page {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_Page window = new Registration_Page();
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
	public Registration_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 914, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 40));
		lblNewLabel.setBounds(313, 47, 216, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_1.setBounds(169, 160, 84, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email_ID");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		lblNewLabel_2.setBounds(166, 219, 117, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone No");
		lblNewLabel_3.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		lblNewLabel_3.setBounds(165, 275, 132, 40);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(333, 166, 236, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(333, 221, 236, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(333, 275, 236, 29);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN_PAGE z=new LOGIN_PAGE();
				z.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD, 34));
		btnNewButton.setBounds(242, 404, 252, 55);
		frame.getContentPane().add(btnNewButton);
	}
}
