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
<header class="main_menu">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-12">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <a class="navbar-brand" href="index.html"> <img src="img/cookBooklogo.png" alt="logo"> </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse main-menu-item justify-content-end"
                         id="navbarSupportedContent">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="index.jsp">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="about.html">About</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="blog.html" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Categories
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="Recipes.jsp">All Recipes</a>
                                    <a class="dropdown-item" href="SearchByIngredients.jsp">Search by Ingredients</a>
                                    <a class="dropdown-item" href="SearchRecipesbyNutrients.jsp">Add New Recipe</a>
                                    <a class="dropdown-item" href="AddNewIngredients.jsp">Add New Ingredients</a>
                                </div>
                            </li>

                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="blog.html" id="navbarDropdown1" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Profile
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="admin.jsp">Admin</a>
                                    <a class="dropdown-item" href="userRegistration.jsp">Sign Up</a>
                                    <a class="dropdown-item" href="index.jsp">Sign Out</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
    </div>
</header>
<!-- Header part end-->

<!-- User sign up start-->
<div align="center">
    <h2>User Sign up page</h2>
    <form action="<%= request.getContextPath() %>/register" method="post" align="center">
        <table style="with: 50%">
            <tr>
                <td>First Name</td>
                <td><input type="text" name="first_name" /></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="last_name" /></td>
            </tr>
            <tr>
                <td>UserName</td>
                <td><input type="text" name="user_name" /></td>
            </tr>

            <tr>
                <td>Email</td>
                <td><input type="text" name="email" /></td>
            </tr>

            <tr>
                <td>Password</td>
                <td><input type="password" name="pass" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>

</div>
<!-- sig up-->

<!-- jquery -->
<c:import url="jqueryPlugins.jsp" />
</body>

</html>
