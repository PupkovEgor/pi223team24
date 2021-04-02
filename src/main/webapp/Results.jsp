<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Объем правильной пирамиды:</title>
</head>
<body>
<h1>Результат нахождения объема правильной пирамиды</h1>
<h2>Ваши введеные данные:</h2>
<p><strong>Высота:</strong> ${first_result}</p>
<p><strong>Кол-во сторон:</strong> ${second_result}</p>
<p><strong>Сторона основания:</strong> ${third_result}</p>
<p><strong>Результат:</strong> ${result}</p>

<form action="${pageContext.request.contextPath}/Form.jsp">
	<input type="submit" name="sign" value="Назад">
	</form>

</body>
</html>