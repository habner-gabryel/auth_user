<%@ page import="java.util.Date"%>
<h3>Informações do Servidor:</h3>
<%= application.getServerInfo() %>

<h3>Versao principal da API do servlet:</h3>
<%= application.getMajorVersion()%>

<h3>Informações do Host:</h3>
<%= request.getRemoteHost() %>

<h3>Informações da Sessão:</h3> 
<%= session.getId() %>

<h3>Data de criação:</h3> 
<%= new Date(session.getCreationTime()) %>

<h3>Data de último acesso:</h3> 
<%= new Date(session.getLastAccessedTime()) %>