package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>menu</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@8/swiper-bundle.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("        <!--  css file link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .description {\n");
      out.write("                font-size: 1.5em;\n");
      out.write("                color: grey;\n");
      out.write("                margin-bottom: 1.5em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("            <section class=\"flex\">\n");
      out.write("\n");
      out.write("                <img class=\"logo\" src=\"uploaded_img/logo1.png\" alt=\"My website logo\"></a>\n");
      out.write("\n");
      out.write("                <nav class=\"navbar\">\n");
      out.write("                    <a href=\"home.jsp\">Home</a>\n");
      out.write("                    <a href=\"about.jsp\">About</a>\n");
      out.write("                    <a href=\"menu.jsp\">Menu</a>\n");
      out.write("                    <a href=\"contact.jsp\">Contact</a>\n");
      out.write("                </nav>\n");
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
      out.write("                            <a href=\"orders.html\" class=\"order-option\">Orders</a>\n");
      out.write("                            <a href=\"cart.html\" class=\"cart-option\">Cart</a>\n");
      out.write("                            <a href=\"login.jsp\" id=\"logout-link\">Logout</a>\n");
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
      out.write("            <h3>our menu</h3>\n");
      out.write("            <p><a href=\"home.jsp\">home </a> <span> / menu</span></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"category\">\n");
      out.write("\n");
      out.write("            <h1 class=\"title\">food category</h1>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <a href=\"appetizers.jsp\" class=\"box\">\n");
      out.write("                    <img src=\"images/appetizer-icon.png\" alt=\"\">\n");
      out.write("                    <h3>Appetizers</h3>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"maincourses.jsp\" class=\"box\">\n");
      out.write("                    <img src=\"images/cat-2.png\" alt=\"\">\n");
      out.write("                    <h3>Main Courses</h3>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"beverages.jsp\" class=\"box\">\n");
      out.write("                    <img src=\"images/cat-3.png\" alt=\"\">\n");
      out.write("                    <h3>Beverages</h3>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"desserts.jsp\" class=\"box\">\n");
      out.write("                    <img src=\"images/cat-4.png\" alt=\"\">\n");
      out.write("                    <h3>Desserts</h3>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section >\n");
      out.write("\n");
      out.write("        <section class=\"products\">\n");
      out.write("\n");
      out.write("            <h1 class=\"title\">latest dishes</h1>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box fast-food\">\n");
      out.write("                    <a href=\"quick_view.jsp\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/appetizer-1.png\" alt=\"\">\n");
      out.write("                    <a href=\"appetizers.jsp\" class=\"cat\">Appetizer</a>\n");
      out.write("                    <div class=\"name\">Spinach and Artichoke Dip with Warm Pita Bread</div>\n");
      out.write("                    <div class=\"description\">A creamy blend of spinach, artichokes, and cheese, served with warm pita bread for dipping.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>3<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/appetizer-2.png\" alt=\"\">\n");
      out.write("                    <a href=\"appetizers.jsp\" class=\"cat\">Appetizer</a>\n");
      out.write("                    <div class=\"name\">Crispy Fried Calamari with Lemon Aioli</div>\n");
      out.write("                    <div class=\"description\">Tender calamari rings coated in a crispy batter and served with a zesty lemon aioli sauce.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>1<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/appetizer-3.png\" alt=\"\">\n");
      out.write("                    <a href=\"appetizers.jsp\" class=\"cat\">Appetizer</a>\n");
      out.write("                    <div class=\"name\">Grilled Shrimp Skewers with Garlic Butter</div>\n");
      out.write("                    <div class=\"description\">Juicy shrimp skewered and grilled to perfection, then brushed with garlic butter for added flavor.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>4<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/main-course-1.png\" alt=\"\">\n");
      out.write("                    <a href=\"maincourses.jsp\" class=\"cat\">Main Course</a>\n");
      out.write("                    <div class=\"name\">Pan-Seared Salmon with Roasted Vegetables</div>\n");
      out.write("                    <div class=\"description\">A fresh Atlantic salmon fillet, accompanied by a colorful medley of roasted vegetables.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>1<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/main-course-2.png\" alt=\"\">\n");
      out.write("                    <a href=\"maincourses.jsp\" class=\"cat\">Main Course</a>\n");
      out.write("                    <div class=\"name\">Grilled Ribeye Steak with Mashed Potatoes</div>\n");
      out.write("                    <div class=\"description\">A juicy ribeye steak, seasoned and grilled to your liking, and served with creamy mashed potatoes.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>5<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/main-course-3.png\" alt=\"\">\n");
      out.write("                    <a href=\"maincourses.jsp\" class=\"cat\">Main Course</a>\n");
      out.write("                    <div class=\"name\">Vegetable Curry with Basmati Rice and Naan Bread</div>\n");
      out.write("                    <div class=\"description\">A flavorful vegetarian curry, served with fragrant basmati rice and warm naan bread.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>3<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/dessert-3.png\" alt=\"\">\n");
      out.write("                    <a href=\"desserts.jsp\" class=\"cat\">Dessert</a>\n");
      out.write("                    <div class=\"name\">Seasonal Fruit Crumble with Whipped Cream</div>\n");
      out.write("                    <div class=\"description\">A warm and comforting fruit crumble made with fresh seasonal fruits, topped with whipped cream.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>3<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/dessert-2.png\" alt=\"\">\n");
      out.write("                    <a href=\"desserts.jsp\" class=\"cat\">Dessert</a>\n");
      out.write("                    <div class=\"name\">Classic New York Cheesecake with Strawberry Sauce</div>\n");
      out.write("                    <div class=\"description\">A creamy and smooth cheesecake with a buttery graham cracker crust, topped with a sweet strawberry sauce.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>2<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/dessert-1.png\" alt=\"\">\n");
      out.write("                    <a href=\"desserts.jsp\" class=\"cat\">Dessert</a>\n");
      out.write("                    <div class=\"name\">Decadent Chocolate Brownie with Vanilla Ice Cream</div >\n");
      out.write("                    <div class=\"description\">A decadent chocolate brownie served warm with a scoop of creamy vanilla ice cream and luscious caramel sauce.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>3<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/drink-1.png\" alt=\"\">\n");
      out.write("                    <a href=\"beverages.jsp\" class=\"cat\">Beverage</a>\n");
      out.write("                    <div class=\"name\">Local Craft  Selection</div >\n");
      out.write("                    <div class=\"description\">A selection of locally brewed craft juice, available on tap or in bottles.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>3<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/drink-2.png\" alt=\"\">\n");
      out.write("                    <a href=\"beverages.jsp\" class=\"cat\">Beverage</a>\n");
      out.write("                    <div class=\"name\">Freshly Brewed Iced Tea</div >\n");
      out.write("                    <div class=\"description\">A classic iced tea made with freshly brewed tea and served over ice.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>1<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form accept=\"\" method=\"post\" class=\"box\">\n");
      out.write("                    <a href=\"quick_view.html\" class=\"fas fa-eye\"></a>\n");
      out.write("                    <button class=\"fas fa-shopping-cart\" type=\"button\" name=\"add_to_cart\"></button>\n");
      out.write("                    <img src=\"images/drink-3.jpg\" alt=\"\">\n");
      out.write("                    <a href=\"beverages.jsp\" class=\"cat\">Beverage</a>\n");
      out.write("                    <div class=\"name\">Hilltop Signature Lemonade</div >\n");
      out.write("                    <div class=\"description\">A refreshing blend of freshly squeezed lemons and sugar, served over ice.</div>\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star fa-lg\"></i>\n");
      out.write("                        <i class=\"fas fa-star-half-alt fa-lg\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"price\"><span>$</span>2<span>/-</span></div>\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"qty\" min=\"1\" max=\"99\" value=\"1\" onkeypress=\"if (this.value.length == 2)\n");
      out.write("                                    return false;\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
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
      out.write("            <p>&copy; Hill Top 0223  | All Rights Reserved</p>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <img src=\"images/laod.gif\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("        <script src=\"js/menu.js\"></script>\n");
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
