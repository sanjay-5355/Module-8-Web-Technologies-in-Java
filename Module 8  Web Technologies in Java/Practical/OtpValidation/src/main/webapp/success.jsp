<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>

<h2 style="color:green;">OTP Verified Successfully ✅</h2>

<%
    String email = (String) request.getAttribute("email");
%>

<p>Welcome : <b><%= email %></b></p>

<br><br>

<form action="index.jsp">
    <input type="submit" value="Go to Home">
</form>

</body>
</html>