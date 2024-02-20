<%@page import="project.vo.CustomerVo"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1_basic</title>
</head>
<body>
<p>jsp에서는 html 태그와 함계 자바 명령이 작성, 변수 출력 등을 할 수 있습니다.</p>
<%
	//자바에서 다루었던 배열, 리스트 컬렉션, VO 객체를 선언
	String[] names = {"사나","나연","모모","쯔위","다현"};
	List<String> list = List.of("사나","나연","모모","쯔위","다현");
	CustomerVo vo = new CustomerVo("sana","김사나","sana@gmail.com",23,null);
%>
	<h4>배열 names</h4>
	<ul>
		<!-- 여기에 names 배열 요소값을 자바 코드 사용하여 반복 출력 -->
<%
	for(int i=0;i<names.length;i++){	//for start
%>
	<li><%= names[i] %></li>
<%
	}	//for end
%>
	</ul>
	<hr>
	<h3>컬렉션</h3>
	<ul>
<%
	for(int i=0;i<list.size();i++){	//for start
%>
	<li><%= list.get(i) %></li>
<%
	}	//for end
%>		
	</ul>
	<hr>
	<table style="width:500px">
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