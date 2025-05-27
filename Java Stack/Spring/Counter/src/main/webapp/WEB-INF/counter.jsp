<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <h1>Visit Counter</h1>
    <p>You have visited the Welcome page  <a href="/Your_server">http://Your_server</a><strong>${count}</strong> times.</p>
    <a href="/Your_server">Test another visit?</a><br>
    
        <form method="post" action="/reset">
        <button type="submit">Reset Counter</button>
    </form>
</body>
</html>

