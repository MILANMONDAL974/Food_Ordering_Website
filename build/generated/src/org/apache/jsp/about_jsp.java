package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>about us</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@8/swiper-bundle.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("        <!--  css file link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <input type=\"hidden\" id=\"update\" value=\"");
      out.print( request.getAttribute("name"));
      out.write("\">\n");
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
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("            <section class=\"flex\">\n");
      out.write("\n");
      out.write("                <img class=\"logo\" src=\"uploaded_img/logo1.png\" alt=\"My website logo\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar\">\n");
      out.write("                    <a href=\"home.jsp\">Home</a>\n");
      out.write("                    <a href=\"about.jsp\">About</a>\n");
      out.write("                    <a href=\"menu.jsp\">Menu</a>\n");
      out.write("                    <a href=\"contact.jsp\">Contact</a>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"icons\">\n");
      out.write("                    <a href=\"search.jsp\"><i class=\"fas fa-search\"></i></a>\n");
      out.write("                    <div id=\"user-btn\" class=\"fas fa-user\">\n");
      out.write("                        <a>");
      out.print( rs.getString(1));
      out.write("</a>\n");
      out.write("                        <i class=\"fas fa-caret-down\"></i>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            <a href=\"profile.jsp\" class=\"profile-option\">Profile</a>\n");
      out.write("                            <a href=\"orders.jsp\" class=\"order-option\">Orders</a>\n");
      out.write("                            <a href=\"cart.jsp\" class=\"cart-option\">Cart</a>\n");
      out.write("                            <a href=\"http://localhost:8080/Restaurantweb/logout\" id=\"logout-link\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"menu-btn\" class=\"fas fa-bars\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <h3>about us</h3>\n");
      out.write("            <p><a href=\"home.jsp\">home </a> <span> / about</span></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"about\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"image\">\n");
      out.write("                    <img src=\"images/about-img.svg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>Welcome To Hill Top Restaurant</h3>\n");
      out.write("                    <p> A  restaurant located in the heart of  Jaigaon town.\n");
      out.write("                        Our restaurant was founded in 2020 with a simple mission: to create delicious, healthy food that nourishes the body and the soul.\n");
      out.write("                        At The Hill Top Restaurant, we believe that food is not just fuel, but a way to connect with others and build community.\n");
      out.write("                        That's why we source our ingredients from local farmers and suppliers who share our commitment to sustainability and ethical farming practices.\n");
      out.write("                        We work with these partners to create seasonal menus that showcase the freshest and most flavorful ingredients.\n");
      out.write("                        Thank you for considering Hill Top Restaurant for your next dining experience. We look forward to serving you soon!</p>\n");
      out.write("                    <a href=\"menu.jsp\" class=\"btn\">our menu</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"Opening\">\n");
      out.write("            <h1 class=\"title\">Opening Hours</h1>\n");
      out.write("\n");
      out.write("            <div class=\"hour\">\n");
      out.write("                <h6 > WE ARE OPEN 7 DAYS A WEEK</h6>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    Monday to Friday: \n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    12pm till 9:30pm(kitchen closes at 8:30pm)\n");
      out.write("\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    Saturday & Sunday: \n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    12pm till 10pm (Kitchen closes at 9:30pm)\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    Please note our kitchen might close earlier on weekdays if needed\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    * Call 9748560321  for up to date information * \n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"steps\">\n");
      out.write("\n");
      out.write("            <h1 class=\"title\">3 simple steps</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"images/menu (1).png\" alt=\"\">\n");
      out.write("                    <h3>Explore Our Menu</h3>\n");
      out.write("                    <p>Discover a wide range of dishes to satisfy your cravings.</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"images/delivery.png\" alt=\"\">\n");
      out.write("                    <h3>Lightning-Fast Delivery</h3>\n");
      out.write("                    <p>Get your food delivered straight to your doorstep in just 30 minutes or less – no need to wait around hungry!</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"images/dish.png\" alt=\"\">\n");
      out.write("                    <h3>Enjoy your meal!</h3>\n");
      out.write("                    <p>Sit back, relax, and savor every bite of our delectable dishes!</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"reviews\">\n");
      out.write("\n");
      out.write("            <h1 class=\"title\">DEVELOPERS</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"swiper reviews-slider\">\n");
      out.write("\n");
      out.write("                <div class=\"swiper-wrapper\">\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide slide\">\n");
      out.write("                        <img src=\"images/cust1.jpg\" alt=\"\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Ranbir Lama</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide slide\">\n");
      out.write("                        <img src=\"images/cust2.jpg\" alt=\"\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Milan Mondal</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide slide\">\n");
      out.write("                        <img src=\"images/cust3.jpg\" alt=\"\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Asif Raja</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide slide\">\n");
      out.write("                        <img src=\"images/pic-4.jpeg\" alt=\"\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Swagatam Dey</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide slide\">\n");
      out.write("                        <img src=\"images/pic-5.jpeg\" alt=\"\">\n");
      out.write("                      \n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Madhusudan Agnihotri</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide slide\">\n");
      out.write("                        <img src=\"images/pic-6.jpeg\" alt=\"\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                            <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Kaustav Chakraborty</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"swiper-pagination\"></div>\n");
      out.write("\n");
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
      out.write("            <p>&copy; Top Hill 2023  | All Rights Reserved</p>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <img src=\"images/laod.gif\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://unpkg.com/swiper@8/swiper-bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            var swiper = new Swiper(\".reviews-slider\", {\n");
      out.write("                loop: true,\n");
      out.write("                grabCursor: true,\n");
      out.write("                spaceBetween: 20,\n");
      out.write("                pagination: {\n");
      out.write("                    el: \".swiper-pagination\",\n");
      out.write("                },\n");
      out.write("                breakpoints: {\n");
      out.write("                    550: {\n");
      out.write("                        slidesPerView: 1,\n");
      out.write("                    },\n");
      out.write("                    768: {\n");
      out.write("                        slidesPerView: 2,\n");
      out.write("                    },\n");
      out.write("                    1024: {\n");
      out.write("                        slidesPerView: 3,\n");
      out.write("                    },\n");
      out.write("                },\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
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
