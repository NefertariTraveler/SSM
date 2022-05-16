<%--
  Created by IntelliJ IDEA.
  User: 刘寿伟
  Date: 2022/5/16
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/rest/user/add" method="post">
    用户名：<input name="uname">
    <br>
    性别：<input name="sex">
    <br>
    地址：<input name="address">
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
