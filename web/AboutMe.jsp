<%-- 
    Document   : AboutMe
    Created on : Mar 16, 2019, 10:45:27 PM
    Author     : kynhanht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About me</title>
        <link rel="stylesheet" href="css/layout.css">
        <link rel="stylesheet" href="css/aboutMe.css">
    </head>
    <body>
        <div class="site-wrapper">
            <jsp:include page="Header.jsp"/>
            <div class="content-wrapper">
                <div class="container">
                    <div class="content-left">
                        <div class="introduction-title">About Me</div>
                        <div class="section">
                            <div class="content">
                                <div>${aboutMe.description}</div>
                            </div>
                        </div>
                        <div class="section">
                            <div class="title-signature">Kind regards</div>
                            <div class="signature">${aboutMe.name}</div>
                        </div>
                    </div>
                    <jsp:include page="Share.jsp"/>
                </div>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
