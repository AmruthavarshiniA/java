package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseGetDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<Employee> al=new ArrayList<>();
		String query="select *from employees";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pwcdb","root","root123");
		PreparedStatement ps=conn.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Employee e=new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			/*String Name=rs.getString(1);
			String Email=rs.getString(2);
			String City=rs.getString(3);
			int income=rs.getInt(4);
			
			System.out.println(Name+" "+Email+" "+City+" "+income);*/
			al.add(e);
			for(Employee el:al) {
				System.out.println(el);
			}
		}
		//System.out.println("Connected...");
	}
	
}
