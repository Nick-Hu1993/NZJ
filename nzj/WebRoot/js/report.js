$(document).ready(function() {
	var monthArr = [];
 	var trainTolAmount = [];
 	var joinTolAmount = [];
 	var tolAmount = [];
 	var guestTolAmount = [];
 	var pieCleanerAmount = 0.0;//保洁员
 	var pieSisterAmount = 0.0;//育儿嫂
 	var pieNannyAmount = 0.0;//保姆
 	var pieMaternityAmount = 0.0;//月嫂
 	var pieOtherAmount = 0.0;//其他
 	var piejoinTolAmount = 0.0;//加盟返点
 	var pietraineeAmount = 0.0;//学费总额
 	var typeName = ['客户总金额','培训总金额','加盟返点','总金额'];
    $.ajax({
        type: "get",
        datatype:'json',
        url: "reportController/getTolAmountList",
        data: {
            userId: 1,
            rankId: 3
        },
        success: function(data) {
        		if(data){
        			//封装客户群总金额
        			joinGuestAmount(data.guestAmountList);
        			//封装培训&加盟总金额
        			joinTrainAmount(data.provinceTrainAmountList,data.cityTrainAmountList,data,data.provinceJoinAmountList,data.cityJoinAmountList);
        			//展示折线图
        			showAxis();
        		}
        }});
    
    /**
     * 展示折线图
     */
    var showAxis = function(){
    	option = {
    		    tooltip: {
    		        trigger: 'axis'
    		    },
    		    legend: {
    		        data:['客户总金额','培训总金额','加盟返点','总金额']
    		    },
    		    grid: {
    		        left: '3%',
    		        right: '4%',
    		        bottom: '3%',
    		        containLabel: true
    		    },
    		    toolbox: {
    		        feature: {
    		            saveAsImage: {}
    		        }
    		    },
    		    xAxis: {
    		        type: 'category',
    		        boundaryGap: false,
    		        data: monthArr
    		    },
    		    yAxis: {
    		        type: 'value'
    		    },
    		    series: [
    		        {
    		            name:'客户总金额',
    		            type:'line',
    		            stack: '总量',
    		            data:guestTolAmount
    		        },
    		        {
    		            name:'培训总金额',
    		            type:'line',
    		            stack: '总量',
    		            data:trainTolAmount
    		        },
    		        {
    		            name:'加盟返点',
    		            type:'line',
    		            stack: '总量',
    		            data:joinTolAmount
    		        },
    		        {
    		            name:'总金额',
    		            type:'line',
    		            stack: '总量',
    		            data:tolAmount
    		        }
    		    ]
    		};
    	// 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }
    
    /**
     * 封装客户群总金额
     */
    var joinGuestAmount = function(guestAmountList){
    	for(var i = 0;i<guestAmountList.length;i++){
    		guestTolAmount.push(guestAmountList[i][1] | 0.0);
    	}
    };
    
    /**
     * 封装培训总金额
     */
    var joinTrainAmount = function(provinceTrainAmountList,cityTrainAmountList,data,provinceJoinAmountList,cityJoinAmountList){
    	for(var i = 0;i<data.monthList.length; i++){
    		monthArr.push(data.monthList[i]);
    	}
    	if(data.rankId == 1 || data.rankId == -1 || data.rankId == 4){
    		trainTolAmount = [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0];
    		joinTolAmount  = [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0];
    		tolAmount = [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0];
    	}else if(data.rankId == 2){
    		for(var i = 0;i < 12;i++){
    			trainTolAmount.push(provinceTrainAmountList[i][1]);
    			joinTolAmount.push(provinceJoinAmountList[i][1]);
    			tolAmount.push(trainTolAmount[i] + joinTolAmount[i] + guestTolAmount[i]);
    		}
    	}else if(data.rankId == 3){
    		for(var i = 0;i < 12;i++){
    			trainTolAmount.push(cityTrainAmountList[i][1]);
    			joinTolAmount.push(cityJoinAmountList[i][1]);
    			tolAmount.push((trainTolAmount[i] + joinTolAmount[i] + guestTolAmount[i]).toFixed(2));
    		}
    	}
    };
    
    /**
     * 展示环形图
     */
    var showPieAxis = function(){
    	option = {
    		    tooltip: {
    		        trigger: 'item',
    		        formatter: "{a} <br/>{b}: {c} ({d}%)"
    		    },
    		    legend: {
    		        orient: 'vertical',
    		        x: 'left',
    		        data:['保洁员总金额','育儿嫂总金额','保姆总金额','月嫂总金额','其他总金额','加盟返点','学员学费']
    		    },
    		    series: [
    		        {
    		            name:'费用说明',
    		            type:'pie',
    		            radius: ['60%', '95%'],
    		            avoidLabelOverlap: false,
    		            label: {
    		                normal: {
    		                    show: false,
    		                    position: 'center'
    		                },
    		                emphasis: {
    		                    show: true,
    		                    textStyle: {
    		                        fontSize: '30',
    		                        fontWeight: 'bold'
    		                    }
    		                }
    		            },
    		            labelLine: {
    		                normal: {
    		                    show: false
    		                }
    		            },
    		            animationDuration: function (idx) {
    		                // 越往后的数据延迟越大
    		                return idx * 10000;
    		            },
    		            data:[
    		                {value:pieCleanerAmount, name:'保洁员总金额'},
    		                {value:pieSisterAmount, name:'育儿嫂总金额'},
    		                {value:pieNannyAmount, name:'保姆总金额'},
    		                {value:pieMaternityAmount, name:'月嫂总金额'},
    		                {value:pieOtherAmount, name:'其他总金额'},
    		                {value:piejoinTolAmount, name:'加盟返点'},
    		                {value:pietraineeAmount, name:'学员学费'}
    		            ]
    		        }
    		    ]
    		};
    	// 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('idShow'));
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    };
    
  //展示环形图

	

		$.ajax({
	        type: "get",
	        datatype:'json',
	        url: "reportController/getPieAmountList",
	        data: {
	            userId: 1,
	            rankId: 3
	        },
	        success: function(data) {
	        		if(data){
	        			//封装客户群总金额
	        			joinPieGuestAmount(data.guestAmountList);
	        			//封装加盟总金额
	        			joinPieJoinAmount(data.provinceJoinAmountList,data.cityJoinAmountList,data.traineeList);
	        			//展示折线图
	        			showPieAxis();
	        		}
	        }});

	
	/**
	 * 服务人群类别拼接
	 */
	var joinPieGuestAmount = function(guestAmountList){
		if(guestAmountList){
			for(var i=0;i<guestAmountList.length;i++){
				if(guestAmountList[i][0] == "0"){
					pieCleanerAmount = guestAmountList[i][1];
				}else if(guestAmountList[i][0] == "1"){
					pieSisterAmount = guestAmountList[i][1];
				}else if(guestAmountList[i][0] == "2"){
					pieNannyAmount = guestAmountList[i][1];
				}else if(guestAmountList[i][0] == "3"){
					pieMaternityAmount = guestAmountList[i][1];
				}else if(guestAmountList[i][0] == "4"){
					pieOtherAmount = guestAmountList[i][1];
				}
			}
		}
	};
	/**
	 * 加盟返点总额
	 */
	var joinPieJoinAmount = function(provinceJoinAmountList,cityJoinAmountList,traineeList){
		if(provinceJoinAmountList && provinceJoinAmountList.length>0){
			piejoinTolAmount = provinceJoinAmountList;
		}else if(cityJoinAmountList && cityJoinAmountList.length>0){
			piejoinTolAmount = cityJoinAmountList;
		}
		if(traineeList && traineeList.length>0){
			pietraineeAmount = traineeList;
		}
	}
});