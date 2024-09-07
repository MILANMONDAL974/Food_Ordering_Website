package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Connection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSetMetaData;
import java.sql.DriverManager;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;
import oracle.jdbc.OracleConnection;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>my profile</title>\n");
      out.write("\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("        <!-- custom css file link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");

            // Creating statement
            Statement stmt = conn.createStatement();

            // Retrieve email from login
            String pm = request.getSession(false).getAttribute("name").toString();

            // Creating Query
            String query = "SELECT * FROM USERS WHERE USERNAME = '" + pm + "'";
            ResultSet rs = stmt.executeQuery(query);

            // Loop through the results and display each movie in a table row
            while (rs.next()) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("            <section class=\"flex\">\n");
      out.write("\n");
      out.write("                <a href=\"home.html\" ><img class=\"logo\" src=\"uploaded_img/logo1.png\" alt=\"My website logo\"></a>\n");
      out.write("\n");
      out.write("                <nav class=\"navbar\">\n");
      out.write("                    <a href=\"home.jsp\">Home</a>\n");
      out.write("                    <a href=\"about.html\">About</a>\n");
      out.write("                    <a href=\"menu.html\">Menu</a>\n");
      out.write("                    <a href=\"orders.html\">Orders</a>\n");
      out.write("                    <a href=\"contact.html\">Contact</a>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"icons\">\n");
      out.write("                    <a href=\"search.html\"><i class=\"fas fa-search\"></i></a>\n");
      out.write("                    <a href=\"adminlogin.html\" class=\"fas fa-sign-in-alt\"></a>\n");
      out.write("\n");
      out.write("                    <div id=\"user-btn\" class=\"fas fa-user\">\n");
      out.write("                        <i class=\"fas fa-caret-down\"></i>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            <a href=\"profile.jsp\" class=\"profile-option\">Profile</a>\n");
      out.write("                            <a href=\"orders.html\" class=\"order-option\">Orders</a>\n");
      out.write("                            <a href=\"cart.html\" class=\"cart-option\">Cart</a>\n");
      out.write("                            <a href=\"#\" id=\"logout-link\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"menu-btn\" class=\"fas fa-bars\"></div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <h3>my profile</h3>\n");
      out.write("            <p><a href=\"home.jsp\">home </a> <span> / profile</span></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"user-details\">\n");
      out.write("\n");
      out.write("            <div class=\"user\">\n");
      out.write("                <img src=\"images/pp.png\" alt=\"\">\n");
      out.write("                <p><i class=\"fas fa-user\"></i> <span>");
      out.print( rs.getString(1));
      out.write("</span></p>\n");
      out.write("                <p><i class=\"fas fa-phone\"></i> <span>");
      out.print( rs.getString(4));
      out.write("</span></p>\n");
      out.write("                <p><i class=\"fas fa-envelope\"></i> <span>");
      out.print( rs.getString(2));
      out.write("</span></p>\n");
      out.write("                <p class=\"address\"><i class=\"fas fa-map-marker-alt\"></i> <span>");
      out.print( rs.getString(5));
      out.write("</span></p>\n");
      out.write("                <a href=\"update_address.html\" class=\"btn\">Add Address</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
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
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li><a href=\"home.html\">Home</a></li>\n");
      out.write("                <li><a href=\"about.html\">About</a></li>\n");
      out.write("                <li><a href=\"menu.html\">Menu</a></li>\n");
      out.write("                <li><a href=\"orders.html\">Orders</a></li>\n");
      out.write("                <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <p>&copy; Top Hill 2023  | All Rights Reserved</p>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <img src=\"images/laod.gif\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("        ");

            }
        
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
