package com.chainsys.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("regno"));
		
		
		Student student =new Student();
		student.setRegno(regno);
		
		StudentDAO dao= new StudentDAO();
		try {
			dao.deleteStudent(student);
			ArrayList<Student> list = new ArrayList<Student>();
		 list=dao.findALL();
		
	 request.setAttribute("DETAILS", list);
			RequestDispatcher rd = request.getRequestDispatcher("listdetails.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	

}
