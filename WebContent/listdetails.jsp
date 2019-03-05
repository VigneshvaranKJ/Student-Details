<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DETAILS</title>
<style>
body{
	background-Image:url(black.png);
	}
	</style>
</head>
<body>
<table align ="right"><tr><th align= "right"></th><td><a href="login.jsp"><p><font color="white">LOGOUT</font></p></a></td></tr></table>
	<table align="center">
		<thead>
			<tr>
				<th><p><font color="white">REG_NO</font></p></th>
				<th><p><font color="white">NAME</font></p></th>
				<th><p><font color="white">POINTS</font></p></th>
				<th><p><font color="white">DEPARTMENT_ID</font></p></th>
			</tr>
		</thead>
		<c:forEach var="student" items="${DETAILS}">
			<tr>
				<td><center><p><font color="SlateBlue">${student.regno}</font></p></center></td>
				<td><center><p><font color="SlateBlue">${student.name}</font></p></center></td>
				<td><center><p><font color="SlateBlue">${student.points}</font></p></center></td>
				<td><center><p><font color="SlateBlue">${student.department_id}</font></p></center></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>