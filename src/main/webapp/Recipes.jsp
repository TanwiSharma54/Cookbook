<%@ page import="javax.json.stream.JsonParser" %>
<%@ page import="javax.json.JsonObject" %><%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/2/19
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All recipe page</h2>
<form action="<%= request.getContextPath() %>/AllRecipesController" method="GET" align="center">

    <input type="submit" value="Get All Recipes" />
</form>

<p><c:out value="${recipes}"/></p>

</body>
</html>
