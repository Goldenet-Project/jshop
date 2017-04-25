<#import "/resource/common_html_front.ftl" as html>
<#import "/indexMenu.ftl" as menu>
<@html.htmlBase>
	<@menu.menu selectMenu=""/>
<html>
  <head>
  
    <base href="<%=basePath%>">
  </head>
  <title>上传成功页面</title>
  <body>  
<div align="center">  
<h1>文件上传成功</h1>  
<button id="" onclick='javascript:history.back(-1);' class="btn btn-warning">
       			返回
   		</button>
</div>  
</body>  
</html>
</@html.htmlBase>
</div>