<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="customCoreRt" uri="http://www.mycustomtag.htm/core_tag_rt" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <c:set var="start" value="34"></c:set>
 <c:set var="end" value="50"></c:set>

 <customCoreRt:output ></customCoreRt:output>
 Output tag must have executed. 
    
      
  
   <customCoreRt:myForEach   start="${start }" end="${end}">
   
      <a href="http://www.google.co.in?q=${output}" title="search it on google">${output}</a>
   
   </customCoreRt:myForEach>
 
 
 
 
</body>
</html>