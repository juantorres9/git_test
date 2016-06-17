<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page  d'acueille</title>
<%@ include file="fictiveList.jsp" %>

<h1 class="h1"><c:out value="BONJOUR à la page  JDBC"/></h1>
</head>
<body>
<!--<c:forEach var="msm" items="pageScope.messages" >
<p>Iteration:<c:out value="${msm}"/> </p> 
</c:forEach>-->
</body>

</html>