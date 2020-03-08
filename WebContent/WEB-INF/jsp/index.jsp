<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath }/static/css/style.css"
	rel="stylesheet" type="text/">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
<style type="text/css">
body {
	background-image: url("${pageContext.request.contextPath }/static/images/cow4.webp");
	background-repeat:no-repeat;
	background-attachment:fixed;
	background-size:100% 100%;
	
}
h1{
	background-color:none;
	padding:30px;
	text-align:center;
	font-size:50px;
	color:white;
	text-shadow:3px 2px red;
}
a{
float:left;
width:30%;
height:300px;
background:none;
padding:20px;
font-size:150%;
color:white;
}
</style>
</head>

	<body>
		<h1>Dairy Management System</h1>
		<a href="index">Home</a>
		<a href="login">login</a>
		
	</body>

</html>