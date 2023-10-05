<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%   %>
    <%
    String myCooikeUserName = "";
   	String userCookie = (String)request.getAttribute("patientCookie");
   	if(userCookie!=null){
   		myCooikeUserName = userCookie;
   	}
   	
   	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
    %>
<!DOCTYPE html>
<html lang="en">

<head>
<style>

.myDiv{
	margin-left: 25%; margin-right:25%; width: 50%; margin:50px 300px; padding:10px 20px;text-align:center; align:center;
}

</style>

    <title>DCX Health Center</title>
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

   <body style="background-image: url('https://media.istockphoto.com/photos/medical-technology-concept-remote-medicine-electronic-medical-record-picture-id1223789376');background-repeat: no-repeat;
height:800px;
background-size:cover;
width:100%;">
<h1>Hey Hello Mr/Mrs : </h1><br><h2>Welcome Back</h2>
              <div class="myDiv" >
    <form  class="row g-3"action="./patientregisterconfirm" method="post">
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label"><b>Email</b></label>
    <input type="email" class="form-control" placeholder="enter your email" id="inputEmail4" name="patientEmail"/>
  </div>
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label"><b>Password</b></label>
    <input type="password" class="form-control" placeholder="enter your passowrd" id="inputPassword4" name="patientPassword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters"/>
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label"><b>Patient Name</b></label>
    <input type="text" name="patientName" class="form-control" id="inputAddress" placeholder="Enter your name"  value="<%=myCooikeUserName %>">
  </div>
  <div class="col-12">
    <label for="inputAddress2" class="form-label"><b>Address</b></label>
    <input type="text" name="patientAddress" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="col-md-6">
    <label for="inputCity" class="form-label"><b>Aadhar Number</b></label>
    <input type="number" name="patientId" class="form-control" placeholder="enter your aadhar number" id="inputCity">
  </div>
  <div class="col-md-6">
    <label for="inputCity" class="form-label"><b>Phone Number</b></label>
    <input type="number" name="patientPhone" class="form-control" id="inputCity"  pattern="[0-9]{10}"><br>
  </div>

 
 
  <div class="col-12">
    <button type="submit" class="btn btn-primary">Register</button>
  </div>
</form>
       </div>
</body>

</html>