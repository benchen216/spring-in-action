<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<html>
<head>
<title>Spittr</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" />
</head>
<body>
<div class="header">
    <span class="title">Spittr</span>
    <nav>
        <a href="<c:url value="/spittles" />">Home</a>
        <a href="<c:url value="/spittler/register" />">Spittles</a>
    </nav>
</div>
</body>
</html>