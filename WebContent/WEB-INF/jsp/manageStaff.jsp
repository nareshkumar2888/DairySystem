<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Staff</title>
</head>
<body>
<%
if(session.getAttribute("username")==null){
	response.sendRedirect("login");
}
%>
<a href="index"><img src="" alt="no-image"></a>
<h1><a href="dashboard">Milk Dairy Management System</a></h1>
<ul>
<li><a href="addStaff">Add Staff</a></li>
<li><a href="viewStaff">View Staff</a></li>
<li><a href="updateStaff">update Staff Details</a></li>
<li><a href="searchStaff">delete Staff</a></li>
<li><a href="logout">Logout</a></li>
</ul>

<p>Manage Staff Details</p>
</body>
</html>