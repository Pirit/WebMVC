<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pirit
  Date: 18.4.16
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book</title>
</head>
<body>
<h3>Welcome[${sessionScope.user.username }] ...</h3>
<br>
<table border="1">
    <tr>
        <th>View</th><th>Book Name</th><th>Author</th><th>Price</th>
    </tr>
    <c:forEach items="${requestScope.bookList }" var="book">
        <tr>
            <td><img src="${pageContext.request.contextPath}/images/${book.icon}" height="60"> </td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
