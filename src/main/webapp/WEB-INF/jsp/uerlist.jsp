<%--
  Created by IntelliJ IDEA.
  User: TR
  Date: 2019/4/4
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <script >
        function fun1() {
            if(confirm("确定删除吗？")){

            }
        }
    </script>
</head>
<body>
    <%--<c:forEach items="${uerlist}" var="user">--%>
        <%--${user.uid}&nbsp;&nbsp;&nbsp;&nbsp;--%>
        <%--${user.uname}&nbsp;&nbsp;&nbsp;&nbsp;--%>
        <%--${user.usex}<br>--%>
    <%--</c:forEach>--%>
    <h3 align="center">查询列表</h3>
    <table align="center" width="95%" border="1" cellpadding="2"	   cellspacing="1"	 >
        <tr align="center">
            <th class="text-center">用户名称</th>
            <th class="text-center">用户性别</th>
            <th class="text-center">用户年龄</th>
            <th class="text-center">操作</th>
        </tr>

        <c:forEach items="${uerlist}" var="user">
            <tr>
                <td align="center">${user.uname}</td>
                <td align="center">${user.usex}</td>
                <td align="center">${user.userage}</td>
                <td align="center"><a href="#" onclick="fun1()" >删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
