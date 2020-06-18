<%@page import="edu.bit.ex.TriangleArea"%>
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
			String width=request.getParameter("width");
			String height=request.getParameter("height");
			TriangleArea tri = new TriangleArea(Integer.parseInt(width),Integer.parseInt(height));
			int result=tri.getArea();
			out.print(result);
		%>
	</body>
</html>