<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
<style>
.nav {width:100%;}
</style>
<script>
$(document).ready(function(){
	getRankList('entertainer/selectEntertainerRankList.do');
});

function instaSearch(Object){
	$.each(Object.list , function(key,value){
		var apiUrl = 'https://api.instagram.com/v1/users/'+ value.USER_ID +'/media/recent?access_token='+TOKEN+'&count=1';
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
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp" %>
	
    <div class="container">
    	<div class="m_head">이 주의 이슈 연예인</div>
        <div class="line"></div>
    </div>
	
	<div class="page-wrap">
        <div class="container" style="padding:10px 0 10px 0">
    		<div id="instafeed"  class="grid" style="width:104%;padding:0;margin:0" >
    		
    		</div>
     	</div>
    </div>
	
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>