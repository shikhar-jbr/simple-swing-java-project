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
import javax.swing.JRadioButton;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudedntForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField Fnametxt;
	private JLabel lblNewLabel_1;
	private JTextField Lnametxt;
	private JLabel lblNewLabel_2;
	private JRadioButton Malerb;
	private JRadioButton Femalerb;
	private JLabel lblNewLabel_3;
	private JTextField Collegetxt;
	private JLabel lblNewLabel_4;
	private JDateChooser Dobc;
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
	private JComboBox Statecom;
	private JTextField Rolltxt;
	private JButton Addbtn;
	private JButton Deletebtn;
	private JButton Updatebtn;
	private JButton Viewbtn;
	private JButton Printbtn;
	private JLabel lblNewLabel_11;
	private JTextField Searchtxt;
	private JScrollPane scrollPane;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudedntForm frame = new StudedntForm();
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
	public StudedntForm() {
		setTitle("Student Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getFnametxt());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLnametxt());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getMalerb());
		contentPane.add(getFemalerb());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getCollegetxt());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getDobc());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getPhonetxt());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getEmailtxt());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getLblNewLabel_10());
		contentPane.add(getCountrytxt());
		contentPane.add(getCitytxt());
		contentPane.add(getStatecom());
		contentPane.add(getRolltxt());
		contentPane.add(getAddbtn());
		contentPane.add(getDeletebtn());
		contentPane.add(getUpdatebtn());
		contentPane.add(getViewbtn());
		contentPane.add(getPrintbtn());
		contentPane.add(getLblNewLabel_11());
		contentPane.add(getSearchtxt());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton());
		displayData();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(10, 27, 93, 35);
		}
		return lblNewLabel;
	}
	private JTextField getFnametxt() {
		if (Fnametxt == null) {
			Fnametxt = new JTextField();
			Fnametxt.setBounds(126, 27, 180, 35);
			Fnametxt.setColumns(10);
		}
		return Fnametxt;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Last Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(10, 73, 93, 35);
		}
		return lblNewLabel_1;
	}
	private JTextField getLnametxt() {
		if (Lnametxt == null) {
			Lnametxt = new JTextField();
			Lnametxt.setBounds(126, 77, 180, 31);
			Lnametxt.setColumns(10);
		}
		return Lnametxt;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Gender");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(10, 119, 93, 35);
		}
		return lblNewLabel_2;
	}
	private JRadioButton getMalerb() {
		if (Malerb == null) {
			Malerb = new JRadioButton("Male");
			buttonGroup.add(Malerb);
			Malerb.setFont(new Font("Tahoma", Font.PLAIN, 16));
			Malerb.setBounds(126, 125, 60, 23);
		}
		return Malerb;
	}
	private JRadioButton getFemalerb() {
		if (Femalerb == null) {
			Femalerb = new JRadioButton("Female");
			buttonGroup.add(Femalerb);
			Femalerb.setFont(new Font("Tahoma", Font.PLAIN, 16));
			Femalerb.setBounds(201, 125, 88, 23);
		}
		return Femalerb;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("College");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_3.setBounds(10, 165, 93, 35);
		}
		return lblNewLabel_3;
	}
	private JTextField getCollegetxt() {
		if (Collegetxt == null) {
			Collegetxt = new JTextField();
			Collegetxt.setBounds(126, 169, 180, 31);
			Collegetxt.setColumns(10);
		}
		return Collegetxt;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("D.O.B");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_4.setBounds(10, 211, 93, 35);
		}
		return lblNewLabel_4;
	}
	private JDateChooser getDobc() {
		if (Dobc == null) {
			Dobc = new JDateChooser();
			Dobc.setBounds(126, 215, 180, 31);
		}
		return Dobc;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Phone");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(10, 257, 93, 35);
		}
		return lblNewLabel_5;
	}
	private JTextField getPhonetxt() {
		if (Phonetxt == null) {
			Phonetxt = new JTextField();
			Phonetxt.setBounds(126, 260, 180, 32);
			Phonetxt.setColumns(10);
		}
		return Phonetxt;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Email");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_6.setBounds(10, 303, 93, 35);
		}
		return lblNewLabel_6;
	}
	private JTextField getEmailtxt() {
		if (Emailtxt == null) {
			Emailtxt = new JTextField();
			Emailtxt.setBounds(126, 306, 180, 32);
			Emailtxt.setColumns(10);
		}
		return Emailtxt;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Country");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(10, 349, 93, 35);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("City");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_8.setBounds(10, 395, 93, 35);
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("State");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_9.setBounds(10, 459, 93, 35);
		}
		return lblNewLabel_9;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("Roll No.");
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_10.setBounds(10, 517, 93, 35);
		}
		return lblNewLabel_10;
	}
	private JTextField getCountrytxt() {
		if (Countrytxt == null) {
			Countrytxt = new JTextField();
			Countrytxt.setBounds(126, 352, 180, 32);
			Countrytxt.setColumns(10);
		}
		return Countrytxt;
	}
	private JTextField getCitytxt() {
		if (Citytxt == null) {
			Citytxt = new JTextField();
			Citytxt.setBounds(126, 398, 180, 32);
			Citytxt.setColumns(10);
		}
		return Citytxt;
	}
	private JComboBox getStatecom() {
		if (Statecom == null) {
			Statecom = new JComboBox();
			Statecom.setModel(new DefaultComboBoxModel(new String[] {"------------Select State-------------", "State 1", "State 2", "State 3", "State 4", "State 5", "State 6", "State 7"}));
			Statecom.setBounds(126, 462, 180, 33);
		}
		return Statecom;
	}
	private JTextField getRolltxt() {
		if (Rolltxt == null) {
			Rolltxt = new JTextField();
			Rolltxt.setBounds(126, 519, 180, 35);
			Rolltxt.setColumns(10);
		}
		return Rolltxt;
	}
	private JButton getAddbtn() {
		if (Addbtn == null) {
			Addbtn = new JButton("Add");
			Addbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Student s = new Student();
					
					s.setFname(Fnametxt.getText());
					s.setLname(Lnametxt.getText());
					s.setCity(Citytxt.getText());
					s.setCollege(Collegetxt.getText());
					s.setCountry(Countrytxt.getText());
					s.setDob(new Date(Dobc.getDate().getTime()));
					s.setEmail(Emailtxt.getText());
					s.setPhone(Phonetxt.getText());
					s.setRollno(Integer.valueOf(Rolltxt.getText()));
					s.setState(Statecom.getSelectedItem().toString());
					
					if(Malerb.isSelected()) {
						s.setGender("Male");
					}
					else if(Femalerb.isSelected()) {
						s.setGender("Female");
					}
		 			else {
						JOptionPane.showMessageDialog(null, "Select One Gender");
					}
					
					StudentService ss= new StudentServiceImpl();
					
					if(ss.addStudent(s)) {
						JOptionPane.showMessageDialog(null,"added success");
						displayData();
						clearText();
					}else {
						JOptionPane.showMessageDialog(null, "added failed");
					}
					
				}
			});
			Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			Addbtn.setBounds(50, 603, 101, 30);
		}
		return Addbtn;
	}
	private JButton getDeletebtn() {
		if (Deletebtn == null) {
			Deletebtn = new JButton("Delete");
			Deletebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any data");
						return;
					}
					
					int row= table.getSelectedRow();
					int id=(int) table.getModel().getValueAt(row, 0);
					
				
					
					
					StudentService st= new StudentServiceImpl();
					
					if(st.deleteStudent(id)) {
						JOptionPane.showMessageDialog(null, "deleted successfully");
						displayData();
						clearText();
					}else {
						JOptionPane.showMessageDialog(null, "delete failed");
					}
										
				}
			});
			Deletebtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			Deletebtn.setBounds(275, 603, 101, 30);
		}
		return Deletebtn;
	}
	private JButton getUpdatebtn() {
		if (Updatebtn == null) {
			Updatebtn = new JButton("Update");
			Updatebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any data");
						return;
					}
					
					int row= table.getSelectedRow();
					int id=(int) table.getModel().getValueAt(row, 0);
					
					UpdateForm uf= new UpdateForm();
					uf.setDataForEdit(id);
					uf.setVisible(true);
					dispose();
					
					
					
				}
			});
			Updatebtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			Updatebtn.setBounds(525, 603, 101, 30);
		}
		return Updatebtn;
	}
	private JButton getViewbtn() {
		if (Viewbtn == null) {
			Viewbtn = new JButton("View");
			Viewbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any data");
						return;
					}
					
					int row= table.getSelectedRow();
					int id=(int) table.getModel().getValueAt(row, 0);
                    					
					ViewForm vf= new ViewForm();
					vf.setDataForEdit(id);
					vf.setVisible(true);
					dispose();
					
					
				}
			});
			Viewbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			Viewbtn.setBounds(775, 603, 101, 30);
		}
		return Viewbtn;
	}
	private JButton getPrintbtn() {
		if (Printbtn == null) {
			Printbtn = new JButton("Print");
			Printbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			Printbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			Printbtn.setBounds(974, 603, 101, 30);
		}
		return Printbtn;
	}
	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("Search");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_11.setBounds(576, 27, 93, 35);
		}
		return lblNewLabel_11;
	}
	private JTextField getSearchtxt() {
		if (Searchtxt == null) {
			Searchtxt = new JTextField();
			Searchtxt.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					
					String searchValue = Searchtxt.getText().trim();
					StudentService ss= new StudentServiceImpl();
					List<Student> slist= ss.searchStudent(searchValue);
					
					DefaultTableModel tmodel= (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Student s: slist) {
						
						tmodel.addRow(new Object[] {s.getId(),s.getFname(),s.getLname(),s.getRollno(),s.getGender(),s.getDob(),s.getCollege()});
						
					}
					
					
				}
			});
			Searchtxt.setBounds(690, 27, 160, 35);
			Searchtxt.setColumns(10);
		}
		return Searchtxt;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {
				
			});
			scrollPane.setBounds(339, 87, 736, 467);
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}
	private JTable getTable_1() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id","First Name", "Last Name", "Roll No", "Gender", "D.O.B","College"
				}
			));
		}
		return table;
	}
	
	
	
