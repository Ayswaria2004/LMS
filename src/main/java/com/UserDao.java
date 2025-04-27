package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.Cookie;




public class UserDao {
	public static Connection con;
	public static PreparedStatement stmt;
	
	public static Connection getConnection()
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	
	//register users
	public static int save(Users u)
	{
	int status = 0;
	try 
	{
		 con=UserDao.getConnection();
		 stmt=con.prepareStatement("insert into Users(name,sid,email,password) values(?,?,?,?)");
		stmt.setString(1, u.getName());
		stmt.setString(2, u.getSid());
		stmt.setString(3, u.getEmail());
		stmt.setString(4, u.getPassword());
		status=stmt.executeUpdate();
		con.close();
	}catch(Exception ex) {
			System.out.println(ex);
		}
	return status;
	}
	
	
	//validate user
	public static boolean validate(Users u)
	{
		boolean status = false;
		try
		{
			 con=UserDao.getConnection();
			 stmt=con.prepareStatement("select * from users where email=? and password=?");
			stmt.setString(1, u.getEmail());
			stmt.setString(2, u.getPassword());
			
			System.out.println(stmt);
			ResultSet rs = stmt.executeQuery();

			status = rs.next();
			con.close();


		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		return status;
	}
	
	//add books to db
	public static int addBooks(Users u) {
		int status = 0;
		try {
			
			con = UserDao.getConnection();
			stmt = con.prepareStatement("insert into Books(Book_Id,Book_Name,Book_Author,Book_price)values(?,?,?,?)");
			stmt.setString(1, u.getBookId());
			stmt.setString(2, u.getBookname());
			stmt.setString(3, u.getBookauthor());
			stmt.setInt(4, u.getBookprice());
			status = stmt.executeUpdate();
			con.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}
	
	//delete books from db
	public static int delete(int id) {
		int status=0;
		try {
			Connection con=UserDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from Books where Book_Id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	// save issue books details to DB
		public static int save1(Users u) {
			int status = 0;
			try {
				con = UserDao.getConnection();
				stmt = con.prepareStatement("insert into issue_books(Book_Id,sid,Book_Name,name,issue_date)values(?,?,?,?)");
				stmt.setString(1,u.getBookId());
				stmt.setString(2,u.getSid());
				stmt.setString(3, u.getBookname());
				stmt.setString(4, u.getName());
				stmt.setString(5, u.getIssue_Date());
				status = stmt.executeUpdate();
				con.close();

			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return status;
		}
		
		//list of students
		public static List<Users> getAllStudents() {
			List<Users> list = new ArrayList<Users>();

			try {
				Connection con = UserDao.getConnection();
				PreparedStatement ps = con.prepareStatement("select * from users");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Users u = new Users();
					u.setName(rs.getString(1));
					u.setSid(rs.getString(2));
					u.setEmail(rs.getString(3));
					u.setPassword(rs.getString(4));
					list.add(u);
				}
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}

		//get all books
		public static List<Users> getAllBooks() {
			List<Users> list = new ArrayList<Users>();

			try {
				Connection con = UserDao.getConnection();
				PreparedStatement ps = con.prepareStatement("select * from books");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Users u = new Users();
					u.setBookId(rs.getString(1));
					u.setBookname(rs.getString(2));
					u.setBookauthor(rs.getString(3));
					u.setBookprice(rs.getInt(4));
					list.add(u);
				}
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}

		//save borrow to db
		public static int save2(Users u) {
			int status = 0;
			try {
				con = UserDao.getConnection();
				stmt = con.prepareStatement("insert into borrow_books(Book_Id,sid,Book_Name,name,borrow_date)values(?,?,?,?,?)");
				stmt.setString(1,u.getBookId());
				stmt.setString(2,u.getSid());
				stmt.setString(3, u.getBookname());
				stmt.setString(4, u.getName());
				stmt.setString(5, u.getBorrow_Date());
				status = stmt.executeUpdate();
				con.close();

			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return status;
}




	
}
