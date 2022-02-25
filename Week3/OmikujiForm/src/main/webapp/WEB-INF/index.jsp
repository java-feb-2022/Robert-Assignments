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
    <form class="card border-4 border-warning p-3 bg-primary text-warning" action="/sendOmikuji" method="post">
        <label class="mb-3" for="num">Pick any number from 5 to 25
            <input type="number" name="num" id="num" min="5" max="25" required>
        </label>
        <label class="mb-3" for="city">Enter the name of any city.
            <input type="text" name="city" id="city" required>
        </label>
        <label class="mb-3" for="person">Enter the name of any person.
            <input type="text" name="person" id="person" required>
        </label>
        <label class="mb-3" for="hobby">Enter a professional endeavor or hobby.
            <input type="text" name="hobby" id="hobby" required>
        </label>
        <label class="mb-3" for="living">Enter any type of living thing.
            <input type="text" name="living" id="living" required>
        </label>
        <label class="mb-3" for="nice">Say something nice to someone:</label>
        <textarea name="nice" id="nice" cols="30" rows="10" required></textarea>
        <input class="btn btn-primary border border-2 border-warning text-warning mt-3" type="submit" value="Sumbit Omikuji">
    </form>
</body>
</html>