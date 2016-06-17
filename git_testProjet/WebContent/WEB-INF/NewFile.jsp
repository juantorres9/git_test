
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Map,java.util.List ,java.util.ArrayList" %>
<%
List<String> messages = new ArrayList<String>();
messages.add("text1");
messages.add("text2");
messages.add("text3");
request.setAttribute("messages", messages);

%>

</body>
</html>