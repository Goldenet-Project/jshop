<#import "/resource/common_html_front.ftl" as html>
<#import "/indexMenu.ftl" as menu>
<@html.htmlBase>
	<@menu.menu selectMenu=""/>
<html>
  <body>  
<title>选择文件进行下载</title>
<div>  
  
<table class="table table-bordered table-condensed">
			<tr>
				<th style="text-align: center;">文件名称</th>
				<th style="text-align: center;">文件大小</th>
				<th style="text-align: center;">文件类型</th>
				<th style="text-align: center;">操作</th>
			</tr>
			<#list fileList as item>
				<tr>
					<td style="text-align: center;">${item.fileName!""}</td>
					<td style="text-align: center;">${item.fileSize!""} kb</td>
					<td style="text-align: center;">${item.fileType!""}</td>
					<td style="text-align: center;">
					<span>
					<a href="Download?id=${item.id!""}">下载</a>
					</span>
					</td>
				</tr>
			</#list>
			</table>
<button id="" onclick='javascript:history.back(-1);' class="btn btn-warning">
       			返回
   		</button>
</div>  
</body>  
</html>
<script type="text/javascript">
//点击提交按钮验证文件是否选择
$('#toUpLoad').click(function(){
	//获取文件的值
	var fileN=$('#fileUp').val();
	//判断文件是否选择
	if(fileN!=null && fileN!=""){
		return true;	
	}else{
		alert("请先选择文件在进行上传");
		return false;
	}
});
</script>
</@html.htmlBase>
</div>