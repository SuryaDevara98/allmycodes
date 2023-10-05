<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
    <%
    String message=(String) request.getAttribute("msg");
    
    %>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Miamie Hospital</title>
</head>
<body>

<%=message %><br>
Click here to goto Miami hospital Homepage
<a href="http://localhost:8081/healthapp/homepage"> Cilck Here</a>

</body>
</html>