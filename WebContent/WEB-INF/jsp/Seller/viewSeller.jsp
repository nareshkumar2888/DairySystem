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
 <th>Seller Id</th>
 <th>Seller Name</th>
 <th>Seller Gender</th>
 <th>Seller Address</th> 
  <th>Seller Phone</th>
  <th>Seller Date</th>
 
 </tr>
 <c:forEach items="${viewSeller}" var="seller">
 <tr>
 <td>${seller.id}</td>
 <td>${seller.name}</td>
 <td>${seller.gender}</td>
 <td>${seller.address}</td>
  <td>${seller.phNo}</td>
  <td>${seller.date}</td>
 
 </tr>
 </c:forEach>
 </table>
</body>
</html>