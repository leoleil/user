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

// 从后台解析时间戳的方法 
function add0(m){
    return m<10?'0'+m:m;
}
function format(shijianchuo){
    //shijianchuo是整数，否则要parseInt转换
    var time = new Date(shijianchuo);
    var y = time.getFullYear();
    var m = time.getMonth()+1;
    var d = time.getDate();
    var h = time.getHours();
    var mm = time.getMinutes();
    var s = time.getSeconds();
    return y+'-'+add0(m)+'-'+add0(d);
}

// 分页
var pageSize=10;
var curPage=0;
var lastPage;
var direct=0;
var len;
var page;
var begin;
var end;
$(document).ready(function display(){
    len = $("#tbody tr").length ;
    page = len % pageSize==0 ? len/pageSize : Math.floor(len/pageSize)+1;
    curPage=1;
    displayPage(1);

    document.getElementById("btn0").innerHTML="当前 " + curPage + "/" + page + " 页    每页 ";
    document.getElementById("sum").innerHTML="共计" + len + "条"+'&nbsp;&nbsp;';        // 显示数据量
    document.getElementById("pageSize").value = pageSize;

    $("#btn1").click(function firstPage(){   //首页
        curPage=1;
        direct=0;
        displayPage();
    });
    $("#btn2").click(function frontPage(){   //上一页
        direct=-1;
        displayPage();
    });
    $("#btn3").click(function nextPage(){    //下一页
        direct=1;
        displayPage();
    });
    $("#btn4").click(function lastPage(){
        curPage=page;
        direct=0;
        displayPage();
    });
    $("#btn5").click(function changePage(){
        curPage=document.getElementById('changePage').value *1;
        if(!/^[1-9]\d*$/.test(curPage)){
            console.log("不是正整数")
            return null;
        }
        if(curPage > page) {
            console.log("没有这一页");
            return;
        }
        direct=0;
        displayPage();
    });
    $("select#pageSize").change(function(){
        console.log($(this).val());
        pageSize = $(this).val();
        page = len % pageSize==0 ? len/pageSize : Math.floor(len/pageSize)+1;
        displayPage();
    });
});
function displayPage() {
    if(curPage<=1&&direct==-1){
        direct=0;
        console.log("这就是第一页");
        return ;
    }else if(curPage>=page&&direct==1){
        direct=0;
        console.log("这就是最后一页");
        return;
    }
    lastPage = curPage;
    //防止 len=1，curpage为0
    if (len > pageSize) {
        curPage = ((curPage + direct + len) % len);
    } else {
        curPage = 1;
    }
    var message = "当前 "+curPage+"/"+page+" 页   每页"; //显示当前多少页
    //document.getElementById("#btn0").innerHTML="当前 "+curPage+"/"+page+" 页   每页显示 "; 
    $("#btn0").html(message);
    begin=(curPage-1)*pageSize; //起始记录号
    end = begin + 1*pageSize -1 ; //末尾记录号
    if(end>len) {end=len};
    $("#tbody tr").hide();   //隐藏tbody tr
    $("#tbody tr").each(function(i){
        if(i>=begin&&i<=end){
            $(this).show();
        }
    });
}

// 总体进度点击事件


$('#sumbtn').on('click',function (){
    var sHeight = document.documentElement.scrollHeight;
    var sWidth = document.documentElement.scrollWidth;
    var wHeight=document.documentElement.clientHeight;
    var wWidth=document.documentElement.clientWidth;
    var mask = document.createElement('div');
    mask.id="mask";
    mask.style.height=sHeight+"px";
    mask.style.width = sWidth+"px";
    document.body.appendChild(mask);
    var con = document.getElementsByClassName('maskCon');
    con[0].style.display = 'block'; 
    var close = document.getElementById("mclose");
    mask.onclick=close.onclick=function () {
        document.body.removeChild(mask);
        con[0].style.display='none';
    }
  });

