<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ABOUT Page</title>
</head>
<body> 
<h1>${Header}</h1>
<p>${Description}</p>
<h1 style="color:green">${msg}</h1>
<hr>
<h1>Welcome, ${user.name}</h1>
<h1>Your email address is ${user.email}</h1>
<h1>Your password is ${user.password} try to secure it.</h1>
</body>
</html>