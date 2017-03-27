<#import "/manage/tpl/pageBase.ftl" as page>
<@page.pageBase currentMenu="测试报表">
	

<script type="text/javascript" src="${basepath}/resource/echarts-1.3.5/echarts.js" >
</script>
 <div id="main" style="width: 600px;height:400px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '2015年地铁站高峰排行'
            },
            tooltip: {},
            legend: {
                data:['人流量']
            },
            xAxis: {
                data: ["立水桥","国贸","国贸","国贸"]
            },
            yAxis: {},
            series: [{
                name: '人数',
                type: 'bar',
                data: [4300398, 6828078, 6578986, 3252598]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>



</@page.pageBase>
