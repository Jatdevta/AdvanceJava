<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
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
	<form action="UserListCtl" method="post">

		<%@ include file="Header.jsp"%>
		<%
			List list = (List) request.getAttribute("list");
			int pageNo = (int) request.getAttribute("pageNo");
			int nextListSize = (int) request.getAttribute("nextListSize");
			int index = ((pageNo - 1) * 5) + 1;
			Iterator it = list.iterator();
		%>
		<table>

			<tr>

				<th><input type="text" placeholder="Enter Date of Birth"
					name="dob"> <input type="text"
					placeholder="Enter First Name" name="firstName"></th>
				<td><input type="submit" name="operation" value="Search"></td>

			</tr>
			
		</table>
<br>

		<table border="2">


			<tr>

				<th>select</th>
				<th>S.No</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>LoginId</th>
				<th>Password</th>
				<th>DOB</th>
				<th>Address</th>
				<th>Edit</th>

			</tr>
			<%
				while (it.hasNext()) {
					bean = (UserBean) it.next();
			%>
			<tr>

				<td><input type="checkbox" name="ids"
					value="<%=bean.getId()%>"></td>
				<td><%=index++%></td>
				<td><%=bean.getFirstName()%></td>
				<td><%=bean.getLastName()%></td>
				<td><%=bean.getLoginId()%></td>
				<td><%=bean.getPassword()%></td>
				<td><%=bean.getDob()%></td>
				<td><%=bean.getAddress()%></td>
				<td><a href="UserCtl?id=<%=bean.getId()%>">edit</a></td>
			</tr>
			<%
				}
			%>

			</center>
		</table>

		<tr>


			<td><input type="hidden" name="pageNo" value="<%=pageNo%>"></td>

			<td><input type="submit" name="operation" value="Previous"
				<%=(pageNo != 1) ? "" : "disabled"%>></td>
			<td><input type="submit" name="operation" value="Delete"></td>
			<td><input type="submit" name="operation" value="Next"
				<%=(nextListSize != 0) ? "" : "disabled"%>></td>


		</tr>

	</form>
</body>
</html>