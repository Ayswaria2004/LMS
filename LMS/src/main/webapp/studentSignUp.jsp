<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->
<link rel="stylesheet" href="Register.css">

</head>
<body>
<div style="margin:200px;margin-left:400px">
<h2 style="text-align:center">Registration Page</h2>
  <form class="form-horizontal" action="SaveServlet" method="post">
  <div class="form-group">
      <label class="control-label col-sm-2" for="name">Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="sid">Student ID:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="sid" placeholder="Enter Student ID" name="sid">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="rpwd">Re-Type Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" placeholder="Re-Type Password" name="rpwd">
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Create Account</button>
      </div>
    </div>
  </form>
  </div>
</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Register</title>
    
    <link rel="stylesheet" href="Register.css">
</head>
<body>

    <div class="container">
        <h2>Student Registration</h2>
        
        <form class="form-horizontal" action="SaveServlet" method="post">
            
            <!-- Name -->
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name" required>
            </div>
            
            <!-- Student ID -->
            <div class="form-group">
                <label for="sid">Student ID:</label>
                <input type="text" class="form-control" id="sid" placeholder="Enter Student ID" name="sid" required>
            </div>

            <!-- Email -->
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" placeholder="Enter Email" name="email" required>
            </div>

            <!-- Password -->
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" id="pwd" placeholder="Enter Password" name="pwd" required>
            </div>

            <!-- Re-Type Password -->
            <div class="form-group">
                <label for="rpwd">Re-Type Password:</label>
                <input type="password" class="form-control" id="rpwd" placeholder="Re-Type Password" name="rpwd" required>
            </div>

            <!-- Register Button -->
            <button type="submit" class="btn-register">Create Account</button>

        </form>
    </div>

</body>
</html>
