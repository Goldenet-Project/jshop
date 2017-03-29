<!-- 首页通知切换卡 -->
<style type="text/css">
		/* css 重置 */
/* 		*{margin:0; padding:0; list-style:none; } */
/* 		body{ background:#fff; font:normal 12px/22px 宋体;  } */
/* 		img{ border:0;  } */
/* 		a{ text-decoration:none; color:#333;  } */
/* 		a:hover{ color:#1974A1;  } */


		/* 本例子css */
.slideTxtBox{ width:100%; border:1px solid #ddd; text-align:left;  }
.slideTxtBox *{margin:0; padding:0; list-style:none;}
.slideTxtBox .hd{ height:30px; line-height:30px; background:#f4f4f4; padding:0 20px; border-bottom:1px solid #ddd;  position:relative;  }
.slideTxtBox .hd ul{ float:left; position:absolute; left:20px; top:-1px; height:32px;   }
.slideTxtBox .hd ul li{ float:left; padding:0 15px; cursor:pointer;  }
.slideTxtBox .hd ul li.on{ height:30px;  background:#fff; border:1px solid #ddd; border-bottom:2px solid #fff; }
.slideTxtBox .bd ul{ padding:15px;  zoom:1;  }
/* 		.slideTxtBox .bd li{ height:24px; line-height:24px;    */
/* 			display: block; */
/* 			width: 200px; */
/* 			overflow: hidden; /*注意不要写在最后了*/ */
/* 			white-space: nowrap; */
/* 			-o-text-overflow: ellipsis; */
/* 			 */
/* 		} */
.slideTxtBox .bd li .date{ float:right; color:#999;  }
#productdetailDiv img{max-width: 670px;}
</style>
		<div class="slideTxtBox">
			<div class="hd">
				<ul><li>数据详情</li><li>数据样例</li><li>支付须知</li></ul>
			</div>
			<div class="bd">
				<ul>
					<br>
					<!-- 商品HTML信息 -->
					<div class="row">
						<div class="col-xs-12">
							<div style="border: 0px solid; text-align: left;" id="productdetailDiv">
								${e.productHTML!""}
							</div>
						</div>
					</div>
				</ul>
				
			
					
					<!------------------------------------------------------------------------------------->
					<ul>
						<div class="row">
								<div class="col-xs-12">
										<ul class="media-list">
									  		<li class="media">
									    		<span class="pull-left" href="#">
											    数据样例数据样例数据样例数据样例数据样例
											    </span>
											    <div class="media-body">
											       数据样例数据样例数据样例
											    </div>
											  </li>
											</ul>
								</div>
							<div class="col-xs-12">
									<ul class="media-list">
									  <li class="media">
									    <span class="pull-left" href="#">
									    数据样例数据样例数据样例数据样例数据样例
									    </span>
									    <div class="media-body">
									       数据样例数据样例数据样例
									    </div>
									  </li>
									</ul>
							</div>
							<div class="col-xs-12">
									<ul class="media-list">
									  <li class="media">
									    <span class="pull-left" href="#">
									    数据样例数据样例数据样例数据样例数据样例
									    </span>
									    <div class="media-body">
									       数据样例数据样例数据样例
									    </div>
									  </li>
									</ul>
							</div>
					</ul>
			<!------------------------------------------------------------------------------------->	
				<ul>
					<div class="row">
							<div class="col-xs-12">
									<ul class="media-list">
									  <li class="media">
									    <span class="pull-left" href="#">
									    这里是支付须知
									    </span>
									    <div class="media-body">
									      
									           支付须知支付须知支付须知支付须知支付须知支付须知
									    
									    </div>
									  </li>
									</ul>
							</div>
				</ul>
		<!------------------------------------------------------------------------------------->	
			</div>
		</div>
