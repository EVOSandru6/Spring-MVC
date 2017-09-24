<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start Application</title>
</head>
<body>
<h2>Rest-сервис</h2>
<p>
<form method="get" action="<%=request.getContextPath()%>/get-json">
    <input type="text"   placeholder="Property String" name="propertyString">
    <input type="text"   placeholder="Property Int"    name="propertyInt">
    <input type="text"   placeholder="Property Bool"   name="propertyBool">
    <input type="submit" value="Получить JSON">
</form>
</p>
<p>
<form method="get" action="<%=request.getContextPath()%>/get-xml">
    <input type="text"   placeholder="Property String" name="propertyString">
    <input type="text"   placeholder="Property Int"    name="propertyInt">
    <input type="text"   placeholder="Property Bool"   name="propertyBool">
    <input type="submit" value="Получить XML">
</form>
</p>
<p>
    <a href="<%=request.getContextPath()%>/error-rest-controller">Вызвать ошибку в Rest-контроллере</a>
</p>
<p>
    <a href="<%=request.getContextPath()%>">Назад</a>
</p>
</body>
</html>
