<%@page import="project.vo.CustomerVo"%>
<%@page import="java.util.List"%>
<%@page import="project.dao.TblCustomerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>13_jdbc_jstl</title>
<style type="text/css">
table {
	width: 700px;
}

td {
	background-color: #d89cff;
	border: 5px solid gray;
	padding: 5px;
}
</style>
</head>
<body>
	<h3>2번 소스파일 스크립트릿 출력식을 jstl과 el로 변경하기</h3>
	<hr>
	<p>TblCustomerDao 메소드로 db접속 및 조회 결과 출력하는 연습</p>
	<hr>


	<%
	TblCustomerDao dao = new TblCustomerDao();
	List<CustomerVo> list = dao.allCustomer();
	pageContext.setAttribute("list", list);
	%>
	<table>
	<!-- el 기호에서 지정된 이름 list 에트리뷰트를 가져오는 동작 : 
			pageContext.getAttribute(list); 실행하기 -->
		<c:forEach items="${list}" var="vo" varStatus="status">
         <tr>
            <td><c:out value="${status.index + 1}" /></td>
            <td><c:out value="${fn:toUpperCase(vo.customId)}" /></td>
            <td><c:out value="${vo.name}" /></td>
            <td><c:out value="${vo.email}" /></td>
            <td><fmt:formatDate value="${vo.reg_date}" 
            				pattern="yyyy-MM-dd a HH:mm:ss" /></td>
         </tr>
      </c:forEach>
	</table>
</body>
</html>
<!-- 
	에트리뷰트 내용은 교재 : 111page
	jstl과 el은 교재 : 343 ~ 422page
	교재 422page taglib의 uri 가 다릅니다. (톰캣 버전 차이)
 -->
