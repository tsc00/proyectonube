<!DOCTYPE html>
<head>
    <title>Restaurantes</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://bootswatch.com/4/cerulean/bootstrap.min.css" crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <style>
        table, th, td {
            border: 2px solid black;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="/">Inicio</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault"
            aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="http://bfy.tw/Ffa2">Mejores Restaurantes del Mundo <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="https://github.com/tsc00">Conócenos</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" style="color: forestgreen" href="/rest/api/v1/restaurants">API REST</a>
            </li>
        </ul>
    </div>
</nav>

<main role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="container">
            <h1 class="display-3">Restaurantes de Mallorca</h1>
            <p><h3>En esta pagina conoceremos los mejores restaurantes de Mallorca segun el criterio de los clientes.</h3>
            <h8>Les recordamos que las opiniones son 100% propias de los clientes y no nos hacemos responsable de sus comentarios</h8> </p>
<div class="row">
<#if model??>
    <div class="row center mt-1">
        <#list model["list"] as item>
            <div align="center" class="col-sm-4"/>
                <br>
                <br>
                <div align="center">
                    <img class="align-self-start mr-1"
                    <img src="${item.imagen!""}" width="340" height="240"/>
                </div>
                <div>
                    <br>
                    <div>
                        <table>
                            <tr>
                                <td><p><b>Codigo de restaurante: </b>${item.codigo!""}</p></td>
                            </tr>
                            <tr>
                                <td><p><b>Restaurante:</b></p><p>${item.nombre!""}</p></td>
                            </tr>
                            <tr>
                                <td><p><b>Direccion:</b></p><p>${item.direccion!""}</p></td>
                            </tr>
                             <tr>
                                <td><p><b>Pagina Web:</b></p><p>${item.web!""}</p></td>
                             </tr>
                            <tr>
                                <td><p><b>Puntuacion:</b></p><p>${item.mitjana!""}</p></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </#list>
    </div>
</#if>
</div>
</div>
</main>
<footer class="container">
    <p>&copy; Tomás Sastre Cámara 2018</p>
</footer>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</body>
</html>
<!--
Tomás Sastre Cámara
2n ASIX
-->