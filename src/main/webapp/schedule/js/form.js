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
/*
    移除tree-icon
*/

// data
data =  {
    //表A目录
    "projectName": "111222",//项目名称
    "documentName": "",
    "documentNumber": "",
    "documentDate": new Date(),//$("#documentDate").val(),
    "investmentamount": "",
    "approvalAuthority":"",
    "constructionPeriod": "",
    "isimportent": "",
    "level1": "",
    "level2": "",
    "level3": "",
    "level4": "",
    "level5": "",
    //"subprojectId": "",
    "subName": $("#subName").val(),
    "startTime": new Date(),//$("#startTime").val(),
    "submitFileName":"",
    "submitDepartment": "",
    "submitNumber": "",
    "submitDate": new Date(),//$("#submitDate").val(),
    "approvalName": "",
    "approvalDepartment": "",
    "approvalNumber": "",
    "approvalDate": new Date(),//$("#approvalDate").val(),
    "submitFileNameTa": "",
    "submitDepartmentTa": "",
    "submitNumberTa": "",
    "submitDateTa": new Date(),//$("#submitDateTa").val(),
    "approvalNameTa": "",
    "approvalDepartmentTa": "",
    "approvalNumberTa": "",
    "approvalDateTa": new Date(),//$("#approvalDateTa").val(),
    "replyDate": new Date(),//$("#replyDate").val(),
    "approvalProgress": "",
    "constructionContent": "",
    "projectNumber": "",
    "constructionPlace": "",
    "constructionCompany": "",
    "endTime": new Date(),//$("#endTime").val(),
    "releaseInvestment": "",
    "constructionPhase": "",
    "firstDesign": "",
    "bidding": "",
    "constructionDesign": "",
    "reason":"",
    "testTimeCon":new Date(),
    "endTimeCon": new Date(),
    "startTimeCon": new Date(),//$("#startTimeCon").val(),
    "projectProgress":"",
    "completedInvestment": "",
    "formedAbility": "",
    "designedAbility": "",
    "remarks":"",
    "department": ""
};
// combo onChange事件触发失败 ，改用combotree组件
$(function(){
    $('#box').tabs({
        // width:1400,
        height:600,
        border:true,
        tools:[{
            iconCls:'icon-save',
            text:'提交',
            handler:function(){
                $.ajax({
                    url: "/onps/schedule/submitProjectSchedule.do",
                    type: "post",
                    async: false,
                    data: {
                        //表A目录
                        "projectName": data.projectName,//项目名称
                        "documentName": data.documentName,//文件名
                        "documentNumber":data.documentNumber,//文件号
                        "documentDate": data.documentDate,//$("#documentDate").val(),//填报时间
                        "investmentamount": data.investmentamount,//计划投资
                        "approvalAuthority": data.approvalAuthority,//审批权限
                        "constructionPeriod": data.constructionPeriod,//建设周期
                        "isimportent": data.isimportent,//是否规划重点项目
                        "level1": data.level1,//五个地理位置
                        "level2": data.level2,//二级地理位置
                        "level3": data.level3,//建设计划
                        "level4": data.level4,//十几五建设计划
                        "level5": data.level5,//军区军兵种后勤
                        //"subprojectId": $("#subprojectId").val(),
                        //b 表
                        "subName": data.subName,//子项目名
                        "startTime":data.startTime,//$("#startTime").val(),//开工时间
                        "endTime": data.endTime,//$("#endTime").val(),//竣工时间
                        "submitFileName": data.submitFileName,//计划书送审文件名
                        "submitDepartment": data.submitDepartment,//计划书送审单位
                        "submitNumber": data.submitNumber,//计划书送审文号
                        "submitDate": data.submitDate,//$("#submitDate").val(),//计划书送审时间
                        "approvalName": data.approvalName,//计划书批复文件名
                        "approvalDepartment": data.approvalDepartment,//计划书批复单位
                        "approvalNumber": data.approvalNumber,//计划书批复文号
                        "approvalDate": data.approvalDate,//$("#approvalDate").val(),//计划书批复时间
                        "submitFileNameTa": data.submitFileNameTa,//任务书送审文件名
                        "submitDepartmentTa": data.submitDepartmentTa,//任务书送审单位
                        "submitNumberTa": data.submitNumberTa,//任务书送审文号
                        "submitDateTa": data.submitDateTa,//$("#submitDateTa").val(),//任务书送审时间
                        "approvalNameTa": data.approvalNameTa,//任务书批复文件名
                        "approvalDepartmentTa": data.approvalDepartmentTa,//任务书批复单位
                        "approvalNumberTa": data.approvalNumberTa,//任务书批复文号
                        "approvalDateTa": data.approvalDateTa,//$("#approvalDateTa").val(),//任务书批复时间
                        "replyDate": data.replyDate,//$("#replyDate").val(),//军委机关回复时间
                        "approvalProgress": data.approvalProgress,//审批进展
                        "constructionContent": data.constructionContent,//主要建设内容以及发展
                        "projectNumber": data.projectNumber,//工程代号
                        "constructionPlace": data.constructionPlace,//建设地点
                        "constructionCompany": data.constructionCompany,//建设单位
                        "releaseInvestment": data.releaseInvestment,//下达投资（万元）
                        //c 表
                        "constructionPhase": data.constructionPhase,//建设阶段
                        "firstDesign": data.firstDesign,//初步设计
                        "bidding": data.bidding,//招标采购
                        "constructionDesign": data.constructionDesign,//施工图设计
                        "startTimeCon": data.startTimeCon,//$("#startTimeCon").val(),//建设开工时间
                        "testTimeCon":data.testTimeCon,//初验时间
                        "endTimeCon":data.endTimeCon,//竣工时间
                        "projectProgress": data.projectProgress,//工程进度
                        "reason":data.reason,
                        "completedInvestment": data.completedInvestment,//已经完成投资
                        "formedAbility": data.formedAbility,//已经形成能力
                        "designedAbility": data.designedAbility,//完工后预期形成能力
                        "remarks": data.remarks,//备注
                        "department": data.department//提交部门
                    },
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
                console.log(data);
            }
        }]
    });
    
    $('#a_1').combotree({
        width:300,
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
    $('#a_2').combotree({
        width:300,
        labelWidth:120,
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
    $('#a_3').combotree({
        required:true,
        width:300,
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
                        "iconCls":"icon-blank",
                        "text":'11项目'}]
                },{
                    "id":'west',
                    "text":"西部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"4",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'south',
                    "text":"南部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'north',
                    "text":"北部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'middle',
                    "text":"中部战区",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'land',
                    "text":"陆军",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'navy',
                    "text":"海军",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'air',
                    "text":"空军",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'rocket',
                    "text":"火箭军",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'strategic_support',
                    "text":"战略支援部队",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'space',
                    "text":"军事航天部队",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'network',
                    "text":"网络空间部队",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'info',
                    "text":"信息通信基地",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'service',
                    "text":"联勤保障部队",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
                        "text":'XXX项目'}]
                },{
                    "id":'military_commission',
                    "text":"军委国防动员部",
                    "state":"closed",
                    "iconCls":"icon-blank",
                    "children":[{
                        "id":"3",
                        "iconCls":"icon-blank",
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
    /*文件名需要回显options*/ 
    $('#a_4').combotree({
        width:300,
        labelWidth:85,
        required:true,
        label:'文件名：',
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
   /*文号需要回显options*/ 
   $('#a_5').combotree({
        width:300,
        labelWidth:80,
        required:true,
        label:'文号：',
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
    
    $('#a_6').datebox({
        required:true,
        width:300,
        label:'时间：',
        labelPosition:'left',
        labelWidth:85,
        onSelect:function(date){
            data.documentDate = new Date(date);
        }
    })
    $('#a_7').textbox({
        required:true,
        width:300,
        editable:true,
        hasDownArrow:false,
        label:'规划/计划投资（万元）：',
        labelPosition:'left',
        labelWidth:180,
        onChange:function(){
            data.investmentamount = $('#a_7').textbox('getText');
        }
    });
    $('#a_8').combotree({
        width:300,
        labelWidth:80,
        required:true,
        label:'审批权限：',
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
  
    $('#a_9').textbox({
        required:true,
        width:300,
        editable:true,
        label:'建设周期：',
        labelPosition:'left',
        labelWidth:85,
        onChange:function(){
            data.constructionPeriod = $(this).textbox('getText');
           
        }
    });
    $('#a_10').combotree({
        width:300,
        labelWidth:280,
        required:true,
        label:'规划纲要重点项目：',
        labelPosition:'left',
        labelWidth:150,
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
    }])
    // div titleB
    $('#b_1').textbox({
        required:true,
        width:355,
        label:"子项目名称：",
        labelPosition:'left',
        labelWidth:135,
        onChange:function(){
            data.subName  = $(this).textbox('getText');
           
        }
    });
    $('#b_2').textbox({
        width:355,
        required:true,
        label:'填报单位:',
        labelPosition:'left',
        labelWidth:135,
        onChange:function(){
            data.department  = $(this).textbox('getText');
           
        }
    });
    $('#b_3').textbox({
        width:300,
        required:true,
        label:'文件名:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.submitFileName  = $(this).textbox('getText');
         
        }
    });
    $('#b_4').textbox({
        width:300,
        required:true,
        label:'送审单位:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.submitDepartment  = $(this).textbox('getText');
          
        }
    });
    $('#b_5').textbox({
        width:300,
        required:true,
        label:'文号:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.submitNumber  = $(this).textbox('getText');
           
        }
    });
    $('#b_6').datebox({
        width:300,
        required:true,
        label:'时间:',
        labelPosition:'left',
        labelWidth:80,
        onSelect:function(date){
            data.submitDate =  new Date(date);
          
        }
    });
    $('#b_7').textbox({
        width:300,
        required:true,
        label:'文件名:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.approvalName  = $(this).textbox('getText');
         
        }
    });
    $('#b_8').textbox({
        width:300,
        required:true,
        label:'审批单位:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.approvalDepartment  = $(this).textbox('getText');
            
        }
    });
    $('#b_9').textbox({
        width:300,
        required:true,
        label:'文号:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.approvalNumber  = $(this).textbox('getText');
           
        }
    });
    $('#b_10').datebox({
        width:300,
        required:true,
        label:'时间:',
        labelPosition:'left',
        labelWidth:80,
        onSelect:function(date){
            data.approvalDate = new Date(date);
          
        }
    });
    $('#b_11').textbox({
        width:300,
        required:true,
        label:'文件名:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.submitFileNameTa  = $(this).textbox('getText');
            
        }
    });
    $('#b_12').textbox({
        width:300,
        required:true,
        label:'送审单位:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.submitDepartmentTa  = $(this).textbox('getText');
           
        }
    });
    $('#b_13').textbox({
        width:300,
        required:true,
        label:'文号:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.submitNumberTa  = $(this).textbox('getText');
           
        }
    });
    $('#b_14').datebox({
        width:300,
        required:true,
        label:'时间:',
        labelPosition:'left',
        labelWidth:80,
        onSelect:function(date){
            data.submitDateTa =new Date(date);
            
        }
    });
    $('#b_15').textbox({
        width:300,
        required:true,
        label:'文件名:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.approvalNameTa  = $(this).textbox('getText');
           
        }
    });
    $('#b_16').textbox({
        width:300,
        required:true,
        label:'审批单位:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.approvalDepartmentTa  = $(this).textbox('getText');
           
        }
    });
    $('#b_17').textbox({
        width:300,
        required:true,
        label:'文号:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.approvalNumberTa  = $(this).textbox('getText');
           
        }
    });
    $('#b_18').datebox({
        width:300,
        required:true,
        label:'时间:',
        labelPosition:'left',
        labelWidth:80,
        onSelect:function(date){
            data.approvalDateTa = new Date(date);
           
        }
    });
    $('#b_19').datebox({
        width:320,
        required:true,
        label:'军委机关审核意见回复时间:',
        labelPosition:'left',
        labelWidth:200,
        onSelect:function(date){
            data.replyDate = new Date(date);
           
        }
    });
    $('#b_20').combotree({
        width:300,
        labelWidth:80,
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
    
    $('#b_21').textbox({
        width:1100,
        height:100,
        multiline:true,
        required:true,
        label:'主要建设内容和工程量：',
        labelPosition:"left",
        labelWidth:200,
        onChange:function(){
            data.constructionContent  = $(this).textbox('getText');
           
        }
    });
    $('#b_22').textbox({
        width:300,
        required:true,
        label:'工程代号:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.projectNumber  = $(this).textbox('getText');
           
        }
    });
    $('#b_23').textbox({
        width:300,
        required:true,
        label:'建设地点:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.constructionPlace  = $(this).textbox('getText');
         
        }
    });
    $('#b_24').textbox({
        width:300,
        required:true,
        label:'建设单位:',
        labelPosition:'left',
        labelWidth:80,
        onChange:function(){
            data.constructionCompany  = $(this).textbox('getText');
            
        }
    });
    $('#b_25').datebox({
        width:300,
        required:true,
        label:'开工时间:',
        labelPosition:'left',
        labelWidth:80,
        onSelect:function(date){
            data.startTime = new Date(date);
           
        }
    });
    $('#b_26').datebox({
        width:300,
        required:true,
        label:'竣工时间:',
        labelPosition:'left',
        labelWidth:80,
        onSelect:function(date){
            data.endTime = new Date(date);
            
        }
    });
    $('#b_27').textbox({
        width:300,
        required:true,
        label:'下达投资（万元）:',
        labelPosition:'left',
        labelWidth:130,
        onChange:function(){
            data.releaseInvestment  = $(this).textbox('getText');
           
        }
    });
    // div title c  
    $('#c_1').combotree({
        width:320,
        labelWidth:100,
        required:true,
        label:'建设阶段：',
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

    $('#c_2').combotree({
        width:320,
        labelWidth:100,
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

    $('#c_3').combotree({
        width:320,
        labelWidth:100,
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

    $('#c_4').combotree({
        width:320,
        labelWidth:100,
        required:true,
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
  
    
  
   
    $('#c_5').datebox({
        width:320,
        required:true,
        label:'开工时间:',
        labelPosition:'left',
        labelWidth:100,
        onSelect:function(date){
            data.startTimeCon = new Date(date);
            
        }

    });
    $('#c_6').datebox({
        width:320,
        required:true,
        label:'初验时间:',
        labelPosition:'left',
        labelWidth:100,
        onSelect:function(date){
            data.testTimeCon = new Date(date);
         
        }
    });
    $('#c_7').datebox({
        width:320,
        required:true,
        label:'竣工时间:',
        labelPosition:'left',
        labelWidth:100,
        onSelect:function(date){
            data.endTimeCon = new Date(date);
         
        }
    });
    $('#reason').textbox({
        width:320,
        required:true,
        label:'未开工原因:',
        labelPosition:'left',
        labelWidth:100,
        onChange:function(){
            data.reason = $('#reason').textbox('getText');
            
        } 
    });
    $('#c_8').textbox({
        width:320,
        required:true,
        label:'工程进度（工程完成率%）:',
        labelPosition:'left',
        labelWidth:180,
        onChange:function(){
            data.projectProgress = $('#c_8').textbox('getText');
            
        } 
    });
    $('#c_9').textbox({
        width:320,
        required:true,
        label:'完成投资（万元）:',
        labelPosition:'left',
        labelWidth:140,
        onChange:function(){
            data.completedInvestment = $('#c_9').textbox('getText');
            
        } 
    });
    $('#c_10').textbox({
        width:1000,
        height:150,
        multiline:true,
        required:true,
        label:'已形成能力:',
        labelPosition:'top',
        labelWidth:100,
        onChange:function(){
            data.formedAbility = $('#c_10').textbox('getText');
           
        } 
    });
    $('#c_11').textbox({
        width:1000,
        height:150,
        multiline:true,
        required:true,
        label:'完工后预期形成能力:',
        labelPosition:'top',
        labelWidth:200,
        onChange:function(){
            data.designedAbility = $('#c_11').textbox('getText');
           
        } 
    });
    $('#c_12').textbox({
        width:1000,
        height:150,
        multiline:true,
        required:true,
        label:'备注:',
        labelPosition:'top',
        labelWidth:100,
        onChange:function(){
            data.remarks = $('#c_12').textbox('getText');
           
        } 
    });
});