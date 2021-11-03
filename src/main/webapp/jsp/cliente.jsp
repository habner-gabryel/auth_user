<jsp:useBean id="cliente" 
class="jsp.Cliente"/>
<%
cliente.setCpf(123);
cliente.setNome("Antonio");
cliente.setEmail("assoftbel@gmail.com");
request.setAttribute("cliente",cliente);
%>
<h3>Cpf:${cliente.cpf}</h3>
<h3 >Nome:${cliente.nome}</h3>
<h3>Email:${cliente.email}</h3>