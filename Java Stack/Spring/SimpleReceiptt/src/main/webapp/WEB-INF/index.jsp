<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Purchase Receipt</h1>
    <p><strong>Customer:</strong> <c:out value="${name}" /></p>
    <p><strong>Item:</strong> <c:out value="${itemName}" /></p>
    <p><strong>Price:</strong> $<c:out value="${price}" /></p>
    <p><strong>Description:</strong> <c:out value="${description}" /></p>
    <p><strong>Vendor:</strong> <c:out value="${vendor}" /></p>
</body>
</html>