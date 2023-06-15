package EEE_STARS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LOGIN_PAGE {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField ps1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN_PAGE window = new LOGIN_PAGE();
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
	public LOGIN_PAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 868, 708);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 40));
		lblNewLabel.setBounds(333, 33, 249, 97);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		lblNewLabel_1.setBounds(138, 173, 121, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		lblNewLabel_2.setBounds(138, 221, 141, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(287, 169, 249, 31);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("\r\nLOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=tb1.getText();
				String ps=ps1.getText();
				if(un.equals("sreenivas")&&(ps.equals("Sreenivas@123")))
				{
					JOptionPane.showMessageDialog(btnNewButton, "login successful");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "invalid");
				}
			}
			
		});
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		btnNewButton.setBounds(232, 344, 158, 43);
		frame.getContentPane().add(btnNewButton);
		
		ps1 = new JPasswordField();
		ps1.setBounds(289, 223, 247, 31);
		frame.getContentPane().add(ps1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}
