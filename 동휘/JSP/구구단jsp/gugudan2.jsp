<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
		<style>
			tr {
				text-align: center;
			}
			
			td {
				border: 1px solid #cccccc;
			}
			#dan{
				background-color:skyblue;
			}
			
		</style>
	</head>
	<body>
		<table>
			<tr>
				<% for(int i=2; i<=9 ; i++){ %>
					<td id="dan"><% out.print(i+"단"); %></td>
				<% }  %>
			</tr>
			
				<% for(int i=1; i<=9 ;i++){ %>
					<tr>
					<% for(int j=2; j<=9; j++){ %>
						<td> <% 
						out.print(j + " x "+ i + " = "+(j*i)); %>
					<% } %>
				<% } %>
		</table>
	</body>
</html>