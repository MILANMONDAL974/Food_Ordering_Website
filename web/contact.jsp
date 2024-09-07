<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>contact us</title>

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

        <!-- custom css file link  -->
        <link rel="stylesheet" href="css/style.css">
        <style>
            #alert {
                padding: 30px;
                background-color: green;
                color: white;
                text-align: center;
                font-size: 23px;

            }
            .closebtn {
                margin-left: 15px;
                color: white;
                font-weight: bold;
                float: right;
                font-size: 24px;
                line-height: 20px;
                cursor: pointer;
                transition: 0.3s;
            }

            .closebtn:hover {
                color: black;
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

        <div class="heading">
            <h3>contact us</h3>
            <p><a href="home.jsp">home </a> <span> / contact</span></p>
        </div>

        <section class="contact">

            <div class="row">

                <div class="image">
                    <img src="images/Contact us.gif" alt="">
                </div>

                <form action="contact" method="post">
                    <div id="alert">
                        <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span> 
                        ${succ} 
                    </div>

                    <h3>Tell Us Something!</h3>
                    <input type="text" name="name" required placeholder="Enter your name" maxlength="50" class="box">
                    <input type="number" name="number" required placeholder="Enter your number" max="9999999999" min="0" class="box" onkeypress="if (this.value.length == 10)
                          return false;">
                    <input type="email" name="email" required placeholder="Enter your email" maxlength="50" class="box">
                    <textarea name="message" placeholder="Enter your message" required class="box" cols="30" rows="10" maxlength="500"></textarea>
                    <input type="submit" value="Send Message" class="btn" name="send">

                </form>

            </div>

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
        <%
            }
        %>
    </body>
</html>
