<%--
  Created by IntelliJ IDEA.
  User: pirit
  Date: 4/13/2018
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Welcome to Login</h3>
<form action="login" method="post">
    <table>
        <tr>
            <td><label>Account: </label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>Password: </label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="Login On"></td>
        </tr>
    </table>
</form>
</body>
</html>
