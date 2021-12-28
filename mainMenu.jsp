<%@page import="com.testyantra.union.customerdto.CustomerDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
CustomerDto dto = (CustomerDto) request.getAttribute("depoKey");
String msg = (String) request.getAttribute("msg");
%>
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
<title></title>
</head>
<body  style="background-image: url('https://images.unsplash.com/photo-1557682250-33bd709cbe85?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1429&q=80');">>
<%if(msg!=null && !msg.isEmpty()){ %>
<h1 style="color: red"><%=msg %></h1>
<%} %>
	<ul>
		<li><a href="http://localhost:8084/union/openAccount">Home</a></li>
		<li><a href="./update">About Us</a></li>
		<li><a href="./delete">Contact</a></li>
		<li><a href="http://localhost:8084/union/transfer">Money Transfer</a></li>
		<li><a href="http://localhost:8084/union/deposit">Deposit</a></li>
		<li><a href="http://localhost:8084/union/check">Balance Check</a></li>
		<li><a href="http://localhost:8084/union/update">Edit-Detail's</a></li>
		<li><a href="http://localhost:8084/union/searchPerticular">Search</a></li>
		<li><a href="http://localhost:8084/union/delete">Delete Account</a></li>
		<li><a href="http://localhost:8084/union/logout">Log-Out</a></li>
	</ul>
	 <div id="formFooter">
     
     <body  style="background-image:url('https://www.desktopbackground.org/download/1366x768/2011/01/11/140250_hd-wallpapers-desktop-simple-plain-hd-desktop-wallpapers_1600x1000_h.jpg'); ">
    </div>
</body>

</html>