<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Update Address</title>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>
        <input type="hidden" id="update" value="<%= request.getAttribute("name")%>">

        <%
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
        %>

        <header class="header">

            <section class="flex">

                <img class="logo" src="uploaded_img/logo1.png" alt="My website logo"></a>

                <nav class="navbar">
                    <a href="home.jsp">Home</a>
                    <a href="about.jsp">About</a>
                    <a href="menu.jsp">Menu</a>
                    <a href="contact.jsp">Contact</a>
                </nav>

                <div class="icons">
                    <a href="search.jsp"><i class="fas fa-search"></i></a>
                    <div id="user-btn" class="fas fa-user">
                        <a><%= rs.getString(1)%></a>
                        <i class="fas fa-caret-down"></i>
                        <div class="dropdown-content">
                            <a href="profile.jsp" class="profile-option">Profile</a>
                            <a href="orders.jsp" class="order-option">Orders</a>
                            <a href="cart.jsp" class="cart-option">Cart</a>
                            <a href="http://localhost:8080/Restaurantweb/logout" id="logout-link">Logout</a>
                        </div>
                    </div>

                    <div id="menu-btn" class="fas fa-bars"></div>
                </div>

            </section>

        </header>

        <section class="form-container">

            <form method="post" action="http://localhost:8080/Restaurantweb/update_address">
                <h3>Your Address</h3>
                <input type="text" maxlength="100" placeholder="Enter your address" required class="box" name="taddress">
                <input type="submit" value="save address" name="submit" class="btn">
            </form>

        </section>

        <footer>

            <ul class="social_icon">
                <li><a href="https://www.facebook.com/"><ion-icon name="logo-facebook"></ion-icon></a></li>
                <li><a href="https://twitter.com/"><ion-icon name="logo-twitter"></ion-icon></a></li>
                <li><a href="https://linkedin.com/"><ion-icon name="logo-linkedin"></ion-icon></a></li>
                <li><a href="https://instagram.com/"><ion-icon name="logo-instagram"></ion-icon></a></li>

            </ul>
            <p>&copy; Hill Top 2023  | All Rights Reserved</p>
        </footer>

        <Script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></Script>
        <Script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></Script>

        <div class="loader">
            <img src="images/laod.gif" alt="">
        </div>

        <script src="js/script.js"></script>
        <%
            }
        %>
    </body>
</html>
