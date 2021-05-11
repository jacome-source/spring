<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Users</title>
</head>
<body>
<h1>User Registration</h1>
<c:forEach items="${users}" var="user">
	${user}<br/>
</c:forEach>

</body>
</html>