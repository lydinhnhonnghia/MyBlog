<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/share.css">
<div class="content-right">
    <div class="share-box">
        <div class="share-header">Share this page</div>
        <div class="share-content">
            <c:forEach var="x" items="${shares}">
                <div>
                    <a href="${x.url}">
                        <img src="${x.icon}"> 
                        Share on ${x.socialNetwork}
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="share-box">

    </div>
</div>