<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<title>Edit Expense</title>
</head>
<body class="container">
    <div class="navbar">
        <h1>Edit Expense</h1>
        <a class="btn btn-secondary" href="/">Home</a>
    </div>
    <form:form action="/edit/${expense.id}/commit" method="PUT" modelAttribute="expense">
    	<form:input path="id" type="hidden"/>
    	<div>
    		<form:errors path="name"/>
    		<form:label path="name">Expense Name:</form:label>
    		<form:input path="name"/>
    	</div>
    	<div>
    		<form:errors path="vendor"/>
    		<form:label path="vendor">Vendor Name:</form:label>
    		<form:input path="vendor"/>
    	</div>
      	<div>
    		<form:errors path="amount"/>
    		<form:label path="amount">Amount:</form:label>
    		<form:input path="amount" type="number"/>
    	</div>
    	<div>
    		<form:errors path="description"/>
    		<form:label path="description">Expense Name:</form:label>
    		<form:input path="description" type="textarea"/>
    	</div>
    	<input type="submit" value="Edit Expense">
    </form:form>
</body>
</html>