<%@page import="model.User"%>
<%@page import="dao.UserDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
<%
String uid= request.getParameter("id");
int id=Integer.parseInt(uid);
User u= UserDAO.getUserByID(id);
%>
	<div style="width: 50%; margin-left: auto; margin-right: auto">
		<form method="post" action="update.jsp" accept-charset="utf-8"
			style="border: 8px solid transparent; border-image: url(image/border.png) 10 round; padding: 8px">
			<fieldset>
				<legend>Update</legend>
				<input name="id" type="hidden"
					value="<%request.getParameter("id");%>"> <input
					name="image" id="upload" style="float: right"
					onchange="previewImage()" type="file" accept="image/*"> <br>
				<br> <img id="preview" width="120px" height="100px" alt="Image"
					style="float: right;"> First name:<br> <input
					name="firstname" value="<%u.getFirstName(); %>" 
					style="width: 300px; height: 30px; border: 1px solid black; border-radius: 6px;"
					text" required > <br> Last name: <br> <input
					name="lastname" value="<%u.getLastName(); %>" 
					style="width: 300px; height: 30px; border: 1px solid black; border-radius: 6px;"
					type="text" required> <br> Phone number : <br> (
				  <input maxlength="3" name="num1"  
					style="width: 50px; border: 1px solid black; border-radius: 6px;"
					type="text">) <input maxlength="3" name="num2"
					style="width: 50px; border: 1px solid black; border-radius: 6px;"
					type="text">- <input maxlength="4" name="num3"
					style="width: 50px; border: 1px solid black; border-radius: 6px;"
					type="text"> <br> <input type="radio" name="gender"
					value="male"> Male <br> <input type="radio"
					name="gender" value="female"> Female <br>
				<textarea placeholder="Descaption" name="descap"
					style="max-width: 590px; background-color: #F1F1F1; border: 1px solid black; border-radius: 6px; padding: 8px" value="<%u.getDesCaption(); %>"
					rows="8" cols="80"></textarea>
				<br> <input type="checkbox" name="vehicle" value="Bike">By
				Bike <br> <input type="checkbox" name="vehicle" value="Car">By
				Car <br> <select name="option"
					style="border: none; width: 100%; height: 40px; background-color: #F1F1F1">
					<option>Metter</option>
					<option>Kilometer</option>
				</select> <br>
				<button type="submit"
					style="margin-top: 10px; background-color: #39AF5A; border: none; width: 100px; height: 40px">Submit</button>
			</fieldset>
		</form>

	</div>
</body>
<script src="js/script.js"></script>
</html>