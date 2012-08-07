<%-- 
    Document   : article
    Created on : 07.08.2012, 23:03:23
    Author     : sergey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Главная страница блога</title>
    </head>
    <body>
        <header>
            <a href="/"><img alt="Логотип" id="top-image" src="#"/></a>
            <div id="user-panel">
                <a href="#"><img alt="Иконка юзера" scr=""/></a>
                <a href="javascript:void(0);">[Панель для юзера]</a>
            </div>
        </header>
        <div id="main">
            <aside class="leftAside">
                <h2>Темы статей</h2>
                <ul>
                    <li><a href="#">Тема 1</a></li>
                    <li><a href="#">Тема 2</a></li>
                    <li><a href="#">Тема 3</a></li>
                    <li><a href="#">Тема 3</a></li>
                    
                </ul>
            </aside>
            <section>
                <article>
                    <h1>Статья</h1>
                    <div class="text-article">
                        Текст статьи
                    </div>
                    <div class="fotter-article">
                        <span class="autor">Автор статьи: <a href="#">автор</a></span>
                        <span class="date-article">Дата статьи: 20.12.2012</span>
                    </div>
                </article>
            </section>
        </div>
        <footer>
            <div>
                <span>Тестовое приложение JAVA EE</span>
                <span><a target="_blanc" href="http://onedeveloper.ru/search?w=Java">Уроки по JavaEE</a></span>
            </div>
        </footer>
    </body>
</html>

