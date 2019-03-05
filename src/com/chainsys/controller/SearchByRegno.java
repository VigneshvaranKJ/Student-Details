package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchByRegno")
public class SearchByRegno extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int reg_no= Integer.parseInt(request.getParameter("regno"));
		
		Student student= new Student();
		student.setRegno(reg_no);
	StudentDAO dao = new StudentDAO();
	try {
	//	dao.findById(department);
		ArrayList<Student> list = new ArrayList<Student>();
		list= dao.findByRegno(student);
		 request.setAttribute("DETAILS", list);
			RequestDispatcher rd = request.getRequestDispatcher("listdetails.jsp");
			rd.forward(request, response);

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}


