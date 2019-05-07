<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/1 0001
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<form action="/day19/wordServlet" method="post">
    用户名：<input type="text" name="username"/>
    <input type="submit" value="提交"/>
</form>
<hr/>

<form action="/day19/wordServlet" method="post">
    请发表言论：<input type="text" name="info" />
    <input type="submit" value="确定发表"/>
</form>
</body>
</html>
