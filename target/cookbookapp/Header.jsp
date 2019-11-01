<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/21/19
  Time: 3:59 AM
  To change this template use File | Settings | File Templates.
--%>
<!--::header part start::-->
<header class="main_menu home_menu">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-12">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <a class="navbar-brand" href="index.html"> <img src="img/cookBooklogo.png" alt="logo" width=200> </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse main-menu-item justify-content-end"
                         id="navbarSupportedContent">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="index.html">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="about.html">About</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="blog.html" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Categories
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="#">All Recipes</a>
                                    <a class="dropdown-item" href="#">Search by Ingredients</a>
                                    <a class="dropdown-item" href="#">Add New Recipe</a>
                                    <a class="dropdown-item" href="#">Add New Ingredients</a>
                                </div>
                            </li>

                        </ul>
                    </div>
                    <!-- Google Sign In starts-->
                    <div class="g-signin2" data-onsuccess="onSignIn" id="myP"></div>
                    <img id="myImg"><br>
                    <p id="name"></p>
                    <div id="status">
                    </div>
                    <script type="text/javascript">
                        function onSignIn(googleUser) {
                            // window.location.href='success.jsp';
                            var profile = googleUser.getBasicProfile();
                            var imagurl=profile.getImageUrl();
                            var name=profile.getName();
                            var email=profile.getEmail();
                            document.getElementById("myImg").src = imagurl;
                            document.getElementById("name").innerHTML = name;
                            document.getElementById("myP").style.visibility = "hidden";
                            document.getElementById("status").innerHTML = '<a class="btn_1 d-none d-sm-block" href="success.jsp?email='+email+'&name='+name+'&imagurl='+imagurl+'"/>Continue with Google login</a></p>'
                        }
                    </script>
                    <button onclick="myFunction()">Sign Out</button>
                    <script>
                        function myFunction() {
                            gapi.auth2.getAuthInstance().disconnect();
                            location.reload();
                        }
                    </script>
                    <!-- Google Sign In Ends-->
                    <!-- <div class="menu_btn">
                         <a href="#" class="btn_1 d-none d-sm-block">Login with Google</a>
                     </div>-->
                </nav>
            </div>
        </div>
    </div>
</header>
<!-- Header part end-->