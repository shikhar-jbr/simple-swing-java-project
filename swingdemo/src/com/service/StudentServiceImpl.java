package com.service;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Student;

public class StudentServiceImpl implements StudentService {
	

	@Override
	public boolean addStudent(Student std) {
		String sql="insert into student(fname,lname,phone,email,gender,dob,college,state,country,city,rollno)values(?,?,?,?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			pstm.setString(1, std.getFname());
			pstm.setString(2, std.getLname());
			pstm.setString(3, std.getPhone());
			pstm.setString(4, std.getEmail());
			pstm.setString(5, std.getGender());
			pstm.setDate(6, std.getDob());
			pstm.setString(7, std.getCollege());
			pstm.setString(8, std.getState());
			pstm.setString(9, std.getCountry());
			pstm.setString(10, std.getCity());
			pstm.setInt(11, std.getRollno());
			
			pstm.execute();
			return true;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		
		String sql="delete from student where id= "+id;
		try{
			Statement stm = DB.getConnection().createStatement();
			
			
			stm.execute(sql);
			return true;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public boolean updateStudent(Student std) {
		
		String sql="update student set fname=?,lname=?,phone=?,email=?,gender=?,dob=?,college=?,state=?,country=?,city=?,rollno=? where id=?";
		try{
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			pstm.setString(1, std.getFname());
			pstm.setString(2, std.getLname());
			pstm.setString(3, std.getPhone());
			pstm.setString(4, std.getEmail());
			pstm.setString(5, std.getGender());
			pstm.setDate(6, std.getDob());
			pstm.setString(7, std.getCollege());
			pstm.setString(8, std.getState());
			pstm.setString(9, std.getCountry());
			pstm.setString(10, std.getCity());
			pstm.setInt(11, std.getRollno());
			pstm.setInt(12, std.getId());
			
			pstm.execute();
			return true;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;

	}

	@Override
	public Student getStudentById(int id) {
		
		Student s= new Student();
		String sql="select * from student where id= "+id;
		
		Statement stm;
		try {
			stm = DB.getConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			if(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setRollno(rs.getInt("rollno"));
				s.setGender(rs.getString("gender"));
				s.setDob(rs.getDate("dob"));
				s.setCollege(rs.getString("college"));
				s.setCity(rs.getString("city"));
				s.setCountry(rs.getString("country"));
				s.setEmail(rs.getString("email"));
				s.setPhone(rs.getString("phone"));
				s.setState(rs.getString("state"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return s;
	}

	@Override
	public List<Student> getAllStudent() {
		
		List<Student> slist= new ArrayList();
		
		String sql="select* from student";
		try {
			Statement stm= DB.getConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Student s= new Student();
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setRollno(rs.getInt("rollno"));
				s.setGender(rs.getString("gender"));
				s.setDob(rs.getDate("dob"));
				s.setCollege(rs.getString("college"));
				
				slist.add(s);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return slist;
	}

	@Override
	public List<Student> searchStudent(String data) {
		
List<Student> slist= new ArrayList();
		
		String sql="select* from student where fname like '%"+data+"%' OR college like '%"+data+"%'";
		try {
			Statement stm= DB.getConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Student s= new Student();
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setRollno(rs.getInt("rollno"));
				s.setGender(rs.getString("gender"));
				s.setDob(rs.getDate("dob"));
				s.setCollege(rs.getString("college"));
				
				slist.add(s);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return slist;
		
	}
	

}
