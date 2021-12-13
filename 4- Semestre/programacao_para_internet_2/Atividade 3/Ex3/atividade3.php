<?php 

	$numero = $_POST['valor'];

	if (is_numeric($numero)){

		if ($numero > 0) echo "Número digitado é Positivo!";
			elseif ($numero < 0) echo "Número digitado é Negativo!";
				elseif ($numero == 0) echo "Número digitado é igual a 0!";

	} else {

		print "O valor informado não é um Numero!!";
	
	}


 ?>