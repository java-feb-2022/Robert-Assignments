<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta charset="ISO-8859-1">
<title>Registration and Login</title>
</head>
<body class="container">
	<div class="navbar">
		<h1>Welcome to Book Club!</h1>
	</div>
	<div class="row justify-content-between">
		<form:form class="card col-5" action="/registration" method="POST" modelAttribute="newUser">
			<div class="form-group">
				<form:errors class="text-danger" path="userName"/>
				<form:label class="form-label" path="userName">Name:</form:label>
				<form:input class="form-input" path="userName"/>
			</div>
			<div class="form-group">
				<form:errors class="text-danger" path="email"/>
				<form:label class="form-label" path="email">Email:</form:label>
				<form:input class="form-input" path="email" type="email"/>
			</div>
			<div class="form-group">
				<form:errors class="text-danger" path="password"/>
				<form:label class="form-label" path="password">Password:</form:label>
				<form:input class="form-input" path="password" type="password"/>
			</div>
			<div class="form-group">
				<form:errors class="text-danger" path="confirm"/>
				<form:label class="form-label" path="confirm">Name:</form:label>
				<form:input class="form-input" path="confirm" type="password"/>
			</div>
			<input class="btn btn-primary" type="submit" value="Register">
		</form:form>
		
		<form:form class="card col-5" action="/login" method="POST" modelAttribute="logUser">
			<div class="form-group">
				<form:errors class="text-danger" path="email"/>
				<form:label class="form-label" path="email">Email:</form:label>
				<form:input class="form-input" path="email"/>
			</div>
			<div class="form-group">
				<form:errors class="text-danger" path="password"/>
				<form:label class="form-label" path="password">Password:</form:label>
				<form:input class="form-input" path="password"/>
			</div>		
			<input class="btn btn-primary" type="submit" value="Login">
		</form:form>
	</div>
</body>
</html>