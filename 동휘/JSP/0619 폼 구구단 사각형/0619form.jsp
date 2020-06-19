<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="0619form_receive.jsp" method="get">
			이름:<input type="text" name="uname"> <br/>
			아이디:<input type="text" name="uid"> <br/>
			비밀번호:<input type="password" name="npass"><br/>
			취미:
			<input type="checkbox" name="hobby" value="book">독서 
			<input type="checkbox" name="hobby" value="cook">요리 
			<input type="checkbox" name="hobby" value="jogging">조깅 
			<input type="checkbox" name="hobby" value="swim">수영 
			<input type="checkbox" name="hobby" value="sleep">취침 <br/>
			
			<input type="radio" name="subject" value="kor">국어
			<input type="radio" name="subject" value="eng" checked="checked">영어
			<input type="radio" name="subject" value="math">수학
			<input type="radio" name="subject" value="design">디자인<br/>
			
			<select name="protocol">
				<option value="ftp">ftp</option>
				<option value="UDP">UDP</option>
			</select>
			<br/>
			
			<input type="submit"> <input type="reset">
			
			
			
		</form>
	
	</body>
</html>