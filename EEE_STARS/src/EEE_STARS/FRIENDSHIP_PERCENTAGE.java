package EEE_STARS;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FRIENDSHIP_PERCENTAGE {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRIENDSHIP_PERCENTAGE window = new FRIENDSHIP_PERCENTAGE();
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
	public FRIENDSHIP_PERCENTAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 181));
		frame.setBounds(100, 100, 898, 809);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FRIENDSHIP PERCENTAGE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel.setBounds(10, 2, 843, 108);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblName.setBounds(86, 152, 120, 86);
		frame.getContentPane().add(lblName);
		
		JLabel lblFriendName = new JLabel("FRIEND NAME");
		lblFriendName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFriendName.setBounds(85, 216, 191, 86);
		frame.getContentPane().add(lblFriendName);
		
		tb1 = new JTextField();
		tb1.setBounds(289, 171, 310, 36);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(295, 245, 304, 36);
		frame.getContentPane().add(tb2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\LLLL.jpg"));
		lblNewLabel_1.setBounds(697, 28, 203, 80);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\FRIEND.jpg"));
		lblNewLabel_2.setBounds(10, 536, 232, 223);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lb = new JLabel("");
		lb.setFont(new Font("Tahoma", Font.BOLD, 50));
		lb.setBounds(226, 347, 322, 93);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r= new Random();
				int n=r.nextInt(1,100);
				lb.setText(n+"% of love");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(252, 521, 310, 69);
		frame.getContentPane().add(btnNewButton);
	}
}
