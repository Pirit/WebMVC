<%--
  Created by IntelliJ IDEA.
  User: pirit
  Date: 4/16/2018
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Test Return of JSON Transfer</title>
    <script src="https://code.jquery.com/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="json2.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            testResponseBody()
        });
        function testResponseBody() {
            $.post("${pageContext.request.contextPath}/json/testRequestBody",null,
                function (data) {
                    $.each(data,function () {
                        var tr = $("<tr align='center'/>");
                        $("<td/>").html(this.id).appendTo(tr);
                        $("<td/>").html(this.name).appendTo(tr);
                        $("<td/>").html(this.author).appendTo(tr);
                        $("#booktable").append(tr);
                    })
                },"json");
        }
    </script>
</head>
<body>
<table id="booktable" border="1" style="border-collapse: collapse; ">
    <tr align="center">
        <th>ID</th>
        <th>Name</th>
        <th>Author</th>
    </tr>
</table>
</body>
</html>
