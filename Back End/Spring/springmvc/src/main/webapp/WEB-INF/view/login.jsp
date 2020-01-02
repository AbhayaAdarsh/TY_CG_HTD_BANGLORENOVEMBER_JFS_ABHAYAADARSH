<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Before creating login we see this -->    
<%@page session="false" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./login" method="post"><!-- post use bcause sencetive data -->
<table>
<tr>
<td>User Name:</td>
<td><input type="text " name="username"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password"></td>
</tr>
<td><input type="submit" name="Login"></td>
</tr>
</table>
</body>
</html>