<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo1</title>
</head>
<body>
	<% for(int i=0;i<=4;i++) {  %>
	<h2>Your name is: Parth</h2>
	<%} %>
	<%int marks=49;
if(marks>50){%>
	<h2><%=marks %></h2>
	<%} 
	else
	{ %>
	<h2>
		<% out.println("study more you lazy a**");%>
	</h2>
	<%} %>
</body>
</html>