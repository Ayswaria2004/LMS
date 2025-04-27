package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BorrowBooksServlet
 */
public class BorrowBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrowBooksServlet() {
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
		PrintWriter out = response.getWriter();
		String Book_Id = request.getParameter("bookid");
		String sid = request.getParameter("Sid");
		String Book_name=request.getParameter("bookname");
		String name=request.getParameter("name");
		String Borrow_date=request.getParameter("borrowdate");
		int id = Integer.parseInt(sid);
		Users u = new Users();
		u.setBookId(Book_Id);
		u.setSid(sid);
		u.setBookname(Book_name);
		u.setName(name);
		u.setBorrow_Date(Borrow_date);

		int status = UserDao.save2(u);

		if (status > 0) {

			out.print("<p style=\"display:block; color:green;\">Book Borrowed successfully</p>");
			request.getRequestDispatcher("studentDashboard.jsp/#BorrowBooks").include(request,response);

		} else {

			out.print("<p style=\"display:block; color:red;\">Unable to Borrow the Book.</p>");
			
			request.getRequestDispatcher("studentDashboard.jsp").include(request, response);

		}

		out.close();

	}
}
