<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/css/select.css"/>
</head>
<body>
	<h3>구매 전체 조회</h3>
	<hr>
	<ul>
		<c:forEach items="${list}" var="vo" varStatus="status">
			<li>
				<ul class="row">
					<li><c:out value="${fn:toUpperCase(vo.CUSTOMID)}" /></li>
					<li><c:out value="${vo.PCODE}" /></li>
					<li><c:out value="${vo.QUANTITY}" /></li>
					<li><fmt:formatDate value="${vo.buy_date}"
							pattern="yyyy-MM-dd a HH:mm:ss" /></li>
				</ul>
			</li>
		</c:forEach>
		</ul>
</body>
</html>