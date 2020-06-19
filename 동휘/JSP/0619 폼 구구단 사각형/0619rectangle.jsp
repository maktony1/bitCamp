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
			String str_width = request.getParameter("width");
			String str_height = request.getParameter("height");
			
			int width=Integer.parseInt(str_width);
			int height=Integer.parseInt(str_height);
			
			RectangleArea rec = new RectangleArea(width,height);
			
			out.print(rec.getArea());
		%>
	
	</body>
</html>