<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
		<style type="text/css">
			#backcolor{
				background: #ccccff;}
			td{
				width:auto;	
				text-align: center;
			}
		
		</style>
	</head>
	<body>
		<%
		out.print("<table border>");
				out.print("<tr>");
				for(int j=2 ; j <=9; j++){
					out.print("<td id=backcolor>"+j+"단"+"</td>");
				}
				out.print("</tr>");
			for(int i=1 ; i <=9; i++){
				out.print("<tr>");
				for(int j=2 ; j <=9; j++){
					out.print("<td>"+j+" * "+i+" = "+(i*j)+"\t\t"+"</td>");
				}
				out.print("<tr>");
			}
		out.print("</table>");
		%>
	</body>
</html>

