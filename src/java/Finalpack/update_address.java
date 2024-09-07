package Finalpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;

public class update_address extends HttpServlet {

//    OracleConnection oconn;
//    OraclePreparedStatement ost;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet register</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String vAddress = request.getParameter("taddress");

        try {
            OracleConnection oconn;
            OraclePreparedStatement ost;

            Class.forName("oracle.jdbc.OracleDriver");

            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");

            System.out.println("Connected");
            
            // Retrieve email from login
            String te = request.getSession(false).getAttribute("tempname").toString();

            //STEP 3: CREATING THE QUERY
            String q = "UPDATE USERS SET ADDRESS=? WHERE USERNAME=?";

            //STEP 4: INSTANTIATING STATEMENT OBJECT FOR EXECUTING SQL QUERIES
            ost = (OraclePreparedStatement) oconn.prepareStatement(q);

            //STEP 6: FILLING THE BLANK VALUES OF THE QUERY MARKED WITH ? 
            ost.setString(1, vAddress);
            ost.setString(2, te);

            int ra = ost.executeUpdate();
            
            out.println("<h2>Rows affected is : " + ra + "</h2>");
            out.println("<h2 style='color:green'>Data saved successfully.........</h2>");

            RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
            rd.forward(request, response);
            
            ost.close();
            oconn.close();

        } catch (Exception e) {
            System.out.println("ERROR ::" + e.getMessage());
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
