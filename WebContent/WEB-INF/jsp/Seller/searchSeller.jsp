<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("username")==null){
	response.sendRedirect("login");
}
%>
<h1>${seller}</h1>
<form action="updateSellerForm">
		<label>Seller ID</label> <input type="text" name="id"
			placeholder="Enter Seller ID"> <br> <br> <input
			type="submit" value="search">
	</form>

</body>
</html>