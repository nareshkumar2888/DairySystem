<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>dashboard</title>
</head>
<body>
<%
if(session.getAttribute("username")==null){
	response.sendRedirect("login");
}
%>

<h1><a href="dashboard">DashBoard</a></h1>
	<c:choose>
		<c:when test="${type.equalsIgnoreCase('admin')}">
			<ul>
				<li><a href="manageSeller">Manage Seller</a></li><br><br>
				<li><a href="manageMilk">Manage Milk</a></li><br><br>
				<li><a href="manageStaff">Manage Staff</a></li><br><br>
				<li><a href="logout">Logout</a></li><br><br>

			</ul>
		</c:when>
		<c:when test="${type.equalsIgnoreCase('staff')}">
			<ul>
				<li><a href="manageSeller">Manage Seller</a></li>
				<li><a href="manageMilkRate">Manage Milk Rate</a></li>
				<li><a href="manageSellerMilkRate">Manage Seller Milk Rate</a></li>
				<li><a href="logout">Logout</a></li>

			</ul>
		</c:when><c:when test="${type.equalsIgnoreCase('seller')}">
			<ul>
				<li><a href="">View Milk Rate</a></li>
				<li><a href="">View Profile</a></li>
				<li><a href="">Solid Milk Rate Details</a></li>
				<li><a href="">Logout</a></li>

			</ul>
		</c:when>
		<c:otherwise>
		<ul>
		<li><a><h1>Invalid Access</h1></a>
		<li><a href="login">Goto HomePage</a>
		</ul>
		</c:otherwise>

	</c:choose>
	

</body>
</html>