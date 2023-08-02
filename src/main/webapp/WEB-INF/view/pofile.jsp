<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<html>
<head>
    <title>Profile</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" />
</head>
<body>
<h1>Profile</h1>
<c:out value="${spieler.username}"/>
<c:out value="${spieler.firstname}"/>
<c:out value="${spieler.lastname}"/>
</body>
</html>