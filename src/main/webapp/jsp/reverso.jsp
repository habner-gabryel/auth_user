<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%	String nome = request.getParameter("nome");
		StringBuffer reverso = new StringBuffer(nome).reverse();
		
		out.println("<p> Nome: " + nome + "</p> <p> Nome reverso: " + reverso + "<?p>");	%>
</body>
</html>