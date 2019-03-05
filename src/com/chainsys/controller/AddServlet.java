package com.chainsys.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   int regno=Integer.parseInt(request.getParameter("regno"));
			String name =request.getParameter("name");
			int points =Integer.parseInt(request.getParameter("points"));
			int department_id = Integer.parseInt(request.getParameter("department_id"));
			
		
			
		Student student =new Student();
			student.setRegno(regno);
			student.setName(name);
			student.setPoints(points);
			student.setDepartment_id(department_id);
			
			StudentDAO dao= new StudentDAO();
			try {
				dao.insert(student);
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
