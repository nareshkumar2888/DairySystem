<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<style type="text/css">
body {
	background-image:
		url("${pageContext.request.contextPath }/static/images/cow4.webp");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}
form{
text-align:center;
	padding:10%;
	font-size:50px;
		color:radium;
	

}

</style>
</head>
<body>
	<form action="dashboard" method="post">
		<div>
		<label id="user">UserName:</label>
		<input type="text" name="user" id="user"
			placeholder="Enter Your Name Here" /><br>
		<br> <label id="pswd">Password:</label><input type="text" name="pswd" id="pswd"
			placeholder="Enter Your Password Here" /> <br><br><input type="submit"
			value="login">
		</div>
			</form>
</body>
</html>