<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link  href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
 <link rel="stylesheet" href="Register.css">
<style>
	body{
		margin-top: 15px;
	}
	a{
		text-decoration: none;
		background-color: #04AA6D;
    	color: white;
    	padding: 10px;
    	font-size: 16px;
	}
	
</style>
</head>
<body>
	<a href="AdminStudent.jsp">Back</a>
	<center>
		<form action="AdminStudentUpdateController">
			<label for="Student ID"><b>Student ID</b></label>
            <input type="number" placeholder="Enter Student ID" name="studID" required/>
			<br>
            <label for=" Name"><b>Student Name</b></label>
            <input type="text" placeholder="Enter Name" name="studName" required/>
			<br>
			<label for="DOB"><b>Date of Birth</b></label>
            <input type="text" placeholder="Date of Birth" name="studDOB" required/>
			<br>
			<label for="Department"><b>Student Department</b></label>
            <input type="text" placeholder="Department" name="studDepart" required/>
			<br>
			<label for="Year"><b>Year</b></label>
            <input type="text" placeholder="Year" name="studYear" required/>
			<br>
			<label for="Mob No"><b>Mobile No</b></label>
            <input type="text" placeholder="Mob No" name="studMob" required/>
			<br>
            <label for=" User Name"><b>User Name</b></label>
            <input type="text" placeholder="Set User Name" name="studUname" required/>
			<br>
             <label for=" Password"><b>Password</b></label>
            <input type="password" placeholder="Set Password" name="studPass" required/>
			<br>
            
            <button type="submit" value="Update">Update</button>
		</form>
	</center>
	<%if(session.isNew())
		{
		  session.invalidate();
		%>
		<h1>Record Updated..</h1>
		<%} %>

</body>
</html>