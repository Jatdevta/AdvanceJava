package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAddTest {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		Statement stmt = cn.createStatement();
		
		int i = stmt.executeUpdate("insert into result values(25,'Arjun',444)");
		
		System.out.println("Data inserted = "+i);
		
		
		
		
	}

}

