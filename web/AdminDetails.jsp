<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleResultSetMetaData"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OracleStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Displaying all admin details</title>
        <%!
            OracleConnection oconn;
            OracleStatement ost;
            OraclePreparedStatement opst;
            OracleResultSet ors;
            OracleResultSetMetaData orsmd;
            String q;
            int counter, reccounter;
        %>
        <style>
            body {
                margin: 0;
                background: linear-gradient(45deg, black, yellow);
                font-family: sans-serif;
                font-weight: 100;
            }
            .container {
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
            }
            table {
                width: 800px;
                border-collapse: collapse;
                overflow: hidden;
                box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            }

            .center {
                margin-left: auto;
                margin-right: auto;
                margin-top: auto;
                margin-bottom: auto;
            }
            th,
            td {
                padding: 15px;
                background-color: rgba(255, 255, 255, 0.2);
                color: #fff;
            }
            th {
                text-align: left;
            }
            thead th {
                background-color: #55608f;
            }
            tbody tr:hover {
                background-color: rgba(255, 255, 255, 0.3);
            }
            tbody td {
                position: relative;
            }
            tbody td:hover:before {
                content: "";
                position: absolute;
                left: 0;
                right: 0;
                top: -9999px;
                bottom: -9999px;
                background-color: rgba(255, 255, 255, 0.2);
                z-index: -1;
            }
            button {
                width: 100px;
                height: 40px;
                background: transparent;
                border:  2px solid black;
                outline: none;
                border-radius: 50px;
                cursor: pointer;
                font-size: 1em;
                color: white;
                font-weight: 500;
                margin-left: 40px;
                transition: 0.5s;
            }

            button:hover {
                background: black;
            }

            .inputbox {
                width: 20%;
                height: 40px;
                background: transparent;
                border: 2px solid black;
                outline: none;
                border-radius: 50px;
                cursor: pointer;
                font-size: 1.5em;
                color: white;
                font-weight: 500;
                margin-left: 40px;
                padding:auto;
            }
        </style>
        <script>
            function funDelete()
            {
                if (confirm("Are You Sure To Delete???") === true)
                    return true;
                else
                    return false;
            }
        </script>
    </head>
    <body>
            <span style="color: white; font-weight: bold; font-size: 150%"> *** ADMIN DETAILS ***</span>
            </br>
            </br>
            <span>
                <form method="POST" action="AdminDetails.jsp">
                    <input type="text" placeholder="&#128269;Enter Adminname" name="tSearch" class="inputbox" required>
                    <button type="submit" name="bSearch">Search</button> 
                </form>
                <br/>
                <a href="option.jsp"><button type="submit"><ion-icon name="arrow-back"></ion-icon>Back</button></a>
            </span>
        </div>
        <br/>
        <br/>
        <br/>

        <%
            // STEP 1: REGISTERING THE JSP WITH ORACLE
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            //STEP 2: CREATING THE CONNECTION OBJECT
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Milan:1521:ORCL", "GROUP6", "DATABASE");

            if (request.getParameter("bSearch") != null) {
                String vSearchUser = request.getParameter("tSearch");

                //STEP 4: CREATING THE QUERY
                q = "select * from ADMIN where ADMIN_NAME=?";

                //STEP 3: CREATING THE STATEMENT
                opst = (OraclePreparedStatement) oconn.prepareStatement(q);

                //STEP 5: FILLING UP THE PARAMETERS
                opst.setString(1, vSearchUser);

                //STEP 5: Executing the query and populating the resultset
                ors = (OracleResultSet) opst.executeQuery();

        %>
        <form method="POST" action="AdminDetails.jsp">
            <button type="submit">Display all admin </button>
        </form>
        <%                        } else {

                //STEP 3: CREATING THE STATEMENT
                ost = (OracleStatement) oconn.createStatement();

                //STEP 4: CREATING THE QUERY
                q = "select * from ADMIN order by 1";

                //STEP 5: Executing the query and populating the resultset
                ors = (OracleResultSet) ost.executeQuery(q);

            }
            //STEP 6: Getting the Headings
            orsmd = (OracleResultSetMetaData) ors.getMetaData();
        %>
        <table class="center">
            <thead>
                <tr>
                    <%
                        for (counter = 1; counter <= orsmd.getColumnCount(); counter++) {
                    %>
                    <th><%=orsmd.getColumnName(counter)%></th>
                        <%
                            }
                        %>
                    <th colspan="2">ACTIONS</th>
                </tr>
            </thead>
            <tbody>
                <%
                    reccounter = 0;
                    while (ors.next()) {
                        reccounter++;
                %>
                <tr>
                    <%
                        for (int i = 1; i <= 2; i++) {
                    %>
                    <td><%=ors.getString(i)%></td>
                    <%
                        }
                    %>
                    <td><button type="submit">Edit</button></td>
            <form method="POST" action="http://localhost:8080/Restaurantweb/DelAdmin?tadminname=<%=ors.getString(1)%>"  onsubmit=" return funDelete()">
                <td><button type="submit">Delete</button></td>
            </form>
        </tr>
        <%
            }

        %>
    </tbody>
    <tfoot></tfoot>
</table>
<%            if (reccounter == 0) {
%>
<h2 style="font-family: monospace; color: yellow">No matching records exists. Try with a better match</h2>
<%
    }
    // ors.close();
    //  ost.close();
    oconn.close();

%>

<Script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></Script>
<Script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></Script>

</body>
</html>

