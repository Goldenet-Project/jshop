<#import "/resource/common_html_front.ftl" as html>
<#import "/indexMenu.ftl" as menu>
<@html.htmlBase>
	<@menu.menu selectMenu=""/>
<html>
  <body>  
<title>文件上传页面</title>
  <body>  
<div align="center">  
  
<h1>上传文件</h1>  
<form method="post" action="${basepath}/manage/fileOut/fileUpLoad.do" enctype="multipart/form-data">  
<!-- 产品的主键id隐藏域 -->
<input type="hidden" name="productId" id="" value="${productId}"/>
<input type="file" id="fileUp" name="file"/>  
<button type="submit" id="toUpLoad" method="fileUpLoad" class="btn btn-success">提交
</button>  
<button id="" onclick='javascript:history.back(-1);' class="btn btn-warning">
       			返回
   		</button>
</form>  
</div>  
</body>  
</html>
<<script type="text/javascript">
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