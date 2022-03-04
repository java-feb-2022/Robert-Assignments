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
<title>Languages</title>
</head>
<body class="container">
    <h1>Your Languages</h1>
    <table class="table table-striped table-primary">
        <thead>
            <tr>
                <th>Name</th>
                <th>Creator</th>
                <th>Version</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        <!-- items refers to incoming List from Model Data and var is the individual objects to iterate over -->
			<c:forEach var="lang" items="${langs}">
				<tr>
                	<td><a href="/language/<c:out value="${lang.id}"/>"><c:out value="${lang.langName}"/></a></td>
                	<td><c:out value="${lang.creatorName}"/></td>
                	<td><c:out value="${lang.version}"/></td>
                	<td class="">
                    	<form:form class="d-inline-block" action="/delete/${lang.id}" method="DELETE">
                    		<input class="btn btn-danger" type="submit" value="Delete">
                    	</form:form>
                    	<a class="btn btn-primary" href="/edit/<c:out value="${lang.id}"/>">Edit</a>
                	</td>
            	</tr>
			</c:forEach>
        </tbody>
    </table>
    
    <h2>Create New Language</h2>

    <form:form action="/createLanguage" modelAttribute="language" method="POST">
    	<form:errors class="text-danger" path="langName"/>
        <div class="form-group">
            <!-- Name -->
            <form:label path="langName">Language Name:</form:label>
            <form:input path="langName"/>
        </div>
        <form:errors class="text-danger" path="creatorName"/>
        <div class="form-group">
            <!-- Creator -->
            <form:label path="creatorName">Creator:</form:label>
            <form:input path="creatorName"/>
        </div>
        <form:errors class="text-danger" path="version"/>
        <div class="form-group">
            <!-- Version -->
            <form:label path="version">Version</form:label>
            <form:input path="version"/>
        </div>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>