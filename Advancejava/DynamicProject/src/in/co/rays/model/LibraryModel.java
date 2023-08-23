package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.rays.bean.LibraryBean;
import in.co.rays.bean.UserBean;
import in.co.rays.util.JDBCDataSource;

public class LibraryModel {
public static void Add(LibraryBean bean) throws Exception {
	
	//Connection con = JDBCDataSource.getConnection();
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root");
	
	PreparedStatement ps = con.prepareStatement("insert into library values(?,?,?,?,?,?,?)");

	ps.setInt(1, bean.getId());
//	ps.setInt(1, nextPk());
	ps.setString(2, bean.getStudent_name());
	ps.setInt(3, bean.getFees());
	ps.setInt(4, bean.getMobile_no());
	ps.setString(5, bean.getAddress());
	ps.setInt(6, bean.getSeat_no());
	ps.setDate(7, new java.sql.Date(bean.getDob().getTime()));
	
	int i = ps.executeUpdate();
	
	System.out.println("Data inserted = "+i);
	
	
}
  public void Update(LibraryBean bean) throws Exception {
	  
	// Connection cn = JDBCDataSource.getConnection();
	
	
	     Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root");
		
	 PreparedStatement ps = conn.prepareStatement("update library set student_name = ?,fees = ?,mobile_no = ?,address = ?,seat_no = ?,dob = ? where id = ? ");
	
	    ps.setString(1, bean.getStudent_name());
		ps.setInt(2, bean.getFees());
		ps.setInt(3, bean.getMobile_no());
		ps.setString(4, bean.getAddress());
		ps.setInt(5, bean.getSeat_no());
		ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		ps.setInt(7, bean.getId());
		
		
		int i = ps.executeUpdate();
		System.out.println("Data updated = "+i);
		
	  
  }
  
	public void delte(int id) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root");
		
		PreparedStatement ps = conn.prepareStatement("Delete from library where id =?");
		
		ps.setInt(1, id);
		
		int i  = ps.executeUpdate();
		 System.out.println("Data Deleted = "+i);
		
		
		
	}public static Integer nextPk() throws Exception {
		int Pk = 0;

	//	Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		Connection cn = JDBCDataSource.getConnection();
		PreparedStatement ps = cn.prepareStatement("select max(id) from library");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			Pk = rs.getInt(1);
		}
		return  Pk + 1;
}
	public LibraryBean findByPk(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from library where id =?");

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		LibraryBean bean = null;

		while (rs.next()) {
			bean = new LibraryBean();

			bean.setId(rs.getInt(1));
			bean.setStudent_name(rs.getString(2));
			bean.setFees(rs.getInt(3));
			bean.setMobile_no(rs.getInt(4));
			bean.setAddress(rs.getString(5));
			bean.setSeat_no(rs.getInt(6));
			bean.setDob(rs.getDate(7));
		

		}
		return bean;
	}
}