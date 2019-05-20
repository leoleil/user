

$(function () {
    $.ajax({
        url: "/onps/manage/user/getUserByPageInfo.do",
        type: "get",
        async: false,
        data: {
            "pageSize ":10,
            "currentPage ":1
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                console.log(data);
                var entity  = data.entity.data;

                $("#UserList").datagrid({
                    pagination:true,
                    pageNumber:data.entity.currentPage,
                    pageSize:data.entity.pageSize,
                    data:entity,

                });

            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
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
function CloseWindows(){
    $('#adduser').window('close');
    $('#deleteuser').window('close');
    $('#changepassword').window('close');
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