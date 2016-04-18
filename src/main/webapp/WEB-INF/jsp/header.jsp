<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<!-- 상단 로고부분 시작 -->
	<header>
		<div class="container header_pd">
			<div class="con_left">
				<a href="home.do"><img src="img/logo.png" alt="상단로고"></a>
			</div>
		</div>
	</header>
	<!-- 상단 로고부분 끝 -->

	<!-- 네비게이션 시작 -->
	<nav class="navbar navbar-default">
		<div class="container">
			<!-- 모바일용으로 변환되었을 경우 -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#defaultNavbar1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<!-- 컨텐츠 -->
			<div class="collapse navbar-collapse"  id="defaultNavbar1">
				<ul id="tabs" class="nav navbar-nav">
					<li class="out1" onmouseover="mOver(this,'over1')" onmouseout="mOut(this)"><a href="entertainer.do">이 주의 이슈 연예인<span class="sr-only">(current)</span></a></li>
					<li class="out1" onmouseover="mOver(this,'over2')" onmouseout="mOut(this)"><a href="place.do">이 주의 데이트 장소</a></li>
					<li class="out1" onmouseover="mOver(this,'over3')" onmouseout="mOut(this)"><a href="food.do">이 주의 맛스타그램</a></li>
					<li class="out1" onmouseover="mOver(this,'over4')" onmouseout="mOut(this)"><a href="social.do">친해지길 바래!</a></li>
				</ul>
			</div>
			<!-- 컨텐츠 끝 -->
		</div>
	</nav>
	<!-- 네비게이션 끝 -->