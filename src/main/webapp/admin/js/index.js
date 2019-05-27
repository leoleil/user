function user(id,name,rolearray){
    this.id=id;
    this.name=name;
    this.rolearray=rolearray;
}
function role(id,name){
    this.id=id;
    this.name=name;
}
function permission(id,name){
    this.id=id;
    this.name=name;
}
function subproject(id,name){
    this.id=id;
    this.name=name;
}

var Alluser=new Array();
var Allrole=new Array();
var currentroles=new Array();
var Allpermission=new Array();
var currentpermission=new Array();
var Allsubproject=new Array();
var x=0;

$(function () {
    $.ajax({
        url: "/onps/manage/role/selectAllRole.do",
        type: "get",
        async: false,
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                $(".selectroleid").append("<option  selected='selected''>" +"------请选择角色------"+ "</option>");
                for(var i=0;i<data.entity.length;i++){
                    var newRole=new role(data.entity[i].id,data.entity[i].name);
                    Allrole.push(newRole);
                    $(".selectroleid").append("<option value='" + newRole.id + "'>" + newRole.name + "</option>");
                }
                console.log(Allrole.length);
            } else {
                console.log(data);
            }
        },
        error: function (data) {
            alert("请求失败!");
        }
    });
    $.ajax({
        url: "/onps/manage/permission/selectAllPermission.do",
        type: "get",
        async: false,
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                for(var i=0;i<data.entity.length;i++){
                    var newPermission=new permission(data.entity[i].id,data.entity[i].name);
                    Allpermission.push(newPermission);
                }
            } else {
                console.log(data);
            }
        },
        error: function (data) {
            alert("请求失败!");
        }
    });
    $.ajax({
        url: "/onps/manage/project/selectAllSubProject.do",
        type: "get",
        async: false,
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                $('#addsubproject_selectsubprojectid').append("<option  selected='selected''>" +"------请选择子项目------"+ "</option>");
                for(var i=0;i<data.entity.data.length;i++){
                    var newSubproject=new subproject(data.entity.data[i].id,data.entity.data[i].subname);
                    Allsubproject.push(newSubproject);
                    $('#addsubproject_selectsubprojectid').append("<option value='" + newSubproject.id + "'>" +"子项目："+ newSubproject.name + "</option>");
                }
            } else {
                console.log(data);
            }
        },
        error: function (data) {
            alert("请求失败!");
        }
    });
});

$("#UserList").datagrid({
    method:"get",
    url:"/onps/manage/user/getUserByPageInfo.do",
    queryParams:{
        "pageSize ":10,
        "currentPage ":1
    },
    loadFilter:function (data) {
        if(data.status == 'S00001'){
            if(x==0) {//控制只读取一次
                $('.selectuserid').append("<option selected='selected'>" + "------请选择用户------"+ "</option>");
                for (var i = 0; i < data.entity.data.length; i++) {
                    var rolelist=new Array();
                    for (var j=0;j<data.entity.data[i].roleVoList.length;j++){
                        var newrole=new role(data.entity.data[i].roleVoList[j].id,data.entity.data[i].roleVoList[j].name);
                        rolelist.push(newrole);
                    }
                    var newuser=new user(data.entity.data[i].id,data.entity.data[i].username,rolelist);
                    Alluser.push(newuser);
                    $('.selectuserid').append("<option value='" + Alluser[i].id + "'>" + Alluser[i].name + "</option>");
                }
                x++;
            }
            return data.entity.data;
        }
        return null
    },
    pageSize:10,
    pageNumber:1,
    columns:[
        [
            {field:'id',title:'ID',width:'20%',region:'left'},
            {field:'username',title:'用户名',width:'10%',region:'left'},
            {field:'password',title:'密码',width:'10%',region:'left'},
            {field:'department',title:'部门',width:'10%',region:'left'},
            {field:'date',title:'日期',width:'20%',region:'left'},
            {field:'zq',title:'战区',width:'10%',region:'left'},
            {field:'jbz',title:'军兵种',width:'10%',region:'left'},
        ]
    ],
    view: detailview,
    detailFormatter: function(rowIndex, rowData){
        var string = '<table class="easyui-datagrid">\n' +
            '    <thead>\n' +
            '\t\t<tr>\n' +
            '\t\t\t<th data-options="field:\'id\'">角色id</th>\n' +
            '\t\t\t<th data-options="field:\'name\'">角色名</th>\n' +
            '\t\t\t<th data-options="field:\'name\'">权限</th>\n' +
            '\t\t</tr>\n' +
            '    </thead>\n' +
            '    <tbody>\n';

        rowData.roleVoList.forEach(function (value,index) {
            string = string + '<tr><td style=" white-space: nowrap">'+ value.id + '</td>' +'<td style=" white-space: nowrap">'+ value.name + '</td>';
            var p = "<td style=\' white-space: nowrap\'>";
            value.permissionVoList.forEach(function (v,i) {
                p  =  p + v.name + " ; ";
            });
            p = p + '</td></tr>';
            string = string + p;
        });
        string = string +
            '\t</tbody>\n' +
            '</table>';
        return string;
    }
});


