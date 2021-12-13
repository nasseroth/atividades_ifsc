<?php
$salarios = [170.46, 289.75, 570.32, 857.13, 1355.80, 1892.30];
/*
i. Salários até (e incluindo) R$ 280,00: aumento de 20%;
ii. Salários entre R$ 280,00 e R$ 700,00: aumento de 15%;
iii. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
iv. Salários de R$ 1500,00 em diante: aumento de 5%;
*/

foreach ($salarios as & $salario)
{
	if($salario <= 280.00){
		$salarioReajustado = $salario + ($salario * 0.20);
		echo "Salário antes do reajuste: $salario após reajuste: $salarioReajustado <br>";
	}else if($salario > 280.00 && $salario <= 700.00){
		$salarioReajustado = $salario + ($salario * 0.15);
		echo "Salário antes do reajuste: $salario após reajuste: $salarioReajustado <br>";
	}else if($salario > 700.00 && $salario <= 1500.00){
		$salarioReajustado = $salario + ($salario * 0.10);
		echo "Salário antes do reajuste: $salario após reajuste: $salarioReajustado <br>";
	} else if ($salario > 1500.00) {
		$salarioReajustado = $salario + ($salario * 0.05);
		echo "Salário antes do reajuste: $salario após reajuste: $salarioReajustado <br>";
	}
}

?>
