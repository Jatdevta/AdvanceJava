package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDelete {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		Statement smt = cn.createStatement();
		
		int i = smt.executeUpdate("delete from result where id = 2");
		
		System.out.println("Data Deleted = "+i);
	}

}
