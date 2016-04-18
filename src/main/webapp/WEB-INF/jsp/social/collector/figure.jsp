<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
<script>
$(document).ready(function(){
	collectorMenuBar();
	getRankList('../social/selectA20.do');
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
	<%@ include file="/WEB-INF/jsp/social/nav.jsp" %>

    <header class="intro-header">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-xs-12">
                    <img src="../img/figure.jpg"/ style="margin-top:80px;">
                </div>
            </div>
        </div>
    </header>

    <content>
    </content>
    <%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>