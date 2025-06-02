<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Burger Tracker</title>
  <link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
<form:form action="/burgers/${burger.id}" method="post" modelAttribute="burger">
    <input type="hidden" name="_method" value="put">
        <div class="inputs">
        	<h2>Edit Burger:</h2>
        	<a href="/" class="go-back">Go back</a>
		</div>
	<p>
		<div class="inputs">
        	<form:label path="burgerName">Burger Name</form:label>        
        	<form:textarea path="burgerName" />
        </div>
        <form:errors path="burgerName" cssClass="error"/>
    </p>
    <p>
    	<div class="inputs">
        	<form:label path="resName">Restaurant Name</form:label>
        	<form:textarea path="resName"/>
        </div>
        <form:errors path="resName" cssClass="error"/>        
    </p>
    <p>
    	<div class="inputs">
        	<form:label path="rating">Rating</form:label>
        	<form:input type="number" path="rating"/>
        </div>
        <form:errors path="rating" cssClass="error"/>
    </p>
    <p>
    	<div class="inputs">
        	<form:label path="notes">Notes</form:label>
			<form:textarea path="notes" rows="4" cols="40"/>
		</div>
		<form:errors path="notes" cssClass="error"/>     
    </p>    
    <input Class="button" type="submit" value="Submit"/>
</form:form>
</body>
</html>