<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="Login.css">
</head>
<body>
   <form action="AdminLoginController">
   <center>
    <div>
        <h class="bold-text">Login Form</h>
    </div>
  </center>
    <label for="user-name">User Name:</label>
    <input type="text" id="UserName" name="UserName" required><br>

    <label for="password">Password:</label>
    <input type="Password" id="password" name="Password" required><br>

    

    <input type="submit" value="Submit">
  </form>


<%String str=null; %>

<%
if(!session.isNew())
{
	str=(String)session.getAttribute("msg");
	session.invalidate();

%>

<h3 style="color :red"><%=str%></h3>
<%} %>
   

</body>
</html>