<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - нахождение объема правильной пирамиды</title>
</head>
<body>
<h1>Калькулятор - нахождение объема правильной пирамиды</h1>
	<form action="${pageContext.request.contextPath}/JavaCalc" method="post">
		<label for="first">Высота:</label>
		<input type="text" name="first" id="first" value="${first}">
		<label for="second">Кол-во сторон: </label>
		<input type="text" name="second" id="second" value="${second}">
		<label for="second">Сторона основания: </label>
		<input type="text" name="third" id="third" value="${third}">
		<input type="submit" name="sign" value="Calculate">
	</form>
	</body>
</html>