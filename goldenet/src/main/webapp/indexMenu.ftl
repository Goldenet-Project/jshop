<#macro menu selectMenu="0">

<style type="text/css">
.centerImageCss{
	width: 289px;
	height: 190px;
}
.title {
	display: block;
	width: 280px;
	overflow: hidden; /*注意不要写在最后了*/
	white-space: nowrap;
	-o-text-overflow: ellipsis;
	text-overflow: ellipsis;
}
body{
	padding-top: 0px;
  	padding-bottom: 0px;
	font-size: 12px;

}
.top{
	margin-bottom:15px;
	z-index:111;
	width:1100px;
	border:none;
	float:center;
	width:1150px;
}

.navbar-nav>li>a{
	color:#00BBFF;
}
</style>

<style>
.hotSearch{
	cursor: pointer;
}
</style>
<a name="toTop" id="toTop"></a>
<!-- 顶部导航条 -->
<div id="header" style="height:35px;font-size:15px;background-color:#f8f8f8;text-align:right;width:100%" >
	<a href="${basepath}/activity.html" >
					<#if currentAccount()??>
                        <span id="myshopMenuPPP" style="display: inline-block;z-index: 9999;position: relative;;">
		          			<!-- 会员中心的菜单 -->
		          			<span style="margin-top: 0px;">
							  <a data-toggle="dropdown" style="display: block;margin-top: 0px;">
                                  <span class="glyphicon glyphicon-user"></span>&nbsp;用户中心
                                  (${currentAccount().nickname})
                                  <span class="caret" style="display: inline-block;"></span>
                              </a>
							  <ul class="dropdown-menu" id="myshopMenu" role="menu" style="display: none;margin-top: 0px;">
                                  <li><a href="${basepath}/account/account"><span class="glyphicon glyphicon-user"></span>&nbsp;个人资料</a></li>
                                  <li><a href="${basepath}/account/topwd"><span class="glyphicon glyphicon-screenshot"></span>&nbsp;修改密码</a></li>
                                  <li class="divider"></li>
                                  <li><a href="${basepath}/account/orders"><span class="glyphicon glyphicon-th"></span>&nbsp;我的订单</a></li>
                                   <li><a href="${basepath}/account/score"><span class="glyphicon glyphicon-asterisk"></span>&nbsp;我的积分</a></li>
                                  <li><a href="${basepath}/account/address"><span class="glyphicon glyphicon-send"></span>&nbsp;配送地址</a></li>
                                  <li><a href="${basepath}/account/favorite"><span class="glyphicon glyphicon-tags"></span>&nbsp;收藏夹</a></li>
                                  <li class="divider"></li>
                                  <li><a href="${basepath}/account/exit"><span class="glyphicon glyphicon-pause"></span>&nbsp;退出系统</a></li>
                              </ul>
							</span>
		          		</span>
		          		<span style="display: none;">
							${currentAccount().nickname!""}
		          			(${currentAccount().loginType!""})
		          		</span>
					<#else >    
	<div style="padding-top:3px;padding-right:50px;height:30px">   
	<a href="${basepath}/account/login" style="color:#00aeff;">登陆</a> |
	<a href="${basepath}/account/register" style="color:#ff7a32">注册</a>
	<div>
	</#if>
</div>


