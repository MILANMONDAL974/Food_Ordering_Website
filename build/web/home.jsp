<%
    if (session.getAttribute("name") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>home</title>

        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

        <!-- custom css file link  -->
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
            String query = "SELECT * FROM USERS WHERE USERNAME = '"+pm+"'";
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
        <div class="bg-image">
            <div class="bg-text">
                <h1 class="slide-left">Welcome to <br>Top Hill <br> Restaurant </h1>
                <br>
                <br>

                <p class="slide-left">We serve delicious food and drinks!</p>
            </div>

        </div>



        <section class="home">

            <div class="swiper home-slider">

                <div class="swiper-wrapper">

                    <div class="swiper-slide slide">
                        <div class="content">
                            <span>Order Online</span>
                            <h3>delicious pizza</h3>
                            <a href="menu.jsp" class="btn">see menus</a>
                        </div>
                        <div class="image">
                            <img src="images/home-img-1q.png" alt="">
                        </div>
                    </div>

                    <div class="swiper-slide slide">
                        <div class="content">
                            <span>Order Online</span>
                            <h3> roasted chicken</h3>
                            <a href="menu.jsp" class="btn">see menus</a>
                        </div>
                        <div class="image">
                            <img src="images/home-img-3.png" alt="">
                        </div>
                    </div>

                    <div class="swiper-slide slide">
                        <div class="content">
                            <span>Order Online</span>
                            <h3>delicious pasta</h3>
                            <a href="menu.jsp" class="btn">see menus</a>
                        </div>
                        <div class="image">
                            <img src="uploaded_img/dish-3.png" alt="">
                        </div>
                    </div>

                    <div class="swiper-slide slide">
                        <div class="content">
                            <span>Order Online</span>
                            <h3>double hamburger</h3>
                            <a href="menu.jsp" class="btn">see menus</a>
                        </div>
                        <div class="image">
                            <img src="images/home-img-2.png" alt="">
                        </div>
                    </div>

                </div>

                <div class="swiper-pagination"></div>

            </div>

        </section>
        <!--
        <div class="map">
           <h1>Location</h1>
           <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5386.5654047151575!2d89.38351678157065!3d26.848006786905884!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x39e3cb3e923dd3cf%3A0x2b8a1267b106ecb2!2sJaigaon%20View%20Point!5e0!3m2!1sen!2sin!4v1677752086078!5m2!1sen!2sin"
            width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        </div>
        -->


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

        <script src="https://unpkg.com/swiper@8/swiper-bundle.min.js"></script>

        <script src="js/script.js"></script>

        <script>

            var swiper = new Swiper(".home-slider", {
                loop: true,
                grabCursor: true,
                effect: "flip",
                pagination: {
                    el: ".swiper-pagination",
                    clickable: true,
                },
            });

        </script>
        <%
        }
        %>
    </body>
</html>
