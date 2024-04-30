<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <h1>This is home page</h1>
    <h1>Called by home controller</h1>
    <h1>url /home</h1>

    <%
        String name = (String)request.getAttribute("name");
        Integer id = (Integer) request.getAttribute("id");
        List<String> friends = (List<String>) request.getAttribute("f"); // Cast to List<String>
    %>

    <h2> Name is <%=name%> </h2>
    <h2> Id is <%=id%> </h2>
    
    <%-- Loop through friends list --%>
    <% if (friends != null) { %>
        <h2> Friends: </h2>
        <ul>
            <% for(String friend : friends) { %>
                <li><%= friend %></li>
            <% } %>
        </ul>
    <% } else { %>
        <h2> No friends found. </h2>
    <% } %>
    
</body>
</html>
