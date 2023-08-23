package in.co.rays.ctl;



////ye kisi kam ki nahi hai..shok k liye bna li thi......



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.bean.UserBean;
import in.co.rays.model.MarksheetModel;
@WebServlet("/ MarksheetCtl")
public class MarksheetCtl extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 String op = req.getParameter("opertion");
	 
	 if(op.equals("SignUp")) {
	     int id = Integer.parseInt(req.getParameter("id"));
		 String name = req.getParameter("name");
		 int roll_no = Integer.parseInt(req.getParameter("roll_no"));
		 int physics = Integer.parseInt(req.getParameter("physics"));
		 int chemistry =Integer.parseInt( req.getParameter("chemistry"));
		 int maths = Integer.parseInt(req.getParameter("maths"));

		MarksheetBean bean = new MarksheetBean();
		
		bean.setId(id);
		bean.setName(name);
		bean.setRoll_No(roll_no);
		bean.setPhysics(physics);
		bean.setChemistry(chemistry);
		bean.setMaths(maths);
		
		MarksheetModel model = new MarksheetModel();
		 
		
	 }
 }
	 
	 
// resp.sendRedirect("MarksheetRegistration.jsp");
 

 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
 }	
	 
}
