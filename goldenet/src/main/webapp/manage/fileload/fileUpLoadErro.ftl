<#import "/resource/common_html_front.ftl" as html>
<#import "/indexMenu.ftl" as menu>
<@html.htmlBase>
	<@menu.menu selectMenu=""/>
<html>
  <title>文件上传失败页面 </title>
  <body>  
<div align="center">  
  
<h1>文件上传发生错误</h1>  
 <#if errMsg?exists>
<span>${errMsg!""}</span>
</#if>

<br>
		<button id="" onclick='javascript:history.back(-1);' class="btn btn-warning">
       			返回
   		</button>
</div>  
</body>  
</html>
</@html.htmlBase>
</div>