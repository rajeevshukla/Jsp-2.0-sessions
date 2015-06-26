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

			<%
			Map<Integer, Integer> cartInfo = (Map<Integer, Integer>) session
					.getAttribute("cartInfo");
		%>
			<div align="right">

				<%
					if (null != cartInfo) {
				%>
				Cart(  <a href="viewCartDetails.htm"> <%=cartInfo.size()%></a>)

				<%
					} else {
				%>
				Cart(0)
				<%
					}
				%>

			</div>
		</div>

		<div align="right" style="float: left; width: 50%;">

			<a href="LogoutServlet.htm">Logout</a>
		</div>
	</div>

	<div id="content">


		<form action="AddProductToCart.htm" method="post">
			<table style="width: 30%;" align="center">
				<thead>
					<tr>
						<th>Product Name</th>
						<th>Product price</th>
						<th>Select</th>
					</tr>
				</thead>

				<tbody>

					<%
						List<ProductDetails> productDetails = (List<ProductDetails>) session
								.getAttribute("productList");

						for (ProductDetails product : productDetails) {
					%>
					<tr>
						<td><%=product.getProductName()%></td>
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

						<th align="right" colspan="3"><input type="submit"
							value="add"></th>
					</tr>

				</thead>

			</table>
		</form>

	</div>



	<div id="footer"></div>

</body>
</html>