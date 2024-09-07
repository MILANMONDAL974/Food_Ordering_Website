package Finalpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;

public class DelAdmin extends HttpServlet {

        String vUserName,query;
        OracleConnection oconn;
        OraclePreparedStatement ost;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DelAdmin</title>");            
            out.println("</head>");
            out.println("<body>");
            //STEP 1 : REGISTERING OF THE REQUIRED DRIVER WITH THE JAVA PROGRAM
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                
                 //STEP 2: INSTANTIATING THE CONNECTION OBJECT 
                oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");
                
                //STEP 3: CREATING THE QUERY
                query = "delete from  ADMIN where ADMIN_NAME = ?";
            
                //STEP 4: INSTANTIATING STATEMENT OBJECT FOR EXECUTING SQL QUERIES
                ost =(OraclePreparedStatement) oconn.prepareStatement(query);
                
                
                //STEP 6: FILLING THE BLANK VALUES OF THE QUERY MARKED WITH ? 
                vUserName = request.getParameter("tadminname");
                ost.setString(1,vUserName);
                
                //STEP 7: EXECUTING THE QUERY
                
                int ra = ost.executeUpdate();
                
                out.println("<h2>Rows affected is : " + ra + "</h2>");
                out.println("<h2 style='color:green'>Data saved successfully.........</h2>");
                
                ost.close();
                oconn.close();

            out.println("</body>");
            out.println("</html>");
            response.sendRedirect("http://localhost:8080/Restaurantweb/AdminDetails.jsp");
        }   catch (SQLException ex) {
                Logger.getLogger(DelUser.class.getName()).log(Level.SEVERE, null, ex);
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

