<%-- 
    Document   : showBook
    Created on : Mar 7, 2019, 10:12:02 AM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Выбранная для просмотра книга</title>
    </head>
    <body>
        <h1>Просмотр книги!</h1>
        Обложка: <img src="insertFile/${cover.path}" width="150" height="200" ><br>
        Заголовок:${book.name}<br>
        Автор:${book.author}<br>
        Доступно книг:${book.count}
    </body>
</html>
