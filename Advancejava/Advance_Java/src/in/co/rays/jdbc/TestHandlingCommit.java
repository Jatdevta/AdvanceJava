package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestHandlingCommit {
	public static void main(String[] args) throws Exception {
	
		

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

			//conn.setAutoCommit(false);

			Statement s = conn.createStatement();

			int i = s.executeUpdate("insert into result values (13,'ram',100)");
			i = s.executeUpdate("insert into result values (14,'krishna',300)");
			i = s.executeUpdate("insert into result values (14,'vansh',400)");
			
			System.out.println("Data insert = "+ i);
			
			//conn.commit();
		}

}
