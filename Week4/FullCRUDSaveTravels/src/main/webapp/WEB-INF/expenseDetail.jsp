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
<title>Details</title>
</head>
<body class="container">
    <nav class="navbar">
        <h1>Expense Details</h1>
        <a href="/" class="btn btn-primary">Return Home</a>
    </nav>
    <div>
        <p class="text-center display-4">Expense Name: <c:out value="${expense.name}"/></p>
        <p class="text-center display-4">Vendor Name: <c:out value="${expense.vendor }"/></p>
        <p class="text-center display-4">Amount: <c:out value="${expense.amount}"/></p>
        <p class="text-center display-4">Description: <c:out value="${expense.description}"/></p>
    </div>
</body>
</html>