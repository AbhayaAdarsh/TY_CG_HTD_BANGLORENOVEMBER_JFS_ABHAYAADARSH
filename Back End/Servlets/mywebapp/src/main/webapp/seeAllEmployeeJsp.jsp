<%@page import="com.capgemini.mywebapp.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%List<EmployeeInfoBean> employeeList =(List<EmployeeInfoBean>)request.getAttribute("employeeList");%>
<%String msg=%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4><a herf="./home">Home</a></h4>
	<% if(employeeList !=null && !employeeList.isEmpty()) {%>
	<table>
		<tr>
			<th>Emp Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>
		<% for(EmployeeInfoBean employeeInfoBean:employeeList) {%>
		<tr>
		<td><%=employeeInfoBean.getEmpId() %></td>
		<td><%=employeeInfoBean.getName()%></td>
		<td><%=employeeInfoBean.getAge()%></td>
		<td><%=employeeInfoBean.getSalary()%></td>
		<td><%=employeeInfoBean.getDesignation() %></td>
		</tr>
		<% } %>

		<%if(msg !=null && !msg.isEmpty()) { %>
	<h3 style="color:green;">Employee added successfully</h3>
<%}%> 
	</table>
	<%} %>

</body>
</html>