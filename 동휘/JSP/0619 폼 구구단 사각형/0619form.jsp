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
			�̸�:<input type="text" name="uname"> <br/>
			���̵�:<input type="text" name="uid"> <br/>
			��й�ȣ:<input type="password" name="npass"><br/>
			���:
			<input type="checkbox" name="hobby" value="book">���� 
			<input type="checkbox" name="hobby" value="cook">�丮 
			<input type="checkbox" name="hobby" value="jogging">���� 
			<input type="checkbox" name="hobby" value="swim">���� 
			<input type="checkbox" name="hobby" value="sleep">��ħ <br/>
			
			<input type="radio" name="subject" value="kor">����
			<input type="radio" name="subject" value="eng" checked="checked">����
			<input type="radio" name="subject" value="math">����
			<input type="radio" name="subject" value="design">������<br/>
			
			<select name="protocol">
				<option value="ftp">ftp</option>
				<option value="UDP">UDP</option>
			</select>
			<br/>
			
			<input type="submit"> <input type="reset">
			
			
			
		</form>
	
	</body>
</html>