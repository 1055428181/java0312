<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	
  </head>
  
  <body>
 
   	<c:forEach items="${list }" var="m" >
   		归属地：${m.mobileArea}
   	</c:forEach>
   ${mobile.mobileArea }
  
  
  </body>
</html>
