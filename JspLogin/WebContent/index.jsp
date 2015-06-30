<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <%--  <% if(session.getAttribute("errorMsg")!=null) { %>

 --%>
 
      <span style="color: red;">${errorMsg}</span> 


   <%--   <% 
    session.removeAttribute("errorMsg");
      } %> --%>

 <form action="LoginServlet.htm" method="post">
User name : <input name="userName" type="text"> <br>
Password <input name="userPassword" type="password"><br>
 <input type="submit" value="Login">
 </form>
</body>
</html>