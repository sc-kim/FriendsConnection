<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<!-- Modal -->
    <div class="modal fade"  id="myModal"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    	<div class="modal-dialog">
        	<div class="modal-content">
          		<div class="modal-header">
            		<button type="button" class="close" data-dismiss="modal" aria-label="Close" style="margin-top:-8px"><span aria-hidden="true">&times;</span></button>
          		</div>
	          	<div class="modal-con" style="overflow-y:hidden">
	            	<div id="modalLeft" class="modal-left" style="margin-top:10px">
	                	 
	            	</div>
	            	
	            	<div id="modalRight" class="modal-right">
	                
	            	</div>
	          	</div>
	          	<div class="modal-footer">
	          	
	          	</div>
       		</div>
		</div>
	</div>	
	<!-- 하단 시작 -->
    <footer>
        <div class="site-footer">
            <div class="container header_pd">
                <div class="con_left">
                	<img src="<c:url value='/img/logo.png'/>" alt="하단로고"/>
                </div>
                <div class="con_right">
                	<p>COPYRIGHT ⓒ FRIENDS CONNECITON ALL RIGHTS RESERVED.</p>
                </div>
            </div>
        </div>
    </footer>
    <!-- 하단 끝 -->
    
    <script src="https://npmcdn.com/masonry-layout@4.0/dist/masonry.pkgd.js"></script>
    <script>
	    $('#myModal').on('show.bs.modal', function (e) {
			console.log('modal show');
			$('.modal-con').css('height','auto');
		});
	    
	    function mOver(obj,chacgeClass) {
	        obj.className = chacgeClass;	
	    }
	
	    function mOut(obj) {
	        obj.className = "out1"
	    }
	
	    $('.grid').masonry({
	      itemSelector: '.grid-item',
	      isFitWidth: true
	    });
    </script>