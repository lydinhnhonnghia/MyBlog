<%-- 
    Document   : MyBlogHome
    Created on : Mar 15, 2019, 12:17:43 AM
    Author     : kynhanht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Blog</title>
        <link rel="stylesheet" href="css/myBlogHome.css">
        <link rel="stylesheet" href="css/layout.css">
        
    </head>
    <body>
        <div class="site-wrapper">
            <jsp:include page="Header.jsp"/>
            <div class="content-wrapper">
                <div class="container">
                    <div class="content-left">
                        <div class="introduction-title">My Blog</div>
                        <c:forEach var="x" items="${blogs}">
                            <c:url var="blogDetail" value="BlogDetailController">
                                <c:param name="id" value="${x.id}"></c:param>
                            </c:url>
                            <div class="section">
                                <div class="content">
                                    <div class="content-icon">
                                        <img src="${x.iconPicture}" class="icon">
                                    </div>
                                    <div class="content-detail">
                                        <div class="header">
                                            <div class="title">
                                                <a href="${blogDetail}">${x.name}</a>
                                            </div>
                                            <div class="publishedDate">
                                                ${x.publishedDate}
                                            </div>
                                        </div>
                                        <c:choose>
                                            <c:when test="${x.type=='picture'}">
                                                <div class="blog-img">
                                                    <img src="${x.picture}">
                                                </div>
                                                ${x.description}
                                            </c:when>
                                            <c:when test="${x.type=='quote'}">
                                                <div class="pull-right">
                                                    <q>${x.quote}</q>
                                                    <small>${x.author}</small>
                                                </div>   
                                            </c:when>
                                            <c:otherwise>
                                                <div>
                                                    <img src="${x.picture}">
                                                </div>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
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
