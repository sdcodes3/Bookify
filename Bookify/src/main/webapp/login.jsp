<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(session.getAttribute("userId") != null){	
	int uId = Integer.parseInt(session.getAttribute("userId").toString());
	if(uId>100){
		response.sendRedirect("home.jsp");
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/x-icon" href="https://thenounproject.com/api/private/icons/5330258/edit/?backgroundShape=SQUARE&backgroundShapeColor=%23000000&backgroundShapeOpacity=0&exportSize=752&flipX=false&flipY=false&foregroundColor=%23000000&foregroundOpacity=1&imageFormat=png&rotation=0&token=gAAAAABjhQlQWzG1lz6UkmMBFQtFE8q0k7boQfBHU2oY30dckPRxKC6p4jCi7sKm5vVv8ZwfSJP0PgfodERUvZrTtU8TXrMhdw%3D%3D">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bookify - Login</title>
<!--Bootstrap 5.2-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>

<!--CSS-->
<link rel="stylesheet" href="registration.css">

</head>
<body class="d-flex">
	<div class="container-fluid px-0">
        <div class="d-flex bg-light py-3 justify-content-center h4 header fw-bold fixed-top">Login</div>
        <div class="d-flex justify-content-center align-items-center h-100">
            <form action="formProcess.jsp" method="post" class="d-flex flex-column gap-3 border border-2 p-4 form col-xl-3 col-lg-4 col-md-5 mt-5">
            	<div class="text-center text-warning fw-bold">
            	<%
            	String val = "";
            	if(request.getParameterMap().containsKey("un")){
            		val = request.getParameter("un");
	            	if(request.getParameterMap().containsKey("error"))
	            		out.println("Invalid Login Details");
	            	else
	            		out.println("You have registered successfully! Please login here...");
                }
                if(request.getParameterMap().containsKey("error") && request.getParameter("error").equals("2"))
	            		out.println("Kindly Login here to continue...!!");
                %>
                </div>
                <div class="d-flex flex-column gap-2">
                    <label for="uname">Username : </label>
                    <input type="text" id="uname" name="uname" placeholder="cdcodes" value="<%= val %>" required autofocus>
                </div>
                <div class="d-flex flex-column gap-2">
                    <label for="pass">Password : </label>
                    <input type="password" id="pass" name="pass" placeholder="********" required>
                </div>
                <input type="submit" value="LOGIN" class="btn rounded-0">
                <input type="text" value="login" name="type" hidden="true">
	            <div class="d-flex justify-content-center">
	            	New here??
	            	<a href="registration.jsp" class="text-danger fw-bold nav-link ms-2">Register</a>
	           	</div>
            </form>
        </div>
    </div>
<!--Bootstrap 5.2-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>