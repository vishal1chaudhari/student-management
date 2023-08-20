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
	<form action="AdminRegController">
        
        <center>
              <div>
                 <h1>Admin Register Here</h1>
              </div>
        </center>
            
          
             <label for="Admin Id"><b>Registration Number:</b></label>
            <input type="number" placeholder="Enter Registration Id" name="AdminNo" required/>

            <label for=" Name"><b> Name</b></label>
            <input type="text" placeholder="Enter Name" name="CustName" required/>

            <label for=" User Name"><b>User Name</b></label>
            <input type="text" placeholder="Set User Name" name="UserName" required/>

             <label for=" Password">Password</b></label>
            <input type="password" placeholder="Set Password" name="Password" required/>


            <button type="submit" value="Save">Submit</button>
        
    
  </form>

</body>
</html>