package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAdd {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		Statement stmt = conn.createStatement();
		
		//int i = stmt.executeUpdate("insert into result values (2,'raj',200)");
		int  i = stmt.executeUpdate("insert into result values (5,'Ballu',100)");
		System.out.println("Data inserted = "+i);
	}

}
