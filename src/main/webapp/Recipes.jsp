<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/2/19
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All recipe page</h2>
<form action="<%= request.getContextPath() %>/ApiServletController" method="get" align="center">

    <input type="submit" value="Search" />
</form>

</body>
</html>
