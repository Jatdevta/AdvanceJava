<%@page import="in.co.rays.model.UserModel"%>
<%@page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		UserBean bean = (UserBean) session.getAttribute("user");
	
	%>

	<%
	if(bean !=null) {
	
	%>
	<h3>
		Hi....!!!,
		<%=bean.getFirstName()  %>   </h3>
	<a href="UserListCtl">UserList</a>
	<a a href= "MarksheetListCtl">MarkList</a>
<a href="LoginCtl?operation=Logout">Logout</a>
	<a href="LoginCtl?operation=Logout">Logout </a>
	
	<%} else { %>

	<h3>Hii, Guest</h3>
	<%} %>
	<hr>

</body>
</html>