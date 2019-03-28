<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2019/3/13
  Time: 4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/receiveInt.do" method = post>
    输入的整数 <input type="text" name = "id">
    <input type="submit" value="提交">
</form>
</body>
</html>
