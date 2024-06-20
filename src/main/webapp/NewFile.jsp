<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
<link rel="stylesheet" href="NewFile.css">
</head>
<body>
    <img src="Images/img2.gif" alt="laugh" class="gif">
    <h1 class="Name">Joke of the Day</h1>
    <h3 class = "Joke"><%=request.getParameter("Joke") %></h3>
    <form action="myServlet">
        <input name="num1" class="num" placeholder="Enter the Number" />
        <input name="num2" class="num" placeholder="Enter the Number" />
        <button name="bt1" class="bt1" value="1">+</button>
        <button name="bt1" class="bt1" value="2">-</button>
        <button name="bt1" class="bt1" value="3">*</button>
        <button name="bt1" class="bt1" value="4">/</button>
    </form>
</body>
<h1 class = "Answer">Ans=<%=request.getParameter("ans") %></h1>
</html>