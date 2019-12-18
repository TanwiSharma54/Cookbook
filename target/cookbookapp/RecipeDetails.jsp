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
                <h2>Recipe Details page</h2>
            </div>
        </div>
    </div>
</section>
<!-- breadcrumb start-->
&nbsp;<!--::recipes_part start::-->
<section class="blog_area single-post-area padding_top:50px">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 posts-list">
                <div class="single-post">
                    <div class="feature-img">
                        <img class="img-fluid" src=${image} alt="">
                    </div>
                    <div class="blog_details">
                        <h2>Recipe Name: ${title}</h2>
                        <h2>Instructions: </h2>
                        <p class="excert">
                            <c:forEach items="${recipeSteps}" var="recipeSteps">
                        <p>Step ${recipeSteps.number} : ${recipeSteps.step}</p>
                        </c:forEach>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!--::recipes_part end::-->

<!-- jquery -->
<c:import url="jqueryPlugins.jsp" />
</body>
</html>
