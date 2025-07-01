<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Talk Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-4 p-4 border rounded bg-light shadow">
	<a href="/talks" class="text-primary text-decoration-underline">Back to
		the dashboared</a>
		<h1 class="text-primary">${talk.title}</h1>
		<p>
			<strong>${talk.user.userName}</strong> creat <em>${talk.title}</em> in
			<strong>${talk.date}</strong>
		</p>
		<p>Here are ${talk.user.userName}'s thoughts:</p>
		<p>${talk.description}</p>

		<c:if test="${talk.user.id == userId}">
			<a href="/editTalk/${talk.id}" class="btn btn-secondary">Edit</a>
			<form action="/talks/${talk.id}/delete" method="post" class="d-inline">
				<input type="hidden" name="_method" value="delete" />
				<button class="btn btn-danger">Delete</button>
			</form>
		</c:if>
	</div>
</body>
</html>