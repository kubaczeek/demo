<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Rejestracja użytkowników</title>
</head>
<body>
<h1>Rejestracja użytkownika</h1>
<form action="HelloServlet" method="post">
    <label>Imię:</label>
    <input type="text" name="firstName"><br>
    <label>Nazwisko:</label>
    <input type="text" name="lastName"><br>
    <label>Wiek:</label>
    <input type="number" name="age"><br>
    <label>Zainteresowania:</label><br>
    <input type="checkbox" name="prefs" value="programowanie">Programowanie <br>
    <input type="checkbox" name="prefs" value="filmy">Filmy<br>
    <input type="checkbox" name="prefs" value="ksiazki">Książki<br>
    <input type="checkbox" name="prefs" value="fotografia">Fotografia<br>
    <input type="submit" value="Zarejestruj">
</form>
</body>
</html>
