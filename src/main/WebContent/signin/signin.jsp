<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Travel_GURU</title>
<link rel="icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css" />
<link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<link rel="stylesheet" href="https://unpkg.com/swiper/css/swiper.min.css">
<link rel="stylesheet" href="../css/main.css" />
<link rel="stylesheet" href="../css/body.css" />
<link rel="stylesheet" href="../css/footer.css" />
<script defer src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
<script defer src="./js/main.js"></script>
<script defer src="./js/body.js"></script>
<link rel="icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="../css/signin.css" />
</head>
<body>
	<jsp:include page="../layout/header.jsp" />
	<section class="login">
		<div class="inner">
			<form method="post" action="../user?cmd=login">
				<div class="form">
					<label>이메일 로그인</label>
					<input name="id" type="text" placeholder="아이디" required/>
					<input name="password" type="password" placeholder="비밀번호" required/>
					<button type="submit">로그인</button>
				</div>
			</form>
			<div class="service">
				<a href="javascript:void(0)"><span>아이디 찾기</span></a> 
				<a href="javascript:void(0)"><span>비밀번호 초기화</span></a>
			</div>
			<div class="signin">
				<span>현대자동차 통합계정에 가입하지 않으셨나요?</span> <a href="javascript:void(0)">회원가입 ▶</a>
			</div>
		</div>
	</section>
	<jsp:include page="../layout/footer.jsp" />
</body>
</html>