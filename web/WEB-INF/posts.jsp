<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 6/16/18
  Time: 7:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guestbook posts</title>
</head>
<body>
<table border="1">
<c:forEach items="${posts}" var="post">
    <tr>
        <td>${post.id}</td>
        <td><c:out value="${post.txt}"></c:out></td>
        <%--c:out to avoid interpreting text as html (html injection)--%>
        <td>
                <a href="delete?id=${post.id}">
                    <img src="delete.png"/>
                </a>
        </td>
    </tr>
</c:forEach>
    <form action="/add" method="POST">
        <tr>
            <td colspan="2">
                <input name="txt" type="text">
            </td>
            <td colspan="2">
                <input type="submit">
            </td>

        </tr>

    </form>

</table>

</body>
</html>
