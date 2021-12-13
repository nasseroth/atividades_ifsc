<?php
$numeros = [5, 10, 4];
$menorNum = 999999999;
for ($i = 0;$i < count($numeros);$i++)
{
    if ($numeros[$i] < $menorNum)
    {
        $menorNum = $numeros[$i];
    }
}
echo "Menor número: {$menorNum}";

?>
