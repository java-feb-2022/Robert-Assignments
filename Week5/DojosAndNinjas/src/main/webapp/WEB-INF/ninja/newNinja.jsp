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
<title>New Ninja</title>
</head>
<body>
	<div class="navbar">
		<h1>New Ninja</h1>
		<div class="d-flex justify-content-between">
			<a class="btn btn-primary" href="/">Return to Dashboard</a>
			<a class="btn btn-info" href="/new/dojo">Create Dojo</a>
		</div>
	</div>
	<form:form action="/ninja/new" method="POST" modelAttribute="ninja">
		<form:errors path="firstName"/>
		<div class="form-group">
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName"/>
		</div>
		<form:errors path="lastName"/>
		<div class="form-group">
			<form:label path="lastName">Last Name:</form:label>
			<form:input path="lastName"/>
		</div>
		<form:errors path="age"/>
		<div class="form-group">
			<form:label path="age">Age:</form:label>
			<form:input path="age" type="number"/>
		</div>
		<!-- Select Dojo Input HERE -->
		<form:errors path="dojo"/>
		<div class="form-group">
			<form:label path="dojo">Home Dojo</form:label>
			<form:select path="dojo">
				<c:forEach var="oneDojo" items="${dojos}">
					<form:option value="${oneDojo.id}" path="dojo">
						<c:out value="${oneDojo.name}"/>
					</form:option>
				</c:forEach>
			</form:select>
		</div>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>