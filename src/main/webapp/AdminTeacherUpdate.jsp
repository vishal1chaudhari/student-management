<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AdminTecherUpdateController">
		<label for="Teacher Id"><b>Teacher Id:</b></label>
        <input type="text" placeholder="Enter Teacher Id" name="Tid" required/>
		<br>
		<label for="Name"><b>Name:</b></label>
        <input type="text" placeholder="Enter Name" name="Tname" required/>
		<br>
		<label for="Mobno"><b>Mobile No</b></label>
        <input type="text" placeholder="Enter Mobile No" name="Tmob" required/>
		<br>
		<label for="Department"><b>Department</b></label>
        <input type="text" placeholder="Enter Department" name="Tdepart" required/>
		<br>
		<label for="Degree"><b>Degree</b></label>
        <input type="text" placeholder="Enter Degree" name="Tdegree" required/>
		<br>
		<label for="Username"><b>UserName</b></label>
        <input type="text" placeholder="Enter UserName" name="Tuname" required/>
		<br>
		<label for="Password"><b>Password</b></label>
        <input type="text" placeholder="Enter password" name="Tpass" required/>
		<br>
		<input type="submit" value="Update">
	</form>
	
	<%if(session.isNew())
		{
			session.getAttribute("data");
		  session.invalidate();
		%>
		<h1>Record Updated..</h1>
		<%} %>
</body>
</html>