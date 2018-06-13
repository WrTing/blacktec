<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页面</title>
  </head>
  <body>
    <form action="/shiro/login" method="post">
      <input type="text" name="User.username"/>
      <input type="password" name="User.password"/>
      <input type="submit" value="登录"/>
      <input type="reset" value="重置"/>
    </form>
    <a href="/shiro/login"/>
  </body>
</html>
