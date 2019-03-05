<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REG_NO</title>
<style>
body{
	background-Image:url(black.png);
	}
	</style>
</head>
<p><font color="white"><center><h2>ENTER THE REG_NO</h2></center></font></p>
<body>
<table align ="right"><tr><th align= "right"></th><td><a href="login.jsp"><p><font color="white">LOGOUT</font></p></a></td></tr></table>
<form method="post" action ="SearchByRegno">
<table align="center">
<tr>
<th align="right"><p><font color="white">REG_NO</font></p></th>
<td><input type = "number" name="regno"></td></tr><br>
<br>
<tr>
<th align="center"></th>
<td><button type ="submit">ENTER</button></td></tr></table>
</form>

</body>
</html>