<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<title>Details Page</title>
</head>
<body class="container">
    <div class="navbar">
        <h1><c:out value="${language.langName}"/></h1>
        <a class="btn btn-primary" href="/">Dashboard</a>
    </div>
    <h2>Author: <c:out value="${language.creatorName}"/></h2>
    <h2><c:out value="${language.version}"/></h2>
    <a class="btn btn-primary" href="/edit/<c:out value="${language.id}"/>">Edit</a>
    <form:form action="/delete/${language.id}" method="DELETE"><input class="btn btn-danger" type="submit" value="Delete"></form:form>
</body>
</html>