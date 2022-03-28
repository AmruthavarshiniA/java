package com.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String data="Insert into student(roolno,subject,name,city)values(?,?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root123");
		PreparedStatement pst=conn.prepareStatement(data);
		pst.setInt(1, Integer.parseInt(args[0]));
		pst.setString(2, args[1]);
		pst.setString(3, args[2]);
		pst.setString(4, args[3]);
	    
		pst.executeUpdate();
		System.out.println("student is added");
		
	}
}
