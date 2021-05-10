<%-- 
    Document   : Header
    Created on : Mar 14, 2019, 11:42:58 PM
    Author     : kynhanht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/layout.css">
<div class="header-wrapper">
    <div class="container">
        <div class="title-wrapper">
            <div class="header-title">
                <a href="MyBlogHomeController" class="link">Blogging About My Life</a>
            </div>
            <div class="sub-subtitle">Welcome to my blog</div>

        </div>
        <div class="navbar">
            <ul class="nav">
                <c:choose>
                    <c:when test="${currentPage=='0'}">
                        <li><a  href="MyBlogHomeController" class="link keepHightLight-link">My Blog</a></li>
                        <li><a href="AboutMeController" class="link">About Me</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a  href="MyBlogHomeController" class="link">My Blog</a></li>
                        <li><a href="AboutMeController" class="link keepHightLight-link">About Me</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    </div>
</div>

