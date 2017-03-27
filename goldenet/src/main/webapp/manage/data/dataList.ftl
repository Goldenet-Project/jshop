<#import "/manage/tpl/pageBase.ftl" as page>
<@page.pageBase currentMenu="数据列表">
<form action="${basepath}/manage/data" id="form" name="form" namespace="/manage" theme="simple" enctype="multipart/form-data" method="post">
						<a href="toAdd" class="btn btn-success" style="margin-bottom:2px">
							<i class="icon-plus-sign icon-white"></i> 添加
						</a>
   <table class="table table-bordered table-hover">
			<tr style="background-color: #dff0d8">
				<th>数据名称</th>
				<th>购买数</th>
				<th>数据量</th>
				<th>价格</th>
				<th width="60px">操作</th>
			</tr>
			<#list pager.list as item>
				<tr>
					<td>${item.dataName!""}</td>
					<td>${item.dataSizeOfUpload!""}</td>
					<td>${item.price!""}</td>
					<td >${item.purchaseAmount!""}</td>
					<td><a href="toEdit?id=${item.id}">编辑</a></td>
				</tr>
			</#list>
			<tr>
				<td colspan="55" style="text-align: center;">
					<#include "/manage/system/pager.ftl"/></td>
			</tr>
		</table>
	
</form>

<script>
$(function() {
	
	})
	</script>
</@page.pageBase>