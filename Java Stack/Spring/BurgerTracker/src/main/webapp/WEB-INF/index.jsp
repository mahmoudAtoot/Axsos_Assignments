<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Burger Tracker</title>
  <link rel="stylesheet" href="css/style.css" />
</head>
<body>

  <div class="container">
    <h1>Burger Tracker</h1>

    <table>
      <thead>
        <tr>
          <th>Burger Name</th>
          <th>Restaurant Name</th>
          <th>Rating (out of 5)</th>
          <th>Action</th>
          
        </tr>
      </thead>
      <tbody>

		<c:forEach var="burger1" items="${burgers}">
        	<tr>
        	    <td><c:out value="${burger1.burgerName}"></c:out></td>
          		<td><c:out value="${burger1.resName}"></c:out></td>
          		<td><c:out value="${burger1.rating}"></c:out></td>
          		<td><a href="/burgers/edit/${burger1.id}">edit</a></td>
          		          		
        	</tr>
        </c:forEach>
      </tbody>
    </table>



<form:form action="/burgers" method="post" modelAttribute="burger">
    <h2>Add a Burger:</h2>

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

  </div>
</body>
</html>