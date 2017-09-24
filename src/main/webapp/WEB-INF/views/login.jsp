<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="<%=request.getContextPath()%>/resources/css/login-style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="body-form-div">
    <form method="post" action="<%=request.getContextPath()%>/j_spring_security_check">
        <label for="login">Логин</label>
        <input id="login" name="user_login" type="text">
        <br>

        <label for="password">Пароль</label>
        <input id="password" type="password" name='password_login'>
        <br>

        <label for="remember-me">Запомнить меня</label>
        <input id="remember-me" type="checkbox" name="_spring_security_remember_me">
        <br>

        <div class="footer-form-div">
        <input type="reset"  value="Сброс"/>
        <input type="submit" value="Войти"/>
        </div>
    </form>
</div>
</body>
</html>

