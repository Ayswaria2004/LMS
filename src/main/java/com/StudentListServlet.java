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
 * Servlet implementation class StudentListServlet
 */
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Users> list = UserDao.getAllStudents();
		out.print("<table border='1' width='100%'>");
		out.print(
				"<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th>");

		for (Users u : list) {
			out.print("<tr><td>" + u.getSid() + "</td><td>" + u.getName() + "</td><td>" + u.getPassword() + "</td><td>"
					+ u.getEmail() + "</td>");/*<td>" + e.getCountry() + "</td><td><a href='EditServlet?id=" + e.getId()
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
