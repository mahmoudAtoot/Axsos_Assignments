<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Increment by 2</title>
</head>
<body>
    <h1>You just incremented the counter by 2!</h1>
    
     <p>You have visited the Welcome page  <a href="/Your_server">http://Your_server</a><strong>${count}</strong> times.</p>
    <p><a href="/Your_server">Back to Home</a></p>
    
    
    <form method="post" action="/reset">
        <button type="submit">Reset Counter</button>
    </form>
</body>
</html>
