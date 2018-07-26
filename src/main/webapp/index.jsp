<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Current-Converter</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>
<form method="post" action="/curency-converter">
    <div id="container">
        <h2>Curency Converter</h2>
        <label>Rate:</label><br>
        <input type="text" name="rate" class="data"/><br>
        <label>USD:</label><br>
        <input type="text" name="usd" class="data"><br>
        <input type="submit" id="nut" value="converter">
    </div>
</form>
</body>
</html>
