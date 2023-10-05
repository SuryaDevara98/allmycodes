<%@page import="com.te.dto.Patients"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%
    String message=(String) request.getAttribute("msg");
    Patients pat=(Patients) request.getAttribute("patient");
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration cofirmation page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>

You are sucessfully registered

Below are the details of yours

<%=message %><br>
Your Login Id : <%=pat.getAppointmentId() %><br>
Your Name : <%=pat.getPatientName() %><br>
Your password for login is : <%=pat.getPatientPassword() %>
<br>
<br>
<br>
Click here to goto Miami hospital Homepage <a href="http://localhost:8081/healthapp/homepage"> Cilck Here</a>


<a href=./patientlogin><h3>Login</h3></a> Click here to login

</body>
</html>