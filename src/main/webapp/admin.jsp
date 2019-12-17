<%@ page import="com.tanwisharma.entity.User" %>
<%@ page import="com.tanwisharma.persistence.UserDao" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/2/19
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <!-- import part start-->
    <c:import url="template-header.jsp" />
    <!-- import part end-->
</head>

<body>
<!--::header part start::-->
<c:import url="UserHeader.jsp" />
<!-- Header part end-->

<!-- Login start-->
<%
    String user_name= request.getRemoteUser();
    User user = new User();
    user.setUser_name(user_name);
    UserDao userDao = new UserDao();
    user = userDao.getByUsername(user_name);
%>
<div>
<h3 align="center">Welcome </h3>
<h3 align="center">
    <%=user.getFirst_name() %>
    <%=user.getLast_name() %>
</h3>
</div>

<!-- Login-->

<!-- jquery -->
<c:import url="jqueryPlugins.jsp" />
</body>

</html>
