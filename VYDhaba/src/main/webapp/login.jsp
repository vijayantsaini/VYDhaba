<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log-In</title>
</head>
<body>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<form action="login" method="post">
		<table>
			<tr><td>User Id:</td>
			<td><input type="text" name="username"></td></tr>
			<tr><td>Password:</td>
			<td><input type="password" name="password"></td></tr>
			<tr><td><input type="submit" name="login" value="login"></td></tr>
		</table>
	
	</form>

</body>
</html>