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
// window.onload=function(){
//     $(".content").css("height","1000px");
//     console.log("success");
// }
data.forEach((item, index) => {
    var img = document.getElementsByTagName('img');
    var tr = `
    <tr>
        <td>${index+1}</td><td>${item.date}</td><td>${item.project}</td><td>${item.company}</td>
        <td>
            <div class="easyui-progressbar" data-options="value:70" style="width:200px;margin-left:15%;margin-right:-50px;"></div>
        </td>
        <td>
            <button><img src="img/编辑.png" /><span>编辑</span></button>
            <button><img src="img/导出.png" /><span>导出</span></button>
            <button><img src="img/删除.png" /><span>删除</span></button>
        </td>
    </tr>
    `;
    $("#tbody").append(tr);
});
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
    len = $("#tbody tr").length - 1;
    page = len % pageSize==0 ? len/pageSize : Math.floor(len/pageSize)+1;
    curPage=1;
    displayPage(1);

    document.getElementById("btn0").innerHTML="当前 " + curPage + "/" + page + " 页    每页 ";
    document.getElementById("sum").innerHTML="共计 " + len + "条"+'&nbsp;&nbsp;';        // 显示数据量
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
    alert('1111');
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
    "state":"close",
    "children":[{
        "id":"eo",
        "state":"closed",
        "text":"东海"
    },{
        "id":"et",
        "state":"closed",
        "text":"台海"
    }]
},{
    "id":"south",
    "text":"南部战区",
    "state":"close",
    "children":[{
        "id":"so",
        "state":"closed",
        "text":"南海"
    },{
        "id":"cv",
        "state":"closed",
        "text":"中越"
    },{
        "id":"cm",
        "state":"closed",
        "text":"中缅"
    }]
},{
    "id":"west",
    "text":"西部战区",
    "state":"close",
    "children":[{
        "id":"cr",
        "state":"closed",
        "text":"中俄"
    },{
        "id":"ci",
        "state":"closed",
        "text":"中印"
    }]
},{
    "id":"north",
    "text":"北部战区",
    "state":"close",
    "children":[{
        "id":"cg",
        "state":"closed",
        "text":"中蒙"
    },{
        "id":"ck",
        "state":"closed",
        "text":"中朝"
    }]
},{
    "id":"middle",
    "text":"中部战区",
    "state":"close",
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
    "state":"close",
    "children":[{
        "id":"1a",
        "text":"“十二五”战场建设计划"
    },{
        "id":"1b",
        "text":"“十二五”第四批立项调整项目"
    },{
        "id":"1c",
        "text":"“十三五”战场建设计划"
    }]
},{
    "id":"2",
    "text":"“210工程”建设计划",
    "state":"close",
},{
    "id":"3",
    "text":"专项工程",
    "state":"close",
}]);
   