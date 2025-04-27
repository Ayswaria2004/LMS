package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class AddBooks_Servlet
 */
public class AddBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBooksServlet() {
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
		String bookid=request.getParameter("bookid");
		String bookname=request.getParameter("bookname");
		String bookauthor=request.getParameter("bookauthor");
		String bookp=request.getParameter("bookprice");
		int bookprice=Integer.parseInt(bookp);
		Users u=new Users();
		u.setBookId(bookid);
		u.setBookname(bookname);
		u.setBookauthor(bookauthor);
		u.setBookprice(bookprice);		
		int status = UserDao.addBooks(u);

		if (status > 0) {
			
			out.print("<p style=\"display:block; color:red;\">Books added successfully.</p>");
			request.getRequestDispatcher("AdminWelcome.html").include(request, response);

		} else {

			out.print("<p  style=\"display:block; color:red;\">Unable to add the Book.</p>");
			
			request.getRequestDispatcher("AdminWelcome.html").include(request, response);

		}

	}

}
