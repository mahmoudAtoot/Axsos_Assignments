<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Save Travels</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

	<div class="container">
		<h1>Save Travels</h1>

		<table>
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Action</th>
					<th></th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="travel1" items="${travels}">
					<tr>
						<td><a href="/travels/details/${travel1.id}">${travel1.expenseName}
						</a></td>
						<td><c:out value="${travel1.vendor}"></c:out></td>
						<td><c:out value="${travel1.amount}"></c:out>$</td>
						<td><a href="/travels/edit/${travel1.id}">edit</a></td>
						<td>
							<form action="/travels/delete/${travel1.id}" method="post">
								<input type="hidden" name="_method" value="delete"> 
								<input type="submit" value="Delete" class="delete">
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>



		<form:form action="/travels" method="post" modelAttribute="travel">
			<h2>Add an expense:</h2>

			<p>
			<div class="inputs">
				<form:label path="expenseName">Expense Name</form:label>
				<form:textarea path="expenseName" />
			</div>
			<form:errors path="expenseName" cssClass="error" />
			</p>
			<p>
			<div class="inputs">
				<form:label path="vendor">Vendor</form:label>
				<form:textarea path="vendor" />
			</div>
			<form:errors path="vendor" cssClass="error" />
			</p>
			<p>
			<div class="inputs">
				<form:label path="amount">Amount</form:label>
				<form:input type="text" path="amount" />
			</div>
			<form:errors path="amount" cssClass="error" />
			</p>
			<p>
			<div class="inputs">
				<form:label path="description">Description</form:label>
				<form:textarea path="description" rows="4" cols="40" />
			</div>
			<form:errors path="description" cssClass="error" />
			</p>
			<input Class="button" type="submit" value="Submit" />
		</form:form>

	</div>
</body>
</html>