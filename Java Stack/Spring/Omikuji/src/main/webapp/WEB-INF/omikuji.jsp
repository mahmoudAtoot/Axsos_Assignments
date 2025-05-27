<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Omikuji </title>
    <link rel="stylesheet" href="/css/style.css" />

</head>
<body>
		<div class="container">
        <h1>Send an Omikuji!</h1>
        <form action="/omikuji/process" method="POST">
            <label>Pick any number from 5 to 25</label>
            <input type="number" name="number" required min="5" max="25" />

            <label>Enter the name of any city</label>
            <input type="text" name="city" required />

            <label>Enter the name of any real person</label>
            <input type="text" name="person" required />

            <label>Enter professional endeavor or hobby</label>
            <input type="text" name="hobby" required />

            <label>Enter any type of living thing</label>
            <input type="text" name="livingThing" required />

            <label>Say something nice to someone</label>
            <textarea name="message" rows="4" required></textarea>

            <button type="submit">Send</button>
        </form>
    </div>
</body>
</html>




