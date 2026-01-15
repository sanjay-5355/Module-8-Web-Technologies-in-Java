<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Verify OTP</title>
</head>
<body>

<h2>Verify OTP</h2>

<%
    String email = (String) request.getAttribute("email");
    Integer otp = (Integer) request.getAttribute("otp");
    String msg = (String) request.getAttribute("msg");
%>

<% if (msg != null) { %>
    <p style="color:red;"><%= msg %></p>
<% } %>

<form action="controller" method="post">
    <input type="hidden" name="action" value="verify">

    <input type="hidden" name="email" value="<%= email %>">
    <input type="hidden" name="otp1" value="<%= otp %>">

    Enter OTP:
    <input type="number" name="otp2" required><br><br>

    <input type="submit" name="action" value="Verify OTP">
</form>

</body>
</html>