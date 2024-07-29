<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="a" class = "com.wipro.servlet.ClassA" />
<jsp:setProperty property="name" name="a" value="varshitha"/>
<jsp:setProperty property="id" name="a" value="23"/>
<p>ClassA name:<jsp:getproperty property="name" name="a" /></p>
<p>ClassA id<jsp:getproperty property="id" name="a" /></p>

</body>
</html>