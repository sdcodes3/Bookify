<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.File,p1.Login"%>
<%@page import="java.util.*,org.apache.commons.fileupload.FileItem"%>
<%@page import="javax.servlet.annotation.MultipartConfig" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if("1".equals(request.getParameter("addBook"))){
	String data[] = new String[6];
	boolean insert=false;
	int x=0;
	String destination = "D:\\Nirma\\OOP\\workspace\\Bookify\\src\\main\\webapp\\img\\";
	ServletFileUpload upload= new ServletFileUpload(new DiskFileItemFactory());
	List<FileItem> fileItems = upload.parseRequest(request);
	Iterator<FileItem> i = fileItems.iterator();
	String fileUploaded = "";
	while(i.hasNext()){
		FileItem fi = (FileItem)i.next();
		if ( !fi.isFormField () ) {
	           String fieldName = fi.getFieldName();
	           String fileName = fi.getName();
	           boolean isInMemory = fi.isInMemory();
	           long sizeInBytes = fi.getSize();
	           File file = new File( destination + fileName) ;
	           fi.write( file );
	           fileUploaded = destination+fileName;
		}
		else{
		    data[x++] = fi.getString();
		}
	}
	String newImg = fileUploaded;
	new Login();
	x=0;
	insert = Login.insertBook(data[x++], data[x++], data[x++], data[x++], newImg, data[x++]);
	if(insert)
		session.setAttribute("addBook", "true");
	else
		session.setAttribute("addBook", "false");
	response.sendRedirect("addInsight.jsp");
}
else if("1".equals(request.getParameter("addInsight"))){
	String book = request.getParameter("book");
	String bookInsight = request.getParameter("insight");
	int bookId = Integer.parseInt(book);
	int userId = Integer.parseInt(session.getAttribute("userId").toString());
	new Login();
	boolean insert = Login.insertInsight(userId,bookId,bookInsight);
	if(insert)
		session.setAttribute("addInsight", "true");
	else
		session.setAttribute("addInsight", "false");
	response.sendRedirect("addInsight.jsp");
}
else if("1".equals(request.getParameter("manageInsight"))){
	int insightId = Integer.parseInt(request.getParameter("insightId"));
	new Login();
	boolean delete = Login.deleteInsight(insightId);
	if(delete)
		session.setAttribute("deleteInsight", "true");
	else
		session.setAttribute("deleteInsight", "false");
	response.sendRedirect("manageInsight.jsp");
}
%>
</body>
</html>