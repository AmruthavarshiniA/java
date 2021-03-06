package com.examples.business.rules;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.examples.business.data.StudentDAO;

public class StudeentInsert {

	public static void main(String[] args) throws SQLException {
		
		StudentDAO ob=new StudentDAO();
		String data="Insert into student_master(student_roll_no,student_name,student_gender,student_email,student_city,maths_marks,physics_marks,chemistry_marks,computer_science_marks)values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst=ob.getConn().prepareStatement(data);
		pst.setInt(1, Integer.parseInt(args[0]));
		pst.setString(2, args[1]);
		pst.setString(3, args[2]);
		pst.setString(4, args[3]);
		pst.setString(5, args[4]);
		pst.setInt(6, Integer.parseInt(args[5]));
		pst.setInt(7, Integer.parseInt(args[6]));
		pst.setInt(8, Integer.parseInt(args[7]));
		pst.setInt(9, Integer.parseInt(args[8]));
		
		pst.executeUpdate();
		System.out.println("student is added");
		
	}
}
