<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
	<form:form modelAttribute="seller" action="updateSeller">
		<label>Id:</label>
		<form:input path="id" />
		<br>
		<br>
		<label>Name:</label>
		<form:input path="name" />
		<br>
		<br>
		<label>Gender:</label>
		<form:input path="gender" />
		<br>
		<br>
		<label>Address:</label>
		<form:input path="address" />
		<br>
		<br>
		
		<label>Ph.No:</label>
		<form:input path="phNo" />
		<br>
		<br>
		<label>Sell Date:</label>
		<form:input path="date" />
		<br>
		<br>
		<input type="submit" value="Update Seller">




	</form:form>


</body>
</html>