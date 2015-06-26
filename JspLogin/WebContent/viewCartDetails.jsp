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
<title>Cart details</title>
</head>
<body>

	<div id="header" style="width: 100%; height: 100px;">
		<div align="left" style="float: left; width: 50%;">
			Welcome
			<%=session.getAttribute("userName")%>
			!!

			
			
		</div>

		<div align="right" style="float: left; width: 50%;">

			<a href="LogoutServlet.htm">Logout</a>
		</div>
	</div>

	<div id="content">


		<form action="#" method="post">
			<table style="width: 30%;" align="center">
				<thead>
					<tr>
						<th>Product Name</th>
						<th>Quantity</th>
						<th>Product price</th>
						<th>Remove</th>
					</tr>
				</thead>

				<tbody>
<!--    

    We will use EL (Expression language which  is very handy for designer to under stand. )
         
           //Head first servlet and Jsp
                   
                 ${ scopeName.attributeName }  
                 
                 
                 //In EL there are 11 default objects are available.  
                 //Scope 
                   
                   requestScope
                   sessionScope
                   pageScope
                   applicationScope
                   
                      
 
 -->					<%
					
					 int totalQuantity=0;
					 double totalCost=0.0;
						List<ProductDetails> productDetails = (List<ProductDetails>) session
								.getAttribute("cartDetails");

						for (ProductDetails product : productDetails) {
							
							totalQuantity=totalQuantity+product.getQuantity();
							totalCost=totalCost+product.getPrice();
					%>
					<tr>
					
					  
						<td><%=product.getProductName()%></td>
						<td><%=product.getQuantity() %>
						<td><%=product.getPrice()%></td>
						<td><input type="checkbox" name="selectedProducts"
							value="<%=product.getProductId()%>"></td>

					</tr>

					<%
						}
					%>
				</tbody>
				 <thead>
				  <tr>
				  <th>Total</th>
				  
				  <th><%=totalQuantity %></th>
				  <th><%=totalCost%></th>
				  <th>&nbsp;</th>
				  </tr>
				 
				 </thead>

				<thead>

					<tr>

						<th align="right" colspan="3"><input type="submit"
							value="Proceed to Payment"></th>
					</tr>

				</thead>

			</table>
		</form>

	</div>



	<div id="footer"></div>

</body>
</html>