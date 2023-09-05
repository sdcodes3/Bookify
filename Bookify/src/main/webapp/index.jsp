<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if("true".equals(request.getParameter("logout"))){
	session.removeAttribute("userId");
}
%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/x-icon" href="https://thenounproject.com/api/private/icons/5330258/edit/?backgroundShape=SQUARE&backgroundShapeColor=%23000000&backgroundShapeOpacity=0&exportSize=752&flipX=false&flipY=false&foregroundColor=%23000000&foregroundOpacity=1&imageFormat=png&rotation=0&token=gAAAAABjhQlQWzG1lz6UkmMBFQtFE8q0k7boQfBHU2oY30dckPRxKC6p4jCi7sKm5vVv8ZwfSJP0PgfodERUvZrTtU8TXrMhdw%3D%3D">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bookify</title>
<!--Bootstrap 5.2-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>

<!--CSS-->
<style type="text/css">
	html {
	    height: 100%;
	    width: 100%;
	}

	body {
	    height: 100%;
	}
	.btn {
	    background-color: rgb(201, 243, 243);
	}
	.btn:hover,.btn:active,.btn:visited{
		background-color: rgb(201, 243, 243);
		font-weight: bold;
	}
</style>
</head>
<body class="d-flex">
	<div class="container-fluid px-0 d-flex flex-column align-items-center justify-content-center h-100">
	    <div class="d-flex justify-content-center">
	        <h1>Welcome to Bookify!!</h1>
	    </div>
	    <div class="anima">
	        <video width="460" height="315" poster="https://cdnl.iconscout.com/lottie/premium/preview-watermark/ai-reading-books-5647517-4703500.mp4" muted loop autoplay style="width: 329px;height: 320px;">
	            <source src="https://cdnl.iconscout.com/lottie/premium/preview-watermark/ai-reading-books-5647517-4703500.mp4" type="video/webm">
	    	</video>
	    </div>
        <div class="d-flex justify-content-center align-items-center">
           	<a href="login.jsp" class="btn px-3" id="#login">Login</a>
            <a href="registration.jsp" class="btn ms-3 px-3">Register</a>
        </div>
	</div>
	
    <!--Bootstrap 5.2-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>