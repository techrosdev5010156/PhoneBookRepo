<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhoneBook</title>
<link href="https://cdn.datatables.net/1.10.21/css/jquery.datatables.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"></script>
<script>
$(document).ready(function() {
    $('#example').DataTable( {
        "pagingType": "full_numbers"
    } );
} );


</script>

</head>
<body>

<h2>Contact Details</h2>
<p>
<font color='green'>${sucsMsg}</font></p>
<p>
<font color='red'>${erorMsg}</font>
</p>
<form:form action="savecontact" modelAttribute="contact"
 method="POST" >
<table border="1">
<tr>

<form:hidden  path="contactId"/>
<td>ContactName:</td>
<td><form:input path="contactName"/></td>
</tr>

<tr>
<td>ContactEmail:</td>
<td><form:input path="ContactEmail"/></td>
</tr>


<tr>
<td>ContactNumber</td>
<td><form:input path="ContactNumber"/></td>
</tr>
</table>
<input type="reset" value="reset"/> |
<input type="submit" value="submit"/>



</form:form>
<br>
<a href="viewallContacts">Get All Contacts</a>

	
</body>
</html>