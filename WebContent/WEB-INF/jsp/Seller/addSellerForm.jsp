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
<h1>${status}</h1>
	<form:form modelAttribute="addSeller" action="insertSeller">
		<label>Id:</label>
		<form:input path="id" palceholder="Enter Seller Id" id="id" />
		<br>
		<br>
		<label>Name:</label>
		<form:input path="name" palceholder="Enter Seller Name" id="name" />
		<br>
		<br>
		<label>Gender:</label>
		<form:input path="gender" palceholder="Enter Gender" id="gender" />

		<%-- <form:radiobutton path="gender"  id="male" name="gender" value="male" />
		<form:radiobutton path="gender"  id="female" name="gender" value="female" />
		<form:radiobutton path="gender"  id="others" name="gender" value="others" />
		 --%>
		<br>
		<br>
		<label>Address:</label>
		<form:input path="address" palceholder="Enter Seller Address"
			id="address" />
		<br>
		<br>

		<label>Ph.No:</label>
		<form:input path="phNo" palceholder="Enter Seller Phone No" id="phNo" />
		<br>
		<br>
		<label>Sell Date:</label>
		<form:input path="date" palceholder="Enter Sell date" id="selldate" />
		<br>
		<br>
		<input type="submit" value="Add Seller">




	</form:form>

</body>
</html>