<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
		<style>
			#group {
				background-color: #d1d8ff;
				
				}
			td {
				width:200px; height:10px;
				border: 1px solid #cccccc;
				text-align: center;
				size: 50px;
				}
			header{
					font-size:100px;
					text-align: center;
					}
		
		</style>
	</head>
	<body>
				<%!
				
					Connection connection;
					Statement statement;
					ResultSet resultSet;
					
					String driver="oracle.jdbc.driver.OracleDriver";
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String uid = "scott";
					String upw = "tiger";
					String query = "select * from emp";
				
				%>
				<%
					try{
						Class.forName(driver);
						connection = DriverManager.getConnection(url,uid,upw);
						statement = connection.createStatement();
						resultSet = statement.executeQuery(query);
				%>
				<header> EMP table </header>
		<table>
			<tr id="group">
				<td>사원번호</td><td>이름</td><td>직책</td><td>매니저 번호</td><td>입사일</td><td>연봉</td><td>보너스</td><td>부서번호</td>
			</tr>
				<%
						while(resultSet.next()){
						%>
						<%
							String empno 	= resultSet.getString("empno");
							String ename 	= resultSet.getString("ename");
							String job   	= resultSet.getString("job");
							String mgr	 	= resultSet.getString("mgr");
							String hiredate = resultSet.getString("hiredate");
							String sal 		= resultSet.getString("sal");
							String comm		= resultSet.getString("comm");
							String deptno	= resultSet.getString("deptno");
						%>
						
							<tr>
								<td><%=empno%></td><td><%=ename%></td><td><%=job%></td><td><%=mgr%></td><td><%=hiredate%></td><td><%=sal%></td><td><%=comm%></td><td><%=deptno%></td>
						<% } %>
							</tr>
						
						<% 
					} catch(Exception e) {
					} finally {
						try{
							if(resultSet != null) resultSet.close();
							if(statement != null) statement.close();
							if(connection != null) connection.close();
						} catch(Exception e){}
					}
				%>
		</table>
		
		
	</body>
</html>