<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <link rel="stylesheet" href="${rc.contextPath}/css/weui.css"/>
    <link rel="stylesheet" href="${rc.contextPath}/css/weuix.css"/>

    <script src="${rc.contextPath}/js/zepto.min.js"></script>
    <script src="${rc.contextPath}/js/swipe.js"></script>
    <script>
        $(function(){
            $('#slide1').swipeSlide({
                autoSwipe:true,//自动切换默认是
                speed:3000,//速度默认4000
                continuousScroll:true,//默认否
                transitionType:'cubic-bezier(0.22, 0.69, 0.72, 0.88)',//过渡动画linear/ease/ease-in/ease-out/ease-in-out/cubic-bezier
                lazyLoad:true,//懒加载默认否
                firstCallback : function(i,sum,me){
                    me.find('.dot').children().first().addClass('cur');
                },
                callback : function(i,sum,me){
                    me.find('.dot').children().eq(i).addClass('cur').siblings().removeClass('cur');
                }
            });

            $('#slide2').swipeSlide({
                autoSwipe:true,//自动切换默认是
                speed:3000,//速度默认4000
                continuousScroll:true,//默认否
                transitionType:'cubic-bezier(0.22, 0.69, 0.72, 0.88)',//过渡动画linear/ease/ease-in/ease-out/ease-in-out/cubic-bezier
                lazyLoad:true,//懒加载默认否
                firstCallback : function(i,sum,me){
                    me.find('.dot').children().first().addClass('cur');
                },
                callback : function(i,sum,me){
                    me.find('.dot').children().eq(i).addClass('cur').siblings().removeClass('cur');
                }
            });
            $('#slide3').swipeSlide({
                autoSwipe:true,//自动切换默认是
                speed:3000,//速度默认4000
                continuousScroll:true,//默认否
                transitionType:'ease-in'
            });



        })
    </script>
<style>
#slide1{height:300px;}
</style>
</head>

<body ontouchstart>
<div class="container">
    <div class="page-hd">
        <h1 class="page-hd-title">
               今天的主题是：我爱你
        </h1>
    </div>

    <div class="slide" id="slide1" style="max-width:95%;max-height:90%;height:89%;">
        <ul>
            <li>
                <a href="javascript:;">
                    <img src='${rc.contextPath}/images/2.jpg' alt="">
                </a>
                <div class="slide-desc">有佳人兮,见之不忘,一日不见兮,思之若狂。</div>
            </li>
            <li>
                <a href="javascript:;">
                    <img src='${rc.contextPath}/images/3.jpg' alt="">
                </a>
                <div class="slide-desc">愿得一人心,白头不相离。</div>
            </li>
            <li>
                <a href="javascript:;">
                    <img src='${rc.contextPath}/images/4.jpg' alt="">
                </a>
                <div class="slide-desc">相期相就复何日,此时此夜难为情。</div>
            </li>
        </ul>
        <div class="dot">
            <span></span>
            <span></span>
            <span></span>
        </div>
    </div>
    

    <br>
    <br>
</div>

</body>
</html>