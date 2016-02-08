<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stateful Session Beans</title>
</head>
<body>
	<form action="op" method="get">
		<label>Produto</label>
		<input type="text" name="p">
		<input type="submit" value="Add"> 
	</form>
	
	<c:forEach items="${sessionScope.lista}" var="produto">
		<p>${produto}</p>
	</c:forEach>
	
</body>
</html>