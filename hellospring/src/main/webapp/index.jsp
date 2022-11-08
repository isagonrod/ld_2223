<%--
  Created by IntelliJ IDEA.
  User: igr19
  Date: 08/11/2022
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <a href="<c:url value="/hello" />" title="Go to hello">Go to hello action</a>
    </body>
</html>
