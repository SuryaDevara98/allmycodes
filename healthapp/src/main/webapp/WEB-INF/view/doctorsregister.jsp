<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctors Registraction Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
    <div style="  margin-left: 25%; margin-right:25%; width: 50%; margin:50px 300px; padding:10px 20px;text-align:center; align:center;">

    <form action="./doctorsregisterconfirm" method="post">
<fieldset>

<!-- Form Name -->
<legend><center><h2><b>Registration Form</b></h2></center></legend><br>

<!-- Text input-->

<div class="form-group">
  <label>First Name</label>  
  <div>
  <div>
  <span><i class="glyphicon glyphicon-user"></i></span>
  <input  name="doctorFirstName" placeholder="First Name" type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label>Last Name</label> 
    <div>
    <div>
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="doctorLastName" placeholder="Last Name" type="text">
    </div>
  </div>
</div>

 
  
<!-- Text input-->

<div>
  <label>Username</label>  
  <div>
  <div>
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="doctorUserName" placeholder="Username" type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div>
  <label>Password</label> 
    <div>
    <div>
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="doctorPassword" placeholder="Password" type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters">
    </div>
  </div>
</div>
<div>
  <label>Specialization</label> 
    <div>
    <div>
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="doctorSpecialization" placeholder="enter specialization" type="text">
    </div>
  </div>
</div>


<!-- Text input-->
       <div class="form-group" style="text-align:center">
  <label class="col-md-4 control-label">E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="doctorEmail" placeholder="E-Mail Address" class="form-control"  type="text">
    </div>
  </div>
</div>


<!-- Text input-->
       
<div class="form-group"  style="text-align:center">
  <label class="col-md-4 control-label"  style=text-align:center>Contact No.</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input name="doctorPhone" placeholder="(+91 )" class="form-control" type="text">
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
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn btn-warning" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
  </div>
</div>

</fieldset>
</form>
</div>
    </div><!-- /.container -->
</body></html>