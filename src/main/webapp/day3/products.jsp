<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 전체 조회</title>
<link rel="stylesheet" href="assets/css/select.css"/>
</head>
<body>
	<h3>상품 전체 조회</h3>
	<hr>
	<ul>
	<c:forEach items="${list}" var="vo" varStatus="status">
		<li>
			<ul class="row">
				<li><c:out value="${vo.category}" /></li>
				<li><c:out value="${vo.pcode}" /></li>
				<li><c:out value="${vo.pname}" /></li>
				<li><c:out value="${vo.price}" /></li>
			</ul>
		</li>
	</c:forEach>
	</ul>
</body>
</html>