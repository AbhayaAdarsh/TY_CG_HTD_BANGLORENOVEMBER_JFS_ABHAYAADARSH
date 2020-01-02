<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORM</title>
</head>
<body>
<h2 style="color:Black">${name}</h2>
<h2 style="color:Red">${email}</h2>
<h2 style="color:Blue">${password}</h2>
<h2 style="color:Green">${gender}</h2>

<h1>Submit the form</h1>
<form action="./form" method="post">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="radio" name="gender" value="M">Male</td>
<td><input type="radio" name="gender" value="F">Female</td>
</tr>
<tr>
<td><input type="reset" name="Reset"></td>
<td><input type="submit" name="Submit"></td>
</tr>
</table>
</form>
</body>
</html>