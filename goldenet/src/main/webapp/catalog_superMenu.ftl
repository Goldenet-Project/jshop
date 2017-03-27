<#--左侧导航栏、热卖商品、文章、事项-->
<link rel="stylesheet"
	href="${basepath}/resource/js/superMenu/css/css.css"
	type="text/css">
<style type="text/css">
#sidebar .hover {
    border-top: 1px solid #33CCFF;
    border-bottom: 1px solid #33CCFF;
}

#sidebar .i-list {
    border: 1px solid #33CCFF;
}

</style>

<div id="sidebar" style="width:85%;height:500px">
	<#list systemManager().catalogs as item>
       <div class="sidelist">
			<span>
				<h3 style="height:60px;line-height:50px">
					<a href="${basepath}/catalog/${item.code}.html" style="line-height:50px;color:#00BBFF;font-weight:bold">${item.name}</a>
				</h3>
			</span>
			<div class="i-list">
				<ul>
					<#if item.children??>
						<#list item.children as sItem>
						<li>
		          			<a href="${basepath}/catalog/${sItem.code}.html">${sItem.name}</a>
						</li>
						</#list>
					</#if>
				</ul>
				<div style="clear: both;"></div>
				
				<#if item.superMenuProducts??>
					<div style="border-top: 1px solid #AAAAAA;clear: both;" class="hotText">
						<div style="font-weight: bold;padding-top: 5px;padding-bottom: 5px;">推荐热卖：</div>
						<#list item.superMenuProducts as pItem>
							<div style="margin-top: 5px;">
								&gt;<a title="${pItem.name}" target="_blank" href="${basepath}/product/${pItem.id}.html">
									${pItem.name}
								</a>
							</div>
						</#list>
					</div>
				</#if>
			</div>
		</div>
	</#list>
</div>