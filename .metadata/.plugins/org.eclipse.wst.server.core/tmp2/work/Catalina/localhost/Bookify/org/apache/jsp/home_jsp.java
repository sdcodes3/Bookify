/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-12-27 07:15:40 UTC
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

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"home.css\">\r\n");
      out.write("<!-- Bootstrap CDN CSS -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<title>Bookify => Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("        <div class=\"container-fluid py-0 px-4\">\r\n");
      out.write("            <a class=\"navbar-brand d-flex align-items-center\" href=\"home.jsp\">\r\n");
      out.write("               	<img src=\"img/logo5.png\" class=\"img-fluid\" width=\"80\">\r\n");
      out.write("                <b>Bookify</b>\r\n");
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
                        ResultSet rs = Login.st.executeQuery("SELECT name FROM user WHERE id="+id);
                        rs.next();
                        String name = rs.getString("name"); 
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
      out.write("    <div class=\"px-3 row g-0 gap-3\">\r\n");
      out.write("        <div class=\"col-auto mt-3 d-lg-flex flex-column gap-5 d-none p-3 bg-white pb-5\" style=\"border: 1px solid rgba(0,0,0,.125); height: max-content;\">\r\n");
      out.write("        	");

        		ResultSet rs4 = Login.st.executeQuery("SELECT * FROM category");
        		while(rs4.next()){
        			String urlImg = rs4.getString("img");
                	urlImg = urlImg.substring(47);
                	urlImg = urlImg.replaceAll("\\\\", "/");
        			
      out.write("\r\n");
      out.write("        			<div class=\"d-flex justify-content-center align-items-center sider shadow mt-2 rounded\">\r\n");
      out.write("	                	<a href=\"home.jsp?cat=");
 out.println(rs4.getInt("id")); 
      out.write("\" class=\"text-decoration-none text-dark\">\r\n");
      out.write("	    	                <img src=\"");
 out.println(urlImg); 
      out.write("\" alt=\"\" style=\"height:2.5rem;\">\r\n");
      out.write("	    	                <span>");
 out.println(rs4.getString("name")); 
      out.write("</span>\r\n");
      out.write("	    	            </a>\r\n");
      out.write("	                </div>\r\n");
      out.write("	                ");

        		}
        	
      out.write("\r\n");
      out.write("            <div class=\"d-flex justify-content-center align-items-center sider shadow mt-2 rounded\">\r\n");
      out.write("            	<a href=\"home.jsp%>\" class=\"text-decoration-none text-dark\">\r\n");
      out.write("	                <img src=\"img/symbol2.webp\" alt=\"\" style=\"height:2.5rem;\">\r\n");
      out.write("	                <span>All</span>\r\n");
      out.write("	            </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("        	");

        	String showBooksSql;
        	if(request.getParameterMap().containsKey("cat"))
        		showBooksSql = "SELECT * FROM book WHERE categoryid="+request.getParameter("cat");
        	else
        		showBooksSql = "SELECT * FROM book";
        	ResultSet rs3 = Login.st.executeQuery(showBooksSql);
        	while(rs3.next()){
        		
      out.write("\r\n");
      out.write("	            <div class=\"card my-3 p-2\" style=\"width: auto;\">\r\n");
      out.write("	                <div class=\"row g-0\">\r\n");
      out.write("	                    <div class=\"col-md-4 d-flex justify-content-center align-items-center p-2\">\r\n");
      out.write("	                        <div class=\"im\">\r\n");
      out.write("	                        ");
 String url = rs3.getString("img");
	                        	url = url.substring(47);
	                        	url = url.replaceAll("\\\\", "/");
	                        
      out.write("\r\n");
      out.write("	                            <img src=\"");
 out.print(url); 
      out.write("\" class=\"img-fluid rounded-start\" alt=\"...\">\r\n");
      out.write("	                        </div>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                    <div class=\"col-md-8\">\r\n");
      out.write("	                        <div class=\"card-body\">\r\n");
      out.write("	                            <h5 class=\"card-title\">");
 out.print(rs3.getString("name")); 
      out.write("</h5>\r\n");
      out.write("	                            <h5 class=\"card-title\">");
 out.print(rs3.getString("author")); 
      out.write("</h5>\r\n");
      out.write("	                            <p class=\"card-text\">");
 out.print(rs3.getString("about")); 
      out.write("</p>\r\n");
      out.write("	                            <div class=\"rate d-flex align-items-center\">\r\n");
      out.write("	                            	");
 out.println("⭐ "+ rs3.getString("rating")); 
      out.write("\r\n");
      out.write("	                            </div>\r\n");
      out.write("	                        </div>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                </div>\r\n");
      out.write("	            </div>\r\n");
      out.write("	            ");

	            String sql = "SELECT insight,user.name FROM insight,user WHERE insight.bookid="+rs3.getInt("id")+" and user.id = insight.userid";
	            ResultSet rs1 = Login.st1.executeQuery(sql);
	            while(rs1.next()){
	            
      out.write("\r\n");
      out.write("		            <div class=\"card mt-2\">\r\n");
      out.write("		                <div class=\"card-header\">\r\n");
      out.write("		                    Review\r\n");
      out.write("		                </div>\r\n");
      out.write("		                <div class=\"card-body\">\r\n");
      out.write("		                    <blockquote class=\"blockquote mb-0\">\r\n");
      out.write("		                        <p>");
 out.print(rs1.getString("insight")); 
      out.write("</p>\r\n");
      out.write("		                        <footer class=\"blockquote-footer\"><cite title=\"");
 out.print(rs1.getString("name")); 
      out.write('"');
      out.write('>');
 out.print(rs1.getString("name")); 
      out.write("</cite></footer>\r\n");
      out.write("		                    </blockquote>\r\n");
      out.write("		                </div>\r\n");
      out.write("		            </div>\r\n");
      out.write("           	");
  }
	        } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-2 mt-3 d-lg-block d-none\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-header\">\r\n");
      out.write("                    Featured\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">\"Not every passion makes a good business\"</h5>\r\n");
      out.write("                    <p class=\"card-text\">- The 100$ Startup</p>\r\n");
      out.write("                </div>\r\n");
      out.write("				<hr>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">\"Being Well mannered can be faked in all the guise of being nice, and it is an acceptable practice\"</h5>\r\n");
      out.write("                    <p class=\"card-text\">- Not Nice\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">\"Earth is the only known planet that supports life, but it is not the easiest of place to be an organism\"</h5>\r\n");
      out.write("                    <p class=\"card-text\">- A Short History of Nearly Everything\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">\"It is only with the heart that one can see rightly; what is essential is invisible to the eye.\"</h5>\r\n");
      out.write("                    <p class=\"card-text\">- The Little Prince\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid  p-0\" id=\"contact\" style=\"margin-top:2rem;background-color: rgb(203, 223, 255) !important;\">\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"text-center p-3 text-dark fw-bold\">\r\n");
      out.write("                © 2022 Copyright : \r\n");
      out.write("                <a class=\"text-decoration-none text-dark\" href=\"#\">Bookify</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Bootstrap CDN JS Bundle -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
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
