<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD</title>
<style>
body{
	background-Image:url(black.png);
	}
	</style>
</head>
<body>
<table align ="right"><tr><th align= "right"></th><td><a href="login.jsp"><p><font color="white">LOGOUT</font></p></a></td></tr></table>
<p><font color="white"><center><h1>STUDENT DETAILS</h1></center></font></p>
<form method ="post" action ="AddServlet">
<table align="center">
<tr>
<th align="right"><p><font color="white">REG_NO</font></p></th>
<td><input type = "number" name="regno"></td></tr>

<tr>
<th align="right"><p><font color="white">NAME</font></p></th>

<td><input type = "text" name="name"></td></tr>

<tr>
<th align="right"><p><font color="white">POINTS</font></p></th>
<td><input type="number" name="points"></td></tr>

<tr>
<th align="right"><p><font color="white">DEPARTMENT_ID</font></p></th>
<td><input type = "number" name ="department_id"></td></tr>

<tr>
<th align= "center"></th>
<td><button type = "submit">ADD</button></td></tr>
</table>
</form>

</body>
</html>