<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>ERRO !!!</title>
</head>
<body>
	<pre>
		<% exception.printStackTrace(response.getWriter()); %>
	</pre>
</body>
</html>