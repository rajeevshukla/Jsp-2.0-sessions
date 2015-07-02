<%@page import="java.util.Map"%>
<%@page import="com.demo.login.ProductDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<c:if test="${empty userName }">

   <c:redirect context="JspLogin2" url="index.jsp"></c:redirect>
</c:if>

<%
	if (session.getAttribute("userName") == null) {
		response.sendRedirect("index.jsp");
	}
%>
 
 
  when jstl is not enough what will u do  ? 
  
   custom Tag will come into picture. 


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
			Welcome ${userName}
			<!-- El engine will search this attribute in all 4 scope one by one. 
			               1:-pageScope
			               
			
			         -->


			!!

			<div align="right">


				<c:if test="${ not empty cartInfo}">
				Cart(  <a href="viewCartDetails.htm"> ${cartInfo.size()}</a>)
				 </c:if>

				<!-- if else condition in jstl -->
				<%-- 		  <c:choose>
				    <c:when test=""></c:when>
				    <c:otherwise></c:otherwise>
				  </c:choose>
		 --%>

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
					<c:forEach var="product" items="${productList}">
						<tr>
							<td>${product.productName}</td>
							<td>${product.price}</td>
							<td><input type="checkbox" name="selectedProducts" value="${product.productId}"></td>
						</tr>
					</c:forEach>
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