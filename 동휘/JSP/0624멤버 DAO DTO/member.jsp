<%@page import="java.util.ArrayList"%>
<%@page import="edu.bit.ex.dao.*"%>
<%@page import="edu.bit.ex.dto.*"%>
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
			MemberDAO memberDAO = new MemberDAO();
			ArrayList<MemberDTO> dtos = memberDAO.memberSelect();
		
			for(int i=0; i<dtos.size(); i++){
				MemberDTO dto =dtos.get(i);
				
				String name =dto.getName();
				String id =dto.getId();
				String pw =dto.getPw();
				String phone =dto.getPhone1()+" - "+dto.getPhone2()+" - "+dto.getPhone3();
				String gender =dto.getGender();
				
				out.println("이름 : " + name + ", 아이디 : " + id + ", 비밀번호 : " + pw + ", 연락처 : " + phone + ",  성별 : " + gender + "<br />" );
			}
		
		
		%>
	</body>
</html>