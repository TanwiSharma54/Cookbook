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
<div>
<h3 align="center">Welcome ${userName}</h3>
</div>
<!-- Login-->
<!--::recipe_part start::-->
<section class="chefs_part blog_item_section padding_top:50px">
    <div class="container">
        <div class="row">
            <c:forEach items="${recipes}" var="recipes">
                <div class="col-sm-6 col-lg-4">
                    <div class="single_blog_item">
                        <div class="single_blog_img">
                            <img src="#" alt="">
                        </div>
                        <div class="single_blog_text text-center">
                            <h3>${recipes.title}</h3>
                            <div class="social_icon">
                                <div class="social_icon">
                                    <a href="RemoveFavoriteController?favId=${recipes.id}">
                                        <span style="font-size:400%;color:red;">-</span>
                                    </a>
                                    <a href="RecipeDetail?recipeId=${recipes.recipeId}&title=${recipes.title}"> <span style="font-size:300%;color:green;alignment:center">&uparrow;</span> </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>
<!--::recipes_part start::-->

<!-- jquery -->
<c:import url="jqueryPlugins.jsp" />
</body>

</html>
