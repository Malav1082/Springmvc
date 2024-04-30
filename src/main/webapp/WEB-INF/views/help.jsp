<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.LocalDateTime"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HELP Page</title>
</head>
<body>

    <h1>
        Hello my name is:
        ${name}
    </h1>
    <h1>
        Ask for any help:
    </h1>
    <h2>
        My roll No. is:
        ${id}
    </h2>
        ${time}
    <hr>
    <c:forEach var="item" items="${marks}">
        <h3><c:out value="${item}"></c:out></h3>
    </c:forEach>

</body>
</html>