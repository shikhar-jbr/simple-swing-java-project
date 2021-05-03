package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField Emailtxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPasswordField Pswtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getEmailtxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getPswtxt());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Welcome To Swing Database");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
			lblNewLabel.setBounds(95, 89, 621, 62);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Email");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(133, 214, 90, 29);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Password");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(133, 356, 90, 29);
		}
		return lblNewLabel_2;
	}
	private JTextField getEmailtxt() {
		if (Emailtxt == null) {
			Emailtxt = new JTextField();
			Emailtxt.setBounds(302, 214, 306, 29);
			Emailtxt.setColumns(10);
		}
		return Emailtxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String email= Emailtxt.getText();
					String password= Pswtxt.getText();
					
					if(email.isEmpty()) {
						
							JOptionPane.showMessageDialog(null,"Enter Username");
							return;
						}
					if(password.isEmpty()) {
						JOptionPane.showMessageDialog(null,"Enter Password");
						return;
					}
					
//					check user in database
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdemo", "root", "");
						
						String sql="select * from signup where email='"+email+"' and password='"+password+"'";
						Statement stm= con.createStatement();
						ResultSet rs= stm.executeQuery(sql);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "login Success");
							new StudedntForm().setVisible(true);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "login failed");
						}
						
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
										
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(330, 480, 140, 42);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index().setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_1.setBounds(710, 11, 108, 29);
		}
		return btnNewButton_1;
	}
	private JPasswordField getPswtxt() {
		if (Pswtxt == null) {
			Pswtxt = new JPasswordField();
			Pswtxt.setBounds(302, 356, 306, 29);
		}
		return Pswtxt;
	}
}
