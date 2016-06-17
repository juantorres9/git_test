<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Map,java.util.List ,java.util.ArrayList" %>
<%
List<String> messages = new ArrayList<String>();
messages.add("text1");
messages.add("text2");
messages.add("text3");
pageContext.setAttribute("messages", messages);
%>



</body>
</html>