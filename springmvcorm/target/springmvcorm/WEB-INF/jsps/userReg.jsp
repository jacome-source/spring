<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
<h1>Register User</h1>
<form action="registerUser" method="post">
<pre>
	Id: <input type="text" name="id"/><br/>
	Name: <input type="text" name="name"/><br/>
	Email: <input type="text" name="email"/><br/>
	<input type="submit" name="register"/><br/>
</pre>
</form>
<br/>${result}

</body>
</html>