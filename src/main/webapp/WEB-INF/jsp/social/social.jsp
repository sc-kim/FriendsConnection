<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
<script>
$(document).ready(function(){
	getRankList('social/selectSocialAllList.do');
});

function instaSearch(Object){
	$.each(Object.list , function(key,value){
		var apiUrl = 'https://api.instagram.com/v1/users/' + value.USER_ID + '/media/recent?access_token='+TOKEN;
		
		$.ajax({
			url: apiUrl,
			dataType: 'jsonp',
			success: function(Object){
				
				var htmlText =   '<div class="insta-box grid-item">';
				htmlText += '		<div class="image-layer">';
				htmlText += '			<img src="'+Object.data[0].images.low_resolution.url+'"/>'; 
				htmlText +='		</div>';
				htmlText += '		<div class="caption-layer" onclick="showModal(\''+Object.data[0].id+'\')" >';
				htmlText += '			<p class="insta-caption">'+ Object.data[0].caption.text+'</p>';
				htmlText += '      	<span class="insta-likes">'+Object.data[0].likes.count+' Likes</span>';
				htmlText += '		</div>';
				htmlText += '</div>';				
			   	
			   	$('#instafeed').append(htmlText);
				
			},
			error : function(){	alert('instaSearch - 쁑');	},
			complete : function(){
				$(".insta-box").hover(function(){  
					$(this).find(".caption-layer").css({"backbround" : "rgba(255,255,255,0.7)", "display":"block"});  
				}, function(){
					$(this).find(".caption-layer").css({"display":"none"});  
				});
			}
		});
	});   
}
</script>
</head>
<body style="background:#e7e7e7">
    <nav class="navbar navbar-default navbar-custom navbar-fixed-top" style="background:rgba(0,0,0,0.6);padding:0">
        <div class="container-fluid">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home.do" style="padding:10px 0 0 15px"><img src="<c:url value='/img/logo.png'/>" style="max-width:100%;height:32px"/></a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="overflow-x: hidden;padding-left:20px">
                <ul class="nav navbar-nav navbar-right">
                	<li>
                		<input type="text" id="tag" class="form-control" style="margin-top:14px;color:red" name="tag" placeholder="해쉬태그검색" onKeyUp="if(event.keyCode == 13) instaFeed()" />
					</li>
                    <li><a href="entertainer.do" class="m-style">이 주의 이슈연예인</a></li>
                    <li><a href="place.do" class="m-style">이 주의 핫스팟</a></li>
                    <li><a href="food.do" class="m-style">이 주의 맛스타그램</a></li>
                    <li><a href="social.do" class="last-m-style">친해지길바래</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <header class="intro-header" style="background: url('img/bg1.jpg') 0 0 no-repeat;background-size:cover">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <div class="site-heading">
                        <h1>친해지길바래</h1>
                        <hr class="small">
                        <span class="subheading">Finding Our Common Interests.</span>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <content>
    	<div class="container">
	        <div class="row">
	             <div class="col-lg-12 col-md-12 col-xs-12">
	                 <div class="top-menu">
	                     <ul>
	                         <li class="w25"><a href="social/collector.do">컬렉터</a></li>
	                         <li class="w25"><a href="social/pet.do">반려동물</a></li>
	                         <li class="w25"><a href="social/culture.do">문화공연</a></li>
	                         <li class="w25"><a href="social/beauty.do">뷰 티</a></li>
	                     </ul>
	                 </div>    
	             </div>
		             
				<div class="col-lg-12 col-md-12 col-xs-12">
                </div>
                    
	            <div class="col-lg-12 col-md-12 col-xs-12">
                   	<div class="txt-center">
                       	<img src="img/tit.png"/>
                	</div>
                </div>
	            <div class="friend-bottom">
          			<div class="container" style="padding:10px 0 10px 0">
                        <div id="instafeed" class="grid" style="width:104%;padding:0;margin:0" >
                                
                    	</div>
                	</div>
          		</div>
			</div>
 		</div>
    </content>
    <%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>