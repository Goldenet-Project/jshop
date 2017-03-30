<#import "/resource/common_html_front.ftl" as html>
<#import "/indexMenu.ftl" as menu>
<@html.htmlBase>
<style type="text/css">
.totalPayMonery{
	color: red;font-weight: bold;font-size:22px;
}
</style>
<div id="wrap">
	<@menu.menu selectMenu=""/>
		<div class="container">
			<div class="row">
				<div class="col-xs-12" style="font-size: 14px;font-weight: normal;">
					
					<span class="label label-success" style="font-size:200% ;">
						支付成功
					</span>
					
				</div>
			</div>
			


</@html.htmlBase>