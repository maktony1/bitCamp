<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>제목</td>
				<td>날짜</td>
				<td>히트</td>
			</tr>
			<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.bId}</td>
				<td>${dto.bName}</td>
				<td>
					<c:forEach begin="1" end="${dto.bindent}">-</c:forEach>
					<a href="content_view.do?bId=${dto.bId}"> ${dto.bTitle}</a>
				</td>			
				<td>${dto.bDate}</td>
				<td>${dto.bHit}</td>
			</tr>
			</c:forEach>
			
			<tr>
				<td colspan="5"> <a href="list.do">초기화면</a>	</td>
			</tr>
		</table>
	</body>
</html>