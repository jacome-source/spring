<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee</title>
</head>
<body>
<h1>Hello from Spring MVC!!!</h1>

<!-- JSP EL -->
${empl}
<br/> 
ID: ${empl.id}<br/> 
Name: ${empl.name}<br/> 
Salary: ${empl.salary}<br/> 
</body>
</html>