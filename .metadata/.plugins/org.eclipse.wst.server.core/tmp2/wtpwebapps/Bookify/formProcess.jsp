<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="p1.DBconn,p1.Login,p1.Register" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Processing</title>
</head>
<body>
<% 	
	boolean result = false;
	String uname = "";
%>
<%
	if(request.getParameter("type").equals("login")){
		uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		new Login(uname,pass);
		int result1 = Login.main(null);
		if(result1>100){
			session.setAttribute("userId", result1);
			response.sendRedirect("home.jsp");
		}
		else{
			response.sendRedirect("login.jsp?error=1&un="+uname);
		}
	}
	else if(request.getParameter("type").equals("admin")){
		out.println("You are an admin");
	}
	else {
		String name = request.getParameter("name");
		uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		new Register(name,uname,email,pass);
		String redirectURL = "";
		if(Register.main(null))	
			redirectURL = "login.jsp?un="+uname;
		else
			redirectURL = "registration.jsp?error=1";
	    response.sendRedirect(redirectURL);
	}
%>
</body>
</html>