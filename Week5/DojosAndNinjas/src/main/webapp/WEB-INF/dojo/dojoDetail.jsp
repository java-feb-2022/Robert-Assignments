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
<title>Dojo Detail</title>
</head>
<body>
	<h1>Dojo Name: <c:out value="${dojo.name}"/></h1>
	<a class="btn btn-primary" href="/">Dashboard</a>
	<a class="btn btn-primary" href="/dojo/<c:out value="${dojo.id}"/>/edit">Edit Dojo</a>
	<h2>Ninjas:</h2>
	<ul>
		<c:forEach var="ninja" items="${dojo.ninjas}">
			<li>
				<a href="/ninja/<c:out value="${ninja.id}"/>">
					<c:out value="${ninja.firstName}"/> <c:out value="${ninja.lastName}"/>
				</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>