<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="author" content="Ana González Santamaría">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?          family=Open+Sans:300,300italic,400,400italic,600,600italic%7CNoto+Serif:400,400italic,700,700italic%7CDroid+Sans+Mono:400,700">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
  <h1>Mastermind. Solución 1.3. modelViewPresenter</h1>
  <div class="details">
    <span id="author" class="author">Ana González Santamaría</span><br>
    <span id="email" class="email"><a href="mailto:ana97gs@gmail.com">ana97gs@gmail.com</a></span><br>
    <span id="revnumber">version 0.0.1</span>
  </div>
  <div id="toc" class="toc">
    <div id="toctitle">Índice</div>
      <ul class="sectlevel1">
        <li><a href="#requisitos-1-básica">Requisitos 1. Básica</a></li>
        <li><a href="#vista-de-lógicadiseño">Vista de Lógica/Diseño</a>
          <ul class="sectlevel2">
            <li><a href="#arquitectura">Arquitectura</a></li>
            <li><a href="#paquete-mastermind">Paquete <em>Mastermind</em></a></li>
            <li><a href="#paquete-mastermind.views">Paquete <em>mastermind.views</em></a></li>
            <li><a href="#paquete-views-controllers">Paquetes <em>mastermind.views.console</em> y <em>mastermind.controller</em></a></li>
            <li><a href="#paquete-controller-models">Paquetes <em>mastermind.controllers</em> y <em>mastermind.models</em></a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
  <div id="content">
    <div class="sect1">
      <h2 id="requisitos-1-básica">Requisitos 1. Básica</h2>
      <div class="sectionbody">
        <table class="tableblock frame-all grid-all stretch">
          <colgroup>
            <col style="width: 50%;">
            <col style="width: 50%;">
          </colgroup>
          <tbody>
            <tr>     
              <td class="tableblock halign-left valign-top"><div class="content"><div class="ulist">
                <ul>
                  <li>
                    <p><a href="https://en.wikipedia.org/wiki/Mastermind_(board_game)"><strong>Wiki</strong></a> - <a href="https://www.youtube.com/watch?v=2-hTeg2M6GQ"><strong>Youtube</strong></a></p>
                    <div class="ulist">
                      <ul>
                        <li><p><em>Funcionalidad: <strong>Básica</strong></em></p></li>
                        <li><p><em>Interfaz: <strong>Texto</strong></em></p></li>
                        <li><p><em>Distribución: <strong>Stand Alone</strong></em></p></li>
                        <li><p><em>Persistencia: <strong>No</strong></em></p></li>
                      </ul>
                    </div> 
                  </li>
                </ul>
              </td>
              <td class="tableblock halign-left valign-top"><div class="content"><div class="imageblock">
                <div class="content">
                  <img src="images/Mastermind.jpg" alt="Mastermind" width="430" height="460">
                </div>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
    <div class="sect1">
      <h2 id="vista-de-lógicadiseño">Vista de Lógica/Diseño</h2>
      <div class="sectionbody">
        <div class="sect2">
          <h3 id="arquitectura">Arquitectura</h3>
          <div class="imageblock" style="text-align: center">
            <div class="content">
              <img src="images/arquitectura_pm.png" alt="MastermindArquitecture" width="400" height="650">
            </div>
          </div>
        </div>
        <div class="sect2">
          <h3 id="paquete-mastermind">Paquete <em>mastermind</em></h3>
          <div class="imageblock">
            <div class="content">
              <img src="images/paquete_mastermind.png" alt="paqueteMastermind" width="600" height="440">
            </div>
          </div>
        </div>
        <div class="sect2">
          <h3 id="paquete-mastermind.views">Paquete <em>mastermind.views</em></h3>
          <div class="imageblock">
            <div class="content">
              <img src="images/paquete_mastermind.views.png" alt="paqueteViews" width="1400" height="895">
            </div>
          </div>
        </div>
        <div class="sect2">
          <h3 id="paquete-views-controllers">Paquetes <em>mastermind.views.console</em> y <em>mastermind.controller</em></h3>
          <div class="imageblock">
            <div class="content">
              <img src="images/paquetes_vies_controllers.png" alt="paquetesViewsControllers" width="1500" height="470">
            </div>
          </div>
        </div>
        <div class="sect2">
          <h3 id="paquete-controller-models">Paquetes <em>mastermind.controllers</em> y <em>mastermind.models</em></h3>
          <div class="imageblock">
            <div class="content">
              <img src="images/paquetes_controllers_models.png" alt="paqueteControllersModels" width="1050" height="1222">
            </div>
          </div>
        </div>
      </div>
  </div>
</body>
</html>
