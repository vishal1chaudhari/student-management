<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Login.css">
</head>
<body>
	<a href="TeacherRegister.jsp">BACK</a>
   <form action="TeacherLoginController">
   <center>
    <div>
        <h class="bold-text">Teacher Login Form</h>
    </div>
  </center>
    <label for="user-name">User Name:</label>
    <input type="text" id="UserName" name="Tuname" required><br>

    <label for="password">Password:</label>
    <input type="Password" id="password" name="Tpass" required><br>

    

    <input type="submit" value="Submit">
  </form>
</body>
</html>