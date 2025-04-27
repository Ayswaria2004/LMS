<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management System</title>
<style>
/* Import Google Font */
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap');

/* Reset Default Styles */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* Full Page Styling */
body {
    font-family: 'Poppins', sans-serif;
    background: url('https://source.unsplash.com/1600x900/?library,books') no-repeat center center/cover;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    backdrop-filter: blur(6px);
}

/* Main Container */
#main {
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
    gap: 50px;
    background: rgba(255, 255, 255, 0.9);
    padding: 50px;
    border-radius: 12px;
    box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.2);
    animation: fadeIn 0.5s ease-in-out;
}

/* Fade-in Animation */
@keyframes fadeIn {
    from { opacity: 0; transform: translateY(-20px); }
    to { opacity: 1; transform: translateY(0); }
}

/* Image Styling */
#image {
    width: 220px;
    height: 220px;
    border-radius: 50%;
    transition: transform 0.3s ease-in-out, box-shadow 0.3s ease-in-out;
    border: 4px solid #fff;
}

/* Hover Effect on Images */
#image:hover {
    transform: scale(1.1);
    box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.3);
}

/* Responsive Design */
@media (max-width: 768px) {
    #main {
        flex-direction: column;
        padding: 30px;
        gap: 30px;
    }
    #image {
        width: 180px;
        height: 180px;
    }
}

</style>
</head>
<body style="background: linear-gradient(to right, #007bff, #6610f2)">
<h1>Library Management System  </h1>
<div id="main">
	<a href="adminLoginPage.jsp"><img src="admin1.jpg" id="image"class="img-circle" alt="No Image" /></a>
	<a href="studentLogin.jsp"><img src="student.png" id="image" class="img-circle" alt="No Image" /></a>
</div>
</body>
</html>