$('#addrole_selectuserid').change(function () {
    currentroles=[];//赋值空数组清空数组
    var val=$('#addrole_selectuserid').val();
    var addrolelist = $("#addrole_multiselectroleid");
    $("option", addrolelist).remove(); //清空原有的选项
    addrolelist.append("<option >" + "------请选择角色------"+ "</option>");
    var x=0;
    for (var i=0;i<Alluser.length;i++){
        if(val==Alluser[i].id){
            for(var k=0;k<Allrole.length;k++) {
                var bool=true;
                for (var j = 0; j < Alluser[i].rolearray.length; j++) {
                    if(x==0)currentroles.push(Alluser[i].rolearray[j].id);
                    if(Allrole[k].id==Alluser[i].rolearray[j].id) bool=false;
                }
                if(bool) addrolelist.append("<option value='" + Allrole[k].id + "'>" + Allrole[k].name + "</option>");
                x++;
            }
        }
    }
});

$('#deleterole_selectuserid').change(function () {
    var val=$('#deleterole_selectuserid').val();
    var deleterolelist = $("#deleterole_multiselectroleid");
    $("option", deleterolelist).remove(); //清空原有的选项
    deleterolelist.append("<option >" + "------请选择角色------"+ "</option>");
    for (var i=0;i<Alluser.length;i++){
        if(val==Alluser[i].id){
                for (var j = 0; j < Alluser[i].rolearray.length; j++) {
                    deleterolelist.append("<option value='" + Alluser[i].rolearray[j].id + "'>" + Alluser[i].rolearray[j].name + "</option>");
                }
        }
    }
});

$('#addpermission_selectroleid').change(function () {
    currentpermission=[];
    var val=$('#addpermission_selectroleid').val();
    var addpermissionlist = $("#addpermission_selectpermissionid");
    $("option", addpermissionlist).remove(); //清空原有的选项
    addpermissionlist.append("<option >" + "------请选择权限------"+ "</option>");
    for (var i=0;i<Allrole.length;i++){
        if(val==Allrole[i].id){
            var currentUserPermissionList=new Array();
            $.ajax({
                url: "/onps/manage/role/getPermissionByRoleId.do",
                type: "get",
                async: false,
                data:{
                    roleId:$('#addpermission_selectroleid').val()
                },
                success: function (data) {
                    console.log(data);
                    if (data.status == 'S00001') {
                        for(var i=0;i<data.entity.length;i++){
                            var newPermission=new permission(data.entity[i].id,data.entity[i].name);
                            currentUserPermissionList.push(newPermission);
                        }
                    } else {
                        console.log(data);
                    }
                },
                error: function (data) {
                    alert("请求失败!");
                }
            });
            var x=0;
            for(var k=0;k<Allpermission.length;k++) {
                var bool=true;
                for (var j = 0; j < currentUserPermissionList.length; j++) {
                   if(x==0) currentpermission.push(currentUserPermissionList[j].id);
                    if(currentUserPermissionList[j].id==Allpermission[k].id) bool=false;
                }
                if(bool) addpermissionlist.append("<option value='" + Allpermission[k].id + "'>" + Allpermission[k].name + "</option>");
                x++;
            }
        }
    }
});

