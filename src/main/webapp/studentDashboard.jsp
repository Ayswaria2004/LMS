<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Dashboard</title>

<!-- Bootstrap 5 & FontAwesome -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<style>
/* Custom Styling */
body {
	background-color: #7777;
	font-family: 'Arial', sans-serif;
}

.navbar {
	background-color: #343a40 !important;
}

.navbar-brand {
	color: white !important;
	font-weight: bold;
}

.sidebar {
	height: 100vh;
	background-color: #212529;
	padding-top: 20px;
	position: fixed;
	width: 250px;
	top: 0;
	left: 0;
	overflow-y: auto;
}

.sidebar a {
	padding: 15px;
	text-decoration: none;
	font-size: 18px;
	color: #ddd;
	display: block;
	transition: 0.3s;
}

.sidebar a:hover {
	background-color: #495057;
	color: white;
}

.content {
	margin-left: 260px;
	padding: 20px;
}

.module {
	display: none;
	animation: fadeIn 0.5s ease-in-out;
}

@
keyframes fadeIn {from { opacity:0;
	
}

to {
	opacity: 1;
}

}
.btn-logout {
	background-color: #dc3545;
	color: white;
	margin-top: 20px;
	text-align: center;
	padding: 10px;
	font-size: 18px;
	width: 100%;
	border: none;
}

.btn-logout:hover {
	background-color: #c82333;
}
</style>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<script>
	$(document).ready(function() {
		$(".module").hide();
		$("#StudentProfile").show(); // Show default section

		$(".nav-link").click(function(e) {
			e.preventDefault();
			$(".module").hide();
			var moduleId = $(this).attr("href");
			$(moduleId).fadeIn();
		});
	});
</script>

</head>
<body>
	<!-- cookies -->
	<%
	String name = request.getParameter("name");
	Cookie userCookie = new Cookie("name", name);
	userCookie.setMaxAge(60 * 60 * 24); // Set cookie expiration (e.g., 1 day)
	response.addCookie(userCookie);
	%>
	<%
	String email = request.getParameter("email");
	Cookie emailCookie = new Cookie("email", email);
	userCookie.setMaxAge(60 * 60 * 24); // Set cookie expiration (e.g., 1 day)
	response.addCookie(userCookie);
	%>
	<%
	String sid = request.getParameter("sid");
	Cookie sidCookie = new Cookie("sid", sid);
	userCookie.setMaxAge(60 * 60 * 24); // Set cookie expiration (e.g., 1 day)
	response.addCookie(userCookie);
	%>



	<!-- Sidebar -->
	<div class="sidebar">
		<h3 class="text-center text-light">Student Panel</h3>
		<a href="#StudentProfile" class="nav-link"><i class="fa-solid fa-user"></i> Student Profile</a> 
		<a href="#BorrowBooks" class="nav-link"><i class="fa-solid fa-book"></i> Borrow Books</a>  
		<a href="#BorrowDetails" class="nav-link"><i class="fa-solid fa-book"></i> Borrow Details</a> 
		<a href="#BookList" class="nav-link"><i class="fa-solid fa-list"></i> Book List</a>
		<form action="LogoutServlet" method="post">
			<!-- <button type="submit" class="btn btn-logout">
        <i class="fa-solid fa-sign-out-alt"></i> Logout</button> -->
			<a href="studentLogin.jsp" class="btn btn-logout">Logout</a>
		</form>
	</div>

	<!-- Main Content -->
	<div class="content">
		<!-- Student Profile -->
		<div id="StudentProfile" class="module">
			<h2>
				<i class="fa-solid fa-user"></i> Student Profile
			</h2>
			<p>
				Welcome,<%=name%>! Here are your details.
			</p>
			<ul class="list-group">
				<li class="list-group-item"><strong>Student ID:</strong><%=sid%></li>
				<li class="list-group-item"><strong>Email:</strong> <%=email%></li>
				<li class="list-group-item"><strong>Department:</strong>
					Computer Science</li>
			</ul>
		</div>

		<!-- Borrow Books -->
		<div id="BorrowBooks" class="module">

			<form class="form" action="BorrowBooksServlet" method="post">
				<input type="text" class="form-control mb-2" placeholder="Book ID"
					name="bookid"> <input type="text" class="form-control mb-2"
					placeholder="Student ID" name="Sid"> <input type="text"
					class="form-control mb-2" placeholder="Student Name" name="name">
				<input type="text" class="form-control mb-2" placeholder="Book Name"
					name="bookname"> <input type="date"
					class="form-control mb-2" placeholder="Issue Date"
					name="borrowdate">

				<button class="btn btn-success">Borrow Book</button>
			</form>

		</div>

		<!-- Borrow Details -->
		<div id="BorrowDetails" class="module">
			<h2>
				<i class="fa-solid fa-book"></i> Borrow Details
			</h2>
			<p>Here are the books you have borrowed:</p>
			<iframe src="BorrowBooksListServlet" width="100%" height="100%"></iframe>

		</div>

		<!-- Book List -->
		<div id="BookList" class="module">
			<h2>
				<i class="fa-solid fa-list"></i> Book List
			</h2>
			<p>Books you can Borrow:</p>
			<iframe src="BooksListServlet" width="100%" height="100%"></iframe>
		</div>
	</div>

	<!-- Bootstrap 5 JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
