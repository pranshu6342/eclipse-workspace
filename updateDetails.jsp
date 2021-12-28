<%@page import="com.testyantra.union.customerdto.CustomerDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
CustomerDto dto=(CustomerDto) request.getAttribute("upKey");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style="background-image: url('https://images.unsplash.com/photo-1557682250-33bd709cbe85?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1429&q=80');">
<fieldset>
		<legend><h1>Updated Detail's</h1></legend>
		<form action="" method="">
			<table>
Emp_Id : <%=dto.getEmpId() %><br><br>
EmpName : <%=dto.getEmpName() %>
<br><br>
Mobile : <%=dto.getMobileNo()%>
<br><br>
Password : <%=dto.getPassword() %>
<br><br>
Avilable_Balance : <%=dto.getBalance() %><br><br>
				<tr>
					<li><a href="http://localhost:8084/union/main">Go To Main Menu</a></li>
				</tr>
				
			</table>
		</form>
	</fieldset>






</body>
</html>