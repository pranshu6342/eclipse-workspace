<%@page import="com.testyantra.union.customerdto.CustomerDto"%>
<%@page import="com.testyantra.union.customerdto.CustomerDto"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
CustomerDto dto = (CustomerDto) request.getAttribute("name");
String sms=(String)request.getAttribute("sms");
Double amount=(Double)request.getAttribute("money");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transection Successfull</title>
</head>
<body style="background-image: url('https://images.unsplash.com/photo-1557682250-33bd709cbe85?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1429&q=80');">
<%if(sms!=null && !sms.isEmpty()){ %>
<h1 style="color: red"><%=sms %></h1>
<%} %>
	<fieldset>
		
			<table>
				<h1>Transection SUCESSFULL</h1>
				<%=amount %> Deposite Sucessfully to mr. <%=dto.getEmpName() %> Account
			</table>
			<tr>
					<li><a href="http://localhost:8084/union/openAccount">Go To Login Page</a></li>
				</tr>
		</form>
	</fieldset>
</body>
</html>