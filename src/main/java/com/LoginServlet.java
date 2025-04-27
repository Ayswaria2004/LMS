package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		Users u=new Users();
		u.setPassword(password);		
		u.setEmail(email);
		if(password.equals("123")&& email.equals("Admin@123"))
		{
			out.print("<p style='color:green;margin-left:400px;'>Login successfull</p>");
			request.getRequestDispatcher("AdminWelcome.html").forward(request, response);
		}
		else{
			out.print("<p style='color:red;margin-left:400px;'>"
					+ "Unable to Login, Invalid Username/Password Error</p>");
			request.getRequestDispatcher("LoginPage.jsp").include(request, response);
		}
	}

}