<#import "/manage/tpl/pageBase.ftl" as page>
<@page.pageBase currentMenu="新增数据">
<form action="${basepath}/manage/data/" id="form" name="form" namespace="/manage" theme="simple"  method="post" enctype="multipart/form-data">

 		<input type="hidden" value="${e.id!""}" name="id" label="id" id="id"/>
		   <div class="row form-horizontal"-role="form">
				  <div class="form-group col-md-6">
	                        <label class="col-md-4 control-label">数据名称</label>
	                        <div class="col-md-8">
	                        	<input type="text"  value="${e.dataName!""}" name="dataName"
	                          	data-rule="数据名称;required;dataName;"  maxlength="40" id="dataName" />
	                        </div>
	              </div>
	                <div class="form-group col-md-6">
	                        <label class="col-md-4 control-label">数据量(采集)</label>
	                        <div class="col-md-8">
	                        	<input type="text"  value="${e.dataSizeOfCollect!""}" name="dataSizeOfCollect"
	                          	data-rule="数据量;required;dataSizeOfCollect;"  maxlength="40" id="dataSizeOfCollect" />
	                          	
	                          	
	                       
	                        </div>
	              </div>
	               <div class="form-group col-md-6">
	                        <label class="col-md-4 control-label">价格</label>
	                        <div class="col-md-8">
	                        	<input type="text"  value="${e.price!""}" name="price"
	                          	data-rule="价格;required;price;"  maxlength="40" id="price" />
	                        </div>
	              </div>
	               <div class="form-group col-md-6">
	                        <label class="col-md-4 control-label">版权</label>
	                        <div class="col-md-8">
	                        	<input type="text"  value="${e.copyRight!""}" name="copyRight"
	                          	data-rule="版权;required;copyRight;"  maxlength="40" id="copyRight" />
	                        </div>
	              </div>
	               <div class="form-group">
                        <label class="col-md-2 control-label">描述</label>
                        <div class="col-md-10">
							<textarea name="description" class="form-control" rows="3" id="description"
									  data-rule="描述;required;description;length[4~500];">${e.description!""}</textarea>
                        </div>
                    </div>
	            <div class="form-group">
                        <label class="col-md-2 control-label">数据上传</label>
                        <div class="col-md-10">
                               <input type="text"  value="${e.dataHdfsUrl!""}" name="dataHdfsUrl" type="text" id="dataHdfsUrl"  style="width: 600px;"/>
                               <input type="file" name="file" value="浏览数据" class="" onchange="inputFileOnChange()"/>
                        </div>
                    </div>
	              
	            <div>
	              <#if e.id??>
	              	 <button method="update" class="btn btn-success">
                    <i class="icon-ok icon-white"></i> 修改
               	  </button>
               	 <#else>
               	  <button method="insertData" class="btn btn-success">
                    <i class="icon-ok icon-white"></i> 保存
               	  </button>
		        </#if>
		       
		        </div>
</form>

<script>
	$(function() {
	
	})
	
};
     
	</script>
</@page.pageBase>