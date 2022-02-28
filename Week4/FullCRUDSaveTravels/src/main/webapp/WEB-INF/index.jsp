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
<title>Travel Expenses</title>
</head>
<body class="container">
    <h1>Save Travels</h1>
    <table class="table table-secondary table-striped table-bordered border-dark">
        <thead>
            <tr>
                <th>Expense</th>
                <th>Vendor</th>
                <th>Amount</th>
            </tr>
        </thead>
        <tbody>
            <!-- For Each Loop Here -->
			<c:forEach var="item" items="${exp}">
				<tr>
                	<td><c:out value="${item.name}"/></td>
                	<td><c:out value="${item.vendor}"/></td>
                	<td>$<c:out value="${item.amount}"/></td>
            	</tr>
			</c:forEach>
        </tbody>
    </table>
    
    <form:form action="/newExpense" method="post" modelAttribute="expense">
        <form:errors path="name"/>
    	<form:label path="name">Expense Name:</form:label>
    	<form:input path="name"/>
    	
    	<form:errors path="vendor"/>
    	<form:label path="vendor">Vendor:</form:label>
    	<form:input path="vendor"/>
    	
    	<form:errors path="amount"/>
    	<form:label path="amount">Amount:</form:label>
    	<form:input path="amount" type="number"/>
    	
    	<form:errors path="description"/>
    	<form:label path="description">Description:</form:label>
    	<form:textarea path="description"/>
    	
    	<input type="submit" value="Submit">
    </form:form>
</body>
</html>