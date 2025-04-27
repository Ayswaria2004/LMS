package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class BooksListServlet
 */
public class BooksListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BooksListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		List<Users> list = UserDao.getAllBooks();
		out.print("<table border='1' width='100%'>");
		out.print(
				"<tr><th>Book_Id</th><th>Book_Name</th><th>Book_Author</th><th>Book_price</th>");

		for (Users u : list) {
			out.print("<tr><td>" + u.getBookId() + "</td><td>" + u.getBookname() + "</td><td>" + u.getBookauthor() + "</td><td>"
					+ u.getBookprice() + "</td>");/*<td>" + e.getCountry() + "</td><td><a href='EditServlet?id=" + e.getId()
					+ "'>edit</a></td><td><a href='DeleteServlet?id=" + e.getId() + "'>delete</a></td></tr>");*/
		}
		out.print("</table>");
		out.close();
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
