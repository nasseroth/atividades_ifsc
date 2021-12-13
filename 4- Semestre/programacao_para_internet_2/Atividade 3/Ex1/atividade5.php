<?php 

	$valor1 = $_POST['valorA'];
	$valor2 = $_POST['valorB'];

	if ($valor1 < $valor2) print "$valor1 $valor2";
		elseif ($valor2 < $valor1) print "$valor2 $valor1";
		elseif ($valor2 == $valor1) print "$valor1 $valor2";

 ?>