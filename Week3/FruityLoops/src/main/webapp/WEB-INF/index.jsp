<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="navbar">
		<h1 class="text-danger">Fruit Store</h1>
	</div>
	<table class="table table-solid p-4 text-light bg-danger">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
		<thead/>
		<tbody>
			<c:forEach var="fruit" items="${fruits}">
				<tr>
					<td><c:out value="${fruit.name}"/>
					<td><c:out value="${fruit.price}"/>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>