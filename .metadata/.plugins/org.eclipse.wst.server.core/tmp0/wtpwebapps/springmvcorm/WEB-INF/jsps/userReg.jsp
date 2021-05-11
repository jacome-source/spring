<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	// Prepara o documento
	$(document).ready(function(){
		// Pega elemento DOM - # usado para ids
		$("#id").change(function(){
	   		// Fun��o ajax
			$.ajax({
				url: "validateEmail",
				data: {id: $("#id").val()},
				success:  function(responseText){
					$("#errorMsg").text(responseText);
					if (responseText!=""){
						 $("#id").focus();
					}
				}
			});
	  	});
	});
</script>
</head>
<body>
<h1>Register User</h1>
<form action="registerUser" method="post">
<pre>
	Id: <input type="text" name="id" id="id"/><span id="errorMsg"></span><br/>
	Name: <input type="text" name="name"/><br/>
	Email: <input type="text" name="email"/><br/>
	<input type="submit" name="register"/><br/>
</pre>
</form>
<br/>${result}

</body>
</html>