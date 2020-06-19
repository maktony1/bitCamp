<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<%
		String id=request.getParameter("uid");
		String pass=request.getParameter("upass");
		String hobby[]=request.getParameterValues("hobby");
		String subject=request.getParameter("subject");
		String protocol=request.getParameter("protocol");
	%>
		
		아이디: <% out.print(id); %><br>
		비밀번호: <% out.print(pass); %><br>
		취미: [<% for(int i=0; i<hobby.length;i++){
					if(i < (hobby.length-1) ){
						out.print(hobby[i]+", "); 
					}else{
						out.print(hobby[i]);
					}
				} %>]<br>
		
		과목: <% out.print(subject); %><br>
		프로토콜: <% out.print(protocol); %><br>
		
		
	</body>
</html>