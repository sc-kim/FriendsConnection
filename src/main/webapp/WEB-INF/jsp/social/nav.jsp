<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <nav class="navbar navbar-default navbar-custom navbar-fixed-top" style="background:rgba(0,0,0,0.6);padding:0">
        <div class="container-fluid">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="../home.do" style="padding:10px 0 0 15px;margin-top:5px;"><img src="<c:url value='/img/logo.png'/>" style="max-width:100%;height:32px"/></a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="overflow-x: hidden;padding-left:20px">
                <ul class="nav navbar-nav navbar-right">
                	<li>
                		<input type="text" id="tag" class="form-control" style="margin-top:14px;color:red" name="tag" placeholder="해쉬태그검색" onKeyUp="if(event.keyCode == 13) instaFeed()" />
					</li>
                    <li><a href="../entertainer.do" class="m-style">이 주의 이슈연예인</a></li>
                    <li><a href="../place.do" class="m-style">이 주의 핫스팟</a></li>
                    <li><a href="../food.do" class="m-style">이 주의 맛스타그램</a></li>
                    <li><a href="../social.do" class="last-m-style">친해지길바래</a></li>
                </ul>
            </div>
        </div>
    </nav>    