
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>new Talk</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="container mt-5">
	<a href="talks" class="btn btn-primary">All Talks</a>
    <h1 class="mb-4">Add a Talk to your shelf!</h1>
    <form:form action="/addTalk/form" method="post" modelAttribute="talk" class="w-50">
        <div class="mb-3">
            <form:label path="title" class="form-label">title</form:label>
            <form:input path="title" class="form-control" />
            <form:errors path="title" class="text-danger" />
        </div>

        <div class="mb-3">
            <form:label path="date" class="form-label">Due Date (MM/dd/yyyy): </form:label>
            <form:input path="date" class="form-control" type="date" placeholder="MM/dd/yyyy"/>
            <form:errors path="date" class="text-danger" />
        </div>

        <div class="mb-3">
            <form:label path="description" class="form-label">Description </form:label>
            <form:input path="description" class="form-control" />
            <form:errors path="description" class="text-danger" />
        </div>


        <button type="submit" class="btn btn-success">Add TAlk</button>
    </form:form>
</body>
</html>