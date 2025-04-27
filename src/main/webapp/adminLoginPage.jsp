 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Admin Login</title>
    
  
    
    <link rel="stylesheet" href="Login.css">
</head>
<body>

    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6 col-md-offset-3">
                <h2 class="text-center">Admin Login</h2>
                <form class="form-horizontal" action="LoginServlet" method="post">
                    
                   <!-- Email Field --> 
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="email">Email:</label>
                        <div class="col-sm-9">
                            <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
                        </div>
                    </div>

                    <!-- Password Field -->
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="pwd">Password:</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
                        </div>
                    </div>

                   <!--  Remember Me Checkbox -->
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <div class="checkbox">
                                <label><input type="checkbox" name="remember"> Remember me</label>
                            </div>
                        </div>
                    </div>

                    <!-- Sign Up Link -->
                    <!-- <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <p>If you do not have an account, register here:</p>
                            <a href="SignUp.jsp" style="font-size:18px;">SignUp</a>
                        </div>
                    </div> -->
                   <!--  Login Button -->
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <button type="submit" class="btn btn-primary">Log In</button>
                        </div>
                    </div>

                </form>
            </div>
        </div>
    </div>

</body>
</html>

