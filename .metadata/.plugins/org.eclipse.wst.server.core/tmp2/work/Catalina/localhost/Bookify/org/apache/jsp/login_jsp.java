/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-12-25 12:34:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write('\r');
      out.write('\n');

if(session.getAttribute("userId") != null){	
	int uId = Integer.parseInt(session.getAttribute("userId").toString());
	if(uId>100){
		response.sendRedirect("home.jsp");
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
      out.write("<title>Bookify - Login</title>\r\n");
      out.write("<!--Bootstrap 5.2-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--CSS-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"registration.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"d-flex\">\r\n");
      out.write("	<div class=\"container-fluid px-0\">\r\n");
      out.write("        <div class=\"d-flex bg-light py-3 justify-content-center h4 header fw-bold fixed-top\">Login</div>\r\n");
      out.write("        <div class=\"d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("            <form action=\"formProcess.jsp\" method=\"post\" class=\"d-flex flex-column gap-3 border border-2 p-4 form col-xl-3 col-lg-4 col-md-5 mt-5\">\r\n");
      out.write("            	<div class=\"text-center text-warning fw-bold\">\r\n");
      out.write("            	");

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
                
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex flex-column gap-2\">\r\n");
      out.write("                    <label for=\"uname\">Username : </label>\r\n");
      out.write("                    <input type=\"text\" id=\"uname\" name=\"uname\" placeholder=\"cdcodes\" value=\"");
      out.print( val );
      out.write("\" required autofocus>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex flex-column gap-2\">\r\n");
      out.write("                    <label for=\"pass\">Password : </label>\r\n");
      out.write("                    <input type=\"password\" id=\"pass\" name=\"pass\" placeholder=\"********\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"submit\" value=\"LOGIN\" class=\"btn rounded-0\">\r\n");
      out.write("                <input type=\"text\" value=\"login\" name=\"type\" hidden=\"true\">\r\n");
      out.write("	            <div class=\"d-flex justify-content-center\">\r\n");
      out.write("	            	New here??\r\n");
      out.write("	            	<a href=\"registration.jsp\" class=\"text-danger fw-bold nav-link ms-2\">Register</a>\r\n");
      out.write("	           	</div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<!--Bootstrap 5.2-->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
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