//   combo
$('#state1').combotree({
    editable:true,
    required:true,
    width:250,
    label:'战略方向:',
    labelPosition:'left',
    onChange:function () {
        fx = $('#state1').combotree('getText');
        console.log(fx);
        }
});
$('#state1').combotree('loadData',[{
    "id":"east",
    "text":"东部战区",
    "iconCls":"icon-blank",
    "state":"closed",
    "children":[{
        "id":"eo",
        "state":"closed",
        "iconCls":"icon-blank",
        "text":"东海"
    },{
        "id":"et",
        "iconCls":"icon-blank",
        "state":"closed",
        "text":"台海"
    }]
},{
    "id":"south",
    "iconCls":"icon-blank",
    "text":"南部战区",
    "state":"closed",
    "children":[{
        "id":"so",
        "iconCls":"icon-blank",
        "state":"closed",
        "text":"南海"
    },{
        "id":"cv",
        "iconCls":"icon-blank",
        "state":"closed",
        "text":"中越"
    },{
        "id":"cm",
        "iconCls":"icon-blank",
        "state":"closed",
        "text":"中缅"
    }]
},{
    "id":"west",
    "iconCls":"icon-blank",
    "text":"西部战区",
    "state":"closed",
    "children":[{
        "id":"cr",
        "iconCls":"icon-blank",
        "state":"closed",
        "text":"中俄"
    },{
        "id":"ci",
        "iconCls":"icon-blank",
        "state":"closed",
        "text":"中印"
    }]
},{
    "id":"north",
    "iconCls":"icon-blank",
    "text":"北部战区",
    "state":"closed",
    "children":[{
        "id":"cg",
        "iconCls":"icon-blank",
        "state":"closed",
        "text":"中蒙"
    },{
        "id":"ck",
        "iconCls":"icon-blank",
        "state":"closed",
        "text":"中朝"
    }]
},{
    "id":"middle",
    "iconCls":"icon-blank",
    "text":"中部战区",
    "state":"closed",
}]);
$('#state2').combotree({
    multiple:true,
    editable:true,
    required:true,
    width:800,
    label:'选择计划:',
    labelPosition:'left',
    onChange:function () {
        var txt1 = $('#state2').combotree('getText');
        console.log(txt1);
        var plan =  txt1.split(',');
        console.log(plan);
        var input = `
             <input class="easyui-textbox" style="width:30px">
        `;
        var content = `
            <br><br>
                <p class="sump">
                    <span style="color:#63dc90">${txt1}</span>共安排<span style="color:#63dc90">${fx}</span>信息通信设施建设项目${input}项，
                    已开工${input}项,开工率${input}%，
                    总体项目进度完成率${input}%，已完工${input}项，
                    完工率${input}%。<br>
                    一、战场信息通信设施<br>
                    <span style="color:#63dc90">${txt1}</span>安排<span style="color:#63dc90">${fx}</span>战场信息通信设施工程建设项目共${input}项，
                    （<span style="color:#63dc90">${plan[0]}</span>${input}项，<span style="color:#63dc90">${plan[1]}</span>
                    ${input}项）。<br>
                    1.项目报批情况：<br>
                    ①<span style="color:#63dc90">${plan[0]}</span>建设项目共${input}项：调整改革前，
                    <span style="color:#63dc90">${plan[0]}</span>立项和设计任务书批复项目${input}项
                    （原总参谋部批复设计任务书${input}项，海军批复${input}项，空军批复${input}项）；
                    调整改革后，根据《关于部分“十二五”战场信息通信设施建设项目立项调整的通知》（军参通【2018】70号），
                    对“十二五”第四批建设项目立项进行调整，其中<span style="color:#63dc90">${fx}</span>建设项目${input}个（陆军${input}项，海军${input}项，火箭军${input}项，网络空间部队${input}项，信息通信基地${input}项），
                    已批复设计任务书${input}项（陆军${input}项，海军${input}项，网络空间部队${input}项，火箭军${input}项）正在办理报批。<br>
                    ②<span style="color:#63dc90">${plan[1]}</span>安排${input}个项目（南部战区${input}项，陆军${input}项，海军${input}项，空军${input}项，火箭军${input}项，军事航天部队${input}项，网络空间部队${input}项，信息通信基地${input}项），
                    已批复立项、设计任务书${input}项（陆军${input}项，海军${input}项，空军${input}项，火箭军${input}项，军事航天部队${input}项，网络空间部队${input}项，信息通信基地${input}项）。<br>
                    2.工程建设进展情况：<br>
                    ①<span style="color:#63dc90">${plan[0]}</span>建设项目，已开工${input}项（海军${input}项，空军${input}项，原第二炮兵${input}项，原广州军区${input}项，原总参直属部队${input}项），未开工${input}项（海军${input}项，空军${input}项，
                    原第二炮兵${input}项，原广州军区${input}项），开工率${input}项%，项目完成率${input}%（陆军${input}%，海军${input}%，空军${input}%，原第二炮兵${input}%，原广州军区${input}%），已完工${input}项，
                    完工率${input}%；“十二五”第四批项目，由于<span style="color:#63dc90">XXXXXX......(未开展原因)</span>，尚未开展工程建设。<br>
                    ②<span style="color:#63dc90">${plan[1]}</span>的${input}项目为<span style="color:#63dc90">XXXXXX......（未开展原因）</span>尚未开展工程建设。<br>
                    二、<span style="color:#63dc90">${plan[2]}</span>建设项目情况<br>
                    1.项目报批情况：<br>
                    <span style="color:#63dc90">${fx}</span>2011-2015年<span style="color:#63dc90">${plan[2]}</span>，下达建设任务${input}项（海军${input}项，空军${input}项，原第二炮兵${input}项，原广州军区${input}项）
                    正在办理报批。<br>
                    2.工程建设进展情况：<br>
                    已开工${input}项（海军${input}项，空军${input}项，原第二炮兵${input}项，原广州军区${input}项），未开工${input}项（海军${input}项，原广州军区${input}项），开工率${input}%，项目完成率${input}%
                    （海军${input}%，空军${input}%，原第二炮兵${input}%，原广州军区${input}%），已完工${input}项，完工率${input}%。<br>
                    三、专项工程<br>
                    ${input}专项工程，已开工${input}项（海军${input}项，空军${input}项，原第二炮兵${input}项，原广州军区${input}项），未开工${input}项（海军${input}项，原广州军区${input}项），开工率${input}%，项目完成率
                    ${input}%（海军${input}%，空军${input}%，原第二炮兵${input}%，原广州军区${input}%），已完工${input}项，完工率${input}%。<br>
                </p>
        `
        $('#sumdiv').html(content);
    }
});
$('#state2').combotree('loadData',[{
    "id":"1",
    "text":"战场设施建设计划",
    "iconCls":"icon-blank",
    "state":"close",
    "children":[{
        "id":"1a",
        "iconCls":"icon-blank",
        "text":"“十二五”战场建设计划"

    },{
        "id":"1b",
        "iconCls":"icon-blank",
        "text":"“十二五”第四批立项调整项目"
    },{
        "id":"1c",
        "iconCls":"icon-blank",
        "text":"“十三五”战场建设计划"
    }]
},{
    "id":"2",
    "iconCls":"icon-blank",
    "text":"“210工程”建设计划",
    "state":"close",
},{
    "id":"3",
    "iconCls":"icon-blank",
    "text":"专项工程",
    "state":"close",
}]);

 //ajax加载项目列表

$(function () {
        
            $.ajax({
                url: "/onps/schedule/getProjectSchedule.do",
                type: "post",
                async: false,
                success: function (data) {
                    console.log(data);
                    if (data.status == 'S00001') {
                        alert(data.message);

                    } else {
                        alert(data.message);
                    }

                },
                error: function (data) {
                    console.log(data);
                    alert("请求失败!");
                }

        });
    })

 
