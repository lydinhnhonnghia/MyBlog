<%-- 
    Document   : Overview
    Created on : Mar 16, 2019, 9:49:41 PM
    Author     : kynhanht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Overview</title>
        <link rel="stylesheet" href="css/layout.css">
        <link rel="stylesheet" href="css/overview.css">
    </head>
    <body>
        <div class="site-wrapper">
            <jsp:include page="Header.jsp"/>
            <div class="content-wrapper">
                <div class="container">
                    <div class="content-left">
                        <div class="introduction-title">Overview-My Blog</div>
                        <div class="overview-content">
                            <div class="overview-section">
                                <div class="overview-left">NOVEMBER 2015</div>
                                <div class="overview-right">Date</div>
                            </div>
                            <c:forEach var="x" items="${blogs}">
                                <c:url var="blogDetail" value="BlogDetailController">
                                    <c:param name="id" value="${x.id}"></c:param>
                                </c:url>
                                <div class="overview-section">
                                    <div class="overview-left"><a href="${blogDetail}">${x.name}</a></div>
                                    <div class="overview-right">${x.publishedDate}</div>
                                </div>
                            </c:forEach>

                        </div>
                        <div class="section">
                            <div class="content">
                                <div class="page">
                                    <c:forEach var="i" begin="1" end="${pages}">
                                        <c:url var="overview" value="OverviewController">
                                            <c:param name="page" value="${i}"></c:param>
                                        </c:url>
                                        <c:choose>
                                            <c:when test="${page==i}">
                                                <a href="${overview}" class="disabled-link">${i}</a>
                                            </c:when>
                                            <c:otherwise>
                                                <a href="${overview}">${i}</a>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </div>
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
