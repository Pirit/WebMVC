<%--
  Created by IntelliJ IDEA.
  User: pirit
  Date: 4/13/2018
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Reciving Data with JSON format</title>
    <%--<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>--%>
    <script src="https://code.jquery.com/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="json2.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            testRequestBody();
        });

        function testRequestBody() {
            <%--$.ajax("${pageContext.request.contextPath}/json/testRequestBody"--%>
            $.ajax(
                {
                    url: "${pageContext.request.contextPath}/json/testRequestBody",
                    dataType: "json",
                    type: "POST",
                    contentType: "application/json",
                    data: JSON.stringify({id: 1, name: "Spring MVC Enterprice Case!"}),
                    async: true,
                    success: function (data) {
                        $("#id").html(data.id);
                        $("#name").html(data.name);
                        $("#author").html(data.author);
                    },
                    error: function () {
                        alert("Data Transfer Failed!");
                    }
                });
        }
    </script>
</head>
<body>
ID: <span id="id"></span><br>
Name: <span id="name"></span><br>
Author: <span id="author"></span><br>
</body>
</html>
