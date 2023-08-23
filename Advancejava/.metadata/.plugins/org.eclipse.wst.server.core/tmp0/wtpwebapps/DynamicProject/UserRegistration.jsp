<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SYSTUMM....!!!!!!</title>
</head>
<body>
	<center>

		<body>
			<%
				String msg = (String) request.getAttribute("msg");
			%>
			<form action="UserCtl" method="post">
				<table>

					<tr>
						<%
							if (msg != null) {
						%>
						<%=msg%>
						<%
							}
						%>
					</tr>
					<tr>
						<h1>
							<font color="green">SYSTUMM....!!! REGISTRATION
								FORM&#128526: &#128151 </font>
						</h1>
						<hr>
						<th style="color: red;">First Name :</th>
						<td><input type="text" name="firstName"></td>
					</tr>
					<tr>
						<th style="color: pink;">Last Name :</th>
						<td><input type="text" name="lastName"></td>
					</tr>
					<tr>
						<th style="color: blue;">LoginId :</th>
						<td><input type="text" name="loginId"></td>
					</tr>
					<tr>
						<th style="color: yellow;">Password :</th>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<th style="color: voilet;">DOB :</th>
						<td><input type="date" name="dob"></td>
					</tr>
					<tr>
						<th style="color: green;">Address :</th>
						<td><input type="text" name="address"></td>
					</tr>
					<tr>
						<th></th>
						<td><input type="submit" name="operation" value="SignUp">
							<input type="submit" name="operation" value="Reset"></td>
					</tr>
				</table>
			</form>
		</body>
</html>