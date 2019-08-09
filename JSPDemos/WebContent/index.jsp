<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<h2>Login Details</h2>
<form action="validate.jsp">

UserName:<input type="text" name="username"><br/>
Password:<input type="password" name="password"><br/>
<input type="submit" value="Login">
<% String errormsg= (String)session.getAttribute("errmsg");
if(errormsg==null)
	errormsg="";
%>
<font color="red"><%=errormsg %></font>
</form>

</body>
</html>