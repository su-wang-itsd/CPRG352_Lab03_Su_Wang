<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2021, 11:35:34 AM
    Author     : 845593
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
       <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First Number       :</label>
             <input type="text" name="first" value="">
             <br>
              <label>Second Number:</label>
              <input type="text" name="second" value="">
              <br>
            <input type="submit" name="calculator" value="+">
              <input type="submit" name="calculator" value="-">
                <input type="submit" name="calculator" value="*">
                  <input type="submit" name="calculator" value="%">
            <p>${result}</p>
            <a name="otherpage" href="${otherpage}">Age Calculator</a>
        </form>
    </body>
</html>
