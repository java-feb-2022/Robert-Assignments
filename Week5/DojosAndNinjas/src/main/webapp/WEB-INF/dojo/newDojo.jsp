<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
	<div class="navbar">
		<h1>New Dojo</h1>
		<div class="d-flex justify-content-between">
			<a class="btn btn-primary" href="/">Return to Dashboard</a>
			<a class="btn btn-info" href="/new/ninja">Create Ninja</a>
		</div>
	</div>
	<form:form action="/dojo/new" method="POST" modelAttribute="dojo">
		<form:errors path="name"/>
		<form:label path="name">Dojo Name/Location:</form:label>
		<form:input path="name"/>
		<input class="btn btn-primary" type="submit" value="Submit"/>
	</form:form>
</body>
</html>