<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page session="true" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>
	<div class="container prison">
        <h1>You are in Debt!</h1>
        <p>You've been sent to debtor's prison due to excessive negative gold.</p>
        <form action="/process" method="POST">
            <input type="hidden" name="location" value="reset">
            <button class="reset">Start Over</button>
        </form>
    </div>
</body>
</html>