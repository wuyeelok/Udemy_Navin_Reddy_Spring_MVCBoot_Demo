<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Kenneth</title>
</head>
<body>
	<h1>Welcome to Kenneth</h1>

	<form action="add" method="post">
		<label for="num1">Enter 1st number : </label> <input type="number"
			name="num1" id="num1" required /><br> <label for="num2">Enter
			2nd number : </label> <input type="number" name="num2" id="num2" required /><br>
		<input type="submit" value="Add Them UP" />
	</form>
</body>
</html>