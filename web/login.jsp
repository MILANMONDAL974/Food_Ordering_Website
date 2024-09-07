<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>login</title>

       <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">

        <link rel="stylesheet" href="css/style.css">
        <script src="https://code.jquery.com/jquery-3.7.0.slim.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

        <style>

            @import url('https://fonts.googleapis.com/css2?family=Alkatra&display=swap');

            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Alkatra';
            }

            body {
                justify-content: center;
                align-items: center;
                min-height: 100vh;
                background: url("https://cdn.dribbble.com/users/939968/screenshots/2362151/media/a870b3f90a856c0e453f110982ccbcfc.gif") no-repeat;
                background-position: center;
                background-color: wheat;
            }

            header {
                position: fixed;
                top: 0;
                left: 0; 
                width: 100%;
                padding: 20px 100px;
                display: flex;
                justify-content: space-between;
                align-items: center;
                z-index: 99;
            }

            .HILL.TOP {
                font-size: 3em;
                color: black;
                user-select: none;
            }

            .icons .btnLogin-popup {
                width: 130px;
                height: 50px;
                background: transparent;
                border: 2px solid black;
                outline: none;
                border-radius: 50px;
                cursor: pointer;
                font-size: 1.1em;
                color: black;
                font-weight: 500;
                margin-left: 40px;
                transition: 0.5s;
            }

            .icons .btnLogin-popup:hover {
                background: black;
            }

            .icons .btnadmin {
                width: 130px;
                height: 50px;
                background: transparent;
                border: 2px solid black;
                outline: none;
                border-radius: 50px;
                cursor: pointer;
                font-size: 1.1em;
                color: black;
                font-weight: 500;
                margin-left: 40px;
                transition: 0.5s;
            }

            .icons .btnadmin:hover {
                background: #777;
            }

            .wrapper {
                position: relative;
                width: 400px;
                height: 420px;
                background: transparent;
                border: 2px solid rgba(255, 255, 255, .5);
                border-radius: 15px;
                backdrop-filter: blur(10px);
                box-shadow: 0 0 30px rgba(0, 0, 0, .5);
                display: flex;
                justify-content: center;
                align-items: center;
                overflow: hidden;
                transform: scale(0);
                transition: transform .5s ease, height .2s ease;
            }

            .wrapper.active-popup {
                transform: scale(1);
            }

            .wrapper.active {
                height: 570px;
            }

            .wrapper .form-box {
                width: 100%;
                padding: 40px;  
            }

            .wrapper .form-box.login {
                transition: transform .18s ease;
                transform: translateX(0);
            }

            .wrapper.active .form-box.login {
                transition: none;
                transform: translateX(-400px);
            }

            .wrapper .form-box.register {
                position: absolute;
                transition: none;
                transform: translateX(400px);
            }

            .wrapper.active .form-box.register {
                transition: transform .18s ease;
                transform: translateX(0);
            }

            .wrapper .icon-close {
                position: absolute;
                top: 0;
                right: 0;
                width: 45px;
                height: 45px;
                background: black;
                font-size: 2.5em;
                color: orange;
                display: flex;
                justify-content: center;
                align-items: center;
                border-bottom-left-radius: 15px;
                cursor: pointer;
                z-index: 1;
            }

            .form-box h2 {
                font-size: 4em;
                color: skyblue;
                text-align: center;
            }

            .input-box {
                position: relative;
                width: 100%;
                height: 50px;
                border-bottom: 2px ridge skyblue;
                margin: 30px 0;
            }

            .input-box label {
                position: absolute;
                top: 50%;
                left: 5px;
                transform: translateY(-50%);
                font-size: 2em;
                color: orange;
                font-weight: 500;
                pointer-events: none;
                transition: .5s;
            }

            .input-box input:focus~label,
            .input-box input:valid~label {
                top: -5px;
            }
            .input-box input {
                width: 100%;
                height: 100%;
                background: transparent;
                border: none;
                outline: none;
                font-size: 1.5em;
                color: black;
                font-weight: 600;
                padding: 0 35px 0 5px;
            }

            .input-box .icon {
                position: absolute;
                right: 8px;
                font-size: 2em;
                color: skyblue;
                line-height: 57px;
            }

            .remember-forgot {
                font-size: 1.5em;
                color: black;
                font-weight: 500;
                margin: -15px 0 15px;
                display: flex;
                justify-content: space-between;
            }

            .remember-forgot label input {
                accent-color: skyblue;
                margin-right: 3px;
            }

            .remember-forgot a {
                color: orange;
                text-decoration: none;
            }

            .remember-forgot a:hover {
                text-decoration: underline;
            }

            .btn {
                width: 100%;
                height: 45px;
                background: orange;
                border: none;
                outline: none;
                border-radius: 6px;
                cursor: pointer;
                font-size: 2em;
                color: skyblue;
                font-weight: 500;
            }

            .login-register {
                font-size: 1.5em;
                color: black;
                text-align: center;
                font-weight: 500;
                margin: 25px 0 10px;
            }

            .login-register p a {
                color: skyblue;
                text-decoration: none;
                font-weight: 600;
            }

            .login-register p a:hover{
                text-decoration: underline;
            }

        </style>

    </head>

    <body>
        <input type="hidden" id="register" value="<%=request.getAttribute("register")%>">

        <header class="header">
            <h2>Welcome to *</h2>
            <h2 class="HILL TOP">* HILL TOP *</h2>
            <h2>* Restaurant</h2>
            <section class="flex">
                <nav class="navbar">
                    <a href="login.jsp">Home</a>
                    <a href="login.jsp">About</a>
                    <a href="login.jsp">Menu</a>
                    <a href="login.jsp">Contact</a>
                </nav>

                <div class="icons">
                    <button class="btnLogin-popup">Sign In</button>
                    <a href="login.html"><button class="btnadmin">Admin</button></a>

            </section>

        </header>
        <main>
            <div class="wrapper">
                <span class="icon-close">
                    <ion-icon name="close"></ion-icon>
                </span>

                <div class="form-box login">
                    <h2>*Welcome Back*</h2>
                    <form method="POST" action="http://localhost:8080/Restaurantweb/Loginserve">               
                        <div class="input-box">
                            <span class="icon">
                                <ion-icon name="person"></ion-icon>
                            </span>
                            <input type="text" name="tusername" required>
                            <label>Username</label>
                        </div>
                        <div class="input-box">
                            <span class="icon">
                                <ion-icon name="lock-closed"></ion-icon>
                            </span>
                            <input type="password" name="cpassword" required>
                            <label>Password</label>
                        </div>
                        <div class="remember-forgot">
                            <label><input type="checkbox" required>
                                Remember me</label>
                            <a href="forgotpassword.jsp">Forgot Password ?</a>
                        </div>
                        <button type="submit" class="btn">Sign In</button>
                        <div class="login-register">
                            <p>Don't have an account?<a href="#" class="register-link">Register</a></p>
                        </div>

                    </form> 
                </div>
                <div class="form-box register">
                    <h2>Sign Up</h2>
                    <form method="POST" action="http://localhost:8080/Restaurantweb/Signup">               
                        <div class="input-box">
                            <span class="icon">
                                <ion-icon name="person"></ion-icon>
                            </span>
                            <input type="text" name="tusername" required>
                            <label>Username</label>
                        </div>
                        <div class="input-box">
                            <span class="icon">
                                <ion-icon name="mail"></ion-icon>
                            </span>
                            <input type="email" name="temail" required>
                            <label>Email</label>
                        </div>
                        <div class="input-box">
                            <span class="icon">
                                <ion-icon name="lock-closed"></ion-icon>
                            </span>
                            <input type="password" name="cpassword" required>
                            <label> Confirm Password</label>
                        </div>
                        <div class="input-box">
                            <span class="icon">
                                <ion-icon name="call"></ion-icon>
                            </span>
                            <input type="number" min="0" max="9999999999" onkeypress="if (this.value.length === 10)
                                        return false;" name="inumber" required>
                            <label>Mobile Number</label>
                        </div>
                        <div class="remember-forgot">
                            <label><input type="checkbox" required>
                                I agree to the terms & conditions</label>
                        </div>
                        <button type="submit" class="btn">Sign Up</button>
                        <div class="login-register">
                            <p>Already have an account?<a href="#" class="login-link">Login</a></p>
                        </div>
                    </form> 
                </div>
            </div>
        </main>
        <footer>

            <ul class="social_icon">
                <li><a href="https://www.facebook.com/"><ion-icon name="logo-facebook"></ion-icon></a></li>
                <li><a href="https://twitter.com/"><ion-icon name="logo-twitter"></ion-icon></a></li>
                <li><a href="https://linkedin.com/"><ion-icon name="logo-linkedin"></ion-icon></a></li>
                <li><a href="https://instagram.com/"><ion-icon name="logo-instagram"></ion-icon></a></li>

            </ul>

            <p>&copy; Hill Top 2023  | All Rights Reserved</p>
        </footer>

        <script src="js/script.js"></script>

        <script src="https://unpkg.com/ionicons@4.5.10-0/dist/ionicons.js"></script>
        <script>
                                const wrapper = document.querySelector('.wrapper');
                                const loginLink = document.querySelector('.login-link');
                                const registerLink = document.querySelector('.register-link');
                                const btnPopup = document.querySelector('.btnLogin-popup');
                                const iconClose = document.querySelector('.icon-close');

                                registerLink.addEventListener('click', () => {
                                    wrapper.classList.add('active');
                                });

                                loginLink.addEventListener('click', () => {
                                    wrapper.classList.remove('active');
                                });

                                btnPopup.addEventListener('click', () => {
                                    wrapper.classList.add('active-popup');
                                });

                                iconClose.addEventListener('click', () => {
                                    wrapper.classList.remove('active-popup');
                                });

        </script>

        <script type="text/javascript">

            var register = document.getElementById("register").value;
            if (register == "success") {
                swal("Congratulations", "Your account has been successfully cerated.", "success");
            }
//                else {
//                    swal("Sorry","your account creation Failed.");
//                }

        </script>
    </body>
</html>
