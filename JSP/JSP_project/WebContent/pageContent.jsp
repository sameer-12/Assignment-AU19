<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="EPdemo.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 Float no1 = new Float(62.5);
 Float no2 = new Float(41.5);
 pageContext.setAttribute("no2",no2);
 session.setAttribute("no1", no1);
 session.setAttribute("no2", no2); 
 out.print(session.getAttribute("no1"));
 out.print(session.getAttribute("no2"));
 
 
 
 %>
 <%
    int v = 5/0;
    out.print(v);
 %>
 
</body>
</html>