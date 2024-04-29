<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Приветственная страница</title>
    <style>
        body, html {
            height: 100%;
            margin: 0;
            font-family: Arial, sans-serif;
        }

        .bg {
            background-image: url('https://example.com/mountain.jpg');
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            height: 100%;
        }

        .header {
            padding: 20px;
            text-align: left;
            background: rgba(255, 255, 255, 0.8);
        }

        .logout-button {
            position: absolute;
            right: 20px;
            top: 20px;
            padding: 10px 20px;
            background: red;
            color: white;
            border: none;
            cursor: pointer;
        }

        .footer {
            position: absolute;
            bottom: 0;
            width: 100%;
            height: 100px;
            background: rgba(255, 255, 255, 0.8);
        }

        .news-item {
            display: flex;
            align-items: center;
            margin-bottom: 15px;
            padding-bottom: 15px;
            border-bottom: 1px solid black;
        }
        .img-fluid {
            width: 200px;
            height: 120px;
            margin-right: 20px;
        }
    </style>
</head>
<body>
<div class="bg">
    <div class="header">
        <h1>Привет пользователь</h1>
        <a href="MyController?command=do_logout" class="btn btn-lg btn-danger btn-custom">Выйти</a>
    </div>

    <div>
        <h1>Наши новости</h1>
        <c:forEach var="news" items="${requestScope.myNews}">
            <p>${news.title}</p>
            <p class="news-item">${news.content}</p>
            <img src="${news.imgPath}" class="img-fluid">
        </c:forEach>
    </div>

    <div class="footer">
    </div>
</div>
</body>
</html>