$('#deletepermission_selectroleid').change(function () {
    currentpermission=[];
    var val=$('#deletepermission_selectroleid').val();
    var deletepermissionlist = $("#deletepermission_selectpermissionid");
    $("option", deletepermissionlist).remove(); //清空原有的选项
    deletepermissionlist.append("<option >" + "------请选择权限------"+ "</option>");
    for (var i=0;i<Allrole.length;i++){
        if(val==Allrole[i].id){
            var currentUserPermissionList=new Array();
            $.ajax({
                url: "/onps/manage/role/getPermissionByRoleId.do",
                type: "get",
                async: false,
                data:{
                    roleId:$('#deletepermission_selectroleid').val()
                },
                success: function (data) {
                    console.log(data);
                    if (data.status == 'S00001') {
                        for(var i=0;i<data.entity.length;i++){
                            var newPermission=new permission(data.entity[i].id,data.entity[i].name);
                            currentUserPermissionList.push(newPermission);
                        }
                    } else {
                        console.log(data);
                    }
                },
                error: function (data) {
                    alert("请求失败!");
                }
            });

                for (var j = 0; j < currentUserPermissionList.length; j++) {
                    currentpermission.push(currentUserPermissionList.id);
                    deletepermissionlist.append("<option value='" + currentUserPermissionList[j].id + "'>" + currentUserPermissionList[j].name + "</option>");
                }
        }
    }
});


