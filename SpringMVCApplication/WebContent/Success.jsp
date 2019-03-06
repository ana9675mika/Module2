<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>Customer Registered Successfully....</H1>
<table>
<tr><td>Customer Id : <td>${customer.customerId }</td></tr>
<tr><td>First Name : <td>${customer.firstName}</td></tr>
<tr><td>Last Name : <td>${customer.lastName}</td></tr>
<tr><td>email  : <td>${customer.email}</td></tr>
</table>
</body>
</html>