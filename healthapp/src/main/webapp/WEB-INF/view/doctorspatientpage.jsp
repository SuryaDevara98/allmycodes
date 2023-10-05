<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    String Id=(String) request.getAttribute("doctorID");
   
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="myDiv" style="  margin-left: 25%; margin-right:25%; width: 50%; margin:50px 300px; padding:10px 20px;text-align:center; align:center;">
<form action="http://localhost:8081/healthapp/appointment/bookappointment">
    
<%
String connectionUrl = "jdbc:mysql://localhost:3306/hospital";
String userId = "root";
String password = "Prasanna@98";


%>
<h2 align="center"><font><strong>Hello Sir/Madam please chech the patients lists of appointments</strong></font></h2>
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

String sql ="SELECT patientId, patientName,doctorstimeSlot FROM hospital.Appointment where doctorId=?";
PreparedStatement prepareState=connection.prepareStatement(sql);
prepareState.setString(1,Id);
ResultSet resultSet= prepareState.executeQuery();

while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getInt("patientId") %></td>
<td><%=resultSet.getString("patientName") %></td>
<td><%=resultSet.getString("doctorstimeSlot") %></td>
</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

			

</body>
</html>