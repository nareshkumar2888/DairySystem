<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${status}</h1>
<%
if(session.getAttribute("username")==null){
	response.sendRedirect("login");
}
%>
<h1><a href="dashboard">Dairy Management System</a></h1>
<ul>
<li><a href="addSellerForm">Add Seller</a></li>
<li><a href="viewSeller">View Seller</a></li>
<li><a href="searchSeller">update Seller Details</a></li>
<li><a href="deleteSeller">delete Seller</a></li>
<li><a href="logout">Logout</a></li>
</ul>
</body>
</html>