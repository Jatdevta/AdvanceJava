package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.util.JDBCDataSource;


public class MarksheetModel {
	
			public void add(MarksheetBean bean) throws Exception {

			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root");
				Connection cn = JDBCDataSource.getConnection();
		
			PreparedStatement ps = cn.prepareStatement("insert into marksheet values(?, ?, ?, ?, ?, ?)");
			//ps.setInt(1, nextPk());
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
	
			ps.setInt(3, bean.getPhysics());
			ps.setInt(4, bean.getChemistry());
            ps.setInt(5, bean.getMaths());
    		ps.setInt(6, bean.getRoll_No());
			
			int i = ps.executeUpdate();
			
			System.out.println("Data inserted = "+i);
			
		
	}

	
	public void delte(int id) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root");
		
		PreparedStatement ps = conn.prepareStatement("Delete from marksheet where id =?");
		
		ps.setInt(1, id);
		
		int i  = ps.executeUpdate();
		 System.out.println("Data Deleted = "+i);
		
		
		
	}
	
	public void update(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		
		PreparedStatement ps = cnn.prepareStatement("update marksheet set name = ?, physics = ?, chemistry = ?,maths = ?,Rollnumber = ? where id = ?");
		
		ps.setString(1, bean.getName());
		
		ps.setInt(2, bean.getPhysics());
		ps.setInt(3, bean.getChemistry());
		ps.setInt(4, bean.getMaths());
		ps.setInt(5, bean.getRoll_No());
		ps.setInt(6, bean.getId());
		
		int i = ps.executeUpdate();
		System.out.println("Data updated = "+i);
		
	
	
}
	
	public List search(MarksheetBean bean, int pageNo, int pageSize) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		StringBuffer sql = new StringBuffer("select * from marksheet where 1=1");

		if (bean != null) {

			if (bean.getName() != null && bean.getName().length() > 0) {

				sql.append(" and name like '" + bean.getName() + "%'");

			}
			if (bean.getId() != 0 && bean.getId() > 0) {

				sql.append(" and id = " + bean.getId());

			}

			if (bean.getRoll_No() != 0 && bean.getRoll_No() > 0) {

				sql.append(" and roll_no = " + bean.getRoll_No());

			}

		}

		if (pageSize > 0) {

			pageNo = (pageNo - 1) * pageSize;

			sql.append(" limit " + pageNo + ", " + pageSize);

		}

		System.out.println(sql.toString());

		PreparedStatement ps = conn.prepareStatement(sql.toString());

		ResultSet rs = ps.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {

			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoll_No(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));

			list.add(bean);
		}

		return list;

	}
	
	
	public MarksheetBean  findByRoll(int rollno)throws Exception {
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		
		PreparedStatement ps = cn.prepareStatement("select * from marksheet where Rollnumber=?");
		
		ps.setInt(1, rollno);
		
		ResultSet rs = ps.executeQuery();
		
		
		MarksheetBean bean = null;
		
		while(rs.next()) {
			
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoll_No(rs.getInt(3));
			bean.setChemistry(rs.getInt(4));
			bean.setPhysics(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			
		}
		
		
		
     return bean;
		
		
	}
	
	public Integer nextPk() throws Exception {
		
		int pk = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		
		 PreparedStatement ps  =cn.prepareStatement("select max(id) from marksheet");
		           
		 ResultSet rs = ps.executeQuery();  
		 
		 while (rs.next()) {
			 
			 pk = rs.getInt(1);
		 }
		
		return pk+1;
		
		
	}
}
