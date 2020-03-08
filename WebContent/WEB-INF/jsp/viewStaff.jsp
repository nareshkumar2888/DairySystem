<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
        <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
    
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
<table border="1">
 <tr>
 <th>Staff Id</th>
 <th>Staff Name</th>
 <th>Staff Gender</th>
 <th>Staff Address</th>
  <th>Staff Designation</th>
 
  <th>Staff Salary</th>
  <th>Staff Phone</th>
  <th>Staff DOJ</th>
 
 </tr>
 <c:forEach items="${viewstaff}" var="staff">
 <tr>
 <td>${staff.id}</td>
 <td>${staff.name}</td>
 <td>${staff.gender}</td>
 <td>${staff.address}</td>
  <td>${staff.desg}</td>
  <td>${staff.salary}</td>
  <td>${staff.phNo}</td>
  <td>${staff.doj}</td>
 
 </tr>
 </c:forEach>
 </table>

</body>
</html>