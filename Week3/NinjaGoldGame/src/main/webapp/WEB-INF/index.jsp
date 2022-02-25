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
<body class="container">
    <h1>Ninja Gold Game!!</h1>
    <div class="row">
        <h2 class="col-3">Your Gold: </h2>
        <h2 class="col-2 border border-dark border-2"><c:out value="${gold}"/></h2>
    </div>
    <div class="row justify-content-between">
        <form class="border border-2 border-dark p-2 col-2 text-center" method="post" action="/inputGold">
            <h2>Farm</h2>
            <input type="text" name="location" id="" value="farm" hidden>
            <p>(earns 10-20 gold)</p>
            <input class="btn btn-dark text-warning" type="submit" value="Find Gold!!">
        </form>
        <form class="border border-2 border-dark p-2 col-2 text-center" method="post" action="/inputGold">
            <h2>Cave</h2>
            <input type="text" name="location" id="" value="cave" hidden>
            <p>(earns 5-10 gold)</p>
            <input class="btn btn-dark text-warning" type="submit" value="Find Gold!!">
        </form>
        <form class="border border-2 border-dark p-2 col-2 text-center" method="post" action="/inputGold">
            <h2>House</h2>
            <input type="text" name="location" id="" value="house" hidden>
            <p>(earns 2-5 gold)</p>
            <input class="btn btn-dark text-warning" type="submit" value="Find Gold!!">
        </form>
        <form class="border border-2 border-dark p-2 col-2 text-center" method="post" action="/inputGold">
            <h2>Casino</h2>
            <input type="text" name="location" id="" value="casino" hidden>
            <p>(earns/takes 0-50 gold)</p>
            <input class="btn btn-dark text-warning" type="submit" value="Find Gold!!">
        </form>
        <form class="border border-2 border-dark p-2 col-2 text-center" method="post" action="/inputGold">
            <h2>Spa</h2>
            <input type="text" name="location" id="" value="spa" hidden>
            <p>(takes 5-20 gold)</p>
            <input class="btn btn-dark text-warning" type="submit" value="Find Gold!!">
        </form>
    </div>
    <h2 class="my-4">Activities: </h2>
    <div class="row border border-dark overflow-auto" style="height: 100px">
		<c:forEach var="log" items="${logs}">
			<p><c:out value="${log}"/></p>
		</c:forEach>
    </div>
</body>
</html>