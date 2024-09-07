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
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;

public class Signup extends HttpServlet {

    String vUser, vEmail, vPass, vNum;
    OracleConnection oconn;
    OraclePreparedStatement ost;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registration</title>");
            out.println("</head>");
            out.println("<body>");
            vUser = request.getParameter("tusername");
            vEmail = request.getParameter("temail");
            vPass = request.getParameter("cpassword");
            vNum = request.getParameter("inumber");
            HttpSession hs = request.getSession();
            out.println("<h1>Your Info:</h1>");
            out.println("<h2>Username &nbsp;&nbsp;&nbsp;&nbsp; " + vUser + "</h2>");
            out.println("<h2>email &nbsp;&nbsp;&nbsp;&nbsp; " + vEmail + "</h2>");
            out.println("<h2>Password &nbsp;&nbsp;&nbsp;&nbsp; " + vPass + "</h2>");
            out.println("<h2>Number &nbsp;&nbsp;&nbsp;&nbsp; " + vNum + "</h2>");
            out.println("<h2 style='color:orange'>Saving the data within database.........</h2>");

            //STEP 1 : REGISTERING OF THE REQUIRED DRIVER WITH THE JAVA PROGRAM
            //Class.forName("oracle.jdbc.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //STEP 2: INSTANTIATING THE CONNECTION OBJECT 
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");

            //STEP 3: CREATING THE QUERY
            String q = "INSERT INTO USERS(USERNAME,EMAIL,PASSWORD,MOBILE_NUMBER) values(?,?,?,?)";

            //STEP 4: INSTANTIATING STATEMENT OBJECT FOR EXECUTING SQL QUERIES
            ost = (OraclePreparedStatement) oconn.prepareStatement(q);

            //STEP 5: FILLING THE BLANK VALUES OF THE QUERY MARKED WITH ? 
            ost.setString(1, vUser);
            ost.setString(2, vEmail);
            ost.setString(3, vPass);
            ost.setString(4, vNum);

            //STEP 6: EXECUTING THE QUERY
            int ra = ost.executeUpdate();

            out.println("<h2>Rows affected is : " + ra + "</h2>");
            out.println("<h2 style='color:green'>Data saved successfully.........</h2>");
            request.setAttribute("register", "success");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);

            ost.close();
            oconn.close();
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
