<%--
  Created by IntelliJ IDEA.
  User: pirit
  Date: 4/16/2018
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form method="post" action="register">
    <table>
        <tr>
            <td>Name: </td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>SEX: </td>
            <td><form:input path="sex"/></td>
        </tr>
        <tr>
            <td>AGE: </td>
            <td><form:input path="age"/></td>
        </tr>
    </table>
</form:form>
