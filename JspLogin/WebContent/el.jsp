<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	User name from session : ${userName}
	<br> ${ 3 gt 2 }
	<br> ${3 ge 4 }
	<br> ${3+8 }
	<br> 3%2=${3%2 }
	<br> 3>2=${3 >2 }
	<br> null=${null}
	<br>
	  ${session.userName} //not valid
	  ${request.userName } //not valid
	  
	<!-- here i am writing comment which will go to browser userName : ${userName} <c:set var="a" value="hello" scope="session"></c:set> -->
	
	<%-- here i am wirting comment which is not going to browser side ${hellowWorkd}  --%>
	
	 
	 <c:set var="userDemo" value="<b><script> window.alert('hii'); </script>  Dummy User name</b>"></c:set>
	
	 <c:choose>
	   <c:when test="${not empty userName}">
	     When statement will be executed.
	   </c:when>
	    <c:otherwise>
	       Otherwise statement is executed.
	    </c:otherwise>
	 </c:choose>
	  <c:catch>
	   <% int x=2/0; %>
	  </c:catch>
	   
	    <br>
	    <br>
  <c:out value="${userDemo}" escapeXml="true"></c:out>
  <c:import url="welcome.jsp"></c:import>
   <jsp:forward page="">
    <jsp:param value="" name=""/>   
   </jsp:forward>
 
</body>
</html>