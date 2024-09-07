package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class option_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>food menu</title>\n");
      out.write("\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\" integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("        <!-- custom css file link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <style>\n");
      out.write("            .description {\n");
      out.write("                font-size: 1.5em;\n");
      out.write("                color: grey;\n");
      out.write("                margin-bottom: 1.5em;\n");
      out.write("            }\n");
      out.write("            .markers .fa-leaf {\n");
      out.write("                color: green;\n");
      out.write("                font-size: 3em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .markers {\n");
      out.write("                border: 1px solid green;\n");
      out.write("                width: 25%;\n");
      out.write("            }    \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <h3>Dashboard <ion-icon name=\"arrow-down-circle\"></ion-icon></h3>\n");
      out.write("            <p><a href=\"login.html\">Back </a><span><a href=\"login.jsp\"> / Logout</a></span></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"category\">\n");
      out.write("\n");
      out.write("            <h1 class=\"title\">Control Section</h1>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <a href=\"AdminDetails.jsp\" class=\"box\">\n");
      out.write("                    <img src=\"images/admin.jpg\" alt=\"\">\n");
      out.write("                    <h3>ADMIN DETAILS</h3>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"UserDetails.jsp\" class=\"box\">\n");
      out.write("                    <img src=\"images/user1.png\" alt=\"\">\n");
      out.write("                    <h3>USERS DETAILS</h3>\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                <a href=\"OrderDetails.jsp\" class=\"box\">\n");
      out.write("                    <img src=\"images/dish.png\" alt=\"\">\n");
      out.write("                    <h3> ORDERS DETAILS</h3>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"ContactDetails.jsp\" class=\"box\">\n");
      out.write("                    <img src=\"images/comments.jpg\" alt=\"\">\n");
      out.write("                    <h3> REVIEW</h3>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <Script type=\"module\" src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></Script>\n");
      out.write("        <Script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></Script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("        <script src=\"js/menu.js\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
