<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Delete Employee</legend>
<form action="./deleteEmployee2" method="get">
Employee ID:<input type="submit" value="delete">
</form>
</fieldset>
<%if(msg != null && !msg.isEmpty()) { %>
<h4 style="color: red"><%=msg%></h4>
<%} %>
</body>
</html>