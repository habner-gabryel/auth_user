<%@ page language="java" %>
<%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Atual</title>
</head>
<body>
	<p>A data atual é <%= LocalDate.now() %></p>
	<p>2 x 5 = <% out.println(2*5); %>
</body>
</html>