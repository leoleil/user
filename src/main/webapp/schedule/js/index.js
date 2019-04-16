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

// 饼图组件
Vue.component('z-pie', {
    props: ['identify', 'color', 'subtitle', 'percent'],
    template: `
        <div class="z-pie" :class="identify">
            <div :id="identify"></div>
        </div>
    `,
    data(){
        return {
            charts: '',
            option: {
                title: {
                    text: 100*this.percent+'%',
                    x: 'center',
                    y: '65',
                    textStyle: {
                        fontWeight: 'normal',
                        color: this.color[1],
                        fontSize: '62'
                    },
                    subtext: this.subtitle,
                    subtextStyle: {
                        color: '#cccccc',
                        fontSize: '25',

                    }
                },
                color: ['#A7A7A7'],
                series: [{
                    name: 'Line 1',
                    type: 'pie',
                    clockWise: true,
                    radius: ['78%', '92%'],
                    itemStyle: {
                        normal: {
                            label: {
                                show: false
                            },
                            labelLine: {
                                show: false
                            }
                        }
                    },
                    hoverAnimation: true,
                    data: [{
                        value: 100*this.percent,
                        name: '01',
                        itemStyle: {
                            normal: {
                                color: { // 完成的圆环的颜色
                                    colorStops: [{
                                        offset: 0,
                                        color: this.color[0] // 0% 处的颜色
                                    }, {
                                        offset: 1,
                                        color: this.color[1] // 100% 处的颜色
                                    }]
                                },
                                shadowColor: this.color[0],
                                shadowBlur: 12,
                                label: {
                                    show: false
                                },
                                labelLine: {
                                    show: false
                                }
                            }
                        }
                    }, {
                        name: '02',
                        value: 100*(1-this.percent),
                        itemStyle: {
                            shadowColor: '#ccc',
                            shadowBlur: 5
                        }

                    }]
                }]
            }
        }
    },
    methods: {
        initPieOne: function () {
            this.charts = echarts.init(document.getElementById(this.identify));
            this.charts.setOption(this.option);
        }
    },
    mounted: function () {
        this.initPieOne();
    },
    watch: {
        percent: {
            handler(newVal, oldVal){
                if(newVal){
                    console.log('new');
                    console.log(newVal);
                    this.option.series[0].data[0].value = newVal*100;
                    this.option.series[0].data[1].value = (1-newVal)*100;
                    this.option.title.text = `${Math.round(newVal*100)}%`;
                    this.charts.setOption(this.option);
                }else{
                    console.log('old');
                }
            }
        }
    }
});

// 柱状图组件
Vue.component('z-rect', {
    props: ['identify', 'color', 'src'],
    template: `
        <div class="z-rect" :class="identify">
            <div :id="identify">
                
            </div>
        </div>
    `,
    data(){
        return {
            option: {
                dataset: {
                    source: this.src
                },
                grid: {
                    containLabel: true,
                    top: 10,
                    left: 10,
                    width: '82%',
                    height: '85%',

                },
                xAxis: {
                    name: '%',
                    axisLabel: {
                        color: '#ccc'
                        // formatter: '{value}'
                    },
                    splitLine: {
                        show: false
                    },
                    axisLine: {
                        lineStyle: {
                            color: '#ccc'
                        }
                    }
                },
                yAxis: {
                    type: 'category',
                    axisLabel: {
                        color: '#ccc'
                        // formatter: '{value}'
                    },
                    splitLine: {
                        show: false
                    },
                    axisLine: {
                        lineStyle: {
                            color: '#ccc'
                        }
                    }
                },
                visualMap: {
                    orient: 'horizontal',
                    left: 'center',
                    min: 10,
                    max: 100,
                    textStyle: {
                        color: '#ccc'
                    },
                    itemWidth: 10,

                    text: ['低', '高'],
                    // Map the score column to color
                    dimension: 0,
                    inRange: {
                        color: this.color
                    }
                },
                series: [
                    {
                        type: 'bar',
                        barWidth: '12',
                        itemStyle: {
                            normal: {
                                label: {
                                    show: true,
                                    position: 'right',
                                    formatter: ('{c}'.split(','))
                                }
                            }
                        },
                        encode: {
                            // Map the "amount" column to X axis.
                            x: 1,
                            // Map the "product" column to Y axis
                            y: 2
                        }
                    }
                ]
            },
            chart: ''
        }
    },
    methods: {
        initRect: function(){
            this.chart = echarts.init(document.getElementById(this.identify));

            this.chart.setOption(this.option);
        }
    },
    mounted: function(){
        this.initRect();
    },
    watch: {
        // option: {
        //     handle(newVal, oldVal){
        //         if(this.chart){
        //             if(newVal){
        //                 this.chart.setOption(newVal);
        //                 console.log('new');
        //             }else{
        //                 this.chart.setOption(oldVal);
        //                 console.log('old');
        //             }
        //         }else{
        //             this.initRect();
        //             console.log('nothing');
        //         }
        //     }
        // },
        src: {
            handler(newVal, oldVal){
                if(newVal){
                    console.log('new');
                    console.log(newVal);
                    this.option.dataset.source = newVal;
                    this.chart.setOption(this.option);
                }else{
                    console.log('old');
                }
            }
        }
    }
});

