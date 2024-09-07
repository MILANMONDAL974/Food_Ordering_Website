<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>login</title>

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

        <!-- custom css file link  -->
        <link rel="stylesheet" href="css/style.css">
        <script src="https://code.jquery.com/jquery-3.7.0.slim.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

    </head>
    <body>
        <input type="hidden" id="Register" value="<%=request.getAttribute("Register")%>">

        <header class="header">

            <section class="flex">

                <img class="logo" src="uploaded_img/logo1.png" alt="My website logo">

                <nav class="navbar">
                    <a href="#">Home</a>
                    <a href="#">About</a>
                    <a href="#">Menu</a>
                    <a href="#">Contact</a>
                </nav>

                <div class="icons">
                    <a href="login.jsp" class="fas fa-sign-in-alt"></a>
                    <div id="user-btn" class="fas fa-user"><p>ADMIN ONLY <ion-icon name="happy-outline"></ion-icon></p></div>
                    <div id="menu-btn" class="fas fa-bars"></div>
                </div>

            </section>

        </header>

        <div class="login-wrapper">
            <section class="form-container login-box">

                <form action="http://localhost:8080/Restaurantweb/adminregister" method="post">
                    <h3>register now</h3>
                    <input type="admin_name" required maxlength="20" name="tadminname" placeholder="Enter your Name" class="box">
                    <input type="password" required maxlength="20" name="bpassword" placeholder="Enter your password" class="box" oninput="this.value = this.value.replace(/\s/g, '')">
                    <input type="password" required maxlength="20" name="apassword" placeholder="Confirm your password" class="box" oninput="this.value = this.value.replace(/\s/g, '')">
                    <input type="submit" value="Register Now" class="btn" name="submit">
                    <p>Already have an account? <a href="login.html">Login Now</a></p>
                </form>

            </section>
        </div>

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


        <script src="js/script.js"></script>
        <script src="js/otp.js"></script>
        <script type="text/javascript">
            
            var Register= document.getElementById("Register").value;
                if (Register=="Success"){
                    swal("Congratulations","Your account has been successfully cerated.","success");
                }
//                else {
//                    swal("Sorry","your account creation Failed.");
//                }
            
        </script>


    </body>
</html>
