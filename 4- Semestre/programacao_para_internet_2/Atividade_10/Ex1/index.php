<?php

$arquivo = 'arquivo.txt';
$conteudo = "Conteúdo de teste \r\n";
$tamanhoArquivo = filesize($arquivo);

$arquivoAberto = fopen($arquivo, 'r');

while(!feof($arquivoAberto)):
	$linha = fgets($arquivoAberto, $tamanhoArquivo);
	echo $linha . "<br>";
endwhile;

fclose($arquivoAberto);