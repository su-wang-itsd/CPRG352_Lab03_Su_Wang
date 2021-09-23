<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2021, 11:34:56 AM
    Author     : 845593
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="">
            <input type="submit" value="Age next birthday">
            <p>${nextYearAge}</p>
            <a name="otherpage" href="${arithpage}">Arithmetic Calculator</a>
        </form>
    </body>
</html>
