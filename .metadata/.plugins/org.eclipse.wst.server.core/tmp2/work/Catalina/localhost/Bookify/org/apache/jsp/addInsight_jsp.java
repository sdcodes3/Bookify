/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-12-25 16:56:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import p1.Login;
import java.sql.*;

public final class addInsight_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("p1.Login");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

if(session.getAttribute("userId")==null){
	response.sendRedirect("login.jsp?error=2");
}
else{
	int id = Integer.parseInt(session.getAttribute("userId").toString()); 
	if(id<=100){
		response.sendRedirect("login.jsp?error=2");
	}
}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"https://thenounproject.com/api/private/icons/5330258/edit/?backgroundShape=SQUARE&backgroundShapeColor=%23000000&backgroundShapeOpacity=0&exportSize=752&flipX=false&flipY=false&foregroundColor=%23000000&foregroundOpacity=1&imageFormat=png&rotation=0&token=gAAAAABjhQlQWzG1lz6UkmMBFQtFE8q0k7boQfBHU2oY30dckPRxKC6p4jCi7sKm5vVv8ZwfSJP0PgfodERUvZrTtU8TXrMhdw%3D%3D\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Bookify - Insert Insights</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"home.css\">\r\n");
      out.write("<!--Bootstrap 5.2-->\r\n");
      out.write("<!-- CSS only -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Font Awesome link -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("html, body{\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"d-flex flex-column\">\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("        <div class=\"container-fluid py-1 px-4\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                Bookify\r\n");
      out.write("                <!-- <img src=\"img/image-removebg-preview (1).png\" class=\"img-fluid\"> -->\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("                data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("                aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                <ul class=\"navbar-nav ms-auto gap-0 gap-lg-3\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"home.jsp\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"addInsight.jsp\">Add Insight</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"manageInsight.jsp\">Manage your Insight</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp?logout=true\">\r\n");
      out.write("                        ");

                        new Login();
                        int id = Integer.parseInt(session.getAttribute("userId").toString());
                        ResultSet rst = Login.st.executeQuery("SELECT name FROM user WHERE id="+id);
                        rst.next();
                        String name = rst.getString("name"); 
                        if(name.contains(" "))
                        	name = name.substring(0, name.indexOf(' ')); 
                        
      out.write("\r\n");
      out.write("                        <b>Hello ");
 out.print(name); 
      out.write("</b>, Logout?\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("	<div class=\"container-fluid h-100 d-flex justify-content-center\">\r\n");
      out.write("		<div class=\"col-12 col-md-8 col-lg-6 col-xl-4 p-0 d-flex flex-column justify-content-md-start pt-md-5 justify-content-center\">\r\n");
      out.write("			<div class=\"ms-2\">\r\n");
      out.write("				<a href=\"home.jsp\" class=\"text-decoration-none fw-bold\"><i class=\"fa-solid fa-rotate-left me-1\"></i>Go back</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"text-center fw-bold h2 py-5\">\r\n");
      out.write("				Add and Publish your Insights about the book here..	\r\n");
      out.write("			</div>\r\n");
      out.write("			<form action=\"processInsight.jsp?addInsight=1\" method=\"post\" class=\"d-flex flex-column gap-3 bg-light shadow-lg p-3 rounded-2\">\r\n");
      out.write("				");

				if("true".equals(session.getAttribute("addBook"))){
					session.removeAttribute("addBook");
				
      out.write("\r\n");
      out.write("				<div class=\"msg text-center fw-bold h5 text-success\">\r\n");
      out.write("					Book Added Successfully!!\r\n");
      out.write("				</div>\r\n");
      out.write("				");
 } 
      out.write("\r\n");
      out.write("				");

				if("true".equals(session.getAttribute("addInsight"))){
					session.removeAttribute("addInsight");
				
      out.write("\r\n");
      out.write("				<div class=\"msg text-center fw-bold h5 text-success\">\r\n");
      out.write("					Insight Published Successfully!!\r\n");
      out.write("				</div>\r\n");
      out.write("				");
 }
      out.write("\r\n");
      out.write("				<div class=\"d-flex flex-column gap-2\">\r\n");
      out.write("					<label>Book Name : </label>\r\n");
      out.write("					<select name=\"book\" class=\"form-select\">\r\n");
      out.write("						\r\n");
      out.write("						");

						new Login();
						ResultSet rs = Login.st.executeQuery("SELECT * FROM book");
						while(rs.next()){
						
      out.write("							\r\n");
      out.write("							<option value=\"");
 out.print(rs.getInt("id")); 
      out.write('"');
      out.write('>');
 out.println(rs.getString("name")); 
      out.write("</option>\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("					</select>\r\n");
      out.write("			    </div>\r\n");
      out.write("			    <div class=\"d-flex flex-column gap-2\">\r\n");
      out.write("			    	Insights / Comments\r\n");
      out.write("			    	<textarea rows=\"3\" cols=\"10\" class=\"form-control\" name=\"insight\">Your Insight....</textarea>\r\n");
      out.write("			    </div>\r\n");
      out.write("			    <div class=\"d-flex justify-content-between\">\r\n");
      out.write("			    	<button type=\"button\" class=\"btn text-primary border-0\" data-bs-toggle=\"modal\" data-bs-target=\"#addBook\">\r\n");
      out.write("						Book not found?\r\n");
      out.write("					</button>\r\n");
      out.write("		        	<input class=\"btn btn-primary\" type=\"submit\" value=\"Publish\" name=\"publish\">\r\n");
      out.write("		        </div>\r\n");
      out.write("		    </form>\r\n");
      out.write("		    <div class=\"modal fade\" id=\"addBook\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("				<div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("			  		<div class=\"modal-content\">\r\n");
      out.write("				    	<div class=\"modal-header\">\r\n");
      out.write("				        	<h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Add Book</h1>\r\n");
      out.write("				        	<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("				      	</div>\r\n");
      out.write("			      		<form action=\"processInsight.jsp?addBook=1\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("					      	<div class=\"modal-body d-flex flex-column gap-3\">\r\n");
      out.write("						      	<div class=\"d-flex flex-column gap-2\">\r\n");
      out.write("									<label>Book Name : </label>						\r\n");
      out.write("						        	<input list=\"books\" name=\"newBook\" class=\"form-control\">\r\n");
      out.write("							        <datalist id=\"books\">\r\n");
      out.write("							            ");

										ResultSet rs1 = Login.st.executeQuery("SELECT * FROM book");
										while(rs1.next()){
										
      out.write("							\r\n");
      out.write("											<option value=\"");
 out.print(rs1.getString("name")); 
      out.write('"');
      out.write('>');
 out.println(rs1.getString("name")); 
      out.write("</option>\r\n");
      out.write("										");

										}
										
      out.write("\r\n");
      out.write("							        </datalist>\r\n");
      out.write("							    </div>\r\n");
      out.write("							    <div class=\"d-flex flex-column gap-2\">\r\n");
      out.write("									<label>Book Name : </label>\r\n");
      out.write("									<select name=\"category\" class=\"form-select\">\r\n");
      out.write("										");

										ResultSet rs5 = Login.st.executeQuery("SELECT * FROM category");
										while(rs5.next()){
										
      out.write("							\r\n");
      out.write("											<option value=\"");
 out.print(rs5.getInt("id")); 
      out.write('"');
      out.write('>');
 out.println(rs5.getString("name")); 
      out.write("</option>\r\n");
      out.write("										");

										}
										
      out.write("\r\n");
      out.write("									</select>\r\n");
      out.write("							    </div>\r\n");
      out.write("			        		    <div class=\"row g-0 gap-3\">\r\n");
      out.write("							    	<div class=\"col\">\r\n");
      out.write("								    	<label>Author Name : </label>\r\n");
      out.write("								        <input list=\"authorName\" name=\"newAuthor\" class=\"form-control\">\r\n");
      out.write("								        <datalist id=\"authorName\">\r\n");
      out.write("								            ");

											ResultSet rs2 = Login.st.executeQuery("SELECT DISTINCT author FROM book");
											while(rs2.next()){
											
      out.write("							\r\n");
      out.write("												<option value=\"");
 out.print(rs2.getString("author")); 
      out.write('"');
      out.write('>');
 out.println(rs2.getString("author")); 
      out.write("</option>\r\n");
      out.write("											");

											}
											
      out.write("\r\n");
      out.write("								        </datalist>\r\n");
      out.write("							        </div>\r\n");
      out.write("							        <div class=\"col-3\">\r\n");
      out.write("							        	<label>Ratings : </label>\r\n");
      out.write("								       <input type=\"text\" name=\"newRate\" class=\"form-control\">\r\n");
      out.write("							        </div>\r\n");
      out.write("							    </div>\r\n");
      out.write("							    <div class=\"d-flex flex-column gap-2\">\r\n");
      out.write("							    	About Book\r\n");
      out.write("							    	<textarea rows=\"3\" cols=\"10\" class=\"form-control\" name=\"newAbout\">About...</textarea>\r\n");
      out.write("							    </div>\r\n");
      out.write("							    <div class=\"d-flex flex-column gap-2\">\r\n");
      out.write("							    	<div>\r\n");
      out.write("							    		Book's Image : \r\n");
      out.write("							    	</div>\r\n");
      out.write("							    	<div class=\"input-group\">\r\n");
      out.write("										<input type=\"file\" class=\"form-control\" id=\"inputGroupFile02\" name=\"img\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("					      	</div>\r\n");
      out.write("					      	<div class=\"modal-footer\">\r\n");
      out.write("					        	<button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("					        	<input type=\"submit\" class=\"btn btn-primary\" name=\"addBook\" value=\"Add Book\">\r\n");
      out.write("					      	</div>\r\n");
      out.write("						</form>\r\n");
      out.write("				    </div>\r\n");
      out.write("		  		</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<!-- JavaScript Bundle with Popper -->\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}