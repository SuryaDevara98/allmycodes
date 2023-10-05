<%@page import="com.te.dto.Patients"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%
    String message= (String)request.getAttribute("msg");
    Patients pat=(Patients)request.getAttribute("patient");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<%=message %><br>
Your Id is : <%=pat.getPatientId() %><br>
Your Name is : <%=pat.getPatientName() %><br>
Your phone number is : <%=pat.getPatientPhone() %><br>
click here to go to Miami Hospital Homepage<a href="http://localhost:8081/healthapp/homepage"> Cilck Here</a>



</div>

</body>
</html>