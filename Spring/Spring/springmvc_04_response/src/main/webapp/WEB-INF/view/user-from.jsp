<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
</head>
<body>
<h1>用户注册</h1>
<form action="/user/create" method="post" enctype="application/json">
    <label for="id">ID:</label>
    <input type="number" id="id" name="id" required><br>

    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br>

    <label for="birthday">Birthday (yyyy-MM-dd):</label>
    <input type="text" id="birthday" name="birthday" required pattern="\\d{4}-\\d{2}-\\d{2}"><br>

    <input type="submit" value="Create User">
</form>
</body>
</html>
