<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style> 
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #0000ff80;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #0000ff80;
}
</style>
<title>Nav</title>
</head>
<body>
<ul>
  <li><a href="./insert">Home</a></li>
  <li><a href="./update">About Us</a></li>
  <li><a href="./delete">Contact</a></li>
  <li><a href="./search">Money Transfer</a></li>
 <li><a href="./logout">Deposit</a></li>
 <li><a href="./logout">Balance Check</a></li>
 <li><a href="./logout">Edit-Detail's</a></li>
 <li><a href="http://localhost:8084/union/logout">Log-Out</a></li>
 </ul>
</body>

</html>