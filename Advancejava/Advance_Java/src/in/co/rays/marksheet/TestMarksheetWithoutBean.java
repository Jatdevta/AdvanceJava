package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestMarksheetWithoutBean {
	public static void main(String[] args) throws Exception {
		
		//testAdd();
		//testDelete();
	     testupdate();
	}

	
	private static void testAdd()  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		PreparedStatement ps = cn.prepareStatement("insert into result values(?,?,?)");
		
		ps.setInt(1, 19);
		ps.setString(2, "Ballu");
		ps.setInt(3,65 );
		 int i = ps.executeUpdate();
		 System.out.println( "inserted ="+i);
		 
		 
		 
		
	}

	
	public static void testDelete()throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		PreparedStatement ps = cn.prepareStatement("delete from result where id = ?");
		
		ps.setInt(1, 25);
		 int i = ps.executeUpdate();
		 
		 System.out.println("deleted = "+i);
		
	}
	
	
    private static void testupdate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		PreparedStatement ps = cn.prepareStatement("update result set name =?,physics =?,where id = ?");
		
	    
		
		ps.setInt(2,2);
		ps.setString(2,"rrrr");
	    ps.setInt(3, 70);
		int i = ps.executeUpdate();
		System.out.println("update = "+i);
	     }

		
		
		
	}

	
		
	

	
