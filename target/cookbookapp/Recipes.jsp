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
<!-- breadcrumb start-->
<section class="breadcrumb breadcrumb_bg">
    <div class="container">
        <div class="row">
            <div class="col-lg-12" text-center>
                <h2>All recipe page</h2>
            </div>
        </div>
    </div>
</section>
<!-- breadcrumb start-->
&nbsp;
<div margin="3px">
    <form action="<%= request.getContextPath() %>/AllRecipesController" method="GET" align="center">
        <input type="submit" value="Get All Recipes" />
    </form>
</div>
&nbsp;&nbsp;
<!--::recipe_part start::-->
<section class="chefs_part blog_item_section padding_top:50px">
    <div class="container">
        <div class="row">
            <c:forEach items="${recipes}" var="recipe">
                <div class="col-sm-6 col-lg-4">
                    <div class="single_blog_item">
                        <div class="single_blog_img">
                            <img src=${recipe.image} alt="">
                        </div>
                        <div class="single_blog_text text-center">
                            <h3>${recipe.title}</h3>
                            <p>readyInMinutes : ${recipe.readyInMinutes}</p>
                            <p>servings : ${recipe.servings}</p>
                            <div class="social_icon">
                                <div class="social_icon">
                                    <a href="#">
                                        <span style="font-size:300%;color:red;">&hearts;</span>
                                    </a>
                                    <a href="RecipeDetail?recipeId=${recipe.id}&title=${recipe.title}&image=${recipe.image}"> <span style="font-size:300%;color:green;alignment:center">&rightarrow;</span> </a>
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
