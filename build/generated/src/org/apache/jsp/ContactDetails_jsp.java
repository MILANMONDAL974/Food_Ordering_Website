package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSetMetaData;
import java.sql.DriverManager;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;
import oracle.jdbc.OracleConnection;

public final class ContactDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            OracleConnection oconn;
            OracleStatement ost;
            OraclePreparedStatement opst;
            OracleResultSet ors;
            OracleResultSetMetaData orsmd;
            String q;
            int counter, reccounter;
        
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Displaying all contact details</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                background: linear-gradient(45deg, #49a09d, #5f2c82);\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-weight: 100;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                width: 800px;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                overflow: hidden;\n");
      out.write("                box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .center {\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                margin-top: auto;\n");
      out.write("                margin-bottom: auto;\n");
      out.write("            }\n");
      out.write("            th,\n");
      out.write("            td {\n");
      out.write("                padding: 15px;\n");
      out.write("                background-color: rgba(255, 255, 255, 0.2);\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            th {\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            thead th {\n");
      out.write("                background-color: #55608f;\n");
      out.write("            }\n");
      out.write("            tbody tr:hover {\n");
      out.write("                background-color: rgba(255, 255, 255, 0.3);\n");
      out.write("            }\n");
      out.write("            tbody td {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            tbody td:hover:before {\n");
      out.write("                content: \"\";\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("                top: -9999px;\n");
      out.write("                bottom: -9999px;\n");
      out.write("                background-color: rgba(255, 255, 255, 0.2);\n");
      out.write("                z-index: -1;\n");
      out.write("            }\n");
      out.write("            button {\n");
      out.write("                width: 100px;\n");
      out.write("                height: 40px;\n");
      out.write("                background: transparent;\n");
      out.write("                border:  2px solid black;\n");
      out.write("                outline: none;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 1em;\n");
      out.write("                color: white;\n");
      out.write("                font-weight: 500;\n");
      out.write("                margin-left: 40px;\n");
      out.write("                transition: 0.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover {\n");
      out.write("                background: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputbox {\n");
      out.write("                width: 20%;\n");
      out.write("                height: 40px;\n");
      out.write("                background: transparent;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                outline: none;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 1.5em;\n");
      out.write("                color: white;\n");
      out.write("                font-weight: 500;\n");
      out.write("                margin-left: 40px;\n");
      out.write("                padding:auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function funDelete()\n");
      out.write("            {\n");
      out.write("                if (confirm(\"Are You Sure To Delete???\") === true)\n");
      out.write("                    return true;\n");
      out.write("                else\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <span style=\"color: white; font-weight: bold; font-size: 150%\"> *** CONTACT DETAILS ***</span>\n");
      out.write("            </br>\n");
      out.write("            </br>\n");
      out.write("            <span>\n");
      out.write("                <form method=\"POST\" action=\"ContactDetails.jsp\">\n");
      out.write("                    <input type=\"text\" placeholder=\"&#128269;Enter Username\" name=\"tSearch\" class=\"inputbox\" required>\n");
      out.write("                    <button type=\"submit\" name=\"bSearch\">Search</button> \n");
      out.write("                </form>\n");
      out.write("                <br/>\n");
      out.write("                <a href=\"option.jsp\"><button type=\"submit\"><ion-icon name=\"arrow-back\"></ion-icon>Back</button></a>\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        ");

            // STEP 1: REGISTERING THE JSP WITH ORACLE
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            //STEP 2: CREATING THE CONNECTION OBJECT
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");

            if (request.getParameter("bSearch") != null) {
                String vSearchUser = request.getParameter("tSearch");

                //STEP 4: CREATING THE QUERY
                q = "select * from CONTACTS where NAME=?";

                //STEP 3: CREATING THE STATEMENT
                opst = (OraclePreparedStatement) oconn.prepareStatement(q);

                //STEP 5: FILLING UP THE PARAMETERS
                opst.setString(1, vSearchUser);

                //STEP 5: Executing the query and populating the resultset
                ors = (OracleResultSet) opst.executeQuery();

        
      out.write("\n");
      out.write("        <form method=\"POST\" action=\"ContactDetails.jsp\">\n");
      out.write("            <button type=\"submit\">Display all Contacts </button>\n");
      out.write("        </form>\n");
      out.write("        ");
                        } else {

                //STEP 3: CREATING THE STATEMENT
                ost = (OracleStatement) oconn.createStatement();

                //STEP 4: CREATING THE QUERY
                q = "select * from CONTACTS order by 1";

                //STEP 5: Executing the query and populating the resultset
                ors = (OracleResultSet) ost.executeQuery(q);

            }
            //STEP 6: Getting the Headings
            orsmd = (OracleResultSetMetaData) ors.getMetaData();
        
      out.write("\n");
      out.write("        <table class=\"center\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        for (counter = 1; counter <= orsmd.getColumnCount(); counter++) {
                    
      out.write("\n");
      out.write("                    <th>");
      out.print(orsmd.getColumnName(counter));
      out.write("</th>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    <th colspan=\"2\">ACTIONS</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    reccounter = 0;
                    while (ors.next()) {
                        reccounter++;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        for (int i = 1; i <= 4; i++) {
                    
      out.write("\n");
      out.write("                    <td>");
      out.print(ors.getString(i));
      out.write("</td>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    <td><button type=\"submit\">Edit</button></td>\n");
      out.write("            <form method=\"POST\" action=\"http://localhost:8080/Restaurantweb/DelContact?name=");
      out.print(ors.getString(1));
      out.write("\"  onsubmit=\" return funDelete()\">\n");
      out.write("                <td><button type=\"submit\">Delete</button></td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("        ");

            }

        
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("    <tfoot></tfoot>\n");
      out.write("</table>\n");
            if (reccounter == 0) {

      out.write("\n");
      out.write("<h2 style=\"font-family: monospace; color: yellow\">No matching records exists. Try with a better match</h2>\n");

    }
    // ors.close();
    //  ost.close();
    oconn.close();


      out.write("\n");
      out.write("<Script type=\"module\" src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></Script>\n");
      out.write("<Script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></Script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
