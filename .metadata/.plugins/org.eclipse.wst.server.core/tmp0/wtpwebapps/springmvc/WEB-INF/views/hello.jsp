<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1>Hello from Spring MVC!!!</h1>

<!-- Scriplet -->
<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("salary");
	out.println("ID: "+id+ "<br/>");
	out.println("Name: "+name+ "<br/>");
	out.println("Salary: "+salary+ "<br/>");
%>
<br/>
<!-- JSP EL -->
ID: ${id}<br/> 
Name: ${name}<br/> 
Salary: ${salary}<br/> 

</body>
</html>