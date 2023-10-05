<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Login Form</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>

<h2>Hello Doctor, Please login to see the Appointmnets</h2>
<a href="./doctorsregister"><h2>Register</h2></a>

<div  style="  margin-left: 25%; margin-right:25%; width: 50%; margin:50px 300px; padding:10px 20px;text-align:center; align:center;">
<form action="./doctorloginconfirm" method="post">

<fieldset>

<!-- Form Name -->
<legend><center><h2><b>Login Form</b></h2></center></legend><br>

<!-- Text input-->

<div class="form-group">
  <label>doctorId</label>  
  <div>
  <div>
  <span><i class="glyphicon glyphicon-user"></i></span>
  <input  name="doctorId" placeholder="provide your user Id" type="number">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label>Password</label> 
    <div>
    <div>
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="doctorPassword" placeholder="provide your password" type="password">
    </div>
  </div>
</div>

 
  


<!-- Select Basic -->

<!-- Success message -->
<div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Success!.</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" value="Login" class="btn btn-warning" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspLogin <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
  </div>
  
</div>

</fieldset>
</form>
</div>

</body>
</html>