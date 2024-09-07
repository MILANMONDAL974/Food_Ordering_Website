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
        <title>menu</title>

        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

        <!--  css file link  -->
        <link rel="stylesheet" href="css/style.css">

        <style>
            .description {
                font-size: 1.5em;
                color: grey;
                margin-bottom: 1.5em;
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
            <h3>our menu</h3>
            <p><a href="home.jsp">home </a> <span> / menu</span></p>
        </div>

        <section class="category">

            <h1 class="title">food category</h1>

            <div class="box-container">

                <a href="appetizers.jsp" class="box">
                    <img src="images/appetizer-icon.png" alt="">
                    <h3>Appetizers</h3>
                </a>

                <a href="maincourses.jsp" class="box">
                    <img src="images/cat-2.png" alt="">
                    <h3>Main Courses</h3>
                </a>

                <a href="beverages.jsp" class="box">
                    <img src="images/cat-3.png" alt="">
                    <h3>Beverages</h3>
                </a>

                <a href="desserts.jsp" class="box">
                    <img src="images/cat-4.png" alt="">
                    <h3>Desserts</h3>
                </a>

            </div>

        </section >

        <section class="products">

            <h1 class="title">latest dishes</h1>

            <div class="box-container">

                <form accept="" method="post" class="box fast-food">
                    <a href="quick_view.jsp" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/appetizer-1.png" alt="">
                    <a href="appetizers.jsp" class="cat">Appetizer</a>
                    <div class="name">Spinach and Artichoke Dip with Warm Pita Bread</div>
                    <div class="description">A creamy blend of spinach, artichokes, and cheese, served with warm pita bread for dipping.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg fa-lg"></i>
                        <i class="fas fa-star fa-lg fa-lg"></i>
                        <i class="fas fa-star fa-lg fa-lg"></i>
                        <i class="fas fa-star fa-lg fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>3<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/appetizer-2.png" alt="">
                    <a href="appetizers.jsp" class="cat">Appetizer</a>
                    <div class="name">Crispy Fried Calamari with Lemon Aioli</div>
                    <div class="description">Tender calamari rings coated in a crispy batter and served with a zesty lemon aioli sauce.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>1<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/appetizer-3.png" alt="">
                    <a href="appetizers.jsp" class="cat">Appetizer</a>
                    <div class="name">Grilled Shrimp Skewers with Garlic Butter</div>
                    <div class="description">Juicy shrimp skewered and grilled to perfection, then brushed with garlic butter for added flavor.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>4<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/main-course-1.png" alt="">
                    <a href="maincourses.jsp" class="cat">Main Course</a>
                    <div class="name">Pan-Seared Salmon with Roasted Vegetables</div>
                    <div class="description">A fresh Atlantic salmon fillet, accompanied by a colorful medley of roasted vegetables.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>1<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/main-course-2.png" alt="">
                    <a href="maincourses.jsp" class="cat">Main Course</a>
                    <div class="name">Grilled Ribeye Steak with Mashed Potatoes</div>
                    <div class="description">A juicy ribeye steak, seasoned and grilled to your liking, and served with creamy mashed potatoes.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>5<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/main-course-3.png" alt="">
                    <a href="maincourses.jsp" class="cat">Main Course</a>
                    <div class="name">Vegetable Curry with Basmati Rice and Naan Bread</div>
                    <div class="description">A flavorful vegetarian curry, served with fragrant basmati rice and warm naan bread.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>3<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/dessert-3.png" alt="">
                    <a href="desserts.jsp" class="cat">Dessert</a>
                    <div class="name">Seasonal Fruit Crumble with Whipped Cream</div>
                    <div class="description">A warm and comforting fruit crumble made with fresh seasonal fruits, topped with whipped cream.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>3<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/dessert-2.png" alt="">
                    <a href="desserts.jsp" class="cat">Dessert</a>
                    <div class="name">Classic New York Cheesecake with Strawberry Sauce</div>
                    <div class="description">A creamy and smooth cheesecake with a buttery graham cracker crust, topped with a sweet strawberry sauce.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>2<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/dessert-1.png" alt="">
                    <a href="desserts.jsp" class="cat">Dessert</a>
                    <div class="name">Decadent Chocolate Brownie with Vanilla Ice Cream</div >
                    <div class="description">A decadent chocolate brownie served warm with a scoop of creamy vanilla ice cream and luscious caramel sauce.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>3<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/drink-1.png" alt="">
                    <a href="beverages.jsp" class="cat">Beverage</a>
                    <div class="name">Local Craft  Selection</div >
                    <div class="description">A selection of locally brewed craft juice, available on tap or in bottles.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>3<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/drink-2.png" alt="">
                    <a href="beverages.jsp" class="cat">Beverage</a>
                    <div class="name">Freshly Brewed Iced Tea</div >
                    <div class="description">A classic iced tea made with freshly brewed tea and served over ice.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>1<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
                </form>

                <form accept="" method="post" class="box">
                    <a href="quick_view.html" class="fas fa-eye"></a>
                    <button class="fas fa-shopping-cart" type="button" name="add_to_cart"></button>
                    <img src="images/drink-3.jpg" alt="">
                    <a href="beverages.jsp" class="cat">Beverage</a>
                    <div class="name">Hilltop Signature Lemonade</div >
                    <div class="description">A refreshing blend of freshly squeezed lemons and sugar, served over ice.</div>
                    <div class="stars">
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star fa-lg"></i>
                        <i class="fas fa-star-half-alt fa-lg"></i>
                    </div>
                    <div class="flex">
                        <div class="price"><span>$</span>2<span>/-</span></div>
                        <input type="number" name="qty" class="qty" min="1" max="99" value="1" onkeypress="if (this.value.length == 2)
                                    return false;">
                    </div>
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
            <p>&copy; Hill Top 0223  | All Rights Reserved</p>
        </footer>
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

        <div class="loader">
            <img src="images/laod.gif" alt="">
        </div>

        <script src="js/script.js"></script>
        <script src="js/menu.js"></script>
        <%
            }
        %>
    </body>
</html>
