<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/loginServlet" method="get">
	<label>User: </label><input type="text" name="user"><br><br>
	<label>Password: </label><input type="password" name="pass"><br><br>
	<input type="submit">
	
	</form>
	<form action="${pageContext.request.contextPath}/Colors" method="get">
		<input type="submit">
	</form>
</body>
</html>