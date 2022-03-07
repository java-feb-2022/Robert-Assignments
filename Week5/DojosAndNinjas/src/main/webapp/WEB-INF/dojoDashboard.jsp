<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="ISO-8859-1">
<title>Dojo Home</title>
</head>
<body>
	<div class="navbar">
		<h1>Dojo Home</h1>
		<div class="d-flex justify-content-between">
			<a class="btn btn-warning" href="/dojo/new">Create Dojo</a>
			<a class="btn btn-info" href="/ninja/new">Create Ninja</a>
		</div>
	</div>
	<table class="table">
		<thead>
			<tr>
				<th>Location</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojos}" var="dojo">
				<tr>
					<td><c:out value="${dojo.name}"/></td>
					<td>
					<a class="btn btn-primary" href="/dojo/<c:out value="${dojo.id}"/>">Details</a>
					<a class="btn btn-info" href="/dojo/<c:out value="${dojo.id}"/>/edit">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>