<div class="container" style="min-height: 10px;margin-top:20px;margin-bottom:5px;border: 0px solid red;">
		<div class="row">
			<div class="col-xs-3" style="text-align:left">
				<a href="${systemSetting().www}/index"><img style="max-height: 50px;" alt="myshop-logo" src="${systemSetting().log}"/></a>
			</div>
			<div class="col-xs-6" style="border: 0px solid blue;padding-top: 5px; float: right;">
				<!-- search查询输入框 -->
				<div class="search">
					<form class="form-inline" role="form" name="searchForm" id="searchForm" method="post" action="${basepath}/search.html" >
                    <input type="text" class="form-control"  placeholder="请输入关键字" style="width:200px;border-color:#00BBFF" >
                  <button class="btn">  
       				 <span class="glyphicon glyphicon-search" style="" ></span>   
   				 </button> 
				 </form>
				</div>
				<div style="text-align: right; margin-top: 0;color: #7700BB ; font-size: 0.1px; padding-right: 68px;">
					<#list systemManager().hotqueryList as item>
                        <a class="hotSearch" href="${item.url}" target="_blank" style="color:#FF8888">
							${item.key1!""}&nbsp;
                        </a>
					</#list>
				</div>
			</div>
			<div class="col-xs-3" style="height: 100%;">
		    	<div class="row" style="height: 100%;">
					<#if currentAccount()??>
                        <span id="myshopMenuPPP" style="display: inline-block;z-index: 9999;position: relative;;">
		          			<!-- 会员中心的菜单 -->
		          			<span style="margin-top: 0px;">
							  <a data-toggle="dropdown" style="display: block;margin-top: 0px;">
                                  <span class="glyphicon glyphicon-user"></span>&nbsp;用户中心
                                  (${currentAccount().nickname})
                                  <span class="caret" style="display: inline-block;"></span>
                              </a>
							  <ul class="dropdown-menu" id="myshopMenu" role="menu" style="display: none;margin-top: 0px;">
                                  <li><a href="${basepath}/account/account"><span class="glyphicon glyphicon-user"></span>&nbsp;个人资料</a></li>
                                  <li><a href="${basepath}/account/topwd"><span class="glyphicon glyphicon-screenshot"></span>&nbsp;修改密码</a></li>
                                  <li class="divider"></li>
                                  <li><a href="${basepath}/account/orders"><span class="glyphicon glyphicon-th"></span>&nbsp;我的订单</a></li>
                                   <li><a href="${basepath}/account/score"><span class="glyphicon glyphicon-asterisk"></span>&nbsp;我的积分</a></li>
                                  <li><a href="${basepath}/account/address"><span class="glyphicon glyphicon-send"></span>&nbsp;配送地址</a></li>
                                  <li><a href="${basepath}/account/favorite"><span class="glyphicon glyphicon-tags"></span>&nbsp;收藏夹</a></li>
                                  <li class="divider"></li>
                                  <li><a href="${basepath}/account/exit"><span class="glyphicon glyphicon-pause"></span>&nbsp;退出系统</a></li>
                              </ul>
							</span>
		          		</span>
		          		<span style="display: none;">
							${currentAccount().nickname!""}
		          			(${currentAccount().loginType!""})
		          		</span>
					<#else >
		          		
					</#if>
		    	</div>
			</div>
	
	</div>
</div>

<div class="top" style="">
      <div class="container" style="padding-bottom:10px">
        <div class="navbar-left" style="text-align:center;;width:17%" >
        <!-- <a class="navbar-brand" href="${systemSetting().www}/index" style="font-weight: bold;margin-left:25px;color:#009FCC">数据分类</a>-->
	          <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
        </div>
        <div class="navbar-right" style="text-align: center;width:77%" id="navbar-right" >
			 <ul class="nav navbar-nav" style="padding-left:40px" >
	          		<!-- 首页 -->
						<#if selectMenu=="0">
                            <li class="active"><a class="topTitle" href="${systemSetting().www}/index"><b>首页</b></a></li>
						<#else>
                            <li><a  class="topTitle" href="${systemSetting().www}/index"><b>首页</b></a></li>
						</#if>
						<li class=""><a class="topTitle" href="${basepath}/menu/data1.ftl"><b>API</b></a></li>
						<li class=""><a class="topTitle" href="${basepath}/menu/data2.ftl""><b>热门活动</b></a></li>
					<!-- 类别作为菜单显示 -->	
				</ul>
		          <ul class="nav navbar-nav navbar-right" style="display: block;">
		          	<!-- 促销活动 
					<li class="${(selectMenu=="activity")?string("active","")}">
						<a href="${basepath}/activity.html" >
						<span class="glyphicon glyphicon-time"></span>
						<b>促销活动</b></a>
					</li>-->
					<!-- 积分商城 
						<li class="${(selectMenu=="score")?string("active","")}"><a href="${basepath}/activity/score.html" >
							<b>积分商城</b></a>
						</li>-->
					<!-- 团购活动 -->
					<#if false>
						<li class="${(selectMenu=="tuan")?string("active","")}"><a href="${basepath}/activity/tuan.html" >
							<b>团购活动</b></a>
						</li>
					</#if>
		          </ul>
        </div>
      
      </div>
    </div>
<script type="javascript">
//搜索商品
function search(){
	var _key = $.trim($("#key").val());
	if(_key==''){
		return false;
	}
	$("#searchForm").submit();
}
</script>
</#macro>