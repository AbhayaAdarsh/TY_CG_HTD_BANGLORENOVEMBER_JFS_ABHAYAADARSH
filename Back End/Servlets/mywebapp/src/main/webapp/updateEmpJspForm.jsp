<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page session="false" %>
   <%String msg= request.getSession() %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4><a href="./home">Home</a></h4>
	<fieldset>
<legand>Add Employee</legand>
<form action="./addEmployee" method="post">
<table>
<tr>
<td>Employee ID</td>
<td>:</td>
<td><input type="number" name="empId" required>
</tr>
<tr>
<td>Employee Name</td>
<td>:</td>
<td><input type="text" name="empName" >
</tr>
<tr>
<td>Age</td>
<td>:</td>
<td><input type="number" value="empAge" >
</tr>
<tr>
<td>Salary</td>
<td>:</td>
<td><input type="number" value="empSalary" >
</tr>
<tr>
<td>Designation</td>
<td>:</td>
<td><input type="text" name="designation" >
</tr>
<tr>
<td>Password</td>
<td>:</td>
<td><input type="password" name="password" >
</tr>
<tr>
<td colspan="3" align="center"><br>
<input type="submit" value="login">
</td>
</tr>
</table>
</fieldset>
	<%if(msg !=null && !msg.isEmpty()) { %>
	<h3 style="color:green;">Employee added successfully</h3>
<%}%> 
</body>
</html>