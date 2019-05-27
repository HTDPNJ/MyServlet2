<%--
  Created by IntelliJ IDEA.
  User: Oliver
  Date: 2019/5/24
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="resp" method="post">
        用户名：<input type="text" name="uname" value="" /><br />
        密码：<input type="text" name="pwd" value="" /><br />
        爱好：
        <input type="checkbox" name="fav" value="1" />唱歌<br />
        <input type="checkbox" name="fav" value="2" />跳舞<br />
        <input type="checkbox" name="fav" value="3" />游泳<br />

        <input type="submit" name="登录"  />
    </form>
</body>
</html>
