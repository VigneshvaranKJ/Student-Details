package com.chainsys.controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	ResultSet  resultSet= null;
	public void insert(Student student) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into student_details(reg_no,name,points,department_id) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getRegno());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setInt(3, student.getPoints());
			preparedStatement.setInt(4,student.getDepartment_id());
			int rows = preparedStatement.executeUpdate();
			System.out.println("Rows inserted:" + rows);
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();{
			// throw new Exception("Unable to insert book");
		}
		}
	}
	public void deleteStudent(Student student) throws SQLException, ClassNotFoundException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "delete from student_details where reg_no=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, student.getRegno());
		int rows = preparedStatement.executeUpdate();
		System.out.println("Rows deleted:" + rows);
		ConnectionUtil.close(connection, preparedStatement, resultSet);
	}
	public void updateStudent(Student student) throws SQLException,
	ClassNotFoundException {
Connection connection = ConnectionUtil.getConnection();
String sql = "update student_details set name=? where reg_no=?";
PreparedStatement preparedStatement = connection.prepareStatement(sql);
System.out.println("ENTER THE NAME TO BE UPDATED:");
preparedStatement.setString(1, student.getName());
System.out.println("Enter the regno:");
preparedStatement.setInt(2, student.getRegno());
int rows = preparedStatement.executeUpdate();
System.out.println("Rows updated:" + rows);
ConnectionUtil.close(connection, preparedStatement, resultSet);
}
	public ArrayList<Student> findByRegno(Student student) throws SQLException, ClassNotFoundException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select reg_no,name,points,department_id from student_details  where reg_no =?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, student.getRegno());
		ResultSet rset1 = preparedStatement.executeQuery();
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = null;
		if (rset1.next()) {
			s = new Student();
			s.setRegno(rset1.getInt("reg_no"));
			s.setName(rset1.getString("name"));
			s.setPoints(rset1.getInt("points"));
		    s.setDepartment_id(rset1.getInt("department_id"));
		    list.add(s);

			

		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return list;
	}



	public ArrayList<Student>    findByDepartmentName (Department department) throws SQLException, ClassNotFoundException {

		Connection connection = ConnectionUtil.getConnection();
		String sql = "SELECT  reg_no, name, points, department_id from student_details where department_id =(SELECT id from department where department_name = ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, department.department_name);
		ResultSet rset1 = preparedStatement.executeQuery();
		ArrayList<Student> list = new ArrayList<Student>();
		Student s;
		while (rset1.next()) {

		s= new Student();
		s.setRegno(rset1.getInt("reg_no"));
		s.setName(rset1.getString("name"));
		s.setPoints(rset1.getInt("points"));
		s.setDepartment_id(rset1.getInt("department_id"));
			list.add(s);
		
		}
	ConnectionUtil.close(connection, preparedStatement, null);
		return list;
		  
		}
		
	public ArrayList<Student> findALL() throws SQLException,
	ClassNotFoundException {

String sql = "select reg_no, name, points, department_id from Student_details";
Connection connection = ConnectionUtil.getConnection();
PreparedStatement preparedStatement = connection.prepareStatement(sql);
ResultSet rset1 = preparedStatement.executeQuery();
ArrayList<Student> list = new ArrayList<Student>();
Student s;
while (rset1.next()) {

s= new Student();
s.setRegno(rset1.getInt("reg_no"));
s.setName(rset1.getString("name"));
s.setPoints(rset1.getInt("points"));
s.setDepartment_id(rset1.getInt("department_id"));
	list.add(s);
	// System.out.println(rset1.getInt("id") + " "
	// + rset1.getString("name") + " " + rset1.getInt("price"));

}
return list;

}
}
	
	
