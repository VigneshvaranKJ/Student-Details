package com.chainsys.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updateservlet
 */
@WebServlet("/Updateservlet")
public class Updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int regno= Integer.parseInt(request.getParameter("regno"));
			String name =request.getParameter("name");
			
			
			Student student = new Student();
			student.setRegno(regno);
			student.setName(name);
			
			StudentDAO dao = new StudentDAO(); 
			try {
				dao.updateStudent(student);
				List<Student> list =  dao.findALL();
				request.setAttribute("DETAILS", list);
				RequestDispatcher rd = request.getRequestDispatcher("listdetails.jsp");
				rd.include(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			
	}

	}}

		
	

