<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <h1>Login Page!</h1>
    <pre>${errorMessage}</pre>
    <form method="post">
    Name: <input type="text" name="username">
    Password: <input type="password" name="password">
    <input type="submit">
</div>

<%@ include file="common/footer.jspf" %>