function getRankList(ajaxUrl){
	$.ajax({
    	url: ajaxUrl,
    	type: 'post',
        success: function(data){
			instaSearch(data);
        },
        error : function(){	alert(' getRankList - 쁑');	} 
	});   
}

function collectorMenuBar(){
	var html='';
	html += '	<div class="container">' ;
	html += '		<div class="row">';
	html += '			<div class="col-lg-12 col-md-12 col-xs-12">';
	html += '				<div class="top-menu">'; 
	html += '					<ul>'; 
	html += '						<li class="w25"><a href="../social/lego.do">레고</a></li>';
	html += '						<li class="w25"><a href="../social/figure.do">피규어</a></li>';
	html += '						<li class="w25"><a href="../social/shoes.do">운동화</a></li>';
	html += '						<li class="w25"><a href="../social/plamodel.do">프라모델</a></li>';
	html += '					</ul>';
	html += '				</div>';
	html += '			</div>';
	html += '			<div class="friend-bottom">';
	html += '				<div class="container" style="padding:10px 0 10px 0">';
	html += '					<div id="instafeed" class="grid" style="width:104%;padding:0;margin:0">';
	html += '					</div>';
	html += '				</div>';
	html += '			</div>';
	html += '		</div>';
	html += '	</div>';
	
	$('content').append(html);
}

function petMenuBar(){
	var html = '';
	html += '	<div class="container">';
	html += '		<div class="row">';
	html += '			<div class="col-lg-12 col-md-12 col-xs-12">';
	html += '				<div class="top-menu">';
	html += '					<ul>';
	html += '						<li style="width:33%"><a href="../social/dog.do">강아지</a></li>';
	html += '						<li style="width:33%"><a href="../social/cat.do">고양이</a></li>';
	html += '						<li style="width:34%"><a href="../social/etc.do">기 타</a></li>';
	html += '					</ul>';
	html += '				</div>';
	html += '			</div>';
	html += '			<div class="friend-bottom">';
	html += '				<div class="container" style="padding:10px 0 10px 0">';
	html += '					<div id ="instafeed" class="grid" style="width:104%;padding:0;margin:0">';
	html += '					</div>';
	html += '				</div>';
	html += '			</div>';
	html += '		</div>';
	html += '	</div>';
    
	$('content').append(html);
}

function cultureMenuBar(){
	var html = '';
	html += '	<div class="container">';
	html += '		<div class="row">';
	html += '			<div class="col-lg-12 col-md-12 col-xs-12">';
	html += '				<div class="top-menu">';
	html += '					<ul>';
	html += '						<li class="w20"><a href="../social/book.do">독 서</a></li>';
	html += '						<li class="w20"><a href="../social/music.do">음 악</a></li>';
	html += '						<li class="w20"><a href="../social/drawing.do">그 림</a></li>';
	html += '						<li class="w20"><a href="../social/board.do">보 드</a></li>';
	html += '						<li class="w20"><a href="../social/picture.do">사 진</a></li>';
	html += '					</ul>';
	html += '				</div>';
	html += '			</div>';
	html += '			<div class="friend-bottom">';
	html += '				<div class="container" style="padding:10px 0 10px 0">';
	html += '					<div id="instafeed" class="grid" style="width:104%;padding:0;margin:0">';
	html += '					</div>';
	html += '				</div>';
	html += '			</div>';
	html += '		</div>';
	html += '	</div>';
                    
	$('content').append(html);
}

function beautyMenuBar(){
	var html = '';
	html += '	<div class="container">';
	html += '		<div class="row">';
	html += '			<div class="col-lg-12 col-md-12 col-xs-12">';
	html += '				<div class="top-menu">';
	html += '					<ul>';
	html += '						<li class="w25"><a href="../social/skincare.do">스킨케어</a></li>';
	html += '						<li class="w25"><a href="../social/makeup.do">메이크업</a></li>';
	html += '						<li class="w25"><a href="../social/nail.do">네 일</a></li>';
	html += '						<li class="w25"><a href="../social/diet.do">다이어트</a></li>';
	html += '					</ul>';
	html += '				</div>';
	html += '			</div>';
	html += '			<div class="friend-bottom">';
	html += '				<div class="container" style="padding:10px 0 10px 0">';
	html += '					<div id="instafeed" class="grid" style="width:104%;padding:0;margin:0">';
	html += '					</div>';
	html += '				</div>';
	html += '			</div>';
	html += '		</div>';
	html += '	</div>';
	
	$('content').append(html);
}

/*
 * modal 띄우고 좌,우 초기화 후 좌: 사진 우:좋아요 누른 사람 보여줌
 */
function showModal(docId){
	$('#modalLeft').html('');
	$('#modalRight').html('');
	var mediaUrl = 'https://api.instagram.com/v1/media/' +docId + '?access_token='+TOKEN;

	$.ajax({
		url: mediaUrl,
		dataType: 'jsonp',
		success: function(Object){
			var htmlText ='';
			htmlText += '<a target="_blank" href="'+Object.data.link+'">';
			htmlText += '		<img src="'+Object.data.images.low_resolution.url+'"/>'; 
			htmlText += '</a>';
			htmlText += '<p style="margin:10px 0;font-size:15px;">'+Object.data.caption.text+'</p>';
			
			if(Object.data.tags.length){
				$.each(Object.data.tags,function(key,value){
					htmlText += '<a target="_blank" href="https://www.instagram.com/explore/tags/'+value+'/" style="margin:10px 0;font-size:15px;color:#125688">#'+value+'</a>';	
				})
			} 
			
			htmlText += '<span class="insta-likes" style="font-size:15px;">좋아요 '+Object.data.likes.count+' 개</span>';	
		   		 
		   	$('#modalLeft').append(htmlText);
			
		} 
	});

	var mediaLikesUrl = 'https://api.instagram.com/v1/media/' +docId + '/likes?access_token='+TOKEN;

	$.ajax({
		url: mediaLikesUrl,
		dataType: 'jsonp',
		success: function(Object){
			$.each(Object.data, function(key,value){
				if( 20 < key ){
					return false;
				}else{
					var htmlText = ''; 
					htmlText += '<p style="margin:8px 0"><span><a target="_blank" href="https://www.instagram.com/'+value.username+'">';
					htmlText += '<img src="'+value.profile_picture+'" class="modal-profile"/></a></span>'+value.username+'</p>';				
	
					$('#modalRight').append(htmlText);
				}
			});
		} 
	});

	$('#myModal').modal('show');
}

/*
 * 해쉬태그로 검색
 */
function instaFeed(){
	var search = $('#tag').val();
	console.log('검색어 = '+search);
	$('#instafeed').html('');
	var insta = new Instafeed({
		target : 'instafeed',
		accessToken : TOKEN,
		get: 'tagged',
		tagName: search, 
		clientId: clientId,
		template: item,
		resolution : 'low_resolution',
		after: function() {
			$(".grid-item").hover(function(){  
				$(this).find(".caption-layer").css({"backbround" : "rgba(255,255,255,0.7)", "display":"block"});  
			}, function(){
				$(this).find(".caption-layer").css({"display":"none"});  
			});  
		}
	});
	insta.run();
}