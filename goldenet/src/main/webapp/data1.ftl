<#import "/resource/common_html_front.ftl" as html>
<#import "/indexMenu.ftl" as menu>
<@html.htmlBase>
<style type="text/css">
img{border: 0px;}

.thumbnail_css{
	border-color: red;
}
.attr_css{
	font-size: 100%;
	float: left;
}
.left_product{
	font-size: 12px;max-height: 35px;overflow: hidden;text-overflow: ellipsis;-o-text-overflow: ellipsis;
}
.lazy {
  display: none;
}
</style>
<script type="text/javascript">
function defaultProductImg(){ 
	var img=event.srcElement; 
	img.src="${systemSetting().defaultProductImg!""}";
	img.onerror=null; //控制不要一直跳动 
}
</script>
	<@menu.menu selectMenu=""/>
	<div class="container">
	
		<div class="row">
			
			<div class="col-xs-3" style="margin-top: -15px;">
					<#include "/catalog_superMenu.ftl"/>
					</br>
					<#include "/productlist_left_picScroll.ftl"/>
			</div>			
			<div class="col-xs-9">
				<!-- 导航栏 -->
				数据菜单待开发，敬请期待！
			</div>
		</div>
	</div>
	
<script type="text/javascript">
$(function() {
	//商品鼠标移动效果
	$("div[class=thumbnail]").hover(function() {
		$(this).addClass("thumbnail_css");
	}, function() {
		$(this).removeClass("thumbnail_css");
	});
});
</script>
</@html.htmlBase>