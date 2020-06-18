<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page import="edu.bit.ex.*" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
			

		<%
			RectArea re = new RectArea(request.getParameter("width"),request.getParameter("height")); 
		%>
		<%
			int result=re.getArea();
			out.println(result);
		%>
	</body>
</html>