function SubmitAdd(){
    $.ajax({
        url: "/onps/manage/user/insertUser.do",
        type: "post",
        async: false,
        data: {
            "username":$("#add_username").val(),
            "password":$("#add_password").val(),
            "rePassword":$("#add_rePassword").val(),
            "zq":$("#add_zq").val(),
            "jbz":$("#add_jbz").val(),
            "department":$("#add_department").val()
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);

            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}

function SubmitDeleteUser(){
    $.ajax({
        url: "/onps/manage/user/deleteUser.do",
        type: "post",
        async: false,
        data: {
            "userId":$("#delete_selectuserid").val()
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);

            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}

function SubmitChangepassword(){
    $.ajax({
        url: "/onps/manage/user/updateUserPassWord.do",
        type: "post",
        async: false,
        data: {
            "userId":$("#change_selectuserid").val(),
            "oriPassword":$("#change_oriPassword").val(),
            "password":$("#change_password").val(),
            "rePassword":$("#change_rePassword").val()
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);

            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}

function SubmitUpdateinfo(){
    $.ajax({
        url: "/onps/manage/user/updateUserMessage.do",
        type: "post",
        async: false,
        data: {
            "userId":$("#update_selectuserid").val(),
            "zq":$("#update_zq").val(),
            "jbz":$("#update_jbz").val(),
            "department":$("#update_department").val()
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);

            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}

function SubmitAddrole(){
    $.ajax({
        url: "/onps/manage/role/grantRolesToSomeOne.do",
        type: "post",
        async: false,
        data: {
            "userId":$("#addrole_selectuserid").val(),
            "roleIds": function(){
                var roleIdarray=new Array();
                $("#addrole_multiselectroleid option:selected").each(function () {
                    console.log($(this).val());
                    roleIdarray.push($(this).val());
                });
                //console.log("选择长度"+roleIdarray.length+"现有长度"+currentroles.length);
                roleIdarray.push.apply(roleIdarray,currentroles);
                return roleIdarray;
            }
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);
            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}
function Submitdeleterole(){
    //todo
    $.ajax({
        url: "/onps/manage/role/revokeRolesFromSomeOne.do",
        type: "post",
        async: false,
        data: {
            "userId":$("#deleterole_selectuserid").val(),
            "roleIds": function(){
                var roleIdarray=new Array();
                $("#deleterole_multiselectroleid option:selected").each(function () {
                    console.log($(this).val());
                    roleIdarray.push($(this).val());
                });
                return roleIdarray;
            }
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);
            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}

function SubmitAddpermissiontorole(){
    $.ajax({
        url: "/onps/manage/permission/grantPermissionsToSomeRole.do",
        type: "post",
        async: false,
        data: {
            "roleId":$("#addpermission_selectroleid").val(),
            "permissionIds": function(){
                var permissionIdarray=new Array();
                $("#addpermission_selectpermissionid option:selected").each(function () {
                    console.log($(this).val());
                    permissionIdarray.push($(this).val());
                });
                permissionIdarray.push.apply(permissionIdarray,currentpermission);
                return permissionIdarray;
            }
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);
            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}

function SubmitDeletepermissiontorole(){
    $.ajax({
        url: "/onps/manage/permission/revokePermissionsFromSomeRole.do",
        type: "post",
        async: false,
        data: {
            "roleId":$("#deletepermission_selectroleid").val(),
            "permissionIds": function(){
                var permissionIdarray=new Array();
                $("#deletepermission_selectpermissionid option:selected").each(function () {
                    console.log($(this).val());
                    permissionIdarray.push($(this).val());
                });
                permissionIdarray.push.apply(permissionIdarray,currentpermission);
                return permissionIdarray;
            }
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);
            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}

function Submitaddsubprojecttouser(){
    $.ajax({
        url: "/onps/manage/project/addSubProjectToSomeOne.do",
        type: "post",
        async: false,
        data: {
            "userId":$("#addsubproject_selectuserid").val(),
            "subProjectId": $('#addsubproject_selectsubprojectid').val()
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                location.reload(true);
            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
}



$('#btn_adduser').click(function(){
    CloseWindows();
    $('#adduser').window('open');
});
$('#btn_deleteuser').click(function(){
    CloseWindows();
    $('#deleteuser').window('open');
});
$('#btn_changepassword').click(function(){
    CloseWindows();
    $('#changepassword').window('open');
});
$('#btn_updateinfo').click(function(){
    CloseWindows();
    $('#updateinfo').window('open');
});
$('#btn_addroletouser').click(function(){
    CloseWindows();
    $('#addroletouser').window('open');
});
$('#btn_deleteroletouser').click(function(){
    CloseWindows();
    $('#deleteroletouser').window('open');
});
$('#btn_addpermissiontorole').click(function(){
    CloseWindows();
    $('#addpermissiontorole').window('open');
});
$('#btn_deletepermissiontorole').click(function(){
    CloseWindows();
    $('#deletepermissiontorole').window('open');
});
$('#btn_addsubjecttouser').click(function(){
    CloseWindows();
    $('#addsubprojecttouser').window('open');
});
function CloseWindows(){
    $('#adduser').window('close');
    $('#deleteuser').window('close');
    $('#updateinfo').window('close');
    $('#changepassword').window('close');
    $('#addroletouser').window('close');
    $('#deleteroletouser').window('close');
    $('#addpermissiontorole').window('close');
    $('#deletepermissiontorole').window('close');
    $('#addsubprojecttouser').window('close');
    $(":input").each(function(){
        this.value="";
    });
}

function Back(){
    var maindiv=document.getElementById("mainmenu");
    var subdiv=document.getElementsByClassName("subfunction");
    for (var i = 0;i<subdiv.length;i++) {
        subdiv[i].style.display="none";
    }
    maindiv.style.display="block";
    CloseWindows();

}
function Usermannagement(){
    var subdiv=document.getElementById("usermannagement");
    var maindiv=document.getElementById("mainmenu");
    maindiv.style.display="none";
    subdiv.style.display="block";
}