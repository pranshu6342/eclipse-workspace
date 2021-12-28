<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

.navbar {
  width: 100%;
  background-color: #555;
  overflow: auto;
}

.navbar a {
  float: left;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background-color: #000;
}

.active {
  background-color: #04AA6D;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}
</style>
<body style="background-image:url('https://wallpaperaccess.com/full/327135.jpg');background-size: 100% ">

<h2></h2>


<div class="navbar">
  <a class="active" href="#"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a href="./search"><i class="fa fa-fw fa-search"></i> Search</a> 
  <a href="./delete"><i class="fa fa-trash-o"></i> Delete Account</a> 
  <a href="http://localhost:6306/mvcproject/contact.jsp"><i class="fa fa-phone"></i>Support </a>
  <a href="./update"><i class="fa fa-edit"></i> update</a>
   <a href="./update"><i class="fa fa-edit"></i> Money_Transfer</a>
    <a href="./update"><i class="fa fa-edit"></i> Deposit</a>
   <a href="./logout"><i class="fa fa-sign-out"></i>logout </a>

</div>

</body>
</html>