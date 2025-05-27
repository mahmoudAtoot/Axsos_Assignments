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
	<div class="container">
        <h1>Ninja Gold Game</h1>
        <h2>Current Gold: <span class="gold"><%= session.getAttribute("gold") %></span></h2>

        <div class="locations">
            <form action="/process" method="POST">
                <input type="hidden" name="location" value="farm">
                <button>Farm</button>
            </form>

            <form action="/process" method="POST">
                <input type="hidden" name="location" value="cave">
                <button>Cave</button>
            </form>

            <form action="/process" method="POST">
                <input type="hidden" name="location" value="house">
                <button>House</button>
            </form>

            <form action="/process" method="POST">
                <input type="hidden" name="location" value="quest">
                <button>Quest</button>
            </form>

            <form action="/process" method="POST">
                <input type="hidden" name="location" value="spa">
                <button>Spa</button>
            </form>

            <form action="/process" method="POST">
                <input type="hidden" name="location" value="reset">
                <button class="reset">Reset</button>
            </form>
        </div>

        <div class="log">
            <h3>Activities:</h3>
            <ul>
                <%
                    java.util.List<String> log = (java.util.List<String>) session.getAttribute("log");
                    if (log != null) {
                        for (String entry : log) {
                %>
                    <li><%= entry %></li>
                <% } } %>
            </ul>
        </div>
    </div>

</body>
</html>