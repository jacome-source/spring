<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1" 
    import="java.util.List, com.jacome.spring.springmvc.entity.Employee"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employees</title>
</head>
<body>
<h1>Hello from Spring MVC!!!</h1>
<!-- Scriplet -->
<%
	List<Employee> list = (List<Employee>) request.getAttribute("employees");
	for (Employee empl : list){
		out.println(empl+ "<br/>");
	}
%>
</body>
</html>