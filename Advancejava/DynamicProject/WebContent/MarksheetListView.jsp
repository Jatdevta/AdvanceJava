<%@page import="in.co.rays.bean.MarksheetBean"%>
<%@page import="in.co.rays.bean.UserBean"%>
<%@page import="com.sun.source.tree.WhileLoopTree"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<center>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<form action="MarksheetListCtl" method="post" >

		<%@ include file="Header.jsp"%>
		<%
			List list = (List) request.getAttribute("list");
			Iterator it = list.iterator();
		%>
		<table border="2">
			<tr>
				<th>Id</th>

				<th>Name</th>

				<th>RollNumber</th>

				<th>Physics</th>

				<th>Chemistry</th>

				<th>Maths</th>

			</tr>
			<%
				while (it.hasNext()) {

					MarksheetBean b = (MarksheetBean)it.next();
			%>
			<tr>

				<td><%=b.getId()%></td>
				<td><%=b.getName()%></td>
				<td><%=b.getRoll_No()%></td>
				<td><%=b.getPhysics()%></td>
				<td><%=b.getChemistry()%></td>
				<td><%=b.getMaths()%></td>


			</tr>
			<%
				}
			%>
			</center>

		</table>


	</form>


</body>
</html>