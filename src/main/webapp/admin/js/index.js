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
                data.data.forEach(function () {

                });

            } else {
                console.log(data);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
})