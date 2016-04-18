<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
<style>
html,body{height:100%}
body{margin:0}
#body{min-height:100%}
#content{padding-bottom:1.9em}
#foot{margin-top:-1.9em;height:1.9em}
.bar-chart{display: inline-block;  margin-right: 1px;  background-color: hotpink;}
.analysisDiv{}
.tag a{color:blue;}
.tag{font-size:17px}
.nav{width:100%}
.placeName{font-size:21px;}
</style>
<script>
$(document).ready(function(){
	var ajaxUrl = 'placeCategory/selectLDLocation.do';
	$.ajax({
    	url: ajaxUrl,
    	type: 'post',
        success: function(data){
			showMapReduce(data);
        },
        error : function(){	alert('쁑');	},
        complete : function(){
        	$('#instafeed').css('height','auto');
        }
        
	});   
});

function showMapReduce(Object){
	$.each(Object.map, function(key,value){
		var htmlText = '<div class="analysisDiv col-xs-12 col-sm-2 col-md-2 col-lg-2">';
		htmlText += '<strong class="placeName">'+value[0].NAME+'</strong>';
		
		$.each(value, function(key,data){
			
			htmlText += '<p class="tag"><a target="_blank" href="https://www.instagram.com/explore/tags/'+data.TAG+'/" style="color:#125688">#'+data.TAG+'</a> | '+data.COUNT+'</p>';
			
		});
		
		htmlText += '</div>';
		
		$('#instafeed').append(htmlText);
	})
}
</script>

</head>
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp" %>
	
    <div class="container">
    	<div class="m_head">이 주의 데이트 장소</div>
        <div class="line"></div>
    </div>
	
	<div class="page-wrap">
        <div class="container" style="padding:10px 0 10px 0"><!-- width: 1148px; -->
    		<div id="instafeed"  class="grid" style="width:104%;padding:0;margin:0" >
    		
    		</div>
     	</div>
    </div>
	
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>