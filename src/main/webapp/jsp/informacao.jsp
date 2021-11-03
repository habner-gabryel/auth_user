<%@ page import="java.util.Date"%>
<h3>Informa��es do Servidor:</h3>
<%= application.getServerInfo() %>

<h3>Versao principal da API do servlet:</h3>
<%= application.getMajorVersion()%>

<h3>Informa��es do Host:</h3>
<%= request.getRemoteHost() %>

<h3>Informa��es da Sess�o:</h3> 
<%= session.getId() %>

<h3>Data de cria��o:</h3> 
<%= new Date(session.getCreationTime()) %>

<h3>Data de �ltimo acesso:</h3> 
<%= new Date(session.getLastAccessedTime()) %>