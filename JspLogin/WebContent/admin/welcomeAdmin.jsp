<%@page import="com.demo.listener.SessionListener"%>
<%@page import="java.util.Map"%>
<%@page import="com.demo.login.ProductDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	if (session.getAttribute("userName") == null) {
		response.sendRedirect("index.jsp");
	}
%>


<head>
<style type="text/css">
#header {
	background-color: lime;
}

#content {
	height: 500px;
	background-color: silver;
}

#footer {
	height: 100px;
	background-color: gray;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="header" style="width: 100%; height: 100px;">
		<div align="left" style="float: left; width: 50%;">
			Welcome
			${userName}  <!-- El engine will search this attribute in all 4 scope one by one. 
			               1:-pageScope
			               
			
			         -->
			
			             
			!!

		
		</div>

		<div align="right" style="float: left; width: 50%;">

			<a href="../LogoutServlet.htm">Logout</a>
		</div>
	</div>

	<div id="content">
       No Of user logged in: <%=SessionListener.count%>
 
	</div>



	<div id="footer"></div>

</body>
</html>