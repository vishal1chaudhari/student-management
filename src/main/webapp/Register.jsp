<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link  href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
 <link rel="stylesheet" href="Register.css">
</head>
<body>
	<form action="RegisterController">
        
        <center>
              <div>
                 <h1>Student Register Here</h1>
              </div>
        </center>
            
          
             <label for="Student Id"><b>Student Id</b></label>
            <input type="number" placeholder="Enter Student Id" name="studID" required/>

            <label for="Student Name"><b>Student Name</b></label>
            <input type="text" placeholder="Enter Name" name="studName" required/>

            <label for="DOB"><b>Student Date Of Birth</b></label>
            <input type="text" placeholder="Student Date Of Birth" name="studDOB" required/>

			<label for="Student Department"><b>Student Department</b></label>
            <input type="text" placeholder="Enter Student Department" name="studDepart" required/>

            <label for="Student year"><b>Student Year</b></label>
            <input type="text" placeholder="Enter Student Year" name="studYear" required/>

            <label for="Mob"><b>Student Mobile Number</b></label>
            <input type="text" placeholder="Student Mobile Number" name="studMob" required/>
            
            <label for="Student Uname"><b>Student UserName</b></label>
            <input type="text" placeholder="Student UserName" name="studUname" required/>
				
				
             <label for=" Password"><b>Student Password</b></label>
            <input type="password" placeholder="Set Password" name="studPass" required/>

            

            <button type="submit" value="Save">Submit</button>
        
    
  </form>

</body>
</html>