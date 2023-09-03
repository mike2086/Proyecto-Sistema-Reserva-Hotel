<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html class="no-js">


    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Hotel Grand Castillo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />

        <!-- Facebook and Twitter integration -->
        <meta property="og:title" content="" />
        <meta property="og:image" content="" />
        <meta property="og:url" content="" />
        <meta property="og:site_name" content="" />
        <meta property="og:description" content="" />
        <meta name="twitter:title" content="" />
        <meta name="twitter:image" content="" />
        <meta name="twitter:url" content="" />
        <meta name="twitter:card" content="" />

        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="shortcut icon" href="favicon.ico">

        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>

        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">
        <!-- Bootstrap  -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Superfish -->
        <link rel="stylesheet" href="css/superfish.css">
        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.css">
        <!-- Date Picker -->
        <link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
        <!-- CS Select -->
        <link rel="stylesheet" href="css/cs-select.css">
        <link rel="stylesheet" href="css/cs-skin-border.css">

        <link rel="stylesheet" href="css/style.css">


        <!-- Modernizr JS -->
        <script src="js/modernizr-2.6.2.min.js"></script>


    </head>

    <body>
        <div id="fh5co-wrapper">
            <div id="fh5co-page">
                <header id="fh5co-header-section" class="sticky-banner">
                    <div class="container">
                        <div class="nav-header">
                            <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>
                            <h1 id="fh5co-logo">
                                <a href="index.html"></a><i class="icon-home32"></i>Hotel Grand Castillo</a>
                            </h1>
                            <!-- START #fh5co-menu-wrap -->
                            <nav id="fh5co-menu-wrap" role="navigation">
                                <ul class="sf-menu" id="fh5co-primary-menu">
                                    <li class="active"><a href="huesped.jsp">Huésped</a></li>
                                    <li><a href="empleado.jsp">Empleado</a></li>
                                    <li><a href="habitacion.jsp">Habitaciones</a></li>
                                    <li><a href="reserva.jsp">Reserva</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </header>

                <!-- end:header-top -->

                <div class="fh5co-hero">
                    <div class="fh5co-overlay"></div>
                    <div class="fh5co-cover" data-stellar-background-ratio="0.5" style="background-image: url(images/fondo.jpeg);">
                        <div class="desc">
                            <div class="container">
                                <div class="row">
                                    <div class="col-sm-5 col-md-5">
                                        <div class="tabulation animate-box">

                                            <!-- Nav tabs -->
                                            <ul class="nav nav-tabs" role="tablist">

                                                <li role="presentation">
                                                    <a href="#hotels" aria-controls="hotels" role="tab" data-toggle="tab">Alta de Huésped</a>
                                                </li>

                                            </ul>

                                            <!-- panel reserva -->
                                            <div class="tab-content">

                                                <div role="tabpanel" class="tab-pane active" id="hotels">
                                                    <div class="row">
                                                        
                                                        <form action="SvHuesped" method="post">
                                                            <div class="col-xxs-12 col-xs-12 mt">
                                                                <div class="input-field">
                                                                    <input type="text" class="form-control" id="dni" name="dni" placeholder="DNI" />
                                                                </div>
                                                            </div>
                                                            <div class="col-xxs-12 col-xs-12 mt">
                                                                <div class="input-field">
                                                                    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" />
                                                                </div>
                                                            </div>
                                                            <div class="col-xxs-12 col-xs-12 mt">
                                                                <div class="input-field">
                                                                    <input type="text" class="form-control" id="apellido" name="apellido" placeholder="Apellido" />
                                                                </div>
                                                            </div>
                                                            <div class="col-xxs-12 col-xs-12 mt">
                                                                <div class="input-field">
                                                                    <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Dirección" />
                                                                </div>
                                                            </div>
                                                            <div class="col-xxs-12 col-xs-6 mt alternate">
                                                                <div class="input-field">
                                                                    <label for="from">Fecha de Nacimiento:</label>
                                                                    <input type="text" class="form-control" id="date-start" name="date-start" placeholder="mm/dd/yyyy" />
                                                                </div>
                                                            </div>
                                                            <div class="col-xxs-12 col-xs-12 mt">
                                                                <div class="input-field">
                                                                    <input type="text" class="form-control" id="profesion" name="profesion" placeholder="Profesión" />
                                                                </div>
                                                            </div>
                                                            <div class="col-xs-12 ">
                                                                <input type="submit" class="btn btn-primary btn-block" value="Crear Huésped">
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>

                                            </div>

                                        </div>
                                    </div>
                                    <div class="desc2 animate-box ">
                                        <div class="col-sm-7 col-sm-push-1 col-md-7 col-md-push-1 ">
                                            <p>Sistema de reservas para Hotel Gran Castillo</p>
                                            <h2><em>El Placer de Servir</em></h2>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>


                <footer>
                    <div id="footer ">
                        <div class="container ">
                            <div class="row row-bottom-padded-md ">
                                <div class="row ">
                                    <div class="col-md-6 col-md-offset-3 text-center ">
                                        <p class="fh5co-social-icons ">
                                            <a href="# "><i class="icon-twitter2 "></i></a>
                                            <a href="# "><i class="icon-facebook2 "></i></a>
                                            <a href="# "><i class="icon-instagram "></i></a>
                                            <a href="# "><i class="icon-dribbble2 "></i></a>
                                            <a href="# "><i class="icon-youtube "></i></a>
                                        </p>
                                        <p>Copyright Hotel Grand Castillo . All Rights Reserved. <br>Made with <i class="icon-heart3 "></i> by Hotel Grand Castillo</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </footer>

                <!-- END fh5co-page -->
            </div>
            <!-- END fh5co-wrapper -->
        </div>
        <!-- jQuery -->


        <script src="js/jquery.min.js "></script>
        <!-- jQuery Easing -->
        <script src="js/jquery.easing.1.3.js "></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js "></script>
        <!-- Waypoints -->
        <script src="js/jquery.waypoints.min.js "></script>
        <script src="js/sticky.js "></script>

        <!-- Stellar -->
        <script src="js/jquery.stellar.min.js "></script>
        <!-- Superfish -->
        <script src="js/hoverIntent.js "></script>
        <script src="js/superfish.js "></script>
        <!-- Magnific Popup -->
        <script src="js/jquery.magnific-popup.min.js "></script>
        <script src="js/magnific-popup-options.js "></script>
        <!-- Date Picker -->
        <script src="js/bootstrap-datepicker.min.js "></script>
        <!-- CS Select -->
        <script src="js/classie.js "></script>
        <script src="js/selectFx.js "></script>

        <!-- Main JS -->
        <script src="js/main.js "></script>

    </body>


</htm>
