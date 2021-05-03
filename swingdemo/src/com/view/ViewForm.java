package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewForm extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JLabel lblNewLabel;
	private JTextField Fnametxt;
	private JLabel lblNewLabel_1;
	private JTextField Lnametxt;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField Collegetxt;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField Phonetxt;
	private JLabel lblNewLabel_6;
	private JTextField Emailtxt;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField Countrytxt;
	private JTextField Citytxt;
	private JTextField Rolltxt;
	private JButton Backbtn;
	private JTextField Dobtxt;
	private JTextField Statetxt;
	private JTextField Gendertxt;
	private int sid;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewForm frame = new ViewForm();
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
	public ViewForm() {
		setTitle("View Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getContentPane_1());
	}

	private JPanel getContentPane_1() {
		if (contentPane_1 == null) {
			contentPane_1 = new JPanel();
			contentPane_1.setLayout(null);
			contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane_1.setBounds(0, 0, 948, 685);
			contentPane_1.add(getLblNewLabel());
			contentPane_1.add(getFnametxt());
			contentPane_1.add(getLblNewLabel_1());
			contentPane_1.add(getLnametxt());
			contentPane_1.add(getLblNewLabel_2());
			contentPane_1.add(getLblNewLabel_3());
			contentPane_1.add(getCollegetxt());
			contentPane_1.add(getLblNewLabel_4());
			contentPane_1.add(getLblNewLabel_5());
			contentPane_1.add(getPhonetxt());
			contentPane_1.add(getLblNewLabel_6());
			contentPane_1.add(getEmailtxt());
			contentPane_1.add(getLblNewLabel_7());
			contentPane_1.add(getLblNewLabel_8());
			contentPane_1.add(getLblNewLabel_9());
			contentPane_1.add(getLblNewLabel_10());
			contentPane_1.add(getCountrytxt());
			contentPane_1.add(getCitytxt());
			contentPane_1.add(getRolltxt());
			contentPane_1.add(getBackbtn());
			contentPane_1.add(getDobtxt());
			contentPane_1.add(getStatetxt());
			contentPane_1.add(getGendertxt());
		}
		return contentPane_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(211, 33, 146, 35);
		}
		return lblNewLabel;
	}
	private JTextField getFnametxt() {
		if (Fnametxt == null) {
			Fnametxt = new JTextField();
			Fnametxt.setEnabled(false);
			Fnametxt.setColumns(10);
			Fnametxt.setBounds(380, 33, 328, 35);
		}
		return Fnametxt;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Last Name");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(211, 79, 146, 35);
		}
		return lblNewLabel_1;
	}
	private JTextField getLnametxt() {
		if (Lnametxt == null) {
			Lnametxt = new JTextField();
			Lnametxt.setEnabled(false);
			Lnametxt.setColumns(10);
			Lnametxt.setBounds(380, 83, 328, 31);
		}
		return Lnametxt;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Gender");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(211, 125, 146, 35);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("College");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_3.setBounds(221, 171, 136, 35);
		}
		return lblNewLabel_3;
	}
	private JTextField getCollegetxt() {
		if (Collegetxt == null) {
			Collegetxt = new JTextField();
			Collegetxt.setEnabled(false);
			Collegetxt.setColumns(10);
			Collegetxt.setBounds(380, 175, 328, 31);
		}
		return Collegetxt;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("D.O.B");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_4.setBounds(211, 217, 146, 35);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Phone");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_5.setBounds(211, 263, 146, 35);
		}
		return lblNewLabel_5;
	}
	private JTextField getPhonetxt() {
		if (Phonetxt == null) {
			Phonetxt = new JTextField();
			Phonetxt.setEnabled(false);
			Phonetxt.setColumns(10);
			Phonetxt.setBounds(380, 266, 328, 32);
		}
		return Phonetxt;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Email");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_6.setBounds(211, 309, 146, 35);
		}
		return lblNewLabel_6;
	}
	private JTextField getEmailtxt() {
		if (Emailtxt == null) {
			Emailtxt = new JTextField();
			Emailtxt.setEnabled(false);
			Emailtxt.setColumns(10);
			Emailtxt.setBounds(380, 312, 328, 32);
		}
		return Emailtxt;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Country");
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_7.setBounds(211, 355, 146, 35);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("City");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_8.setBounds(211, 401, 146, 35);
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("State");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_9.setBounds(211, 465, 146, 35);
		}
		return lblNewLabel_9;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("Roll No.");
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_10.setBounds(211, 523, 146, 35);
		}
		return lblNewLabel_10;
	}
	private JTextField getCountrytxt() {
		if (Countrytxt == null) {
			Countrytxt = new JTextField();
			Countrytxt.setEnabled(false);
			Countrytxt.setColumns(10);
			Countrytxt.setBounds(380, 358, 328, 32);
		}
		return Countrytxt;
	}
	private JTextField getCitytxt() {
		if (Citytxt == null) {
			Citytxt = new JTextField();
			Citytxt.setEnabled(false);
			Citytxt.setColumns(10);
			Citytxt.setBounds(380, 404, 328, 32);
		}
		return Citytxt;
	}
	private JTextField getRolltxt() {
		if (Rolltxt == null) {
			Rolltxt = new JTextField();
			Rolltxt.setEnabled(false);
			Rolltxt.setColumns(10);
			Rolltxt.setBounds(380, 525, 328, 35);
		}
		return Rolltxt;
	}
	private JButton getBackbtn() {
		if (Backbtn == null) {
			Backbtn = new JButton("Back");
			Backbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new StudedntForm().setVisible(true);
					dispose();
					
				}
			});
			Backbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			Backbtn.setBounds(419, 607, 121, 42);
		}
		return Backbtn;
	}
	private JTextField getDobtxt() {
		if (Dobtxt == null) {
			Dobtxt = new JTextField();
			Dobtxt.setEnabled(false);
			Dobtxt.setBounds(380, 217, 328, 35);
			Dobtxt.setColumns(10);
		}
		return Dobtxt;
	}
	private JTextField getStatetxt() {
		if (Statetxt == null) {
			Statetxt = new JTextField();
			Statetxt.setEnabled(false);
			Statetxt.setBounds(380, 465, 328, 35);
			Statetxt.setColumns(10);
		}
		return Statetxt;
	}
	private JTextField getGendertxt() {
		if (Gendertxt == null) {
			Gendertxt = new JTextField();
			Gendertxt.setEnabled(false);
			Gendertxt.setBounds(380, 134, 328, 26);
			Gendertxt.setColumns(10);
		}
		return Gendertxt;
	}
	
public void setDataForEdit(int id) {
		
		sid=id; 
		StudentService ss= new StudentServiceImpl();
		Student s= ss.getStudentById(id);
		
		Fnametxt.setText(s.getFname());
		Lnametxt.setText(s.getLname());
		Citytxt.setText(s.getCity());
		Collegetxt.setText(s.getCollege());
		Countrytxt.setText(s.getCountry());
		Dobtxt.setText(String.valueOf(s.getDob()));
		Emailtxt.setText(s.getEmail());
		Phonetxt.setText(s.getPhone());
		Rolltxt.setText(String.valueOf(s.getRollno()));
		Statetxt.setText(s.getState());
		
		if(s.getGender().equalsIgnoreCase("male")) {
			Gendertxt.setText("Male");
		}else{
			Gendertxt.setText("Female");
		}
		
	}
}
