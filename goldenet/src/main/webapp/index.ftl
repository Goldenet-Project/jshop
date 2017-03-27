<#import "/resource/common_html_front.ftl" as html/>
<#import "/indexMenu.ftl" as menu/>
<#import "/index_productList.ftl" as indexProduct/>
<@html.htmlBase>
<meta property="qc:admins" content="50702666757625530706654" />
<meta property="wb:webmaster" content="28e244326adb6a77" />
<style type="text/css">
.alert123{
/* 	padding: 10px; */
	margin-bottom: 5px;margin-top: 10px;margin-right: -15px;
}
.product_css{
	height: 200px;border: 0px solid #ccc;
}
.left_product{
	font-size: 12px;max-height: 35px;overflow: hidden;text-overflow: ellipsis;-o-text-overflow: ellipsis;
}
img{border: 0px;}

.thumbnail_css{
	border-color: red;
}
img.err-product {
<#if systemSetting().defaultProductImg??>
background: url("${systemSetting().defaultProductImg}"") no-repeat 50% 50%;
</#if>
.lazy {
  display: none;
}
</style>

	<@menu.menu/>
	<div class="container" >
		<div class="row">
			<!-- 左侧导航栏、热卖商品、文章、事项 -->
			<div class="col-xs-3" style="margin-top: -15px;width:22%">
				<#include "/catalog_superMenu.ftl">
				</br>
				
				<#--<#include "/productlist_left_picScroll.ftl">-->
				
			</div>
			<!-- 右侧。滚动图片、新闻活动、首页商品展示 -->
			<div class="col-xs-9" style="margin-top: -10px;width:78%">
				<div class="row">
					<div class="col-xs-9" style="width:65%"><#--轮播图-->
							<div class="row" style="border:0px solid red;padding: 5px;">
								<#include "/index_center_slide.ftl"/>
							</div>
					</div>
					<div class="col-xs-3" style="width:35%"><#--新闻活动--> <!-- 公告新闻 -->
							<div class="row" style="border:0px solid red;padding: 5px;">
								<#include "/index_notice_slide.ftl"/>
							</div>
					</div>
				</div>
			<#--	
				<@indexProduct.indexProduct queryType="hot" productList=systemManager().hotProducts title="热门商品" />
				<@indexProduct.indexProduct queryType="sale" productList=systemManager().saleProducts title="特价商品" />
			-->
			</div>
			
			
		</div>
	</div>
<script>
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