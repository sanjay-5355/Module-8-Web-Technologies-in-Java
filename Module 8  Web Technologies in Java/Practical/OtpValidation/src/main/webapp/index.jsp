<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send OTP</title>
</head>
<body>

<h2>OTP Verification</h2>

<form action="controller" method="post">
    <input type="hidden" name="action" value="send otp">

    Enter Email:
    <input type="email" name="email" required><br><br>

    <input type="submit" name="action" value="Send OTP">
</form>

</body>
</html>