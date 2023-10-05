<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.myDiv {
  border: 5px outset red;
  background-color: lightblue;
  text-align: center;
}
</style>
<title>search patient page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>

<div class="myDiv" style="  margin-left: 25%; margin-right:25%; width: 50%; margin:50px 300px; padding:10px 20px;text-align:center; align:center;">
	<form action="./getpatientconfirm" method="post">
	
		<input type="number" placeholder="enter patient Id number" name="appointmentId"/>
		<input type="submit" value="Getpatient"/>
	
	</form>

</div>

</body>
</html>