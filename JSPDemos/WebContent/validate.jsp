<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate</title>
</head>
<body>
<% 
String UserName= request.getParameter("username");
String Password= request.getParameter("password");
if(UserName.equals("parth")&& Password.equals("chlbe"))
{    %>	
<jsp:forward page="success.jsp"></jsp:forward>
<%}
else
{
session.setAttribute("errmsg", "sahi naam daal na");
response.sendRedirect("index.jsp");
}
%>
</body>
</html>