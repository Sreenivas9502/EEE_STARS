package EEE_STARS;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signup_page {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup_page window = new signup_page();
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
	public signup_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 882, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGNUP");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 38));
		lblNewLabel.setBounds(335, 11, 184, 102);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Sylfaen", Font.BOLD, 38));
		lblName.setBounds(58, 129, 184, 102);
		frame.getContentPane().add(lblName);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Sylfaen", Font.BOLD, 38));
		lblGender.setBounds(58, 220, 184, 102);
		frame.getContentPane().add(lblGender);
		
		JLabel lblBranch = new JLabel("BRANCH");
		lblBranch.setFont(new Font("Sylfaen", Font.BOLD, 38));
		lblBranch.setBounds(58, 308, 184, 102);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblProgramming = new JLabel("PROGRAMMING");
		lblProgramming.setFont(new Font("Sylfaen", Font.BOLD, 38));
		lblProgramming.setBounds(58, 391, 305, 102);
		frame.getContentPane().add(lblProgramming);
		
		tb1 = new JTextField();
		tb1.setBounds(335, 141, 276, 48);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "EEE", "CSE", "MECH", "CIVIL", "IT"}));
		c1.setBounds(357, 321, 290, 48);
		frame.getContentPane().add(c1);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setFont(new Font("Tahoma", Font.BOLD, 18));
		r1.setBounds(338, 236, 126, 40);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setFont(new Font("Tahoma", Font.BOLD, 18));
		r2.setBounds(521, 236, 126, 40);
		frame.getContentPane().add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JCheckBox cb1 = new JCheckBox("JAVA");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 23));
		cb1.setBounds(422, 413, 225, 37);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("C");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 23));
		cb2.setBounds(422, 453, 225, 40);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("python");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 23));
		cb3.setBounds(422, 496, 225, 40);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String g;
				if(r1.isSelected())
				{
					g="female";
				}
				else if(r2.isSelected())
				{
					g="male";
				}
				else
				{
					g="invalid";
				}
				String b=(String) c1.getSelected();
				String p;
				{
			       p="python";
			    }
				else
				{
					p="c";
				}
				JOptionPane.showMessageDialog(btnNewButton,
						"HELLO"+n+"\ngender:"+g+" \n Branch"+b+
						"\n programming"+p);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(297, 582, 167, 48);
		frame.getContentPane().add(btnNewButton);
	}
}