//	display student data in jtable
	
	private void displayData() {
		
		StudentService ss= new StudentServiceImpl();
		List<Student> slist= ss.getAllStudent();
		
		DefaultTableModel tmodel= (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Student s: slist) {
			
			tmodel.addRow(new Object[] {s.getId(),s.getFname(),s.getLname(),s.getRollno(),s.getGender(),s.getDob(),s.getCollege()});
			
		}
		
	}


	
	public void clearText() {
		
		Fnametxt.setText("");
		Lnametxt.setText("");
		buttonGroup.clearSelection();
		Collegetxt.setText("");
		Dobc.setDate(null);
		Phonetxt.setText("");
		Emailtxt.setText("");
		Countrytxt.setText("");
		Citytxt.setText("");
		Statecom.setSelectedIndex(0);
		Rolltxt.setText("");
		
		
	}

	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Logout");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String lg=JOptionPane.showInputDialog("Logout?? Yes/NO");
					
					if(lg.equalsIgnoreCase("yes")) {
						JOptionPane.showMessageDialog(null, "Logout Successful");
						new LoginForm().setVisible(true);
						dispose();
						
					}else {
						JOptionPane.showMessageDialog(null, "logout canceled");
					}
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton.setBounds(962, 27, 101, 31);
		}
		return btnNewButton;
	}
}
