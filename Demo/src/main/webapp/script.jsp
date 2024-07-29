<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>script tag</title>
</head>
<body>
<!-- scriptlet tag -->
<% 
 int stid=26;
 String stname="Varshitha";
 out.println("the student id is:" + stid);
 out.println("<br/>");
 out.println("the student name is: " + stname);
 %>
 <br/>
 <%="the student id is: " + stid%><br/>
 <%="the student name is: " + stname%>
 

</body>
</html>