// select组件
Vue.component('z-selects', {
    props: ['statusList'],
    template: `
        <div class='z-selects'>
            <div class='z-select-1'>
                年限: 
                <i-select v-model="model1" @on-change="status" placeholder="请选择年限" style="width:200px;">
                    <i-option v-for="item in planList" :value="item.value" :key="item.value">{{ item.label }}</i-option>
                </i-select>
            </div>
            
            <div class='z-select-2'>
                战区: 
                <i-select v-model="model2" @on-change="status" placeholder="请选择战区" style="width:200px;">
                    <i-option v-for="item in direList" :value="item.value" :key="item.value">{{ item.label }}</i-option>
                </i-select>
            </div>

            <div class='z-select-3'>
                军种: 
                <i-select v-model="model3" @on-change="status" placeholder="请选择兵种" style="width:200px;">
                    <i-option v-for="item in typeList" :value="item.value" :key="item.value">{{ item.label }}</i-option>
                </i-select>
            </div>
        </div>
    `,
    data: function(){
        return {
            planList: [
                {
                    value: '115',
                    label: '十一五'
                },
                {
                    value: '125',
                    label: '十二五'
                },
                {
                    value: '135',
                    label: '十三五'
                },
                {
                    value: '145',
                    label: '十四五'
                },
                {
                    value: '155',
                    label: '十五五'
                },
            ],
            direList: [
                {
                    value: 'allD',
                    label: '全战区'
                },
                {
                    value: 'east',
                    label: '东部战区'
                },
                {
                    value: 'south',
                    label: '南部战区'
                },
                {
                    value: 'west',
                    label: '西部战区'
                },
                {
                    value: 'north',
                    label: '北部战区'
                },
                {
                    value: 'middle',
                    label: '中部战区'
                }
            ],
            typeList: [
                {
                    value: 'allT',
                    label: '全军种'
                },
                {
                    value: 'nv',
                    label: '海军'
                },
                {
                    value: 'lf',
                    label: '陆军'
                },
                {
                    value: 'af',
                    label: '空军'
                },
                {
                    value: 'rk',
                    label: '火箭军'
                },
                {
                    value: 't1',
                    label: '某部队一'
                },
                {
                    value: 't2',
                    label: '某部队二'
                },
                {
                    value: 't3',
                    label: '某部队三'
                }
            ],
            model1: "135",
            model2: "east",
            model3: "allT",
            dataList: {
                src_1: [
                    ['score', 'amount', 'name']
                ],
                src_2: [
                    ['score', 'amount', 'name']
                ],
                src_3: [
                    ['score', 'amount', 'name']
                ],
                per_1: 0,
                per_2: 0,
                per_3: 0
            }
        }
    },
    methods: {
        initDataList: function(){
            this.dataList = {
                src_1: [
                    ['score', 'amount', 'name']
                ],
                src_2: [
                    ['score', 'amount', 'name']
                ],
                src_3: [
                    ['score', 'amount', 'name']
                ],
                per_1: 0,
                per_2: 0,
                per_3: 0
            };
        },
        handleJSON: function(dataList, item, name){
            let fwr = Math.round(item.finishWorkingRatio);
            let swr = Math.round(item.starWorkingRatio);
            let pro = Math.round(item.progress*100);

            dataList.src_1.push([pro, pro, name]);
            dataList.src_2.push([fwr, fwr, name]);
            dataList.src_3.push([swr, swr, name]);

        },
        status: function(){
            const _this = this;

            const ajaxPromise = param => {
                return new Promise((resolve, reject) => {
                    $.ajax({
                        url: '/onps/schedule/getProjectScheduleSummarize.do',
                        type: 'POST',
                        async: false,
                        data: param,
                        success: function(res){
                            resolve(res);
                        },
                        error: function(err){
                            reject(err);
                        }
                    });
            });
            }

            if( this.model2!='allD' && this.model3=='allT' ){

                this.initDataList()

                // 总体
                var step1 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        _this.dataList.per_1 = res.entity.progress;
                        _this.dataList.per_2 = Math.round(res.entity.finishWorkingRatio)/100;
                        _this.dataList.per_3 = Math.round(res.entity.starWorkingRatio)/100;
                        step2();
                        console.log(res);
                        console.log(_this.dataList);
                    }).catch( err => {
                        console.log(err);
                    })
                };

                let step2 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '海军');
                        }
                        step3();
                    }).catch( err => {
                        console.log('第二个请求失败');
                    })
                };

                let step3 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '陆军');
                        }
                        step4();
                    }).catch( err => {
                        console.log('第三个请求失败');
                    })
                };

                let step4 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '空军');
                        }
                        step5();
                    }).catch( err => {
                        console.log(第四个请求失败);
                    })
                };

                let step5 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '火箭军');
                        }
                        step6();
                    }).catch( err => {
                        console.log('第五个请求失败');
                    })
                };

                let step6 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '某部队1');
                        }
                        step7();
                    }).catch( err => {
                        console.log('第六个请求失败');
                    })
                };

                let step7 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '某部队2');
                        }
                        step8();
                    }).catch( err => {
                        console.log('第七个请求失败');
                    })
                };

                let step8 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '某部队3');
                        }

                        _this.$emit('hsrc1', _this.dataList.src_1);
                        _this.$emit('hsrc2', _this.dataList.src_2);
                        _this.$emit('hsrc3', _this.dataList.src_3);
                        _this.$emit('hper1', _this.dataList.per_1);
                        _this.$emit('hper2', _this.dataList.per_2);
                        _this.$emit('hper3', _this.dataList.per_3);
                    }).catch( err => {
                        console.log('第八个请求失败');
                    })
                };

                step1();
            }else if( this.model2=='allD' && this.model3!='allT' ){

                this.initDataList();

                // 总体
                let step1 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        _this.dataList.per_1 = res.entity.progress;
                        _this.dataList.per_2 = (Math.round(res.entity.finishWorkingRatio))/100;
                        _this.dataList.per_3 = (Math.round(res.entity.starWorkingRatio))/100;
                        step2();
                    }).catch( err => {
                        console.log('第一个请求失败');
                })
                };

                let step2 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '东部');
                        }
                        step3();
                    }).catch( err => {
                        console.log('第二个请求失败');
                })
                };

                let step3 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '西部');
                        }
                        step4();
                    }).catch( err => {
                        console.log('第三个请求失败');
                })
                };

                let step4 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '南部');
                        }
                        step5();
                    }).catch( err => {
                        console.log('第四个请求失败');
                })
                };

                let step5 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '北部');
                        }
                        step6();
                    }).catch( err => {
                        console.log('第五个请求失败');
                })
                };

                let step6 = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        if(res.status == 'S00001'){
                            _this.handleJSON(_this.dataList, res.entity, '中部');
                        }
                        _this.$emit('hsrc1', _this.dataList.src_1);
                        _this.$emit('hsrc2', _this.dataList.src_2);
                        _this.$emit('hsrc3', _this.dataList.src_3);
                        _this.$emit('hper1', _this.dataList.per_1);
                        _this.$emit('hper2', _this.dataList.per_2);
                        _this.$emit('hper3', _this.dataList.per_3);
                    }).catch( err => {
                        console.log('第六个请求失败');
                })
                };

                step1();
            }else if( this.model2!='allD' && this.model3!='allT' ){
                this.initDataList();

                let step = function(){
                    ajaxPromise({
                        projectName: '',
                        level1: '',
                        level2: '',
                        level3: '',
                        level4: '',
                        level5: ''
                    }).then(function(res){
                        _this.dataList.per_1 = res.entity.progress;
                        _this.dataList.per_2 = (Math.round(res.entity.finishWorkingRatio))/100;
                        _this.dataList.per_3 = (Math.round(res.entity.starWorkingRatio))/100;

                        _this.$emit('hsrc1', _this.dataList.src_1);
                        _this.$emit('hsrc2', _this.dataList.src_2);
                        _this.$emit('hsrc3', _this.dataList.src_3);
                        _this.$emit('hper1', _this.dataList.per_1);
                        _this.$emit('hper2', _this.dataList.per_2);
                        _this.$emit('hper3', _this.dataList.per_3);
                    }).catch( err => {
                        console.log('第一个请求失败');
                    })

                };

                step();
            }

            /*if( this.model2!='allD' && this.model3=='allT' ){
                axios
                  .post('http://localhost:3000/allType',{
                    direct: this.model2,
                    type: this.model3
                  })
                  .then( response => {
                    this.dataList = response.data.data;
                    console.log(this.dataList);

                    this.$emit('hsrc1', this.dataList.src_1);
                    this.$emit('hsrc2', this.dataList.src_2);
                    this.$emit('hsrc3', this.dataList.src_3);
                    this.$emit('hper1', this.dataList.per_1);
                    this.$emit('hper2', this.dataList.per_2);
                    this.$emit('hper3', this.dataList.per_3);

                });
            }else if( this.model2=='allD' && this.model3!='allT' ){
                axios
                  .post('http://localhost:3000/allDirect')
                  .then( response => {
                    this.dataList = response.data.data;
                    console.log(this.dataList);

                    // console.log(this.dataList.src_2);
                    this.$emit('hsrc1', this.dataList.src_1);
                    this.$emit('hsrc2', this.dataList.src_2);
                    this.$emit('hsrc3', this.dataList.src_3);
                    this.$emit('hper1', this.dataList.per_1);
                    this.$emit('hper2', this.dataList.per_2);
                    this.$emit('hper3', this.dataList.per_3);

                });
            }else{

            }*/
        }
    }
});

