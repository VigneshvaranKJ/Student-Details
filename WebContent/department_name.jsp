<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Details</title>
<style>
body{
	background-Image:url(black.png);
	}
	</style>
</head>


<center><h3><p><font color="white">ENTER THE DEPARTMENT NAME</font></p></h3></center>
<body>
<table align ="right"><tr><th align= "right"></th><td><a href="login.jsp"><p><font color="white">LOGOUT</font></p></a></td></tr></table>
<form method="post" action="SearchByDeaprtmentId">
<table align = "center">
<tr>
<th align="right"><p><font color="white">DEPARTMENT NAME</font></p></th>
<td><input type="text" name="department_name"></td></tr>
<tr>
<th align= "center"></th>
<td><button  type="submit" >SEARCH</button></td></tr>
</table>


</form>
</body>
</html>