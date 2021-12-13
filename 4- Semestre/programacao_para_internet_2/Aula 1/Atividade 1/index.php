<?php
  $notas = [5, 10, 4];
  $somaTotal = 0;

  for($i = 0; $i < count($notas); $i++){
    $somaTotal += $notas[$i];
  }

  $media = $somaTotal / count($notas);

  if($media >= 6){
    echo "Aprovado, média final {$media}";
  }else{
    echo "Reprovado, média final {$media}";
  }

?>