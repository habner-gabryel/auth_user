<jsp:useBean id="obj" class="jsp.Calc"/>
<%
	int cubo = obj.cubo(531);
	out.println("<p> Cubo de 5 é igual a " + cubo + "</p>");
%>