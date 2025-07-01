<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<%@ page session="true"%>
	

	<div class="container mt-5">
		<h2>Welcome, ${user.userName}!</h2>

		<form action="/logout" method="post">
			<button class="btn btn-danger">Logout</button>
		</form>
		<h2>TalkTracker Dashboard!</h2>
		
		<a href="addTalk" class="btn btn-primary"> Add a Talk +</a>

		<table class="table table-striped mt-3">
			<thead>
				<tr>
					<th>ID</th>
					<th>Talk Title</th>
					<th>Talk Date</th>
					<th>Speaker</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="talk" items="${talks}">
					<tr>
						<td>${talk.id}</td>
						<td><a href="/talkDetails/${talk.id}" class="btn btn-primary">${talk.title}</a>
						</td>
						<td>${talk.date}</td>
						<td>${talk.user.userName}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>