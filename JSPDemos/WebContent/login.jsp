<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String username;
Date d;%>
<%username=request.getParameter("username"); %>
<h1>Welcome,</h1>
<%=username %>
<%
if(username.equals("Parth"))
{
	d=new Date();
	RequestDispatcher dispatcher=request.getRequestDispatcher("success.html");
}
else
{
response.sendRedirect("index.html");
}
%>
Today's date is<%= d %>
</body>
</html>