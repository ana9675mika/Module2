<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="updateCustomerAction.obj" 
 modelAttribute="customer" method="post">
<H2>Customer Registration Form</H2>
<table>
<tr><td>Customer Id:<sf:input type="text" path="customerId" readonly="readonly"></sf:input>

<tr><td>Enter First Name :
<sf:input type="text" path="firstName"></sf:input>
<sf:errors path="firstName"></sf:errors>

<tr><td>Enter Last Name :
<sf:input type="text" path="lastName"></sf:input>
<sf:errors path="lastName"></sf:errors>

<tr><td>Enter Age :
<sf:input type="text" path="age"></sf:input>
<sf:errors path="age"></sf:errors>

<tr><td>Enter mobile no :
<sf:input type="text" path="mobileNo"></sf:input>
<sf:errors path="mobileNo"></sf:errors>

<tr><td>Enter Email ID  :<sf:input type="email" path="email"></sf:input>
<tr><td>Select City : <sf:select path="city">
<sf:option value="Pune">PUNE</sf:option>
<sf:option value="Mumbai">MUMBAI</sf:option>
<sf:option value="Delhi">Delhi</sf:option>
<sf:option value="Noida">Noida</sf:option>
<sf:option value="Bangalore">Bangalore</sf:option></sf:select></td></tr>
<tr><td><input type="submit" name="submit" value="Register Me ">
</td></tr>
</table>
</sf:form>
</body>
</html>