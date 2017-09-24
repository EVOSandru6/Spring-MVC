<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Страница пользователя</title>
</head>
<body>
    <div style="width: 150px;height: 150px;background: yellow;border: solid black 1px"></div>
    <h1>Доступ - "Пользователь(ROLE_USER)"</h1>
    <a href="<%=request.getContextPath()%>">Назад</a>
    <a href="<%=request.getContextPath()%>/j_spring_security_logout">Выйти</a>

</body>
</html>