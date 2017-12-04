<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page import="dao.UserDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Database</title>
</head>
<body>
	<%
	  List<User> list = UserDAO.getList();
	%>
	<table style="border-collapse: collapse;" width="600" border="1"
		style="float: left;">
		<tr>
			<th width="91">
				<div align="center">ID</div>
			</th>
			<th width="98">
				<div align="center">First Name</div>
			</th>
			<th width="198">
				<div align="center">Last Name</div>
			</th>
			<th width="97">
				<div align="center">Phone</div>
			</th>
			<th width="59">
				<div align="center">Descaption</div>
			</th>
			<th width="59">
				<div align="center">Image</div>
			</th>
			<th width="59">
				<div align="center">Gender</div>
			</th>
			<th width="59">
				<div align="center">Vehicle</div>
			</th>
			<th width="59">
				<div align="center">Option</div>
			</th>
		</tr>
		<%
		  for (User u : list) {
		%>
		<tr>
			<td><div align="center"><%=u.getId()%></div></td>
			<td align="right"><%=u.getFirstName()%></td>
			<td align="right"><%=u.getLastName()%></td>
			<td align="right"><div align="center"><%=u.getPhone()%></div></td>
			<td align="right"><%=u.getDesCaption()%></td>
			<td align="right"><%=u.getImage()%></td>
			<td align="right"><%=u.getGender()%></td>
			<td align="right"><%=u.getVehicle()%></td>
			<td align="right"><%=u.getOption()%></td>
			<td align="right"><a href="delete?id=<%=u.getId()%>">Delete</a></td>
			<td align="right"><a href="formupdate.jsp?id=<%=u.getId()%>">Update</a></td>
		</tr>
		<%
		  }
		%>
	</table>
</body>
</html>