<%-- 
    Document   : BlogDetail
    Created on : Mar 16, 2019, 10:36:06 PM
    Author     : kynhanht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog Detail</title>
        <link rel="stylesheet" href="css/layout.css">
        <link rel="stylesheet" href="css/myBlogHome.css">
    </head>
    <body>
        <div class="site-wrapper">
            <jsp:include page="Header.jsp"/>
            <div class="content-wrapper">
                <div class="container">
                    <div class="content-left">
                        <div class="section">
                            <div class="content">
                                <div class="content-icon">
                                    <img src="${blog.iconPicture}">
                                </div>
                                <div class="content-detail">
                                    <div class="header">
                                        <div class="title">
                                            <div class="blog-title">
                                                ${blog.name}
                                            </div>
                                        </div>
                                        <div class="publishedDate">
                                            ${blog.publishedDate}
                                        </div>
                                    </div>
                                    <c:choose>
                                        <c:when test="${blog.type=='picture'}">
                                            <div class="blog-img">
                                                <img src="${blog.picture}">
                                            </div>
                                            ${blog.description}
                                        </c:when>
                                        <c:when test="${blog.type=='quote'}">
                                            <div class="pull-right">
                                                <q>${blog.quote}</q>
                                                <small>${blog.author}</small>
                                            </div>   
                                        </c:when>
                                        <c:otherwise>
                                            <div>
                                                <img src="${blog.picture}">
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </div>
                        </div>
                        <div class="section">
                            <div class="overview">
                                <a href="OverviewController">Overview</a>
                            </div>
                        </div>
                    </div>
                    <jsp:include page="Share.jsp"/>
                </div>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
