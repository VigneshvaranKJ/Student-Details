package com.chainsys.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SearchByDeaprtmentId")
public class SearchByDeaprtmentId extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
		
		
	
	String name = request.getParameter("department_name");
		
		Department department = new Department();
		department.setName(name);
		
	StudentDAO dao = new StudentDAO();
	try {
	//	dao.findById(department);
		ArrayList<Student> list = new ArrayList<Student>();
		list= dao.findByDepartmentName(department);
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
