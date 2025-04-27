package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class SaveServlet
 */
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
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
		
		String name=request.getParameter("name");
		String sid=request.getParameter("sid");
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		String rPassword=request.getParameter("rpwd");
		Users u=new Users();
		u.setName(name);
		u.setSid(sid);
		u.setPassword(password);		
		u.setEmail(email);
		if(password.equals(rPassword))
		{
			int status=UserDao.save(u);
			if(status>0)
			{
				out.print("<p style='color:green;font-size:20px;margin-left:400px'>Registration Successful! Please Login</p>");
				request.getRequestDispatcher("studentLogin.jsp").include(request, response);
			}
			else
			{
				out.print("<p>Unable to Register</p>");
				request.getRequestDispatcher("studentSignUp.jsp").include(request, response);
			}
		}
		else
		{
			out.print("<p style='color:red;margin-left:400px;'>password and Re-Type password do not match </p>");
			request.getRequestDispatcher("SignUp.jsp").include(request, response);
		}
		
		out.close();
	}

}
