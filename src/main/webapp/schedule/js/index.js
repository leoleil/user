function getCurDate(){
    var d=new Date();
    var year=d.getFullYear();
    var month=add_zero(d.getMonth()+1);
    var day=add_zero(d.getDate());
    var hour=add_zero(d.getHours());
    var minute=add_zero(d.getMinutes());
    var second=add_zero(d.getSeconds());
    var ndate= year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
    var divT = document.getElementById("divTime");
    divT.innerHTML=ndate;
}
function add_zero(temp){
    if(temp<10) return "0"+temp;
    else return temp;
}
setInterval(getCurDate,1000);

$('#view').on('click',function(){
    window.location.href="view.html";
  })

var intro = document.getElementById('intro-con');
var myChart = echarts.init(intro);
option = null;
var app={};
option = {
    backgroundColor: '#112951',
    tooltip : {
        formatter: "{a} <br/>{c} {b}"
    },
  
    series : [
        {
            name:'东部战区',
            type:'gauge',
            min:0,
            max:100,
            splitNumber:10,
            center:['20%','50%'],
            radius: '60%',
            axisLine: {            // 坐标轴线
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: [[0.09, 'lime'],[0.82, '#1e90ff'],[1, '#ff4500']],
                    width: 3,
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisLabel: {            // 坐标轴小标记
                textStyle: {       // 属性lineStyle控制线条样式
                    fontWeight: 'bolder',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisTick: {            // 坐标轴小标记
                length :15,        // 属性length控制线长
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: 'auto',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            splitLine: {           // 分隔线
                length :25,         // 属性length控制线长
                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
                    width:3,
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            pointer: {           // 分隔线
                shadowColor : '#fff', //默认透明
                shadowBlur: 5
            },
            title : {
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    fontSize: 20,
                    fontStyle: 'italic',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            detail : {
                backgroundColor: 'rgba(30,144,255,0.8)',
                borderWidth: 1,
                borderColor: '#fff',
                shadowColor : '#fff', //默认透明
                shadowBlur: 5,
                offsetCenter: [0, '50%'],       // x, y，单位px
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    color: '#fff'
                }
            },
            data:[{value: 53, name: '东部战区'}]
        },
        {
            name:'西部战区',
            type:'gauge',
            min:0,
            max:100,
            splitNumber:10,
            center:['35%','50%'],
            radius: '60%',
            axisLine: {            // 坐标轴线
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: [[0.09, 'lime'],[0.82, '#1e90ff'],[1, '#ff4500']],
                    width: 3,
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisLabel: {            // 坐标轴小标记
                textStyle: {       // 属性lineStyle控制线条样式
                    fontWeight: 'bolder',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisTick: {            // 坐标轴小标记
                length :15,        // 属性length控制线长
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: 'auto',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            splitLine: {           // 分隔线
                length :25,         // 属性length控制线长
                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
                    width:3,
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            pointer: {           // 分隔线
                shadowColor : '#fff', //默认透明
                shadowBlur: 5
            },
            title : {
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    fontSize: 20,
                    fontStyle: 'italic',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            detail : {
                backgroundColor: 'rgba(30,144,255,0.8)',
                borderWidth: 1,
                borderColor: '#fff',
                shadowColor : '#fff', //默认透明
                shadowBlur: 5,
                offsetCenter: [0, '50%'],       // x, y，单位px
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    color: '#fff'
                }
            },
            data:[{value: 8, name: '西部战区'}]
        },
        {
            name:'中部战区',
            type:'gauge',
            min:0,
            max:100,
            splitNumber:10,
            center:['50%','50%'],
            radius: '60%',
            axisLine: {            // 坐标轴线
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: [[0.09, 'lime'],[0.82, '#1e90ff'],[1, '#ff4500']],
                    width: 3,
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisLabel: {            // 坐标轴小标记
                textStyle: {       // 属性lineStyle控制线条样式
                    fontWeight: 'bolder',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisTick: {            // 坐标轴小标记
                length :15,        // 属性length控制线长
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: 'auto',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            splitLine: {           // 分隔线
                length :25,         // 属性length控制线长
                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
                    width:3,
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            pointer: {           // 分隔线
                shadowColor : '#fff', //默认透明
                shadowBlur: 5
            },
            title : {
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    fontSize: 20,
                    fontStyle: 'italic',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            detail : {
                backgroundColor: 'rgba(30,144,255,0.8)',
                borderWidth: 1,
                borderColor: '#fff',
                shadowColor : '#fff', //默认透明
                shadowBlur: 5,
                offsetCenter: [0, '50%'],       // x, y，单位px
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    color: '#fff'
                }
            },
            data:[{value: 43, name: '中部战区'}]
        },
        {
            name:'南部战区',
            type:'gauge',
            min:0,
            max:100,
            splitNumber:10,
            center:['65%','50%'],
            radius: '60%',
            axisLine: {            // 坐标轴线
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: [[0.09, 'lime'],[0.82, '#1e90ff'],[1, '#ff4500']],
                    width: 3,
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisLabel: {            // 坐标轴小标记
                textStyle: {       // 属性lineStyle控制线条样式
                    fontWeight: 'bolder',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisTick: {            // 坐标轴小标记
                length :15,        // 属性length控制线长
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: 'auto',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            splitLine: {           // 分隔线
                length :25,         // 属性length控制线长
                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
                    width:3,
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            pointer: {           // 分隔线
                shadowColor : '#fff', //默认透明
                shadowBlur: 5
            },
            title : {
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    fontSize: 20,
                    fontStyle: 'italic',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            detail : {
                backgroundColor: 'rgba(30,144,255,0.8)',
                borderWidth: 1,
                borderColor: '#fff',
                shadowColor : '#fff', //默认透明
                shadowBlur: 5,
                offsetCenter: [0, '50%'],       // x, y，单位px
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    color: '#fff'
                }
            },
            data:[{value: 73, name: '南部战区'}]
        },
        {
            name:'北部战区',
            type:'gauge',
            min:0,
            max:100,
            splitNumber:10,
            center:['80%','50%'],
            radius: '60%',
            axisLine: {            // 坐标轴线
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: [[0.09, 'lime'],[0.82, '#1e90ff'],[1, '#ff4500']],
                    width: 3,
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisLabel: {            // 坐标轴小标记
                textStyle: {       // 属性lineStyle控制线条样式
                    fontWeight: 'bolder',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            axisTick: {            // 坐标轴小标记
                length :15,        // 属性length控制线长
                lineStyle: {       // 属性lineStyle控制线条样式
                    color: 'auto',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            splitLine: {           // 分隔线
                length :25,         // 属性length控制线长
                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
                    width:3,
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            pointer: {           // 分隔线
                shadowColor : '#fff', //默认透明
                shadowBlur: 5
            },
            title : {
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    fontSize: 20,
                    fontStyle: 'italic',
                    color: '#fff',
                    shadowColor : '#fff', //默认透明
                    shadowBlur: 10
                }
            },
            detail : {
                backgroundColor: 'rgba(30,144,255,0.8)',
                borderWidth: 1,
                borderColor: '#fff',
                shadowColor : '#fff', //默认透明
                shadowBlur: 5,
                offsetCenter: [0, '50%'],       // x, y，单位px
                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                    fontWeight: 'bolder',
                    color: '#fff'
                }
            },
            data:[{value: 86, name: '北部战区'}]
        },
      
       
    ]
};
if (option && typeof option === "object") {
    myChart.setOption(option, true);
};

// 条形图部分
var bar =document.getElementById('bar-con');
var myBar = echarts.init(bar);
var app={};
option= null;
var option={
    backgroundColor:'#112951',
    dataset: {
        source: [
            ['score', '百分比', 'product'],
            [100, , '特殊部队3'],
            [57.1, , '特殊部队2'],
            [74.4, , '特殊部队1'],
            [50.1, , '火箭军'],
            [29.7, , '空军'],
            [38.1, , '海军'],
            [18.1, ,'陆军']
        ]
    },
    grid: {containLabel: true},
    xAxis: {
        name: '百分比',
        nameTextStyle:{
            color:'#fff'
        },
        axisLine:{
            lineStyle:{
                color:'#fff'
            }
        },
        axisLabel:{
            color:''
        }
    },
    yAxis: {
        name:'军种',
        type: 'category',
        nameTextStyle:{
            color:'#fff'
        },
        axisLine:{
            lineStyle:{
                color:'#fff'
            }
        },
        splitLine:{
            show:true,
        }
    },
    visualMap: {
        orient: 'horizontal',
        left: 'center',
        min: 20,
        max: 100,
        text: ['完成度高', '完成度低'],
        // Map the score column to color
        dimension: 0,
        textStyle:{
            color:'#fff',
        },
        inRange: {
            color: ['#ff4100', '#ffc873']
        }
    },
    series: [
        {
            type: 'bar',
            encode: {
                // Map the "amount" column to X axis.
                x: 'amount',
                // Map the "product" column to Y axis
                y: 'product'
            }
        }
    ]
};
if (option && typeof option === "object") {
    myBar.setOption(option, true);
}
$('#btn1').on('click',function(){
    $('#btn2').css('backgroundColor','#112951');
    $('#btn1').css('backgroundColor','#060c18');
    $('.content').css('display','block');
    $('.heatMap').css('opacity','0');
});
$('#btn2').on('click',function(){
    $('#btn1').css('backgroundColor','#112951');
    $('#btn2').css('backgroundColor','#060c18');
    $('.content').css('display','none');
    $('.heatMap').css('opacity','1');
    $('.heatMAp').css('display','block')
});

//解决dom获取不到百分比的宽高 

var heatMap=document.getElementById('heatMap-con');
var myHeat=echarts.init(heatMap);
var app={};
option=null;
var hours = ['1月', '2月', '3月', '4月', '5月', '6月', '7月',
        '8月', '9月', '10月','11月','12月'];
var days = ['X部队', 'X部队', 'X部队',
        '火箭军', '空军', '海军', '陆军'];

var data = [[0,0,4],[0,1,10],[0,2,16],[0,3,20],[0,4,45],[0,5,50],[0,6,65],[0,7,70],[0,8,77],[0,9,89],[0,10,94],[0,11,97],[1,0,17],[1,1,37],[1,2,58],[1,3,77],[1,4,90],[1,5,98],[1,6,100],[1,7,100],[1,8,100],[1,9,100],[1,10,100],[1,11,100],[2,0,1],[2,1,12],[2,2,20],[2,3,30],[2,4,40],[2,5,50],[2,6,60],[2,7,77],[2,8,80],[2,9,90],[2,10,93],[2,11,100],[3,0,7],[3,1,23],[3,2,33],[3,3,50],[3,4,60],[3,5,65],[3,6,77],[3,7,90],[3,8,100],[3,9,100],[3,10,100],[3,11,100],[4,0,21],[4,1,23],[4,2,54],[4,3,66],[4,4,70],[4,5,81],[4,6,88],[4,7,90],[4,8,100],[4,9,100],[4,10,100],[4,11,100],[5,0,2],[5,1,11],[5,2,30],[5,3,33],[5,4,40],[5,5,50],[5,6,60],[5,7,70],[5,8,82],[5,9,90],[5,10,94],[5,11,100],[6,0,1],[6,1,10],[6,2,20],[6,3,30],[6,4,40],[6,5,50],[6,6,60],[6,7,70],[6,8,70],[6,9,80],[6,10,91],[6,11,100]];

data = data.map(function (item) {
    return [item[1], item[0], item[2] || '-'];
});

option = {
    backgroundColor:'#112951',
    title:{
      text:'各军兵种2019工程完成统计',
      left:'center',
      top:'20px',
      textStyle:{
          color:'#fff'
      }
    },
    tooltip: {
        position: 'top'
    },
    animation: false,
    grid: {
        height: '60%',
        y: '10%'
    },
    xAxis: {
        type: 'category',
        data: hours,
        splitArea: {
            show: true
        },
        axisLabel:{
            color:'#fff'
        }
    },
    yAxis: {
        type: 'category',
        data: days,
        splitArea: {
            show: true
        },
        axisLabel:{
            color:'#fff',
            rotate:35
        },
        
    },
    visualMap: {
        min: 0,
        max: 100,
        calculable: true,
        orient: 'horizontal',
        left: 'center',
        bottom: '15%',
        textStyle:{
            color:'#fff'
        }
    },
    series: [{
        name: 'Punch Card',
        type: 'heatmap',
        data: data,
        label: {
            normal: {
                show: true
            }
        },
        itemStyle: {
            emphasis: {
                shadowBlur: 10,
                shadowColor: 'rgba(0, 0, 0, 0.5)'
            }
        }
    }]
};;
if (option && typeof option === "object") {
    myHeat.setOption(option, true);
}
// echarts下钻时间
option={
    backgroundColor: '#112951',
        
            title: {
                text: 'Customized Pie',
                left: 'center',
                top: 20,
                textStyle: {
                    color: '#ccc'
                }
            },
        
            tooltip : {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
        
            visualMap: {
                show: false,
                min: 80,
                max: 600,
                inRange: {
                    colorLightness: [0, 1]
                }
            },
            series : [
                {
                    name:'访问来源',
                    type:'pie',
                    radius : '55%',
                    center: ['50%', '50%'],
                    data:[
                        {value:335, name:'直接访问'},
                        {value:310, name:'邮件营销'},
                        {value:274, name:'联盟广告'},
                        {value:235, name:'视频广告'},
                        {value:400, name:'搜索引擎'}
                    ].sort(function (a, b) { return a.value - b.value; }),
                    roseType: 'radius',
                    label: {
                        normal: {
                            textStyle: {
                                color: 'rgba(255, 255, 255, 0.3)'
                            }
                        }
                    },
                    labelLine: {
                        normal: {
                            lineStyle: {
                                color: 'rgba(255, 255, 255, 0.3)'
                            },
                            smooth: 0.2,
                            length: 10,
                            length2: 20
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: '#c23531',
                            shadowBlur: 200,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    },
        
                    animationType: 'scale',
                    animationEasing: 'elasticOut',
                    animationDelay: function (idx) {
                        return Math.random() * 200;
                    }
                }
            ]
}
myChart.on('click',{name:'东部战区'},function(){
    alert("111");
    myChart.setOption(option);
})