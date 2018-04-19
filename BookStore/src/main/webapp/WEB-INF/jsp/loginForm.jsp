<%--
  Created by IntelliJ IDEA.
  User: pirit
  Date: 4/19/2018
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h3>Login View</h3>
<form action="login" method="post">
    <font color="red">${requestScope.msg}</font>
    <table>
        <tr>
            <td><label>Login Name: </label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>Passowrd: </label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Login"></td>
        </tr>
    </table>
</form>
</body>
</html>
