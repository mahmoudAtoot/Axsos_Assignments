<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fruit Store</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

    <h1>Fruit Store</h1>

    <table>
        <thead>
            <tr>
                <th>Fruit</th>
                <th>Price ($)</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="fruit" items="${fruits}">
                <tr>
                    <td class="${fn:startsWith(fruit.name, 'G') ? 'orange' : ''}">
                        ${fruit.name}
                    </td>
                    <td>${fruit.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
