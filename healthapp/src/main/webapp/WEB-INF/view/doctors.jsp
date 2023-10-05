<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.te.dto.Doctors"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctors page</title>
</head>
<body>

<%
String connectionUrl = "jdbc:mysql://localhost:3306/hospital";
String userId = "root";
String password = "Prasanna@98";


%>
<h2 align="center"><font><strong>Hello Sir/Madam, Miami hospital doctors</strong></font></h2>
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
<br>
click here to go to Miami Hospital Homepage<a href="http://localhost:8081/healthapp/homepage"> Cilck Here</a>



</body>
</html>