var app = new Vue({
    el: '#app',
    data: {
        src_1: [
            ['score', 'amount', 'name'],
            [8.3, 8.3, '海军'],
            [57.1, 57.1, '陆军'],
            [74.4,74.4, '空军'],
            [30.1, 30.1, '火箭军'],
            [49.7, 49.7, '某部队1'],
            [8, 8, '某部队2'],
            [13.2, 13.2, '某部队3']
        ],
        src_2: [
            ['score', 'amount', 'name'],
            [70.2, 70.2, '海军'],
            [6.1, 6.1, '陆军'],
            [3.6, 3.6, '空军'],
            [65.3, 65.3, '火箭军'],
            [15.6, 15.6, '某部队1'],
            [28, 28, '某部队2'],
            [52.1, 52.1, '某部队3']
        ],
        src_3: [
            ['score', 'amount', 'name'],
            [55.2, 55.2, '海军'],
            [7.1, 7.1, '陆军'],
            [41.4, 41.4, '空军'],
            [23.1, 23.1, '火箭军'],
            [9.9, 9.9, '某部队1'],
            [27.4, 27.4, '某部队2'],
            [2.1, 2.1, '某部队3']
        ],
        statusList: null,
        per_1: 0.8,
        per_2: 0.6,
        per_3: 0.43
    },
    methods: {
        handleStatus: function(status){
            this.statusList = status;
            console.log(this.statusList);
        },
        handleSrc1: function(src1){
            this.src_1 = src1;
            console.log(this.src_1);
        },
        handleSrc2: function(src2){
            this.src_2 = src2;
            console.log(this.src_2);
        },
        handleSrc3: function(src3){
            this.src_3 = src3;
            console.log(this.src_3);
        },
        handlePer1: function(per1){
            this.per_1 = per1;
            console.log(this.per_1);
        },
        handlePer2: function(per2){
            this.per_2 = per2;
            console.log(this.per_2);
        },
        handlePer3: function(per3){
            this.per_3 = per3;
            console.log(this.per_3);
        }
    },

});
