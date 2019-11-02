<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <!--   <meta name="google-signin-client_id" content="9637365623-60mh9lsstjm89hh809ddemnl2dpkic0i.apps.googleusercontent.com"> -->
    <!-- import part start-->
    <c:import url="template-header.jsp" />
    <!-- import part end-->
</head>

<body>
<!-- Header part start-->
<c:import url="Header.jsp" />
<!-- Header part end-->
<!-- Login-->
<section class="banner_part">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <div class="banner_text">
                    <div class="banner_text_iner">
                        <FORM ACTION="j_security_check" METHOD="POST">
                            <TABLE>
                                <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username">
                                <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                                <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
                            </TABLE>
                        </FORM>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Login-->

<!-- jquery -->
<c:import url="jqueryPlugins.jsp" />
</body>

</html>