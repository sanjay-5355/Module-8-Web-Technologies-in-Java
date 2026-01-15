<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Registration Form</title>
</head>
<body>
	<h2>User Registration</h2>
	<form action="RegisterController" method="post">
		Name: <input type="text" name="name"><br> <br>
		Email: <input type="email" name="email"><br> <br>
		Password: <input type="password" name="password"><br> <br>
		<input type="submit" name="action" value="Register">
	</form>
</body>
</html>