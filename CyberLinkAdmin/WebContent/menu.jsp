<!DOCTYPE html>
<html lang="en">

<head>
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>Admin</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- style css -->
    <link rel="stylesheet" href="css/style.css">
    <!-- Responsive-->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- fevicon -->
    <link rel="icon" href="images/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<!-- body -->

<body class="main-layout album-page">
    <!-- loader  -->
    <div class="loader_bg">
        <div class="loader"><img src="images/loading.gif" alt="#" /></div>
    </div>
    <!-- end loader -->
    <!-- header -->
    <header>
        <!-- header inner -->
        <div class="header">
            <div class="container">
                <div class="row">
                    <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2 col logo_section">
                        <div class="full">
                            <div class="center-desk">
                                <div class="logo">
                                    <a href="index.jsp"><img src="images/logo.jpg" alt="logo" /></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-8 col-lg-8 col-md-10 col-sm-10">
                        <div class="menu-area">
                            <div class="limit-box">
                                <nav class="main-menu">
                                    <ul class="menu-area-main">
                                        <li> <a href="index.jsp">Home</a> </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                   
                </div>
            </div>
            </div>
            <!-- end header inner -->
    </header>
    <!-- end header -->

    <div class="Albumsbg">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="Albumstitlepage">
                        <h2>Post Jobs</h2>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Albums -->
    <div class="Albums">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="titlepage">

<!--                         <span>It is a long established fact that a reader will be distracted by the readable <br>content of a page when looking at its layout. The point of using Lorem </span> -->
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 margin">
                    <div class="Albums-box">
                        <figure>
                        <h1 style="color: red; margin-left: 40%">Freelance</h1>
                            <a href="freelance.jsp" rel="ligthbox">
                                <img src="images/freelance.jpg" class="zoom img-fluid " alt="">
                            </a>
                            <span class="hoverle">
                        <a href="freelance.jsp" rel="ligthbox"><img src="images/search.png"></a>
                        </span>
                        </figure>
                    </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 margin">
                    <div class="Albums-box">
                        <figure>
                         <h1 style="color: red; margin-left: 40%">Jobs</h1>
                            <a href="jobs.jsp" rel="ligthbox ">
                                <img src="images/jobs.jpg" class="zoom img-fluid " alt="">
                            </a>
                            <span class="hoverle">
                        <a href="jobs.jsp" rel="ligthbox"><img src="images/search.png"></a>
                        </span>
                        </figure>
                    </div>
                </div>
             

            </div>
        </div>
    </div>
    <!-- end Albums -->

    <!--  footer -->
   
            <div class="copyright">
                <p>?? 2021 All Rights Reserved. <a href="#">Cyber Link Solutions</a></p>
            </div>
    
    <!-- end footer -->
    <!-- Javascript files-->
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.bundle.min.js"></script>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script src="js/plugin.js"></script>
    <!-- sidebar -->
    <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/custom.js"></script>
    <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
    <script>
        $(document).ready(function() {
            $(".fancybox").fancybox({
                openEffect: "none",
                closeEffect: "none"
            });

            $(".zoom").hover(function() {

                $(this).addClass('transition');
            }, function() {

                $(this).removeClass('transition');
            });
        });
    </script>
</body>

</html>