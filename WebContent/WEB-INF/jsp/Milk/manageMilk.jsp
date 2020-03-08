<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login");
		}
	%>
	<ul>
		<li><a href="viewMilkRate">View Milk Rates</a></li>
		<br>
		<br>
		<li><a href="updateMilkRate">Update Milk Rate</a></li>
		<br>
		<br>
		<li><a href="logout">Logout</a></li>


	</ul>
	<table>
		<tr>
			<th>MINIMUM FAT</th>
			<th>MINIMUM RATE</th>

		</tr>

		<tr>
			<td>${data.get(0)}</td>
			<td>${data.get(1)}</td>
		</tr>

	</table>
	<table>
		<tr>
			<th>MAXIMUM FAT</th>
			<th>MAXIMUM RATE</th>
		</tr>


		<tr>
			<th>${data.get(2)}</th>
			<th>${data.get(3)}</th>
		</tr>




	</table>

</body>
</html>