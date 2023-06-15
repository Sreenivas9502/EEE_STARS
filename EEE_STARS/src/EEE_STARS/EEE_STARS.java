package EEE_STARS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EEE_STARS {

	private JFrame frame;
	int i=0;
	int b=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EEE_STARS window = new EEE_STARS();
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
	public EEE_STARS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(153, 204, 204));
		frame.getContentPane().setBackground(new Color(255, 255, 153));
		frame.setBounds(100, 100, 921, 842);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CNUVERSE");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\c1.PNG"));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 50));
		lblNewLabel.setBounds(10, 75, 385, 423);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(295, 282, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CNUVERSE");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 60));
		lblNewLabel_2.setBounds(242, 11, 331, 84);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\C22.PNG"));
		lblNewLabel_3.setBounds(400, 75, 495, 294);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS: 30,00,000/-");
		lblNewLabel_4.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblNewLabel_4.setBounds(96, 497, 196, 35);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS:15,00,000/-");
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_5.setBounds(560, 367, 169, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"KOTHA MACHINE", "MRF TYRES", "STINELESS STINE BODY", "POWERFUL"}));
		comboBox.setBounds(87, 525, 145, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MASSY FERGUSON TRACTOR", "CRI TYRES", "POWERGENERATOR", "POWER STERING"}));
		comboBox_1.setBounds(560, 394, 133, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\cc4.jpg"));
		lblNewLabel_6.setBounds(489, 456, 331, 249);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("RS : 100000/-\r\n");
		lblNewLabel_7.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		lblNewLabel_7.setBounds(560, 701, 169, 35);
		frame.getContentPane().add(lblNewLabel_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"PUMPSET", "GENERATOR", "220V SUPPLY"}));
		comboBox_2.setBounds(560, 728, 145, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("CART:0\r\n");
		lb.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb.setBounds(714, 0, 102, 35);
		frame.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("Bill:0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb2.setBounds(714, 28, 181, 29);
		frame.getContentPane().add(lb2);
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
			   b=b+3000000;
				lb2.setText("bill:"+b);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(97, 554, 119, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
				b=b+1500000;
				lb2.setText("bill:"+b);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(570, 422, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("ADD TO CART");
		btnNewButton_1_1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
				b=b+100000;
				lb2.setText("bill:"+b);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBounds(584, 757, 109, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	
	}
}
