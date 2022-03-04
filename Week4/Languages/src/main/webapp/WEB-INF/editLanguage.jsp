<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<meta charset="ISO-8859-1">
<title>Edit Language</title>
</head>
<body class="container">
	<div class="navbar">
		<h1>Edit Language</h1>
		<a class="btn btn-primary" href="/">Return to Dashboard</a>
	</div>
	<form:form action="/edit/${language.id}/commit" modelAttribute="language" method="PUT">
		<form:errors class="text-danger" path="langName"/>
		<div class="form-group">
			<form:label path="langName">Language Name:</form:label>
			<form:input path="langName"/>
		</div>
		<form:errors class="text-danger" path="creatorName"/>
		<div class="form-group">
			<form:label path="creatorName">Creator Name:</form:label>
			<form:input path="creatorName"/>
		</div>
		<form:errors class="text-danger" path="version"/>
		<div class="form-group">
			<form:label path="version">Version:</form:label>
			<form:input path="version"/>
		</div>
		<input class="btn btn-primary" type="submit" value="Submit Changes">
	</form:form>
</body>
</html>