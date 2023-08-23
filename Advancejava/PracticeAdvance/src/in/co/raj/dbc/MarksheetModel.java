package in.co.raj.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class MarksheetModel {
	
	public void add (MarksheetBean bean) throws Exception {
		Class.forName("com.myql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:33306/university","root","root");
		PreparedStatement ps = cn.prepareStatement("insert into marksheet values(?,?,?,?,?)");
		
		ps.setInt(1,bean.getId());
		ps.setString(2,bean.getName());
		ps.setInt(3,bean.getRoll_no());
		ps.setInt(4,bean.getPhysics());
		ps.setInt(5,bean.getChemistry());
		ps.setInt(6,bean.getMaths());
		
		
		
		
		
	}

}
