<%@page import="com.te.dto.Patients"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    String message =(String)request.getAttribute("msg");
   Patients patient =(Patients)request.getAttribute("Patient");
   String doctor =(String)request.getAttribute("doctorId");

    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment page</title>
</head>
<body>
<%=message %><br>
<%=patient.getPatientName() %><br>
<%=doctor %>


</body>
</html>