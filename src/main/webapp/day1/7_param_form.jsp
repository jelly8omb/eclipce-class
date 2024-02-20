<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>7_param_form</title>
</head>
<body>
	<h3>테이블 행 조호ㅣ에 필요한 조건값(name, age)을 input 에 입력하고 전송</h3>
	<hr>
	<form action="6_selectBy.jsp" method="get">
	<input type="text" name="name" placeholder="이름을 입력하세요." required>
	<input type="number" name="age" placeholder="나이을 입력하세요." required>
	<button>조회</button>
	<!-- 기본 type = submit. 클릭하면 action 에 지정된 url로 전송 
		form method="get"(기본값) 이면 파라미턱ㅏ url 에 포함됩니다.
		실행하면 url 확인. 4번 실행 url과 같음.
	-->
	</form>
</body>
</html>