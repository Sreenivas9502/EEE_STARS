package EEE_STARS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METR_TRAIN_TICKET {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METR_TRAIN_TICKET window = new METR_TRAIN_TICKET();
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
	public METR_TRAIN_TICKET() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TRAIN TICKET");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel.setBounds(97, -11, 414, 96);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 103, 80, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("FROM ");
		lblNewLabel_1_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 152, 80, 36);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TO");
		lblNewLabel_1_1_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(10, 197, 80, 36);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("TICKETS");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(10, 244, 96, 36);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		tb1 = new JTextField();
		tb1.setBounds(126, 110, 191, 30);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "SECUNDRABAD ", "MAISSAMMAGUDA", "KOMPALLI", "JEEDIMETALA", "SUCHITRA", "BOINPALLI", "PARADISE"}));
		c1.setBounds(126, 157, 191, 35);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "SECUNDRABAD ", "MAISSAMMAGUDA", "KOMPALLI", "JEEDIMETALA", "SUCHITRA", "BOINPALLI", "PARADISE"}));
		c2.setBounds(126, 208, 191, 35);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\METRO TRAIN.jpg"));
		lblNewLabel_2.setBounds(97, -46, 403, 315);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6"}));
		c3.setBounds(126, 249, 191, 35);
		frame.getContentPane().add(c3);
		frame.setBounds(100, 100, 635, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pn=tb1.getText();
				String fr=(String) c1.getSelectedItem();
				String to=(String) c2.getSelectedItem();
				String tickets=(String) c3.getSelectedItem();
				int t=Integer.parseInt(tickets);
						int bill=t*40;
				JOptionPane.showMessageDialog(btnNewButton,"hell0"+pn+"\n From:"+fr+"\n To:"+to+ "\n Tickets:"+t+"\n Bill:"+bill);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(97, 346, 124, 36);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
