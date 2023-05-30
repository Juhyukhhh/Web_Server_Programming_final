<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<title>Swiper demo</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1" />
<!-- Link Swiper's CSS -->
<link rel="stylesheet"
	href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<!-- Demo styles -->
<style>
html, body {
	position: relative;
	height: 100%;
}

body {
	background: #eee;
	font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
	font-size: 14px;
	color: #000;
	margin: 0;
	padding: 0;
}

.swiper {
	width: 100%;
	height: 100%;
}

.swiper-slide {
	text-align: center;
	font-size: 18px;
	background: #fff;
	/* Center slide text vertically */
	display: -webkit-box;
	display: -ms-flexbox;
	display: -webkit-flex;
	display: flex;
	-webkit-box-pack: center;
	-ms-flex-pack: center;
	-webkit-justify-content: center;
	justify-content: center;
	-webkit-box-align: center;
	-ms-flex-align: center;
	-webkit-align-items: center;
	align-items: center;
}

.swiper-slide img {
	display: block;
	width: 100%;
	height: 100%;
	object-fit: cover;
}
</style>
</head>

<body>
	<section class="banner">
		<div class="swiper-container">
			<div class="swiper-wrapper">
				<div class="swiper-slide">
					<img src="./images/banners/1.png" />
					<div class="swiper__button">
						<button>GRANDEUR</button>
						<button>GRANDEUR Hybrid</button>
					</div>
				</div>
				<div class="swiper-slide">
					<img src="./images/banners/2.png" />
					<div class="swiper__button">
						<button>자세히 보기</button>
						<button>내 차 만들기</button>
					</div>
				</div>
				<div class="swiper-slide">
					<img src="./images/banners/3.png">
					<div class="swiper__button">
						<button>STARIA Lounge</button>
						<button>STARIA</button>
					</div>
				</div>
			</div>
			<div class="swiper-button-prev"></div>
			<div class="swiper-button-next"></div>
			<div class="swiper-scrollbar"></div>
		</div>

		<div class="log_bar">
			<span class="login_text">로그인 하시고 현대자동차의 편리하고 다양한 맞춤형 서비스를 이용해
				보세요. </span> <span class="login_text2"><a href="/signin/">로그인</a></span> <span
				class="login_text2"><a href="javascript:void(0)"></a>회원가입</a></span>
		</div>

	</section>
	<div class="tap_service">
		<div class="tap">
			<span>신차 구매 정보</span>
		</div>
		<div class="tap">
			<span>블루멤버스 및 차량 관리 정보</span>
		</div>
	</div>

	<!-- Swiper JS -->
	<script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

	<!-- Initialize Swiper -->
	<script>
      var swiper = new Swiper(".mySwiper", {
        spaceBetween: 30,
        centeredSlides: true,
        autoplay: {
          delay: 2500,
          disableOnInteraction: false,
        },
        pagination: {
          el: ".swiper-pagination",
          clickable: true,
        },
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev",
        },
      });

    </script>
</body>

</html>