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
<title>Ninja Detail Page</title>
</head>
<body>
	<h1>Ninja Name: <c:out value="${ninja.firstName} ${ninja.lastName}"/></h1>
	<h2>Age: <c:out value="${ninja.age}"/></h2>
	<h2>Dojo: <a href="/dojo/<c:out value="${ninja.dojo.id}"/>"><c:out value="${ninja.dojo.name}"/></a></h2>
	<a class="btn btn-primary" href="/">Dashboard</a>
	<a class="btn btn-info" href="/ninja/<c:out value="${ninja.id}"/>/edit">Edit Ninja</a>
</body>
</html>