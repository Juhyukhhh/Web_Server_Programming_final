<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header class="header">
		<ul class="header_menu">
			<c:choose>
				<c:when test="${sessionScope.principal != null}">
					<li class="menu_list"><a href=".javascript:void(0)">${sessionScope.principal.name} 님</a></li>
					<li class="menu_list"><a href="./user?cmd=logout">로그아웃</a></li>
				</c:when>
				<c:otherwise>
					<li class="menu_list"><a href="./signin/signin.jsp">개인 로그인</a></li>
					<li class="menu_list"><a href="./signin/signin.jsp">관리자 로그인</a></li>
					<li class="menu_list"><a href="./signup/signup.jsp">회원가입</a></li>
				</c:otherwise>
			</c:choose>
			<li class="menu_list"><a href="javascript:void(0)">LANGUAGE</a></li>
			<li class="menu_list"><a class="search"
				href="javascript:void(0)">검색</a></li>
			<li class="menu_search">
				<div class="form">
					<input type="text" placeholder="검색어를 입력해주세요." />
					<button></button>
				</div>
			</li>
		</ul>
		<div class="header_list">
			<a href="/Travel_GURU"> <img class="header_logo"
				src="./images/header_logo/logo_1.png" alt="logo" />
			</a>
			<ul>
				<li><a href="javascript:void(0)">모델</a></li>
				<li><a href="javascript:void(0)">장바구니</a></li>
				<li><a href="javascript:void(0)">찜하기</a></li>
				<li><a href="javascript:void(0)">고객지원</a></li>
				<li><a href="javascript:void(0)">이용약관</a></li>
				<li><a href="./intro.jsp">회사소개</a></li>
			</ul>
		</div>
	</header>
</body>
</html>