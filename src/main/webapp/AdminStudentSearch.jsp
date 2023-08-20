<%@page import="project1.model.Register" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="AdminDashboard.css">
    <title>AdminDashboard</title>
     <style>
        h2{
            color:white;
        }
        .container .h1
        {
            color: black;
           

        }
    </style>
</head>
<body>
	<!--Side menu creation-->

    <div class="side-menu">
        <div class="brand-menu">
              <h2>AISSMS IOIT</h2>
        </div>
    


    <ul>
        <li><img src="./images/activities.png" width="50" height="60"><span><a href="AdminDashboard.jsp">Dashboard</a></span></li>
        <li><img src="./images/student.png" width="50" height="60"><span><a href="AdminStudent.jsp">Student</a></span></li>
        <li><img src="./images/teacher.png" width="50" height="60"><span>Teacher</span></li>
        <li><img src="./images/Assignment.png" width="50" height="60"><span>Assignment</span></li>
        <li><img src="./images/examination.png" width="50" height="60"><span>Examination</span></li>
        <li><img src="./images/notes.png" width="50" height="60"><span>Notes</span></li>    
        <li><img src="./images/activities.png" width="50" height="60"><span>Activities</span></li>
    </ul>




</div>

<!--Navbar creation-->

<div class="container">
    <div class="header">
        <div class="nav">
        <div class="collage-name">
            <h1>AISSMS IOIT</h1>
        </div>
        &nbsp;
        &nbsp;
        <div class="user">
            
            <img src="./images/notification.png" alt="">
            <div class="img-case">
                <img src="./images/user.png" alt="">
            </div>
        </div>
    </div>
   </div>



   
   <div class="search">
   		<a href="AdminStudent.jsp">Back</a>
		<form action="AdminStudentSearchController">
			<h3>Enter Student Reg No.</h3><br>
			<input type="text" name="RegNo"><br><br>
			<button>Search</button>
		</form>
   
   
	<%Register r=null; %>
	
	<%
	if(!session.isNew())
	{
		r=(Register)session.getAttribute("data");
		session.invalidate();
	
	%>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Birth Date</th>
			<th>Deparment</th>
			<th>Year</th>
			<th>Mob No.</th>
			<th>UserName</th>
			<th>Password</th>
			
		</tr>
		<tr>
			<td><%=r.getStudID() %></td>
			<td><%=r.getStudName() %></td>
			<td><%=r.getStudDOB() %></td>
			<td><%=r.getStudDepart() %></td>
			<td><%=r.getStudYear() %></td>
			<td><%=r.getStudMob() %></td>
			<td><%=r.getStudUname() %></td>
			<td><%=r.getStudPass() %></td>
		</tr>
			
	</table>
	<%} %>
	</div>

</div>
    

</body>
</html>