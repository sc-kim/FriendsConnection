<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/include/include-header.jspf"%>
</head>
<style>
.nav {	width: 100%;}
</style>
<body>
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
					<li class="out1" onmouseover="mOver(this,'over1')" onmouseout="mOut(this)"><a href="entertainer.do">이 주의 이슈연예인<span class="sr-only">(current)</span></a></li>
					<li class="out1" onmouseover="mOver(this,'over2')" onmouseout="mOut(this)"><a href="place.do">이 주의 핫스팟</a></li>
					<li class="out1" onmouseover="mOver(this,'over3')" onmouseout="mOut(this)"><a href="food.do">이 주의 맛스타그램</a></li>
					<li class="out1" onmouseover="mOver(this,'over4')" onmouseout="mOut(this)"><a href="social.do">친해지길바래!</a></li>
				</ul>
			</div>
			<!-- 컨텐츠 끝 -->
		</div>
	</nav>
	<!-- 네비게이션 끝 -->

	<!-- 슬라이드영역 시작 -->
	<div class="container-fluid">

		<ul class="bxslider">
			<li><a href="entertainer.do"><img src="images/pic1.jpg" /></a></li>
			<li><a href="place.do"><img src="images/pic2.jpg" /></a></li>
			<li><a href="food.do"><img src="images/pic3.jpg" /></a></li>
			<li><a href="social.do"><img src="images/pic4.jpg" /></a></li>
		</ul>

	</div>
	<!-- 슬라이드영역 끝 -->

	<!-- 하단 시작 -->
	<footer>
	<div class="site-footer">
		<div class="container header_pd">
			<div class="con_left">
				<img src="img/logo.png" alt="하단로고" />
			</div>
			<div class="con_right">
				<p>COPYRIGHT ⓒ FRIENDS CONNECITON ALL RIGHTS RESERVED.</p>
			</div>
		</div>
	</div>
	</footer>
	<!-- 하단 끝 -->

	<script>

    var tabs = document.getElementById("tabs");
    var classes = ['over1','over2','over3','over4'];
   
    function mOver(obj,chacgeClass) {
        obj.className = chacgeClass;	
    }

    function mOut(obj) {
        obj.className = "out1"
    }

    $(document).ready(function(){

        $('.bxslider').bxSlider({
            auto: true,
            autoControls: true,
            useCSS: false,
            onSliderLoad: function(currentIndex){
                var obj = tabs.childNodes[currentIndex+1];
                obj.className = classes[currentIndex];

            },
            onSlideNext: function($slideElement, oldIndex, newIndex){
                tabs.childNodes[(2*oldIndex)+1].className="out1";
                tabs.childNodes[(2*newIndex)+1].className = classes[newIndex];
            }
        });

    });
    </script>
</body>
</html>