//列表数据json
var datalist = {"status":"S00001","message":"项目规划详细信息数据","entity":null,"list":[{"projectId":null,"submitCompany":null,"projectName":"11项目","documentName":"东海1号","documentNumber":"东海1号","documentDate":1554912000000,"investmentamount":1,"approvalAuthority":"军委","constructionPeriod":"1","isimportent":1,"level1":"东部战区","level2":"东海","level3":"战场设施建设计划","level4":"“十二五”战场建设计划","level5":"东部战区","timestamp":1554991989006,"subprojectId":null,"subName":"1","startTimeCon":"Thu Apr 11 2019 00:00:00 GMT+0800 (中国标准时间)","endTimeCon":"Thu Apr 11 2019 00:00:00 GMT+0800 (中国标准时间)","submitFileName":"1","submitDepartment":"1","submitNumber":"1","submitDate":1554912000000,"approvalName":"1","approvalDepartment":"1","approvalNumber":"1","approvalDate":1554912000000,"submitFileNameTa":"1","submitDepartmentTa":"1","submitNumberTa":"1","submitDateTa":null,"approvalNameTa":null,"approvalDepartmentTa":"1","approvalNumberTa":"1","approvalDateTa":1554912000000,"replyDate":1554912000000,"approvalProgress":"部分完成","constructionContent":"1","projectNumber":"1","constructionPlace":"1","constructionCompany":"1","releaseInvestment":1,"constructionPhase":"未开工","firstDesign":"未开展","bidding":"未启动","constructionDesign":"未开展","startTime":1554912000000,"testTime":null,"endTime":1554912000000,"projectProgress":63,"completedInvestment":1,"formedAbility":"1","designedAbility":"1","remarks":"1","reason":null,"department":"1","isIsimportent":1},{"projectId":null,"submitCompany":null,"projectName":"11项目","documentName":"东海1号","documentNumber":"东海1号","documentDate":1554912000000,"investmentamount":1,"approvalAuthority":"军委","constructionPeriod":"1","isimportent":1,"level1":"东部战区","level2":"东海","level3":"战场设施建设计划","level4":"“十二五”战场建设计划","level5":"东部战区","timestamp":1555036742174,"subprojectId":null,"subName":"3","startTimeCon":"Fri Apr 12 2019 10:27:45 GMT+0800 (中国标准时间)","endTimeCon":"Fri Apr 12 2019 10:27:45 GMT+0800 (中国标准时间)","submitFileName":"1","submitDepartment":"1","submitNumber":"1","submitDate":1554998400000,"approvalName":"1","approvalDepartment":"1","approvalNumber":"1","approvalDate":1554998400000,"submitFileNameTa":"1","submitDepartmentTa":"1","submitNumberTa":"1","submitDateTa":null,"approvalNameTa":"1","approvalDepartmentTa":"1","approvalNumberTa":"1","approvalDateTa":1554912000000,"replyDate":1554998400000,"approvalProgress":"全部完成","constructionContent":"1","projectNumber":"1","constructionPlace":"1","constructionCompany":"1","releaseInvestment":1,"constructionPhase":"未开工","firstDesign":"未开展","bidding":"未启动","constructionDesign":"未开展","startTime":1554998400000,"testTime":"Fri Apr 12 2019 00:00:00 GMT+0800 (中国标准时间)","endTime":1554998400000,"projectProgress":79,"completedInvestment":1,"formedAbility":"1","designedAbility":"1","remarks":"1","reason":null,"department":"1","isIsimportent":1},{"projectId":null,"submitCompany":null,"projectName":"11项目","documentName":"东海1号","documentNumber":"东海1号","documentDate":1554912000000,"investmentamount":1,"approvalAuthority":"军委","constructionPeriod":"1","isimportent":1,"level1":"东部战区","level2":"东海","level3":"战场设施建设计划","level4":"“十二五”战场建设计划","level5":"东部战区","timestamp":1555036250013,"subprojectId":null,"subName":"2","startTimeCon":"Fri Apr 12 2019 10:27:45 GMT+0800 (中国标准时间)","endTimeCon":"Fri Apr 12 2019 10:27:45 GMT+0800 (中国标准时间)","submitFileName":"1","submitDepartment":"1","submitNumber":"1","submitDate":1554998400000,"approvalName":"1","approvalDepartment":"1","approvalNumber":"1","approvalDate":1554998400000,"submitFileNameTa":"1","submitDepartmentTa":"1","submitNumberTa":"1","submitDateTa":null,"approvalNameTa":null,"approvalDepartmentTa":"1","approvalNumberTa":"1","approvalDateTa":1554912000000,"replyDate":1554998400000,"approvalProgress":"全部完成","constructionContent":"1","projectNumber":"1","constructionPlace":"1","constructionCompany":"1","releaseInvestment":1,"constructionPhase":"未开工","firstDesign":"未开展","bidding":"未启动","constructionDesign":"未开展","startTime":1554998400000,"testTime":"Fri Apr 12 2019 00:00:00 GMT+0800 (中国标准时间)","endTime":1554998400000,"projectProgress":66,"completedInvestment":1,"formedAbility":"1","designedAbility":"1","remarks":"1","reason":null,"department":"1","isIsimportent":1}]}
var dList = [{"projectId":null,"submitCompany":null,"projectName":"11项目","documentName":"东海1号","documentNumber":"东海1号","documentDate":1554912000000,"investmentamount":1,"approvalAuthority":"军委","constructionPeriod":"1","isimportent":1,"level1":"东部战区","level2":"东海","level3":"战场设施建设计划","level4":"“十二五”战场建设计划","level5":"东部战区","timestamp":1554991989006,"subprojectId":null,"subName":"1","startTimeCon":"Thu Apr 11 2019 00:00:00 GMT+0800 (中国标准时间)","endTimeCon":"Thu Apr 11 2019 00:00:00 GMT+0800 (中国标准时间)","submitFileName":"1","submitDepartment":"1","submitNumber":"1","submitDate":1554912000000,"approvalName":"1","approvalDepartment":"1","approvalNumber":"1","approvalDate":1554912000000,"submitFileNameTa":"1","submitDepartmentTa":"1","submitNumberTa":"1","submitDateTa":null,"approvalNameTa":null,"approvalDepartmentTa":"1","approvalNumberTa":"1","approvalDateTa":1554912000000,"replyDate":1554912000000,"approvalProgress":"部分完成","constructionContent":"1","projectNumber":"1","constructionPlace":"1","constructionCompany":"1","releaseInvestment":1,"constructionPhase":"未开工","firstDesign":"未开展","bidding":"未启动","constructionDesign":"未开展","startTime":1554912000000,"testTime":null,"endTime":1554912000000,"projectProgress":76,"completedInvestment":1,"formedAbility":"1","designedAbility":"1","remarks":"1","reason":null,"department":"1","isIsimportent":1},{"projectId":null,"submitCompany":null,"projectName":"11项目","documentName":"东海1号","documentNumber":"东海1号","documentDate":1554912000000,"investmentamount":1,"approvalAuthority":"军委","constructionPeriod":"1","isimportent":1,"level1":"东部战区","level2":"东海","level3":"战场设施建设计划","level4":"“十二五”战场建设计划","level5":"东部战区","timestamp":1555036742174,"subprojectId":null,"subName":"3","startTimeCon":"Fri Apr 12 2019 10:27:45 GMT+0800 (中国标准时间)","endTimeCon":"Fri Apr 12 2019 10:27:45 GMT+0800 (中国标准时间)","submitFileName":"1","submitDepartment":"1","submitNumber":"1","submitDate":1554998400000,"approvalName":"1","approvalDepartment":"1","approvalNumber":"1","approvalDate":1554998400000,"submitFileNameTa":"1","submitDepartmentTa":"1","submitNumberTa":"1","submitDateTa":null,"approvalNameTa":"1","approvalDepartmentTa":"1","approvalNumberTa":"1","approvalDateTa":1554912000000,"replyDate":1554998400000,"approvalProgress":"全部完成","constructionContent":"1","projectNumber":"1","constructionPlace":"1","constructionCompany":"1","releaseInvestment":1,"constructionPhase":"未开工","firstDesign":"未开展","bidding":"未启动","constructionDesign":"未开展","startTime":1554998400000,"testTime":"Fri Apr 12 2019 00:00:00 GMT+0800 (中国标准时间)","endTime":1554998400000,"projectProgress":88,"completedInvestment":1,"formedAbility":"1","designedAbility":"1","remarks":"1","reason":null,"department":"1","isIsimportent":1},{"projectId":null,"submitCompany":null,"projectName":"11项目","documentName":"东海1号","documentNumber":"东海1号","documentDate":1554912000000,"investmentamount":1,"approvalAuthority":"军委","constructionPeriod":"1","isimportent":1,"level1":"东部战区","level2":"东海","level3":"战场设施建设计划","level4":"“十二五”战场建设计划","level5":"东部战区","timestamp":1555036250013,"subprojectId":null,"subName":"2","startTimeCon":"Fri Apr 12 2019 10:27:45 GMT+0800 (中国标准时间)","endTimeCon":"Fri Apr 12 2019 10:27:45 GMT+0800 (中国标准时间)","submitFileName":"1","submitDepartment":"1","submitNumber":"1","submitDate":1554998400000,"approvalName":"1","approvalDepartment":"1","approvalNumber":"1","approvalDate":1554998400000,"submitFileNameTa":"1","submitDepartmentTa":"1","submitNumberTa":"1","submitDateTa":null,"approvalNameTa":null,"approvalDepartmentTa":"1","approvalNumberTa":"1","approvalDateTa":1554912000000,"replyDate":1554998400000,"approvalProgress":"全部完成","constructionContent":"1","projectNumber":"1","constructionPlace":"1","constructionCompany":"1","releaseInvestment":1,"constructionPhase":"未开工","firstDesign":"未开展","bidding":"未启动","constructionDesign":"未开展","startTime":1554998400000,"testTime":"Fri Apr 12 2019 00:00:00 GMT+0800 (中国标准时间)","endTime":1554998400000,"projectProgress":97,"completedInvestment":1,"formedAbility":"1","designedAbility":"1","remarks":"1","reason":null,"department":"1","isIsimportent":1}];
var editbtn = [];


