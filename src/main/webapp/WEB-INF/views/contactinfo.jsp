<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" padding="7">
<h2 align="center">Contact Information</h2>
<thead>
<tr>
<th>S.No</th>
<th>Name</th>
<th>Email Adress</th>
<th>Phone No</th>
<th>Action</th></tr>

</thead>
<tbody>
<c:forEach items="${contactlist}" var="c" varStatus="index">
<tr>
<td>${index.count}</td>
<td>${c.contactName }</td>
<td>${c.contactEmail }</td>
<td>${c.contactNumber }</td>

<td>
   <a href="editContact?id=${c.contactId }">Edit</a>
   <a href="deleteContact?id=${c.contactId }">Delete</a></td></tr>
</c:forEach>
</tbody>
</table>


</body>
</html>