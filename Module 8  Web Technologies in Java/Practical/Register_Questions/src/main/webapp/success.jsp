<%@page import="Model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<body>

	<%
	user user = null;

	if (session.getAttribute("data") != null) {

		user = (user) session.getAttribute("data");
	} else {

		response.sendRedirect("register.jsp");
	}
	%>
	<h2>Registration Successful</h2>
	Name:
	<%=user.getName()%>
	<br> Email:
	<%=user.getEmail()%>
</body>
</html>