dList.forEach((item, index) => {
    var num  = index;
    var tr = `
    <tr>
        <td>${index+1}</td><td>${item.documentDate}</td><td>${item.projectName}</td><td>${item.submitCompany}</td>
        <td>
            <div class="easyui-progressbar" data-options="value:'${item.projectProgress}'" style="width:250px;margin-left:25px;"></div>
        </td>
        <td >
            <button class="btn" id="edit__${index}"><img src="img/编辑.png" /><span>编辑</span></button>
            <button><img src="img/删除.png" /><span>删除</span></button>
        </td>
    </tr>
    `;
    $("#tbody").append(tr); 
     
});



//编辑btn 点击事件
$( "button[id^='edit_']" ).each( function(){//获取所有的id为edit_开头的Button
    $(this).bind("click" , function(){//绑定当前点击的按钮
        var ids = $(this).attr("id");//获取它的id属性值
        var arr = ids.split("__" );
        var listNumber = arr[1];
        console.log(dList[listNumber]);        
        var sHeight = document.documentElement.scrollHeight;
        var sWidth = document.documentElement.scrollWidth;
        var wHeight=document.documentElement.clientHeight;
        var wWidth=document.documentElement.clientWidth;
        var mask = document.createElement('div');
        mask.id="fmask";
        mask.style.height=sHeight+"px";
        mask.style.width = sWidth+"px";
        document.body.appendChild(mask);
        var con = document.getElementsByClassName('formCon');
        con[0].style.display = 'block'; 
        var close = document.getElementById("fclose");
        mask.onclick=close.onclick=function () {
            document.body.removeChild(mask);
            con[0].style.display='none';
        }
        
        $(function(){
            $('#box').tabs({
                height:600,
                tools:[{
                    iconCls:'icon-save',
                    text:'提交',
                    handler:function(){
                        console.log('开始提交请求');
                    //     $.ajax({
                    //         url: "/onps/schedule/submitProjectSchedule.do",
                    //         type: "post",
                    //         async: false,
                    //         data: {
                    //             //表A目录
                    //             "projectName": data.projectName,//项目名称
                    //             "documentName": data.documentName,//文件名
                    //             "documentNumber":data.documentNumber,//文件号
                    //             "documentDate": data.documentDate,//$("#documentDate").val(),//填报时间
                    //             "investmentamount": data.investmentamount,//计划投资
                    //             "approvalAuthority": data.approvalAuthority,//审批权限
                    //             "constructionPeriod": data.constructionPeriod,//建设周期
                    //             "isimportent": data.isimportent,//是否规划重点项目
                    //             "level1": data.level1,//五个地理位置
                    //             "level2": data.level2,//二级地理位置
                    //             "level3": data.level3,//建设计划
                    //             "level4": data.level4,//十几五建设计划
                    //             "level5": data.level5,//军区军兵种后勤
                    //             //"subprojectId": $("#subprojectId").val(),
                    //             //b 表
                    //             "subName": data.subName,//子项目名
                    //             "startTime":data.startTime,//$("#startTime").val(),//开工时间
                    //             "endTime": data.endTime,//$("#endTime").val(),//竣工时间
                    //             "submitFileName": data.submitFileName,//计划书送审文件名
                    //             "submitDepartment": data.submitDepartment,//计划书送审单位
                    //             "submitNumber": data.submitNumber,//计划书送审文号
                    //             "submitDate": data.submitDate,//$("#submitDate").val(),//计划书送审时间
                    //             "approvalName": data.approvalName,//计划书批复文件名
                    //             "approvalDepartment": data.approvalDepartment,//计划书批复单位
                    //             "approvalNumber": data.approvalNumber,//计划书批复文号
                    //             "approvalDate": data.approvalDate,//$("#approvalDate").val(),//计划书批复时间
                    //             "submitFileNameTa": data.submitFileNameTa,//任务书送审文件名
                    //             "submitDepartmentTa": data.submitDepartmentTa,//任务书送审单位
                    //             "submitNumberTa": data.submitNumberTa,//任务书送审文号
                    //             "submitDateTa": data.submitDateTa,//$("#submitDateTa").val(),//任务书送审时间
                    //             "approvalNameTa": data.approvalNameTa,//任务书批复文件名
                    //             "approvalDepartmentTa": data.approvalDepartmentTa,//任务书批复单位
                    //             "approvalNumberTa": data.approvalNumberTa,//任务书批复文号
                    //             "approvalDateTa": data.approvalDateTa,//$("#approvalDateTa").val(),//任务书批复时间
                    //             "replyDate": data.replyDate,//$("#replyDate").val(),//军委机关回复时间
                    //             "approvalProgress": data.approvalProgress,//审批进展
                    //             "constructionContent": data.constructionContent,//主要建设内容以及发展
                    //             "projectNumber": data.projectNumber,//工程代号
                    //             "constructionPlace": data.constructionPlace,//建设地点
                    //             "constructionCompany": data.constructionCompany,//建设单位
                    //             "releaseInvestment": data.releaseInvestment,//下达投资（万元）
                    //             //c 表
                    //             "constructionPhase": data.constructionPhase,//建设阶段
                    //             "firstDesign": data.firstDesign,//初步设计
                    //             "bidding": data.bidding,//招标采购
                    //             "constructionDesign": data.constructionDesign,//施工图设计
                    //             "startTimeCon": data.startTimeCon,//$("#startTimeCon").val(),//建设开工时间
                    //             "testTimeCon":data.testTimeCon,//初验时间
                    //             "endTimeCon":data.endTimeCon,//竣工时间
                    //             "projectProgress": data.projectProgress,//工程进度
                    //             "reason":data.reason,
                    //             "completedInvestment": data.completedInvestment,//已经完成投资
                    //             "formedAbility": data.formedAbility,//已经形成能力
                    //             "designedAbility": data.designedAbility,//完工后预期形成能力
                    //             "remarks": data.remarks,//备注
                    //             "department": data.department//提交部门
                    //         },
                    //         success: function (data) {
                    //             console.log(data);
                    //             if (data.status == 'S00001') {
                    //                 alert(data.message);
                    //             } else {
                    //                 alert(data.message);
                    //             }
            
                    //         },
                    //         error: function (data) {
                    //             console.log(data);
                    //             alert("请求失败!");
                    //         }
                    //     });
                    }
                },{
                    iconCls:'icon-clear',
                    text:'清除',
                    handler:function () {
                        $('#a_1').combotree('setText',null);
                        data.level1="";
                        $('#a_2').combotree('setText',null);
                        data.level2="";
                        $('#a_3').combotree('setText',null);
                        data.level3="";
                        data.level4="";
                        data.level5="";
                        data.projectName="";
                        $('#a_4').combotree('setText',null);
                        data.documentName="";
                        $('#a_5').combotree('setText',null);
                        data.documentNumber="";
                        $('#a_6').datebox('setValue',null);
                        data.documentDate=new Date();
                        $('#a_7').textbox('setText',null);
                        data.investmentamount="";
                        $('#a_8').combotree('setText',null);
                        data.approvalAuthority="";
                        $('#a_9').textbox('setText',null);
                        data.constructionPeriod="";
                        $('#a_10').textbox('setText',null);
                        data.isimportent="";
                        //b表清除
                        $('#b_1').textbox('setText',null);
                        data.subName="";
                        $('#b_2').textbox('setText',null);
                        data.department="";
                        $('#b_3').textbox('setText',null);
                        data.submitFileName="";
                        $('#b_4').textbox('setText',null);
                        data.submitDepartment="";
                        $('#b_5').textbox('setText',null);
                        data.submitNumber="";
                        $('#b_6').datebox('setValue',null);
                        data.submitDate=new Date();
                        $('#b_7').textbox('setText',null);
                        data.approvalName="";
                        $('#b_8').textbox('setText',null);
                        data.approvalDepartment="";
                        $('#b_9').textbox('setText',null);
                        data.approvalNumber="";
                        $('#b_10').datebox('setValue',null);
                        data.approvalDate=new Date();
                        $('#b_11').textbox('setText',null);
                        data.submitFileNameTa="";
                        $('#b_12').textbox('setText',null);
                        data.submitDepartmentTa="";
                        $('#b_13').textbox('setText',null);
                        data.submitNumberTa="";
                        $('#b_14').datebox('setValue',null);
                        data.submitDateTa=new Date();
                        $('#b_15').textbox('setText',null);
                        data.approvalNameTa="";
                        $('#b_16').textbox('setText',null);
                        data.approvalDepartmentTa="";
                        $('#b_17').textbox('setText',null);
                        data.approvalNumberTa="";
                        $('#b_18').datebox('setValue',null);
                        data.approvalDateTa=new Date();
                        $('#b_25').datebox('setValue',null);
                        data.startTime=new Date();
                        $('#b_26').datebox('setValue',null);
                        data.endTime=new Date();
                        $('#b_19').datebox('setValue',null);
                        data.replyDate=new Date();
                        $('#b_20').combotree('setText',null);
                        data.approvalProgress="";
                        $('#b_21').textbox('setText',null);
                        data.constructionContent="";
                        $('#b_22').textbox('setText',null);
                        data.projectNumber="";
                        $('#b_23').textbox('setText',null);
                        data.constructionPlace="";
                        $('#b_24').textbox('setText',null);
                        data.constructionCompany="";
                        $('#b_27').textbox('setText',null);
                        data.releaseInvestment="";
                        //c表清除
                        $('#c_1').combotree('setText',null);
                        data.constructionPhase="";
                        $('#c_2').combotree('setText',null);
                        data.firstDesign="";
                        $('#c_3').combotree('setText',null);
                        data.bidding="";
                        $('#c_4').combotree('setText',null);
                        data.constructionDesign="";
                        $('#c_5').datebox('setValue',null);
                        data.startTimeCon = new Date();
                        $('#c_6').datebox('setValue',null);
                        data.testTimeCon = new Date();
                        $('#c_7').datebox('setValue',null);
                        data.endTimeCon = new Date();
                        $('#reason').textbox('setText',null);
                        data.reason="";
                        $('#c_8').textbox('setText',null);
                        data.projectProgress="";
                        $('#c_9').textbox('setText',null);
                        data.completedInvestment="";
                        $('#c_10').textbox('setText',null);
                        data.formedAbility="";
                        $('#c_11').textbox('setText',null);
                        data.designedAbility="";
                        $('#c_12').textbox('setText',null);
                        data.remarks="";
                    }
                }]
            });
            $('#a_1').combotree({
                width:250,
                labelPosition:'top',
                labelWidth:100,
                required:true,
                label:'战略方向：',
                onChange:function(){
                    data.level1 = $('#a_1').combotree('getText');
                } 
            });
            $('#a_1').combotree('loadData',[{
                "id":"e",
                "text":"东部战区",
                "iconCls":"icon-blank"
            },{
                "id":"w",
                "text":"西部战区",
                "iconCls":"icon-blank"
            },{
                "id":"s",
                "text":"南部战区",
                "iconCls":"icon-blank"
            },{
                "id":"n",
                "text":"北部战区",
                "iconCls":"icon-blank"
            },{
                "id":"m",
                "text":"中部战区",
                "iconCls":"icon-blank"
            }]);
            $('#a_1').combotree('setText',dList[listNumber].level1);
            $('#a_2').combotree({
                width:250,
                labelWidth:120,
                labelPosition:'top',
                required:true,
                label:'二级战略方向：',
                onChange:function(){
                    data.level2 = $('#a_2').combotree('getText');
                } 
            });
            $('#a_2').combotree('loadData',[{
                "id":"dh",
                "text":"东海",
                "iconCls":"icon-blank"
            },{
                "id":"th",
                "text":"台海",
                "iconCls":"icon-blank"
            },{
                "id":"nh",
                "text":"南海",
                "iconCls":"icon-blank"
            },{
                "id":"zy",
                "text":"中越",
                "iconCls":"icon-blank"
            },{
                "id":"zm",
                "text":"中缅",
                "iconCls":"icon-blank"
            },{
                "id":"zyin",
                "text":"中印",
                "iconCls":"icon-blank"
            },{
                "id":"zc",
                "text":"中朝",
                "iconCls":"icon-blank"
            },{
                "id":"zmeng",
                "text":"中蒙",
                "iconCls":"icon-blank"
            },{
                "id":"ze",
                "text":"中俄",
                "iconCls":"icon-blank"
            }]);
            $('#a_2').combotree('setText',dList[listNumber].level2);

            $('#a_3').combotree({
                required:true,
                width:250,
                labelWidth:120,
                labelPosition:'top',
                label:'项目名称：',
                onSelect: function (node) {
                    //获取选中项的父节点
                    var father = $(this).tree("getParent", node.target);
                    //获取选中项的爷爷节点
                    var grandpa =  $(this).tree('getParent',father.target);
                    //获取选中项的顶级节点
                    var topfather = $(this).tree("getRoot", node.target);
        
                    data.level5 = father.text;
                    data.level4 = grandpa.text;
                    data.level3 = topfather.text;
                    data.projectName = node.text;
                   
                }
            });
           $('#a_3').combotree('loadData',[
        {
            "id":'build',
            "text":"战场设施建设计划",
            "state":"closed",
            "iconCls":"icon-blank",
            "children":[{
                "id":"plan_a",
                "state":"closed",
                "iconCls":"icon-blank",
                "text":"“十二五”战场建设计划",
                "children":[{
                    "id":"east",
                    "text":"东部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'11项目'}]
                },{
                    "id":'west',
                    "text":"西部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"4",
                        "text":'XXX项目'}]
                },{
                    "id":'south',
                    "text":"南部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'north',
                    "text":"北部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'middle',
                    "text":"中部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'land',
                    "text":"陆军",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'navy',
                    "text":"海军",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'air',
                    "text":"空军",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'rocket',
                    "text":"火箭军",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'strategic_support',
                    "text":"战略支援部队",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'space',
                    "text":"军事航天部队",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'network',
                    "text":"网络空间部队",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'info',
                    "text":"信息通信基地",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'service',
                    "text":"联勤保障部队",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                },{
                    "id":'military_commission',
                    "text":"军委国防动员部",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "text":'XXX项目'}]
                }]
            },{
                "id":"plan_b",
                "text":"“十二五”第四批立项调整项目",
                "state":"closed",
                "iconCls":"icon-blank"

            },{
                "id":"plan_c",
                "text":"“十三五”战场建设计划",
                "state":"closed",
                "iconCls":"icon-blank",
            }]
        },{
            "id":"210",
            "text":"210工程",
            "state":"closed",
            "iconCls":"icon-blank"
        },{
            "id":"zx",
            "state":"closed",
            "text":"专项工程",
            "iconCls":"icon-blank"
        }
    ]);
            $('#a_3').combotree('setText',dList[listNumber].level5);

            /*文件名需要回显options*/ 
            $('#a_4').combotree({
                width:250,
                labelWidth:180,
                required:true,
                labelPosition:"top",
                label:'规划/计划文件文件名：',
                onChange:function(){
                    data.documentName = $('#a_4').combotree('getText');
                } 
            })
            $('#a_4').combotree('loadData',[
                {
                    "id":"dh",
                    "text":"东海1号",
                    "iconCls":"icon-blank"
                },{
                    "id":"th",
                    "text":"台海1号",
                    "iconCls":"icon-blank"
                },{
                    "id":"nh",
                    "text":"南海1号",
                    "iconCls":"icon-blank"
                },{
                    "id":"zy",
                    "text":"中越1号",
                    "iconCls":"icon-blank"
                },{
                    "id":"zm",
                    "text":"中缅1号",
                    "iconCls":"icon-blank"
                },{
                    "id":"zyin",
                    "text":"中印1号",
                    "iconCls":"icon-blank"
                },{
                    "id":"zc",
                    "text":"中朝1号",
                    "iconCls":"icon-blank"
                }
            ]);
            $('#a_4').combotree('setText',dList[listNumber].documentName);
           /*文号需要回显options*/ 
           $('#a_5').combotree({
                width:250,
                labelWidth:180,
                labelPosition:"top",
                required:true,
                label:'规划/计划文件文号：',
                onChange:function(){
                    data.documentNumber = $('#a_5').combotree('getText');
                } 
            })
            $('#a_5').combotree('loadData',[
                {
                    "id":"dh",
                    "text":"东海1号下的00号文件",
                    "iconCls":"icon-blank"
                },{
                    "id":"th",
                    "text":"台海1号下的00号文件",
                    "iconCls":"icon-blank"
                },{
                    "id":"nh",
                    "text":"南海1号下的00号文件",
                    "iconCls":"icon-blank"
                },{
                    "id":"zy",
                    "text":"中越1号下的00号文件",
                    "iconCls":"icon-blank"
                },{
                    "id":"zm",
                    "text":"中缅1号下的00号文件",
                    "iconCls":"icon-blank"
                },{
                    "id":"zyin",
                    "text":"中印1号下的00号文件",
                    "iconCls":"icon-blank"
                },{
                    "id":"zc",
                    "text":"中朝1号下的00号文件",
                    "iconCls":"icon-blank"
                }
            ]);
            
            $('#a_5').combotree('setText',dList[listNumber].documentNumber);

            $('#a_6').datebox({
                required:true,
                width:250,
                label:'规划/计划文件时间：',
                labelPosition:'top',
                labelWidth:180,
                onSelect:function(date){
                    data.documentDate = new Date(date);
                }
            });
            var documentDate =  format(dList[listNumber].documentDate);
            $('#a_6').datebox('setValue',documentDate);

            $('#a_7').textbox({
                required:true,
                width:250,
                editable:true,
                hasDownArrow:false,
                label:'规划/计划投资（万元）：',
                labelPosition:'top',
                labelWidth:180,
                onChange:function(){
                    data.investmentamount = $('#a_7').textbox('getText');
                }
            });
            $('#a_7').textbox('setText',dList[listNumber].investmentamount);

            $('#a_8').combotree({
                width:250,
                labelWidth:180,
                required:true,
                label:'审批权限：',
                labelPosition:'top',
                onChange:function(){
                    data.approvalAuthority = $('#a_8').combotree('getText');
                } 
            })
            $('#a_8').combotree('loadData',[
                {
                    "id":"jw",
                    "text":"军委",
                    "iconCls":"icon-blank"
        
                },{
                    "id":"jz",
                    "text":"军种",
                    "iconCls":"icon-blank"
        
                },{
                    "id":"210",
                    "text":"210工程",
                    "iconCls":"icon-blank"
        
                }
            ]);
            $('#a_8').combotree('setText',dList[listNumber].approvalAuthority);


            $('#a_9').textbox({
                required:true,
                width:250,
                editable:true,
                label:'建设周期（年）：',
                labelPosition:'top',
                labelWidth:130,
                onChange:function(){
                    data.constructionPeriod = $(this).textbox('getText');
                   
                }
            });
            $('#a_9').textbox('setText',dList[listNumber].constructionPeriod);

            $('#a_10').combotree({
                width:250,
                labelWidth:280,
                required:true,
                label:'规划纲要重点项目：',
                labelPosition:'top',
                onChange:function(){
                    data.isimportent = $('#a_10').combotree('getValue');
                   
                } 
            });
            $('#a_10').combotree('loadData',[{
                "id":"1",
                "text":"是",
                "iconCls":'icon-blank'
            },{
                "id":"0",
                "text":"否",
                "iconCls":'icon-blank'
            }]);
            $('#a_10').combotree('setText',dList[listNumber].isimportent);

            // div titleB
            $('#b_1').textbox({
                required:true,
                width:350,
                label:"子项目名称：",
                labelPosition:'top',
                labelWidth:120,
                onChange:function(){
                    data.subName  = $(this).textbox('getText');
                   
                }
            });
            $('#b_1').textbox('setText',dList[listNumber].subName);

            $('#b_2').textbox({
                width:350,
                required:true,
                label:'填报单位:',
                labelPosition:'top',
                labelWidth:120,
                onChange:function(){
                    data.department  = $(this).textbox('getText');
                   
                }
            });
            $('#b_2').textbox('setText',dList[listNumber].department);

            $('#b_3').textbox({
                width:350,
                required:true,
                label:'立项送审文件名:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.submitFileName  = $(this).textbox('getText');
                 
                }
            });
            $('#b_3').textbox('setText',dList[listNumber].submitFileName);

            $('#b_4').textbox({
                width:350,
                required:true,
                label:'立项送审送审单位:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.submitDepartment  = $(this).textbox('getText');
                  
                }
            });
            $('#b_4').textbox('setText',dList[listNumber].submitDepartment);

            $('#b_5').textbox({
                width:350,
                required:true,
                label:'立项送审文号:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.submitNumber  = $(this).textbox('getText');
                   
                }
            });
            $('#b_5').textbox('setText',dList[listNumber].submitNumber);

            $('#b_6').datebox({
                width:350,
                required:true,
                label:'立项送审时间:',
                labelPosition:'top',
                labelWidth:280,
                onSelect:function(date){
                    data.submitDate =  new Date(date);
                  
                }
            });
            var submitDate =  format(dList[listNumber].submitDate);
            $('#b_6').datebox('setValue',submitDate);

            $('#b_7').textbox({
                width:350,
                required:true,
                label:'立项批复文件名:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.approvalName  = $(this).textbox('getText');
                 
                }
            });
            $('#b_7').textbox('setText',dList[listNumber].approvalName);

            $('#b_8').textbox({
                width:350,
                required:true,
                label:'立项批复审批单位:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.approvalDepartment  = $(this).textbox('getText');
                    
                }
            });
            $('#b_8').textbox('setText',dList[listNumber].approvalDepartment);

            $('#b_9').textbox({
                width:350,
                required:true,
                label:'立项批复文号:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.approvalNumber  = $(this).textbox('getText');
                   
                }
            });
            $('#b_9').textbox('setText',dList[listNumber].approvalNumber);

            $('#b_10').datebox({
                width:350,
                required:true,
                label:'立项批复时间:',
                labelPosition:'top',
                labelWidth:280,
                onSelect:function(date){
                    data.approvalDate = new Date(date);
                  
                }
            });
            var approvalDate =  format(dList[listNumber].approvalDate);
            $('#b_10').datebox('setValue',approvalDate);
            
            $('#b_11').textbox({
                width:350,
                required:true,
                label:'设计任务书送审文件名:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.submitFileNameTa  = $(this).textbox('getText');
                    
                }
            });
            $('#b_11').textbox('setText',dList[listNumber].submitFileNameTa);

            $('#b_12').textbox({
                width:350,
                required:true,
                label:'设计任务书送审送审单位:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.submitDepartmentTa  = $(this).textbox('getText');
                   
                }
            });
            $('#b_12').textbox('setText',dList[listNumber].submitDepartmentTa);

            $('#b_13').textbox({
                width:350,
                required:true,
                label:'设计任务书送审文号:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.submitNumberTa  = $(this).textbox('getText');
                   
                }
            });
            $('#b_13').textbox('setText',dList[listNumber].submitNumberTa);

            $('#b_14').datebox({
                width:350,
                required:true,
                label:'下达设计任务书、建设计划（批复）送审时间:',
                labelPosition:'top',
                labelWidth:380,
                onSelect:function(date){
                    data.submitDateTa =new Date(date);
                    
                }
            });
            var submitDateTa =  format(dList[listNumber].submitDateTa);
            $('#b_14').datebox('setValue',submitDateTa);

            $('#b_15').textbox({
                width:350,
                required:true,
                label:'下达设计任务书、建设计划（批复）文件名:',
                labelPosition:'top',
                labelWidth:380,
                onChange:function(){
                    data.approvalNameTa  = $(this).textbox('getText');
                   
                }
            });
            $('#b_15').textbox('setText',dList[listNumber].approvalNameTa);

            $('#b_16').textbox({
                width:350,
                required:true,
                label:'下达设计任务书、建设计划（批复）审批单位:',
                labelPosition:'top',
                labelWidth:380,
                onChange:function(){
                    data.approvalDepartmentTa  = $(this).textbox('getText');
                   
                }
            });
            $('#b_16').textbox('setText',dList[listNumber].approvalDepartmentTa);

            $('#b_17').textbox({
                width:350,
                required:true,
                label:'下达设计任务书、建设计划（批复）文号:',
                labelPosition:'top',
                labelWidth:380,
                onChange:function(){
                    data.approvalNumberTa  = $(this).textbox('getText');
                   
                }
            });
            $('#b_17').textbox('setText',dList[listNumber].approvalNumberTa);

            $('#b_18').datebox({
                width:350,
                required:true,
                label:'下达设计任务书、建设计划（批复）时间:',
                labelPosition:'top',
                labelWidth:380,
                onSelect:function(date){
                    data.approvalDateTa = new Date(date);
                   
                }
            });
            var approvalDateTa =  format(dList[listNumber].approvalDateTa);
            $('#b_18').datebox('setValue',approvalDateTa);

            $('#b_19').datebox({
                width:350,
                required:true,
                label:'军委机关审核意见回复时间:',
                labelPosition:'top',
                labelWidth:200,
                onSelect:function(date){
                    data.replyDate = new Date(date);
                   
                }
            });
            var replyDate =  format(dList[listNumber].replyDate);
            $('#b_18').datebox('setValue',replyDate);

            $('#b_20').combotree({
                width:350,
                labelWidth:280,
                labelPosition:'top',
                required:true,
                label:'审批进展：',
                onChange:function(){
                    data.approvalProgress = $('#b_20').combotree('getText');
                  
                } 
            })
            $('#b_20').combotree('loadData',[
                {
                    "id":"1",
                    "text":"全部完成",
                    "iconCls":'icon-blank'
                },{
                    "id":"2",
                    "text":"部分完成",
                    "iconCls":'icon-blank'
                },{
                    "id":"3",
                    "text":"待审批",
                    "iconCls":'icon-blank'
                }
            ]);
            $('#b_20').combotree('setText',dList[listNumber].approvalProgress);

            $('#b_21').textbox({
                width:880,
                height:200,
                multiline:true,
                required:true,
                label:'主要建设内容和工程量：',
                labelPosition:"top",
                labelWidth:200,
                onChange:function(){
                    data.constructionContent  = $(this).textbox('getText');
                   
                }
            });
            $('#b_21').textbox('setText',dList[listNumber].constructionContent);

            $('#b_22').textbox({
                width:350,
                required:true,
                label:'工程代号:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.projectNumber  = $(this).textbox('getText');
                   
                }
            });
            $('#b_22').textbox('setText',dList[listNumber].projectNumber);

            $('#b_23').textbox({
                width:350,
                required:true,
                label:'建设地点:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.constructionPlace  = $(this).textbox('getText');
                 
                }
            });
            $('#b_23').textbox('setText',dList[listNumber].constructionPlace);

            $('#b_24').textbox({
                width:350,
                required:true,
                label:'建设单位:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.constructionCompany  = $(this).textbox('getText');
                    
                }
            });
            $('#b_24').textbox('setText',dList[listNumber].constructionCompany);

            $('#b_25').datebox({
                width:350,
                required:true,
                label:'开工时间:',
                labelPosition:'top',
                labelWidth:280,
                onSelect:function(date){
                    data.startTime = new Date(date);
                   
                }
            });
            var startTime =  format(dList[listNumber].startTime);
            $('#b_25').datebox('setValue',startTime);

            $('#b_26').datebox({
                width:350,
                required:true,
                label:'竣工时间:',
                labelPosition:'top',
                labelWidth:280,
                onSelect:function(date){
                    data.endTime = new Date(date);
                    
                }
            });
            var endTime =  format(dList[listNumber].endTime);
            $('#b_26').datebox('setValue',endTime);

            $('#b_27').textbox({
                width:350,
                required:true,
                label:'下达投资（万元）:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.releaseInvestment  = $(this).textbox('getText');
                   
                }
            });
            $('#b_27').textbox('setText',dList[listNumber].releaseInvestment);

            // div title c  
            $('#c_1').combotree({
                width:350,
                labelWidth:280,
                labelPosition:'top',
                required:true,
                label:'审批进展：',
                onChange:function(){
                    data.constructionPhase = $('#c_1').combotree('getText');
                 
                } 
            })
            $('#c_1').combotree('loadData',[
                {
                    "id":"1",
                    "text":"未开工",
                    "iconCls":'icon-blank'
                },{
                    "id":"2",
                    "text":"在建",
                    "iconCls":'icon-blank'
                },{
                    "id":"3",
                    "text":"竣工",
                    "iconCls":'icon-blank'
                }
            ]);
            $('#c_1').combotree('setText',dList[listNumber].constructionPhase);

            $('#c_2').combotree({
                width:350,
                labelWidth:280,
                labelPosition:'top',
                required:true,
                label:'初步设计',
                onChange:function(){
                    data.firstDesign = $('#c_2').combotree('getText');
                   
                } 
            })
            $('#c_2').combotree('loadData',[
                {
                    "id":"1",
                    "text":"未开展",
                    "iconCls":'icon-blank'
                },{
                    "id":"2",
                    "text":"正在进行",
                    "iconCls":'icon-blank'
                },{
                    "id":"3",
                    "text":"已完成",
                    "iconCls":'icon-blank'
                }
            ]);
            $('#c_2').combotree('setText',dList[listNumber].firstDesign);

        
            $('#c_3').combotree({
                width:350,
                labelWidth:280,
                labelPosition:'top',
                required:true,
                label:'招标采购：',
                onChange:function(){
                    data.bidding = $('#c_3').combotree('getText');
                  
                } 
            })
            $('#c_3').combotree('loadData',[
                {
                    "id":"1",
                    "text":"未启动",
                    "iconCls":'icon-blank'
                },{
                    "id":"2",
                    "text":"正在拟制招标采购方案",
                    "iconCls":'icon-blank'
                },{
                    "id":"3",
                    "text":"正在进行招标采购",
                    "iconCls":'icon-blank'
                },{
                    "id":"4",
                    "text":"已完成",
                    "iconCls":'icon-blank'
                }
            ]);
            $('#c_3').combotree('setText',dList[listNumber].bidding);

        
            $('#c_4').combotree({
                width:350,
                labelWidth:280,
                labelPosition:'top',
                label:'施工图设计：',
                onChange:function(){
                    data.constructionDesign = $('#c_4').combotree('getText');
                   
                } 
            })
            $('#c_4').combotree('loadData',[
                {
                    "id":"1",
                    "text":"未开展",
                    "iconCls":'icon-blank'
                },{
                    "id":"2",
                    "text":"正在进行",
                    "iconCls":'icon-blank'
                },{
                    "id":"3",
                    "text":"已完成",
                    "iconCls":'icon-blank'
                }
            ]);
            $('#c_4').combotree('setText',dList[listNumber].constructionDesign);

            $('#c_5').datebox({
                required:true,
                label:'开工时间:',
                width:350,
                labelWidth:280,
                labelPosition:'top',
                onSelect:function(date){
                    data.startTimeCon = new Date(date);   
                }
            });
            var startTimeCon =  format(dList[listNumber].startTimeCon);
            $('#c_5').datebox('setValue',startTimeCon);

            $('#c_6').datebox({
                required:true,
                label:'初验时间:',
                width:350,
                labelWidth:280,
                labelPosition:'top',
                onSelect:function(date){
                    data.testTimeCon = new Date(date);
                 
                }
            });
            var testTimeCon =  format(dList[listNumber].testTimeCon);
            $('#c_6').datebox('setValue',testTimeCon);

            $('#c_7').datebox({
                width:350,
                labelWidth:280,
                labelPosition:'top',
                required:true,
                label:'竣工时间:',
                onSelect:function(date){
                    data.endTimeCon = new Date(date);
                 
                }
            });
            var endTimeCon =  format(dList[listNumber].endTimeCon);
            $('#c_7').datebox('setValue',endTimeCon);

            $('#reason').textbox({
                width:350,
                labelWidth:280,
                labelPosition:'top',
                required:true,
                label:'未开工原因:',
                onChange:function(){
                    data.reason = $('#reason').textbox('getText');
                    
                } 
            });
            $('#reason').textbox('setText',dList[listNumber].reason);

            $('#c_8').textbox({
                required:true,
                label:'工程进度（请输入整数）:',
                width:350,
                labelWidth:280,
                labelPosition:'top',
                onChange:function(){
                    data.projectProgress = $('#c_8').textbox('getText');
                } 
            });
            $('#c_8').textbox('setText',dList[listNumber].projectProgress);

            $('#c_9').textbox({
                width:350,
                labelWidth:280,
                labelPosition:'top',
                required:true,
                label:'完成投资（万元）:',
                onChange:function(){
                    data.completedInvestment = $('#c_9').textbox('getText');
                    
                } 
            });
            $('#c_9').textbox('setText',dList[listNumber].completedInvestment);

            $('#c_10').textbox({
                width:880,
                height:200,
                multiline:true,
                required:true,
                label:'已形成能力:',
                labelPosition:'top',
                labelWidth:100,
                onChange:function(){
                    data.formedAbility = $('#c_10').textbox('getText');
                   
                } 
            });
            $('#c_10').textbox('setText',dList[listNumber].formedAbility);

            $('#c_11').textbox({
                width:880,
                height:200,
                multiline:true,
                required:true,
                label:'完工后预期形成能力:',
                labelPosition:'top',
                labelWidth:280,
                onChange:function(){
                    data.designedAbility = $('#c_11').textbox('getText');
                   
                } 
            });
            $('#c_11').textbox('setText',dList[listNumber].designedAbility);

            $('#c_12').textbox({
                width:880,
                height:100,
                multiline:true,
                required:true,
                label:'备注:',
                labelPosition:'top',
                labelWidth:100,
                onChange:function(){
                    data.remarks = $('#c_12').textbox('getText');
                   
                } 
            });
            $('#c_12').textbox('setText',dList[listNumber].remarks);

        });
    });

});
