package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class SignupForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;
	private JTextField Fnametxt;
	private JTextField Lnametxt;
	private JTextField Emailtxt;
	private JPasswordField Pswtxt;
	private JPasswordField Repswtxt;
	private JTextField Phonetxt;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupForm frame = new SignupForm();
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
	public SignupForm() {
		setTitle("Signup Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getBtnNewButton());
		contentPane.add(getFnametxt());
		contentPane.add(getLnametxt());
		contentPane.add(getEmailtxt());
		contentPane.add(getPswtxt());
		contentPane.add(getRepswtxt());
		contentPane.add(getPhonetxt());
		contentPane.add(getBtnNewButton_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(49, 60, 162, 30);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Last Name");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(49, 160, 162, 30);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Email");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(49, 260, 162, 30);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Password");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(49, 360, 162, 30);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Re-type Password");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(49, 460, 162, 30);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Phone no.");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(49, 560, 162, 30);
		}
		return lblNewLabel_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Sign Up");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String fname= Fnametxt.getText();
					String lname= Lnametxt.getText();
					String email= Emailtxt.getText();
					String password= Pswtxt.getText();
					String repassword= Repswtxt.getText();
					String phone= Phonetxt.getText();
					
					if(password.equals(repassword)) {
						
						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdemo", "root", "");
							
							String sql="insert into signup(firstname, lastname, email, password, phone)values('"+fname+"','"+lname+"','"+email+"','"+password+"','"+phone+"')";
							Statement stm= con.createStatement();
							stm.execute(sql);
							con.close();
							
							JOptionPane.showMessageDialog(null, "Signup Successful");
							new LoginForm().setVisible(true);
							dispose();
							
							
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} 
						
					}else {
						JOptionPane.showMessageDialog(null, "Password doesn't match");
					}
					
					
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(373, 637, 143, 46);
		}
		return btnNewButton;
	}
	private JTextField getFnametxt() {
		if (Fnametxt == null) {
			Fnametxt = new JTextField();
			Fnametxt.setBounds(320, 60, 355, 30);
			Fnametxt.setColumns(10);
		}
		return Fnametxt;
	}
	private JTextField getLnametxt() {
		if (Lnametxt == null) {
			Lnametxt = new JTextField();
			Lnametxt.setBounds(320, 160, 355, 30);
			Lnametxt.setColumns(10);
		}
		return Lnametxt;
	}
	private JTextField getEmailtxt() {
		if (Emailtxt == null) {
			Emailtxt = new JTextField();
			Emailtxt.setBounds(320, 260, 355, 30);
			Emailtxt.setColumns(10);
		}
		return Emailtxt;
	}
	private JPasswordField getPswtxt() {
		if (Pswtxt == null) {
			Pswtxt = new JPasswordField();
			Pswtxt.setBounds(320, 360, 355, 35);
		}
		return Pswtxt;
	}
	private JPasswordField getRepswtxt() {
		if (Repswtxt == null) {
			Repswtxt = new JPasswordField();
			Repswtxt.setBounds(320, 460, 355, 30);
		}
		return Repswtxt;
	}
	private JTextField getPhonetxt() {
		if (Phonetxt == null) {
			Phonetxt = new JTextField();
			Phonetxt.setBounds(320, 560, 355, 30);
			Phonetxt.setColumns(10);
		}
		return Phonetxt;
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
			btnNewButton_1.setBounds(760, 11, 111, 30);
		}
		return btnNewButton_1;
	}
}
