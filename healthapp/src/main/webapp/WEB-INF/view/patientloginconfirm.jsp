<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Appointment page</title>
</head>
<body>
<div class="myDiv" style="  margin-left: 25%; margin-right:25%; width: 50%; margin:50px 300px; padding:10px 20px;text-align:center; align:center;">
<form action="http://localhost:8081/healthapp/appointment/bookappointment">
    
<%
String connectionUrl = "jdbc:mysql://localhost:3306/hospital";
String userId = "root";
String password = "Prasanna@98";


%>
<h2 align="center"><font><strong>Hello Sir/Madam please book your appointment</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="lightgreen">
<td><b>Doctor Id</b></td>
<td><b>Doctor Name</b></td>
<td><b>Doctor Mobile</b></td>
<td><b>Doctor Speciality</b></td>
</tr>
<%
try{ 
	Class.forName("com.mysql.jdbc.Driver");

Connection connection = DriverManager.getConnection(connectionUrl, userId, password);

String sql ="SELECT * FROM Doctors";
Statement state=connection.createStatement();
ResultSet resultSet= state.executeQuery(sql);

while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getInt("doctorId") %></td>
<td><%=resultSet.getString("doctorFirstName") %></td>
<td><%=resultSet.getString("doctorPhone") %></td>
<td><%=resultSet.getString("doctorSpecialization") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

							<label for="cars">Choose a TimeSlot:</label>

							<select name="doctorstimeSlot" id="doc">
								 <option >Choose Time Slot</option>
							      <option >10:30 AM - 11:00 AM</option>
								  <option >11:00 AM - 11:30 AM</option>
								  <option >11:30 AM - 12:00 AM</option>
								  <option >12:30 PM - 01:00 PM</option>
								   <option >4:30 PM - 5:00 PM</option>
								  <option >05:00 PM - 05:30 PM</option>
								  <option >05:30 PM - 06:00 PM</option>
								  <option >06:00 PM - 06:30 PM</option>
							</select>   
							          
				<input type="number" placeholder="enter doctor id" name="doctorId"/>
				<input type="number" placeholder="enter Patient id" name="patientId"/>
							              
				   <input type="submit" value="Book Appointment"/>
</form>

<div  style="  margin-left: -100px; width: 50px; margin:50px 300px; padding:10px 20px;text-align:left; align:left;">
<a href="./getpatient">GetPatient</a>
</div>
<div><a>
<form action="./logout">
<input type="submit" value="Logout"/>
</form>
</a></div>
</div>


               
</body>
</html>