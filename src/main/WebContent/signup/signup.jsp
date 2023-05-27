<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "customer.*"%>
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
			<form name="joinForm" onsubmit="return join()">
		        <input name="id" placeholder="아이디" type="text" required/>
		        <button type="button" onclick="idCheck()" class="checkId">중복체크</button>
		        <input name="idDuplication" type="text" value="idUncheck"/><br>
		        <input name="password" placeholder="비밀번호" type="password" required><br>
		        <input name="password2" placeholder="비밀번호 확인" type="password" required><br>
		        <input name="name" placeholder="이름" type="text" required/><br>
		        <input name="email" placeholder="Email" type="email" required/><br>
		    	<input name="phone" placeholder="휴대폰 번호" type="text" required/><br>
				<input name="address" placeholder="주소" type="text" required/><br>
		        <button type="submit">회원가입</button>
			</form>
		</div>
	</section>
	<jsp:include page="../layout/footer.jsp" />
</body>
<script type="text/javascript">
	function join() {
		var joinForm = document.joinForm;
		var pwd = joinForm.password.value;
		var pwd2 = joinForm.password2.value;
		
		console.log(joinForm.idDuplication.value);
		
		if (joinForm.idDuplication.value != "idCheck") {
			alert("아이디 중복체크를 해주세요");
		}
		else if (pwd != pwd2) {
			alert("비밀번호를 동일하게 입력해주세요");
			joinForm.password2.focus();
		}
		else {		
			joinForm.method = "post";
			joinForm.action = "../user?cmd=join";
		}
	}
	
	function idCheck() {
		var joinForm = document.joinForm;
		var id = joinForm.id.value;
		
		if (id.length == 0 || id == "") {
			alert("아이디를 입력해주세요");
			joinForm.id.focus();
		} else {
			window.open("../user?cmd=idCheck&user_id=" + id, "hiddenFrame")
		}
	}
	
	function setIdUncheck() {
		document.joinForm.idDuplication.value = "idUncheck";
	}
</script>
</html>