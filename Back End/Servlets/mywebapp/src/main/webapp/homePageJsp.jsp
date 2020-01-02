<%@page import="com.capgemini.mywebapp.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
 <%@ page session="false" %>
  
 <% HttpSession session =request.getSession(false);
 EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) session.getAttribute("employeeInfoBean");%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color: navy;">Welcome <%=employeeInfoBean.getName() %></h3>
<a href="./addEmployeeJsp.jsp">Add Employee</a> <br>
<a href="./updateEmployeeJsp.jsp">Update Employee</a><br>
<a href="deleteEmployeeJsp.jsp">Delete Employee</a><br>
<a href="./searchEmployeeJspForm">Search Employee</a><br>
<a href="./seeAllEmployeeJsp.jsp">See All Employee</a><br>
<br>
<a href="./logout2">Logout</a>
</body>
</html>