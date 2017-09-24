<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Доступ закрыт</title>
</head>
<body>
    <div style="width: 150px;height: 150px;background: red;border: solid black 1px"></div>
    <h1>Доступ к запрашиваемому ресурсу или методу закрыт</h1>
    <a href="<%=request.getContextPath()%>">Назад</a>
</body>
</html>