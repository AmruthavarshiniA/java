package com.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<Student> al=new ArrayList<>();
		String query="select *from student";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root123");
		PreparedStatement ps=conn.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Student s=new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			al.add(s);
			for(Student sl:al) {
				System.out.println(sl);
			}
		}
	}
}
