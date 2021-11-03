<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<link rel="stylesheet" type="text/css" href="../lib/css/style.css">
<style>
input:invalid {
  border: 2px solid red;
  border-radius: 5%;
}
input:invalid:focus {
  background-color: RGB(195, 90, 90);
  border: 2px solid red;
  border-radius: 5%;
}
</style>
<body>
	<div class="div_father">
		<form name="form" action="http://localhost/JavaWeb/jsp/auth.jsp" method="post">
			<label>Digite seu CPF:</label><br>
			<input type="text" minlength="14" maxlength="14" title="xxx.xxx.xxx-xx" required pattern="\d(3)\.\d(3)\.\d(3)\-\d(2)" name="cpf"><br>
			
			<label>Digite a sua senha:</label><br>
			<input type="password" name="senha" minlength="6" required><br>
			
			<input type="submit" class="button" value="Entrar">
		</form>
	</div>
	
	<div clss="div_father">
		<p><strong style="color: red; margin-left:30%">${message}</strong></p>
	</div>
</body>
</html>