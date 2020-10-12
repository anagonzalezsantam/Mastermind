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
  <h1>Mastermind</h1>
  <div class="details">
    <span id="author" class="author">Ana González Santamaría</span><br>
    <span id="email" class="email"><a href="mailto:ana97gs@gmail.com">ana97gs@gmail.com</a></span><br>
    <span id="revnumber">version 0.0.1</span>
  </div>
  <div id="index">
    <div id="index_title">Table of Contents</div>
      <ul class="sectlevel1">
        <li><a href="#modelo-del-dominio">Modelo del Dominio</a>
          <ul class="sectlevel2">
            <li><a href="#vocabulario">Vocabulario</a></li>
            <li><a href="#estado-inicial">Estado Inicial. Primera propuesta de la combinación.</a></li>
            <li><a href="#estado-final">Estado Final. Inserción de combinación correcta.</a></li>
            <li><a href="#instrucciones">Instrucciones</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
  <div id="content">
    <div class="sect1">
      <h2 id="modelo-del-dominio">Modelo del Dominio</h2>
      <div class="sectionbody">
        <div class="imageblock">
          <div class="content">
            <img src="images/Mastermind.jpg" alt="Mastermind">
          </div>
        </div>
        <div class="sect2">
          <h3 id="vocabulario">Vocabulario</h3>
          <div class="imageblock" style="text-align: center">
            <div class="content">
              <img src="images/diagrama_clases.png" alt="MastermindClases" width="800" height="1165">
            </div>
          </div>
        </div>
        <div class="sect2">
          <h3 id="estado-inicial">Estado Inicial. Primera propuesta de la combinación.</h3>
          <div class="imageblock">
            <div class="content">
              <img src="images/diagrama_objetos_inicial.png" alt="estadoInicialMastermind" width="1100" height="566">
            </div>
          </div>
        </div>
        <div class="sect2">
          <h3 id="estado-final">Estado Final. Insertar combinación correcta.</h3>
          <div class="imageblock">
            <div class="content">
              <img src="images/diagrama_objetos_final.png" alt="estadoFinalMastermind" width="1200" height="842">
            </div>
          </div>
        </div>
        <div class="sect2">
          <h3 id="instrucciones">Instrucciones</h3>
          <div class="imageblock">
            <div class="content">
              <img src="images/diagrama_estados.png" alt="instructions" width="300" height="650">
            </div>
          </div>
        </div>
      </div>
  </div>
</body>
</html>
