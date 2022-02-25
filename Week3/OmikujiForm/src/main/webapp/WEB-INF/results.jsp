<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="d-flex flex-column align-items-center bg-primary">
    <h1 class="text-warning mb-3">Send an Omikuji</h1>
    <div class="card border-4 border-warning p-3 bg-primary text-warning w-50">
        <p>In <c:out value="${num}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${person}"/>
        as your roommate, <c:out value="${hobby}"/> for a living. The next time you see a <c:out value="${living}"/>, you will have 
    good luck. Also, <c:out value="${nice}"/></p>
    </div>
    <a class="btn btn-primary border border-2 border-warning text-warning mt-3" href="/">Go Back</a>
</body>
</html>