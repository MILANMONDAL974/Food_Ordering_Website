package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>login</title>\n");
      out.write("\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("        <!-- custom css file link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.7.0.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <input type=\"hidden\" id=\"Register\" value=\"");
      out.print(request.getAttribute("Register"));
      out.write("\">\n");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("            <section class=\"flex\">\n");
      out.write("\n");
      out.write("                <img class=\"logo\" src=\"uploaded_img/logo1.png\" alt=\"My website logo\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar\">\n");
      out.write("                    <a href=\"#\">Home</a>\n");
      out.write("                    <a href=\"#\">About</a>\n");
      out.write("                    <a href=\"#\">Menu</a>\n");
      out.write("                    <a href=\"#\">Contact</a>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"icons\">\n");
      out.write("                    <a href=\"login.jsp\" class=\"fas fa-sign-in-alt\"></a>\n");
      out.write("                    <div id=\"user-btn\" class=\"fas fa-user\"><p>ADMIN ONLY <ion-icon name=\"happy-outline\"></ion-icon></p></div>\n");
      out.write("                    <div id=\"menu-btn\" class=\"fas fa-bars\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"login-wrapper\">\n");
      out.write("            <section class=\"form-container login-box\">\n");
      out.write("\n");
      out.write("                <form action=\"http://localhost:8080/Restaurantweb/adminregister\" method=\"post\">\n");
      out.write("                    <h3>register now</h3>\n");
      out.write("                    <input type=\"admin_name\" required maxlength=\"20\" name=\"tadminname\" placeholder=\"Enter your Name\" class=\"box\">\n");
      out.write("                    <input type=\"password\" required maxlength=\"20\" name=\"bpassword\" placeholder=\"Enter your password\" class=\"box\" oninput=\"this.value = this.value.replace(/\\s/g, '')\">\n");
      out.write("                    <input type=\"password\" required maxlength=\"20\" name=\"apassword\" placeholder=\"Confirm your password\" class=\"box\" oninput=\"this.value = this.value.replace(/\\s/g, '')\">\n");
      out.write("                    <input type=\"submit\" value=\"Register Now\" class=\"btn\" name=\"submit\">\n");
      out.write("                    <p>Already have an account? <a href=\"login.html\">Login Now</a></p>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("\n");
      out.write("            <ul class=\"social_icon\">\n");
      out.write("                <li><a href=\"https://www.facebook.com/\"><ion-icon name=\"logo-facebook\"></ion-icon></a></li>\n");
      out.write("                <li><a href=\"https://twitter.com/\"><ion-icon name=\"logo-twitter\"></ion-icon></a></li>\n");
      out.write("                <li><a href=\"https://linkedin.com/\"><ion-icon name=\"logo-linkedin\"></ion-icon></a></li>\n");
      out.write("                <li><a href=\"https://instagram.com/\"><ion-icon name=\"logo-instagram\"></ion-icon></a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <p>&copy; Hill Top 2023  | All Rights Reserved</p>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <Script type=\"module\" src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></Script>\n");
      out.write("        <Script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></Script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("        <script src=\"js/otp.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("            var Register= document.getElementById(\"Register\").value;\n");
      out.write("                if (Register==\"Success\"){\n");
      out.write("                    swal(\"Congratulations\",\"Your account has been successfully cerated.\",\"success\");\n");
      out.write("                }\n");
      out.write("//                else {\n");
      out.write("//                    swal(\"Sorry\",\"your account creation Failed.\");\n");
      out.write("//                }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
