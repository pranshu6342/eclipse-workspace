<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<style type="text/css">@import url('https://fonts.googleapis.com/css?family=Poppins');

/* BASIC */

html {
  background-color: #56baed;
}

body {
  font-family: "Poppins", sans-serif;
  height: 100vh;
}

a {
  color: #92badd;
  display:inline-block;
  text-decoration: none;
  font-weight: 400;
}

h2 {
  text-align: center;
  font-size: 16px;
  font-weight: 600;
  text-transform: uppercase;
  display:inline-block;
  margin: 40px 8px 10px 8px; 
  color: #cccccc;
}



/* STRUCTURE */

.wrapper {
  display: flex;
  align-items: center;
  flex-direction: column; 
  justify-content: center;
  width: 100%;
  min-height: 100%;
  padding: 20px;
}

#formContent {
  -webkit-border-radius: 10px 10px 10px 10px;
  border-radius: 10px 10px 10px 10px;
  background: #fff;
  padding: 30px;
  width: 90%;
  max-width: 450px;
  position: relative;
  padding: 0px;
  -webkit-box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);
  box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);
  text-align: center;
}

#formFooter {
  background-color: #f6f6f6;
  border-top: 1px solid #dce8f1;
  padding: 25px;
  text-align: center;
  -webkit-border-radius: 0 0 10px 10px;
  border-radius: 0 0 10px 10px;
}



/* TABS */

h2.inactive {
  color: #cccccc;
}

h2.active {
  color: #0d0d0d;
  border-bottom: 2px solid #5fbae9;
}



/* FORM TYPOGRAPHY*/

input[type=button], input[type=submit], input[type=reset]  {
  background-color: #56baed;
  border: none;
  color: white;
  padding: 15px 80px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  text-transform: uppercase;
  font-size: 13px;
  -webkit-box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);
  box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);
  -webkit-border-radius: 5px 5px 5px 5px;
  border-radius: 5px 5px 5px 5px;
  margin: 5px 20px 40px 20px;
  -webkit-transition: all 0.3s ease-in-out;
  -moz-transition: all 0.3s ease-in-out;
  -ms-transition: all 0.3s ease-in-out;
  -o-transition: all 0.3s ease-in-out;
  transition: all 0.3s ease-in-out;
}

input[type=button]:hover, input[type=submit]:hover, input[type=reset]:hover  {
  background-color: #39ace7;
}

input[type=button]:active, input[type=submit]:active, input[type=reset]:active  {
  -moz-transform: scale(0.95);
  -webkit-transform: scale(0.95);
  -o-transform: scale(0.95);
  -ms-transform: scale(0.95);
  transform: scale(0.95);
}

input[type=text] {
  background-color: #f6f6f6;
  border: none;
  color: #0d0d0d;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 5px;
  width: 85%;
  border: 2px solid #f6f6f6;
  -webkit-transition: all 0.5s ease-in-out;
  -moz-transition: all 0.5s ease-in-out;
  -ms-transition: all 0.5s ease-in-out;
  -o-transition: all 0.5s ease-in-out;
  transition: all 0.5s ease-in-out;
  -webkit-border-radius: 5px 5px 5px 5px;
  border-radius: 5px 5px 5px 5px;
}

input[type=text]:focus {
  background-color: #fff;
  border-bottom: 2px solid #5fbae9;
}

input[type=text]:placeholder {
  color: #cccccc;
}
input[type=password] {
  background-color: #f6f6f6;
  border: none;
  color: #0d0d0d;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 5px;
  width: 85%;
  border: 2px solid #f6f6f6;
  -webkit-transition: all 0.5s ease-in-out;
  -moz-transition: all 0.5s ease-in-out;
  -ms-transition: all 0.5s ease-in-out;
  -o-transition: all 0.5s ease-in-out;
  transition: all 0.5s ease-in-out;
  -webkit-border-radius: 5px 5px 5px 5px;
  border-radius: 5px 5px 5px 5px;
}

input[type=password]:focus {
  background-color: #fff;
  border-bottom: 2px solid #5fbae9;
}

input[type=password]:placeholder {
  color: #cccccc;
}



/* ANIMATIONS */

/* Simple CSS3 Fade-in-down Animation */
.fadeInDown {
  -webkit-animation-name: fadeInDown;
  animation-name: fadeInDown;
  -webkit-animation-duration: 1s;
  animation-duration: 1s;
  -webkit-animation-fill-mode: both;
  animation-fill-mode: both;
}

@-webkit-keyframes fadeInDown {
  0% {
    opacity: 0;
    -webkit-transform: translate3d(0, -100%, 0);
    transform: translate3d(0, -100%, 0);
  }
  100% {
    opacity: 1;
    -webkit-transform: none;
    transform: none;
  }
}

@keyframes fadeInDown {
  0% {
    opacity: 0;
    -webkit-transform: translate3d(0, -100%, 0);
    transform: translate3d(0, -100%, 0);
  }
  100% {
    opacity: 1;
    -webkit-transform: none;
    transform: none;
  }
}

/* Simple CSS3 Fade-in Animation */
@-webkit-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }
@-moz-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }
@keyframes fadeIn { from { opacity:0; } to { opacity:1; } }

.fadeIn {
  opacity:0;
  -webkit-animation:fadeIn ease-in 1;
  -moz-animation:fadeIn ease-in 1;
  animation:fadeIn ease-in 1;

  -webkit-animation-fill-mode:forwards;
  -moz-animation-fill-mode:forwards;
  animation-fill-mode:forwards;

  -webkit-animation-duration:1s;
  -moz-animation-duration:1s;
  animation-duration:1s;
}

.fadeIn.first {
  -webkit-animation-delay: 0.4s;
  -moz-animation-delay: 0.4s;
  animation-delay: 0.4s;
}

.fadeIn.second {
  -webkit-animation-delay: 0.6s;
  -moz-animation-delay: 0.6s;
  animation-delay: 0.6s;
}

.fadeIn.third {
  -webkit-animation-delay: 0.8s;
  -moz-animation-delay: 0.8s;
  animation-delay: 0.8s;
}

.fadeIn.fourth {
  -webkit-animation-delay: 1s;
  -moz-animation-delay: 1s;
  animation-delay: 1s;
}

/* Simple CSS3 Fade-in Animation */
.underlineHover:after {
  display: block;
  left: 0;
  bottom: -10px;
  width: 0;
  height: 2px;
  background-color: #56baed;
  content: "";
  transition: width 0.2s;
}

.underlineHover:hover {
  color: #0d0d0d;
}

.underlineHover:hover:after{
  width: 100%;
}



/* OTHERS */

*:focus {
    outline: none;
} 

#icon {
  width:60%;
}

* {
  box-sizing: border-box;
}
</style>
<body style="background-image:url('https://www.desktopbackground.org/download/1366x768/2011/01/11/140250_hd-wallpapers-desktop-simple-plain-hd-desktop-wallpapers_1600x1000_h.jpg'); ">
<li><a href="http://localhost:8084/union/login">Back to Login Page</a></li>
<img alt="not found" src="data:image/png;base64,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" style="width:36cm;height:5cm  ">
<form action="./login" method="post">
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    
  

    <!-- Icon -->
    <div class="fadeIn first">
     <!--  <img src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png" id="icon" alt="User Icon" /> -->
    </div>

    <!-- Login Form -->
    <form>
    <div id="formFooter">
     <h2> <a class="">Registration Successfully</a></h2>
    </div>
    </form>

    

  </div>
</div>
</body>

</html>