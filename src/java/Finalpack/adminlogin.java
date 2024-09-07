package Finalpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

public class adminlogin extends HttpServlet {

    OracleConnection oconn;
    OraclePreparedStatement ost;
    OracleResultSet ors = null;
    String ptype, padminname, ppassword;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            padminname = request.getParameter("tadminname");
            ppassword = request.getParameter("apassword");

            //STEP 1 : REGISTERING OF THE REQUIRED DRIVER WITH THE JAVA PROGRAM
            //Class.forName("oracle.jdbc.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //STEP 2: INSTANTIATING THE CONNECTION OBJECT 
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");

            // Search for matching user in the users table
            ost = (OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM ADMIN where ADMIN_NAME=? and PASSWORD=?");

            ost.setString(1, padminname);
            ost.setString(2, ppassword);

            ors = (OracleResultSet) ost.executeQuery();

            if (ors.next()) {
                response.sendRedirect("option.jsp");

            } else {
                response.sendRedirect("Warning.html");

            }

            ost.close();
            oconn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Loginserve.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
