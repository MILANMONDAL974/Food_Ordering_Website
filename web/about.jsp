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
        <title>about us</title>

        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

        <!--  css file link  -->
        <link rel="stylesheet" href="css/style.css">
        <style>


        </style>
        <script>


        </script>

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

        <div class="heading">
            <h3>about us</h3>
            <p><a href="home.jsp">home </a> <span> / about</span></p>
        </div>

        <section class="about">

            <div class="row">

                <div class="image">
                    <img src="images/about-img.svg" alt="">
                </div>

                <div class="content">
                    <h3>Welcome To Hill Top Restaurant</h3>
                    <p> A  restaurant located in the heart of  Jaigaon town.
                        Our restaurant was founded in 2020 with a simple mission: to create delicious, healthy food that nourishes the body and the soul.
                        At The Hill Top Restaurant, we believe that food is not just fuel, but a way to connect with others and build community.
                        That's why we source our ingredients from local farmers and suppliers who share our commitment to sustainability and ethical farming practices.
                        We work with these partners to create seasonal menus that showcase the freshest and most flavorful ingredients.
                        Thank you for considering Hill Top Restaurant for your next dining experience. We look forward to serving you soon!</p>
                    <a href="menu.jsp" class="btn">our menu</a>
                </div>

            </div>

        </section>

        <section class="Opening">
            <h1 class="title">Opening Hours</h1>

            <div class="hour">
                <h6 > WE ARE OPEN 7 DAYS A WEEK</h6>
                <br>
                <br>
                <p>
                    Monday to Friday: 
                    <br>
                    <br>
                    12pm till 9:30pm(kitchen closes at 8:30pm)


                </p>
                <br>
                <br>
                <p>
                    Saturday & Sunday: 
                    <br>
                    <br>
                    12pm till 10pm (Kitchen closes at 9:30pm)
                    <br>
                </p>
                <br>
                <br>
                <p>
                    Please note our kitchen might close earlier on weekdays if needed
                    <br>
                    <br>
                    * Call 9748560321  for up to date information * 
                </p>
            </div>

        </section>


        <section class="steps">

            <h1 class="title">3 simple steps</h1>


            <div class="box-container">

                <div class="box">
                    <img src="images/menu (1).png" alt="">
                    <h3>Explore Our Menu</h3>
                    <p>Discover a wide range of dishes to satisfy your cravings.</p>
                </div>

                <div class="box">
                    <img src="images/delivery.png" alt="">
                    <h3>Lightning-Fast Delivery</h3>
                    <p>Get your food delivered straight to your doorstep in just 30 minutes or less – no need to wait around hungry!</p>
                </div>

                <div class="box">
                    <img src="images/dish.png" alt="">
                    <h3>Enjoy your meal!</h3>
                    <p>Sit back, relax, and savor every bite of our delectable dishes!</p>
                </div>

            </div>

        </section>

        <section class="reviews">

            <h1 class="title">DEVELOPERS</h1>


            <div class="swiper reviews-slider">

                <div class="swiper-wrapper">

                    <div class="swiper-slide slide">
                        <img src="images/cust1.jpg" alt="">
                        
                        <div class="stars">
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                        </div>
                        <h3>Ranbir Lama</h3>
                    </div>

                    <div class="swiper-slide slide">
                        <img src="images/cust2.jpg" alt="">
                        
                        <div class="stars">
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star-half-alt fa-lg"></i>
                        </div>
                        <h3>Milan Mondal</h3>
                    </div>

                    <div class="swiper-slide slide">
                        <img src="images/cust3.jpg" alt="">
                        
                        <div class="stars">
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>

                        </div>
                        <h3>Asif Raja</h3>
                    </div>

                    <div class="swiper-slide slide">
                        <img src="images/pic-4.jpeg" alt="">
                        
                        <div class="stars">
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star-half-alt fa-lg"></i>
                        </div>
                        <h3>Swagatam Dey</h3>
                    </div>

                    <div class="swiper-slide slide">
                        <img src="images/pic-5.jpeg" alt="">
                      
                        <div class="stars">
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star-half-alt fa-lg"></i>
                        </div>
                        <h3>Madhusudan Agnihotri</h3>
                    </div>

                    <div class="swiper-slide slide">
                        <img src="images/pic-6.jpeg" alt="">
                        
                        <div class="stars">
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star fa-lg"></i>
                            <i class="fas fa-star-half-alt fa-lg"></i>
                        </div>
                        <h3>Kaustav Chakraborty</h3>
                    </div>

                </div>

                <div class="swiper-pagination"></div>

            </div>

        </section>

        <footer>

            <ul class="social_icon">
                <li><a href="https://www.facebook.com/"><ion-icon name="logo-facebook"></ion-icon></a></li>
                <li><a href="https://twitter.com/"><ion-icon name="logo-twitter"></ion-icon></a></li>
                <li><a href="https://linkedin.com/"><ion-icon name="logo-linkedin"></ion-icon></a></li>
                <li><a href="https://instagram.com/"><ion-icon name="logo-instagram"></ion-icon></a></li>

            </ul>
            <p>&copy; Top Hill 2023  | All Rights Reserved</p>
        </footer>
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>






        <div class="loader">
            <img src="images/laod.gif" alt="">
        </div>

        <script src="https://unpkg.com/swiper@8/swiper-bundle.min.js"></script>

        <script src="js/script.js"></script>

        <script>

            var swiper = new Swiper(".reviews-slider", {
                loop: true,
                grabCursor: true,
                spaceBetween: 20,
                pagination: {
                    el: ".swiper-pagination",
                },
                breakpoints: {
                    550: {
                        slidesPerView: 1,
                    },
                    768: {
                        slidesPerView: 2,
                    },
                    1024: {
                        slidesPerView: 3,
                    },
                },
            });

        </script>
        <%
            }
        %>
    </body>
</html>
