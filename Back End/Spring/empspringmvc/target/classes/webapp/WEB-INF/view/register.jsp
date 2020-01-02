<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %><!-- One session is created and don't want to create new session -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./register" method="post">
		<table>
			<fieldset>
				<legend>
					<h3>Employee Details</h3>
				</legend>
				<div>
					<label>Name:</label><input type="text" name="name"><br>
					<br>
					<label>Email:</label><input type="email" name="email"><br>
					<br>
					<label>Password:</label><input type="password" name="password"><br>
				</div>
			</fieldset>

			<fieldset>
				<legend>
					<h3>Employee Permanent Address1</h3>
				</legend>
				<div>
					<label>Address Type:</label><select name="addressBeans[0].addType">
						<option>--------------Select--------------</option>
						<option value="Permanent">Permanent</option>
						<option value="Temporary">Temporary</option>
					</select><br> <br>
					<label>Address1:</label><input type="text"
						name="addressBeans[0].address1"><br> <br>
					<label>Address2:</label><input type="text"
						name="addressBeans[0].address2"><br>
				</div>
			</fieldset>

			<fieldset>
				<legend>
					<h3>Employee Temporary Address2</h3>
				</legend>
				<div>
					<label>Address Type:</label><select name="addressBeans[1].addType">
						<option>--------------Select--------------</option>
						<option value="Permanent">Permanent</option>
						<option value="Temporary">Temporary</option>
					</select><br> <br>
					<label>Address1:</label><input type="text"
						name="addressBeans[1].address1"><br> <br>
					<label>Address2:</label><input type="text"
						name="addressBeans[1].address2"><br>
				</div>
			</fieldset>

			<table>
				<tr>
					<center>
					<td><input type="submit" value="Register"></td>
					</center>
				</tr>
			</table>
		</table>
		</form>
</body>
</html>