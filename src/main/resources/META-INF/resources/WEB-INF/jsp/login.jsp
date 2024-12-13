<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
    <head>
        <link href="webjars\bootstrap\5.3.3\css\bootstrap.min.css" rel="stylesheet">
        <title> Login Page </title>
    </head>
    <body>
        <div class="container">
            <h1>Login Page!</h1>
            <pre>${errorMessage}</pre>
            <form method="post">
            Name: <input type="text" name="username">
            Password: <input type="password" name="password">
            <input type="submit">
        </div>

        <script src="webjars\bootstrap\5.3.3\js\bootstrap.min.js"></script>
        <script src="webjars\jquery\3.7.1\jquery.min.js"></script>
    </body>
<html>