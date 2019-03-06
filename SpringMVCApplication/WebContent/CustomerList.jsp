<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<c:forEach items="${list}" var="customer">
<tr><Td>${customer.customerId}<td>${customer.firstName}
<td>${customer.lastName}
<td><a href="findCustomerAction.obj?custId=${customer.customerId}">update</a><td><A href="">Delete</A>
</c:forEach>
</table>
</body>
</html>