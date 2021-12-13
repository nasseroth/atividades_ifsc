<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
<?php

function calculo1($valor){
$valor *= $valor;
echo $valor . "<br>";
}

function calculo2($valor) {
$valor =+ $valor;
echo $valor . "<br>";
}

$valor = 5;

calculo1($valor++);
echo $valor . "<br>";
calculo2($valor--);
echo $valor;

?>
    </body>
</html>
