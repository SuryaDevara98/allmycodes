<%@page import="com.te.dto.Doctors"%>
<%@page import="com.te.dto.Appointment"%>
<%@page import="com.te.dto.Patients"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    Appointment appoint=(Appointment) request.getAttribute("appointment");
   /*  String doctorTimeSchedule=(String) request.getAttribute("doctorTime"); */
    Doctors doctors = (Doctors) request.getAttribute("doctors");
       
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment confirm page</title>
</head>
<body>

<div style="float:right; margin-top:90px; margin-right:590px">
Dear Sir/Madam <h2><b><%=appoint.getPatientName()%></b></h2><br>

Your Appointment Id is : <%=appoint.getApointRefNo() %><br>
Your appointment is fixed with doctor : <%=appoint.getDoctorId() %><br> <br>
Name of your doctor : <b> <%=doctors.getDoctorFirstName() %>   <%=doctors.getDoctorLastName() %></b><i>(<%=doctors.getDoctorSpecialization() %>)</i><br>
Your time of appointment : <%=appoint.getDoctorstimeSlot() %><br> 
<br>
<br>

Click here to go to Miami HomePage <a href="http://localhost:8081/healthapp/homepage"> Cilck Here</a>
</div>


</body>
</html>