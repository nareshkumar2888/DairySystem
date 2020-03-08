<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Staff</title>
</head>
<body>
<%
if(session.getAttribute("username")==null){
	response.sendRedirect("login");
}
%>
	<form:form modelAttribute="staff" action="insertStaff">
		<label>Id:</label>
		<form:input path="id" palceholder="Enter Staff Id" id="id"/>
		<br>
		<br>
		<label>Name:</label>
		<form:input path="name" palceholder="Enter Staff Name" id="name" />
		<br>
		<br>
		<label>Gender:</label>
				<form:input path="gender" palceholder="Enter Gender" id="gender" />
	
		<br>
		<br>
		<label>Address:</label>
		<form:input path="address"  palceholder="Enter Staff Address" id="address"/>
		<br>
		<br>
		<label>Designation:</label>
		<form:input path="desg" palceholder="Enter Designation" id="desg" />
		<br>
		<br>
		<label>Salary:</label>
		<form:input path="salary" palceholder="Enter Staff Salary" id="salary" />
		<br>
		<br>
		<label>Ph.No:</label>
		<form:input path="phNo" palceholder="Enter Staff Phone No" id="phNo"/>
		<br>
		<br>
		<label>DOJ:</label>
		<form:input path="doj" palceholder="Enter Staff DOJ" id="doj" />
		<br>
		<br>
		<input type="submit" value="Add Staff">




	</form:form>

</body>
</html>