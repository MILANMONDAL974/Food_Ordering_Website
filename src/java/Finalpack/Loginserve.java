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

public class Loginserve extends HttpServlet {

    OracleConnection oconn;
    OraclePreparedStatement ost;
    OracleResultSet ors = null;
    String ltype, lusername, lpassword;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            lusername = request.getParameter("tusername");
            lpassword = request.getParameter("cpassword");
//                lusername = "Milan";
//                lpassword = "1234";
            
            HttpSession ses = request.getSession();

            //STEP 1 : REGISTERING OF THE REQUIRED DRIVER WITH THE JAVA PROGRAM
            //Class.forName("oracle.jdbc.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //STEP 2: INSTANTIATING THE CONNECTION OBJECT 
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");

            // Search for matching user in the users table
            ost = (OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM USERS where USERNAME=? and PASSWORD=?");

            ost.setString(1, lusername);
            ost.setString(2, lpassword);

            ors = (OracleResultSet) ost.executeQuery();

            if (ors.next()) {
                ses.setAttribute("name", ors.getString("USERNAME"));
                ses.setAttribute("tempname", ors.getString("USERNAME"));
                response.sendRedirect("home.jsp");

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
