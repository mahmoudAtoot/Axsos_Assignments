<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Edit Expense</title>
  <link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
<form:form action="/travels/${travel.id}" method="post" modelAttribute="travel">
    <input type="hidden" name="_method" value="put">
        <div class="inputs">
        	<h2>Edit Expense:</h2>
        	<a href="/" class="go-back">Go back</a>
		</div>
	<p>
		<div class="inputs">
        	<form:label path="expenseName">Expense Name</form:label>        
        	<form:textarea path="expenseName" />
        </div>
        <form:errors path="expenseName" cssClass="error"/>
    </p>
    <p>
    	<div class="inputs">
        	<form:label path="vendor">Vendor</form:label>
        	<form:textarea path="vendor"/>
        </div>
        <form:errors path="vendor" cssClass="error"/>        
    </p>
    <p>
    	<div class="inputs">
        	<form:label path="amount">Amount</form:label>
        	<form:input type="text" path="amount"/>
        </div>
        <form:errors path="amount" cssClass="error"/>
    </p>
    <p>
    	<div class="inputs">
        	<form:label path="description">Description</form:label>
			<form:textarea path="description" rows="4" cols="40"/>
		</div>
		<form:errors path="description" cssClass="error"/>     
    </p>    
    <input Class="button" type="submit" value="Submit"/>
</form:form>
</body>
</html>