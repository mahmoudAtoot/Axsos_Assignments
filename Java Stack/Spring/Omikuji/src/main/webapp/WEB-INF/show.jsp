<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji </title>
    <link rel="stylesheet" href="/css/style.css" />

</head>
<body>

    <div class="container">
        <h1>Here's Your Omikuji!</h1>
        <div class="fortune-box">
            In <span>${sessionScope.number}</span> years, you will live in 
            <span>${sessionScope.city}</span> with <span>${sessionScope.person}</span> 
            as your roommate, selling <span>${sessionScope.hobby}</span> for a living.
            The next time you see a <span>${sessionScope.livingThing}</span>, you will have good luck. 
            Also, <span>${sessionScope.message}</span>
        </div>
        <a class="back-link" href="/omikuji">Go Back</a>
    </div>

</body>
</html>

