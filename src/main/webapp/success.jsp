<%@ page import="com.tanwisharma.persistence.GoogleUserDao" %>
<%@ page import="com.tanwisharma.entity.GoogleUser" %><%--
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
    String name=(String)request.getParameter("name");
    String email=(String)request.getParameter("email");
    String imag = (String)request.getParameter("imagurl");
    GoogleUser googleUser = new GoogleUser();
    googleUser.setName(name);
    googleUser.setEmail(email);
    GoogleUserDao googleUserDao = new GoogleUserDao();
    googleUserDao.insert(googleUser);
%>

<%=name %>
<%=googleUser.getName() %>
<%=email %>
<img src=<%=imag %> alt="profile" width="50" height="50">
</body>
</html>