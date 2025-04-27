package com;

public class Users {
	private int Bookprice;
	private String Issue_Date, Borrow_Date, name, sid, email, password, rPassword, Bookname, Bookauthor, BookId;

	public String getBorrow_Date() {
		return Borrow_Date;
	}

	public void setBorrow_Date(String borrow_Date) {
		Borrow_Date = borrow_Date;
	}

	public String getIssue_Date() {
		return Issue_Date;
	}

	public void setIssue_Date(String issue_Date) {
		Issue_Date = issue_Date;
	}

	public int getBookprice() {
		return Bookprice;
	}

	public void setBookprice(int bookprice) {
		Bookprice = bookprice;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public String getBookauthor() {
		return Bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		Bookauthor = bookauthor;
	}

	public String getBookId() {
		return BookId;
	}

	public void setBookId(String bookId) {
		BookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
