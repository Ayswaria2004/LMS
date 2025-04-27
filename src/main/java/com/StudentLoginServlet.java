package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class studentLogin
 */
@WebServlet("/studentLogin")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLoginServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String sid=request.getParameter("sid");
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		
		Users u=new Users();
		
		u.setName(name);
		u.setSid(sid);
		u.setPassword(password);		
		u.setEmail(email);
		
		try {
			if(UserDao.validate(u)) {
				out.print("Login successful");
				request.getRequestDispatcher("studentDashboard.jsp").include(request, response);;
			}else {
				out.print("Login fail");
				request.getRequestDispatcher("studentLogin.jsp").include(request, response);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
