package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		Statement stmt = con.createStatement();
		
		int i = stmt.executeUpdate("update result set physics = 78 where id =2");
		System.out.println("Data Update = "+i);
	}

}
