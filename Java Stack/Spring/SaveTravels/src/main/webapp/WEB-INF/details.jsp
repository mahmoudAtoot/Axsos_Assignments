<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Edit Expense</title>
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body class="details">
	<div class="details">
		<div class="inputs">
			<h2>Edit Expense:</h2>
			<a href="/" class="go-back">Go back</a>
		</div>
		<p>
		<div class="inputs">
			<p>Expense Name:</p>
			<p>${travels.expenseName}</p>
		</div>
		</p>
		<p>
		<div class="inputs">
			<p>Description:</p>
			<p>${travels.description}</p>
		</div>
		</p>
		<p>
		<div class="inputs">
			<p>Vendor:</p>
			<p>${travels.vendor}</p>
		</div>
		</p>
		<p>
		<div class="inputs">
			<p>Amount:</p>
			<p>${travels.amount}$</p>
		</div>
		</p>
	</div>

</body>
</html>