<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- language="java" : java 언어로 컴파일 된다.
	contentType="text/html; charset=UTF-8" : 응답으로 만들어질 형식은 html
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 - WELCOME</title>
</head>
<body>
	<h1>WELCOME</h1>
    <h3>회원 가입이 완료되었습니다.</h3>
    
<!-- java 프로그래밍을 하는 스크립트 작성 부분입니다.(스크립트릿) -->
<%
	// form 태그 태그안의 입력방식이 서버로 제출될 때, 그 값을 받아 저장하는 코드입니다.
	// getParameter 메소드이므로 앞으로는 입력 요소를 파라미터라고 부른다.
	
	//아이디, input 요소의 name 속성값을 인자로 합니다.
	String id = request.getParameter("userid");	
	String password = request.getParameter("password");
	String username = request.getParameter("name");
	String useremail = request.getParameter("email");
	String userPhone = request.getParameter("phoneNumber");
	String birth = request.getParameter("myBirth");
	
	out.print("<h3>아이디</h3>");
	out.print(id);
	
	out.print("<h3>비밀번호</h3>");
	out.print(password);
	
	out.print("<h3>이름</h3>");
	out.print(username);
	
	out.print("<h3>이메일</h3>");
	out.print(useremail);
	
	out.print("<h3>전화번호</h3>");
	out.print(userPhone);
	
	out.print("<h3>생년월일</h3>");
	out.print(birth);
	
	
%>
	<hr>
    <p>form 제출 확인 페이지 입니다.</p>
</body>
</html>