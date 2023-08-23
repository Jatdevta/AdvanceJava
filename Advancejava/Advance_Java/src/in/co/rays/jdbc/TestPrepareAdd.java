package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrepareAdd {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
	 PreparedStatement ps =   cn.prepareStatement("insert into result values (17,'Ram',123)");
	
	 int i = ps.executeUpdate();
	 
	 System.out.println(i);
	 
		
	
		
	}

}
