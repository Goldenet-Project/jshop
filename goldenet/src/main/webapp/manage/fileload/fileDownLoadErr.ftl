<#import "/resource/common_html_front.ftl" as html>
<#import "/indexMenu.ftl" as menu>
<@html.htmlBase>
	<@menu.menu selectMenu=""/>
<html>
  <body>  
<div align="center">  
  
<h1>文件下载发生错误</h1>  
<#if msg?exists>
<span>${msg!""}</span>
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