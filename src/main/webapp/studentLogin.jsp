<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
    
    <link rel="stylesheet" href="Login.css">
</head>
<body>

    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6 col-md-offset-3">
                <h2 class="text-center">Student Login</h2>
                <form class="form-horizontal" action="StudentLoginServlet" method="post">
                   
                    <!-- Sid Field (Fixed Name Attribute) --> 
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="email">Sid:</label>
                        <div class="col-sm-9">
                            <input type="text" name="sid" class="form-control" id="sid" 
                            placeholder="Enter Sid" required>
                        </div>
                    </div>
                    <!-- Name Field (Fixed Name Attribute) --> 
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="email">Name:</label>
                        <div class="col-sm-9">
                            <input type="text" name="name" class="form-control" id="name" 
                            placeholder="Enter Name" required>
                        </div>
                    </div>
                    
                    <!-- Email Field (Fixed Name Attribute) --> 
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="email">Email:</label>
                        <div class="col-sm-9">
                            <input type="text" name="email" class="form-control" id="email" 
                            placeholder="Enter Email" required>
                        </div>
                    </div>

                    <!-- Password Field -->
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="pwd">Password:</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="pwd" 
                            placeholder="Enter password" name="pwd" required>
                        </div>
                    </div>

                    <!-- Remember Me Checkbox -->
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <div class="checkbox">
                                <label><input type="checkbox" name="remember"> Remember me</label>
                            </div>
                        </div>
                    </div>

                    <!-- Sign Up Link -->
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <p>If you do not have an account, register here:</p>
                            <a href="studentSignUp.jsp" style="font-size:18px;">SignUp</a>
                        </div>
                    </div>

                    <!-- Login Button (Fixed Form Submission) -->
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-12">
                            <button type="submit" class="btn btn-primary">Log In</button>
                        </div>
                    </div>

                </form>
            </div>
        </div>
    </div>

</body>
</html>
