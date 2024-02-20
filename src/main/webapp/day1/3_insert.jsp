<%@page import="project.dao.TblCustomerDao"%>
<%@page import="project.vo.CustomerVo"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3_insert</title>
</head>
<body>
<p>2번 select 조회 결과 확인과 같이 이번에는 insert 실행</p>
<%
	CustomerVo vo = new CustomerVo("sanaa","김사나","sana@gmail.com",23,null);
	//dao 생성
	TblCustomerDao dao = new TblCustomerDao();
	dao.join(vo);
%>
	
	<h4>CustomerVo 객체</h4>
	<table style="width:600px">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
			<th>나이</th>
			<th>가입날짜</th>
		</tr>
		<tr>
			<td><%= vo.getCustomId() %></td>
			<td><%= vo.getName() %></td>
			<td><%= vo.getEmail() %></td>
			<td><%= vo.getAge() %></td>
			<td><%= vo.getReg_date() %></td>
		</tr>
	</table>
	<p></p>
	<a href="2_jdbc.jsp">전체 고객 조회</a>
</body>
</html>
<!-- 단축키 : 실행: Ctrl + F11		저장: Ctrl + S
			전체 화면 토글: Ctrl + M	되돌리기: Ctrl + Z
			잘라내기: Ctrl + X	복사: Ctrl + C
			붙여넣기: Ctrl + V	모두 선택: Ctrl + A
			파일 찾기: Ctrl + Shift + R	변수 찾기: Ctrl + Shift + T
			자동 코드 정렬: Ctrl + Shift + F	메소드 추출: Alt + Shift + M
			변수 추출: Alt + Shift + L	디버그 시작/중지: F11
			다음 줄로 이동: F6		현재 메소드로 이동: Ctrl + R, Ctrl + T
			프로젝트 열기: Ctrl + Shift + R	에디터 창 사이 이동: Ctrl + F6
			빌드: Ctrl + B
 -->