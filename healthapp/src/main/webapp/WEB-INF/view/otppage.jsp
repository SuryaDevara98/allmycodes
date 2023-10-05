<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One Time Password Confirmation Page</title>
</head>
<body>
<form action="http://localhost:8081/healthapp/appointment/bookappointment" method="post">
<div>
<legend>OTP</legend>
<input type="number" placeholde="please enter your otp" name="otp"/>
<input type="submit" value="Submit"/>
</div>
</form>
</body>
</html>