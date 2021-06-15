<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/> 


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrando Nova Empresa</title>
</head>
<body>
	<form action="${linkServletNovaEmpresa}" method="post"> 
		Nome: <input type="text" name="nome"/> 
		Data Abertura: <input type="text" name="data" /> 
		<input type="submit" />  
	</form>	
</body>
</html> 