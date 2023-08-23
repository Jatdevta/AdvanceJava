package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransactionHandling {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

			conn.setAutoCommit(false);

			Statement s = conn.createStatement();

			int i = s.executeUpdate("insert into result values (10,'ram',100)");
			i = s.executeUpdate("insert into result values (11,'krishna',300)");
			i = s.executeUpdate("insert into result values (12,'vansh',400)");
		//	System.out.println("Data create= "+i);
			conn.commit();
		}

		catch (Exception e) {
			conn.rollback();
		}
	}

}
