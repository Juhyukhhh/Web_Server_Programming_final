<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Travel_GURU</title>

    <meta property="og:type" content="website" />
    <meta property="og:site_name" content="현대자동차" />
    <meta property="og:title" content="현대자동차" />
    <meta
      property="og:description"
      content="현대자동차 공식 홈페이지에 오신것을 환영합니다. 현대자동차의 최신 차량 정보부터 인기모델들을 확인하실 수 있습니다."
    />
    <meta property="og:image" content="./images/header_logo/logo.png" />
    <link rel="icon" href="/favicon.ico" type="image/x-icon" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css"
    />
    <link
      rel="stylesheet"
      href="https://unpkg.com/swiper/swiper-bundle.min.css"
    />
    <link rel="stylesheet" href="https://unpkg.com/swiper/css/swiper.min.css">
    <link rel="stylesheet" href="./css/main.css" />
    <link rel="stylesheet" href="./css/body.css" />
    <link rel="stylesheet" href="./css/footer.css" />
    <script defer src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script defer src="./js/main.js"></script>
    <script defer src="./js/body.js"></script>
  </head>
  <body>
  <jsp:include page="./layout/header.jsp" />
  <jsp:include page="./main/banner_test.jsp" />
	<section>
    <div class="section_1">
      <h2>이달의 구매 혜택</h2>
      <div class="swiper-container">
        <div class="swiper-wrapper">

          <div class="swiper-slide">
            <ul>
              <li class="list_card">
                <h4 class="list_title">아반떼</h4>
                <img src="">
                <div class="list_contents">최대 75만 할인</div>
                <div class="list_sub">Save Auto 30만</div>
                <div class="list_button">
                  <button>혜택 보기</button>
                  <button>구매 상담 신청</button>
                </div>
              </li>
              <li class="list_card">
                <h4 class="list_title">아반떼 Hybrid</h4>
                <img src="">
                <div class="list_contents">최대 75만 할인</div>
                <div class="list_sub">Save Auto 30만</div>
                <div class="list_button">
                  <button>혜택 보기</button>
                  <button>구매 상담 신청</button>
                </div>
              </li>
              <li class="list_card">
                <h4 class="list_title">쏘나타</h4>
                <img src="">
                <div class="list_contents">최대 190만 할인</div>
                <div class="list_sub">Save Auto 30만</div>
                <div class="list_button">
                  <button>혜택 보기</button>
                  <button>구매 상담 신청</button>
                </div>
              </li>
              <li class="list_card">
                <h4 class="list_title">쏘나타 Hybrid</h4>
                <img src="">
                <div class="list_contents">최대 90만 할인</div>
                <div class="list_sub">Save Auto 30만</div>
                <div class="list_button">
                  <button>혜택 보기</button>
                  <button>구매 상담 신청</button>
                </div>
              </li>
            </ul>
          </div>

        </div>
        <div class="swiper-pagination"></div>
      </div>
    </div>
    </section>

    <section class="section_2">
      <div class="body_banner">
        <button></button>
      </div>
    </section>

    <section class="section_3">
      <div class="event_container">
        <h4>현대자동차 소식</h4>
        <ul class="event_tag">
          <a href="javascript:void(0)"><li>#All</li></a>
          <a href="javascript:void(0)"><li>#STARIA_Lounge</li></a>
          <a href="javascript:void(0)"><li>#현대자동차</li></a>
          <a href="javascript:void(0)"><li>#Hyundai_N</li></a>
          <a href="javascript:void(0)"><li>#TheFutureofMobility</li></a>
          <a href="javascript:void(0)"><li>#about_hyundai</li></a>
          <a href="javascript:void(0)"><li>#친환경</li></a>
          <a href="javascript:void(0)"><li>#BTS</li></a>
          <a href="javascript:void(0)"><li>#IONIQ</li></a>
        </ul>

        <div class="sns_container">
          <ul class="sns">
            <li>
              <a href="javascript:void(0)">
                <img src="./images/sns/hqdefault.jpg" alt="sns">
                <span class="main">SNS</span>
                <div class="sns-hover"></div>
              </a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <img src="./images/sns/hqdefault (1).jpg" alt="sns">
                <span class="main">SNS</span>
              </a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <img src="./images/sns/hqdefault (2).jpg" alt="sns">
                <span class="main">SNS</span>
              </a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <img src="./images/sns/hqdefault (3).jpg" alt="sns">
                <span class="main">SNS</span>
              </a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <img src="./images/sns/hqdefault (4).jpg" alt="sns">
                <span class="main">SNS</span>
              </a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <img src="./images/sns/hqdefault (5).jpg" alt="sns">
                <span class="main">SNS</span>
              </a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <img src="./images/sns/hqdefault (6).jpg" alt="sns">
                <span class="main">SNS</span>
              </a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <img src="./images/sns/hqdefault (7).jpg" alt="sns">
                <span class="main">SNS</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </section>
    <jsp:include page="./layout/footer.jsp" />
  </body>
</html>
