<%--
  Created by IntelliJ IDEA.
  User: 刘寿伟
  Date: 2022/5/16
  Time: 16:49
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
<table>
    <tr>
        <td>
            <a href="${pageContext.request.contextPath}/rest/user/goUser">添加</a>
        </td>
    </tr>
</table>
<table border="1" width="80%" cellpadding="0" cellspacing="0">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>生日</td>
        <td>性别</td>
        <td>地址</td>
        <td>操作</td>
    </tr>
    <c:forEach var="list" items="${list}">
        <tr>
            <td>${list.tid}</td>
            <td>${list.uname}</td>
            <td>
                <fmt:formatDate value="${list.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate>
            </td>
            <td>${list.sex}</td>
            <td>${list.address}</td>
            <td>
                <a href="${pageContext.request.contextPath}/rest/user/delete/${list.tid}">删除</a>
                <a href="${pageContext.request.contextPath}/rest/user/findById/${list.tid}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
<table>
    <tr>
        <td>
            &nbsp;&nbsp;共${info.pages}页&nbsp;&nbsp;
            &nbsp;&nbsp;第${info.pageNum}页&nbsp;&nbsp;
            &nbsp;&nbsp;共${info.total}条&nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/rest/user/query?pageNum=1">首页</a>
            <a href="${pageContext.request.contextPath}/rest/user/query?pageNum=${info.pageNum-1}">上一页</a>
            <a href="${pageContext.request.contextPath}/rest/user/query?pageNum=${info.pageNum+1}">下一页</a>
            <a href="${pageContext.request.contextPath}/rest/user/query?pageNum=${info.pages}">末页</a>
        </td>
    </tr>
</table>
</body>
</html>
