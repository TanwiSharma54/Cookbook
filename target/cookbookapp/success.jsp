<%@ page import="com.tanwisharma.persistence.UserDao" %>
<%@ page import="com.tanwisharma.entity.User" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/20/19
  Time: 9:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Google Login Success page</title>
</head>
<body>
<%
    String first_name=(String)request.getParameter("first_name");
    String last_name=(String)request.getParameter("last_name");
    String user_name=(String)request.getParameter("user_name");
    String email=(String)request.getParameter("email");
    String pass=(String)request.getParameter("pass");
    User user = new User();
    user.setFirst_name(first_name);
    user.setLast_name(last_name);
    user.setUser_name(user_name);
    user.setEmail(email);
    user.setPass(pass);
    UserDao userDao = new UserDao();
    userDao.insert(user);
%>

<%=first_name %>
<%=user.getFirst_name() %>
<%=email %>
</body>
</html>