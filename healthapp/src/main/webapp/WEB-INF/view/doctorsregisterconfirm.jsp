<%@page import="com.te.dto.Patients"%>
<%@page import="com.te.dto.Doctors"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    Doctors doctor=(Doctors)request.getAttribute("doctors");
    String message=(String)request.getAttribute("msg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Registration success</title>
</head>
<body>
<div><h2>Hello Doctor</h2></div>
<%=message %>
<h2>Below are the details you have entered</h2>
Dear Doctor <%=doctor.getDoctorFirstName() %><%=doctor.getDoctorLastName() %><br>
Phone Number : <%=doctor.getDoctorPhone() %><br>
Your Specilization : <%=doctor.getDoctorSpecialization() %><br>
<b>Please note down your password for further process</b>
<b><i><%=doctor.getDoctorPassword() %></i></b><br>

click here to go to Miami Hospital Homepage<a href="http://localhost:8081/healthapp/homepage"> Cilck Here</a>

</body>
</html>