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
        <title>checkout</title>
        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

        <!--  css file link  -->
        <link rel="stylesheet" href="css/style.css">
        <style>
            .checkout form .user-info .box{
                width: 100%;
                border:0.5rem solid black;
                padding:1.4rem;
                color: black;
                font-size: 1.8rem;
                margin-top: 2rem;
            }
        </style>

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

                <img class="logo" src="uploaded_img/logo1.png" alt="My website logo">

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

        <div id="mapid"></div>


        <div class="heading">
            <h3>checkout</h3>
            <p><a href="home.jsp">home </a> <span> / checkout</span></p>
        </div>

        <section class="checkout">

            <h1 class="title">order summary</h1>

            <form action="" method="post">
                <div class="cart-items" name="titems">
                    <h3>cart items</h3>

                    <p class="grand-total"><span class="name">Grand Total :</span> <span class="price"></span></p>
                    <a href="cart.jsp" class="btn">view cart</a>
                </div>
                <div class="user-info">
                    <h3>your info</h3>
                    <p><i class="fas fa-user"></i> <span><%= rs.getString(1)%></span></p>
                    <p><i class="fas fa-phone"></i> <span><%= rs.getString(4)%></span></p>
                    <p><i class="fas fa-envelope"></i> <span><%= rs.getString(2)%></span></p>
                    <p class="address"><i class="fas fa-map-marker-alt"></i> <span><%= rs.getString(5)%></span></p>
                    <a href="update_address.jsp" class="btn">Update Address</a>
                    <select name="method" class="box" required>
                        <option value="" disabled selected>select payment method</option>
                        <option value="cash on delivery">Cash On Delivery</option>
                        <option value="credit card">Credit Card</option>
                        <option value="paytm">Paytm</option>
                        <option value="gpay">Google Pay</option>
                    </select>
                </div>
                    <a href="orders.jsp" input type="submit" value="place order" name="order" class="btn order-btn">Place Order</a>
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
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

        <div class="loader">
            <img src="images/laod.gif" alt="">
        </div>

        <script src="js/script.js"></script>
        <script src="js/checkout.js"></script>
        <%
            }
        %>

    </body>
</html>
