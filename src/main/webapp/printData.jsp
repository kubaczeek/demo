<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <title>Zadanie 1 - Programowanie aplikacji WWW w języku Java</title>
</head>

<body>
<div class="form-style-5">
    <fieldset>
        <legend><span class="number">1</span>Informacje o użytkowniku</legend>
        <p type="text" name="fName">Imie: ${fName}</p>
        <p type="text" name="lName">Nazwisko: ${lName}</p>
        <p type="number" name="age">Wiek: ${age}</p>
    </fieldset>
    <fieldset>
        <legend><span class="number">2</span>Zainteresowania</legend>
        <ul>
            <c:forEach items="${interests}" var="interest">
                <li><c:out value="${interest}"/></li>
            </c:forEach>
        </ul>

        </p>
    </fieldset>
</div>
</body>
</html>
