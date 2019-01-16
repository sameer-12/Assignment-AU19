<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>




</head>
<body>
	<h1>hello</h1>
	<p>
		what is 2 *3

		<%@
	include file="sample.jsp"%>


		<%=2 * 3%></p>

	<p>
		Is 2 greter than 1
		<%=2 > 1%>
	</p>
	<%!int var = 5;

	int getAge() {
		return var;
	}%>
	<p>
		<%
			Date d = new Date();
			out.println(d);
		%>
	</p>
	<p>My age is</p>
	<%
		for (int i = 0; i < 5; i++)
			out.println(i);
	%>

	<c:set var="num" value="${10}" />
	<c:out value="${num}">
	</c:out>
	<c:if test="${num1 % 2==0 }">
		<c:out value="this is an even number" />
	</c:if>
	<c:choose>
		<c:when test="${num1 > num2 }">
			<c:out value="${num1 is lesser than num2 }"/>
		</c:when>
		<c:otherwise>
			<c:out value="num2 is lesser than num1"/>
		</c:otherwise>
	</c:choose>

</body>
</html>