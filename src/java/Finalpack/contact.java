package Finalpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;

public class contact extends HttpServlet {


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
        
        String name = request.getParameter("name");
        String phone = request.getParameter("number");
        String email = request.getParameter("email");
        
        String message = request.getParameter("message");
       
     
        
        
        try{
            OracleConnection oconn;
            OraclePreparedStatement ost;
            
            Class.forName("oracle.jdbc.OracleDriver");
            
            oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");
            
            System.out.println("Connected");
            
            //STEP 3: CREATING THE QUERY
            String q = "INSERT INTO CONTACTS(NAME,PHONENO,EMAIL,MESSAGE) values(?,?,?,?)";
            
            //STEP 4: INSTANTIATING STATEMENT OBJECT FOR EXECUTING SQL QUERIES
            ost =(OraclePreparedStatement) oconn.prepareStatement(q);
            
            
              //STEP 6: FILLING THE BLANK VALUES OF THE QUERY MARKED WITH ? 
                
                ost.setString(1,name);
                ost.setString(2,phone);
                ost.setString(3,email);
                ost.setString(4,message);
                
            
              int ra = ost.executeUpdate();
                
                out.println("<h2>Rows affected is : " + ra + "</h2>");
                
                request.setAttribute("succ","MESSAGE SENT SUCCESFULL !!");
                
              RequestDispatcher rd = request.getRequestDispatcher("contact.jsp");
              rd.forward(request,response);
              
              
                oconn.close();
                ost.close();
             
            
        }catch(Exception e){
            System.out.println("ERROR ::"+e.getMessage());
        }
        
        
        
        
        
        
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
