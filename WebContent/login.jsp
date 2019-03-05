<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href ="bootstrap.css" type="text/css" >
<style>
body{
	background-Image:url(black.png);
	}
	</style>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<center><h1><p><font color="white">LOGIN</font></p></h1></center>
<br>
<form method="post" action="LoginController">
<table align="center">
<tr>
<th align="right"><p><font color="white">EMAIL</font></p></th>
<td><input type="email" name = "email"></td></tr>
<tr>
<th align="right"><p><font color="white"> PASSWORD</font></p></th>
<td> <input type ="password" name= "password"></td></tr>
<tr>
<td colspan ="2" align="right"><input  type="submit" value ="Login"></td>
<tr>
</table>
</form>

</body>
</html>