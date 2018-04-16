<%--
  Created by IntelliJ IDEA.
  User: pirit
  Date: 18.4.16
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Login</title>
</head>
<body>
<h3>Login View</h3>
<form action="login" method="post">
    <font color="red">${requestScope.message}</font>
    <table>
        <tr>
            <td><label>Login Name:</label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>Password:</label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Login"></td>
        </tr>
    </table>
</form>
</body>
</html>
