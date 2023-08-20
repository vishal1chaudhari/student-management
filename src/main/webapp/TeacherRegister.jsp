<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Register</title>
<link  href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
 <link rel="stylesheet" href="Register.css">

</head>
<body>
	<form action="TeacherRegisterController">
        
        <center>
              <div>
                 <h1>Teacher Register Here</h1>
              </div>
        </center>
            
          
             <label for="Teacher ID"><b>Teacher ID:</b></label>
            <input type="text" placeholder="Enter Teacher ID" name="Tid" required/>

            <label for="Tacher Name"><b>Teacher Name</b></label>
            <input type="text" placeholder="Enter Teacher Name" name="Tname" required/>

            <label for="Mobile No"><b>Mobile No.</b></label>
            <input type="text" placeholder="Set Mob No" name="Tmob" required/>
            
            <label for="Teacher Department"><b>Teacher Department</b></label>
            <input type="text" placeholder="Set Department" name="Tdepart" required/>

             <label for=" Teacher Degree"><b>Teacher Degree</b></label>
            <input type="text" placeholder="Set Degree" name="Tdegree" required/>
            
            <label for=" User Name"><b>User Name</b></label>
            <input type="text" placeholder="Set User Name" name="Tuname" required/>

             <label for=" Password"><b>Password</b></label>
            <input type="password" placeholder="Set Password" name="Tpass" required/>

            <button type="submit" value="Save">Submit</button>
        
    
  </form>
	
</body>
</html>