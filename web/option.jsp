<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>food menu</title>

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />

        <!-- custom css file link  -->
        <link rel="stylesheet" href="css/style.css">
        <style>
            .description {
                font-size: 1.5em;
                color: grey;
                margin-bottom: 1.5em;
            }
            .markers .fa-leaf {
                color: green;
                font-size: 3em;
            }

            .markers {
                border: 1px solid green;
                width: 25%;
            }    

        </style>
    </head>
    <body>

        <header>

        </header>

        <div class="heading">
            <h3>Dashboard <ion-icon name="arrow-down-circle"></ion-icon></h3>
            <p><a href="login.html">Back </a><span><a href="login.jsp"> / Logout</a></span></p>
        </div>

        <section class="category">

            <h1 class="title">Control Section</h1>

            <div class="box-container">

                <a href="AdminDetails.jsp" class="box">
                    <img src="images/admin.jpg" alt="">
                    <h3>ADMIN DETAILS</h3>
                </a>

                <a href="UserDetails.jsp" class="box">
                    <img src="images/user1.png" alt="">
                    <h3>USERS DETAILS</h3>
                </a>
                
                <a href="OrderDetails.jsp" class="box">
                    <img src="images/dish.png" alt="">
                    <h3> ORDERS DETAILS</h3>
                </a>

                <a href="ContactDetails.jsp" class="box">
                    <img src="images/comments.jpg" alt="">
                    <h3> REVIEW</h3>
                </a>

            </div>

        </section>
        
        
        <Script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></Script>
        <Script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></Script>
        <script src="js/script.js"></script>
        <script src="js/menu.js"></script>
        
    </body>
</html>