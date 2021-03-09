<%@ page language='java' contentType='text/html; charset=UTF-8'
	pageEncoding='UTF-8'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<%@ page import="uia.com.contabilidad.ContabilidadUIA.*" %>


<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Clientes</title>
</head>
<body>	
	<jsp:useBean id='contabilidad' class='uia.com.contabilidad.ContabilidadUIA'/>
	
	<form name="formClientes" id="form1" action="/clientes.jsp">
  		Clientes: <select name="cliente">	
		<c:forEach var="cliente" items="${contabilidad.getListaProveedores()}">
			<option value="${cliente.id}">${cliente.name}</option>	
		</c:forEach>
		</select>
  		<input type="submit" value="Submit">
  	</form>
	
	<form name="formCuentas" id="form2" action="/cuentas.jsp">
  		Cuentas: <select name="cuenta">	
		</select>
  		<input type="submit" value="Submit">
  	</form>

	<form name="formCheques" id="form2" action="/cuentas.jsp">
  		Cheques: <select name="cuenta">	
		</select>
  		<input type="submit" value="Submit">
  	</form>
</body>
</html>