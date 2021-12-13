<?php

/*
 * Crie um script que gere um arquivo .txt, abra-o e
 * guarde 3 frases (palavras) nele
 * Depois crie um script que imprima o conteúdo
 * gravado no arquivo.
 */
criarArquivo('arquivo');
//escrever('arquivo', 'teste1');
//escrever('arquivo', 'teste2');
//escrever('arquivo', 'teste3');
//echo imprimirConteudo('arquivo');
function criarArquivo($nomeArquivo) {
    $arquivo = fopen($nomeArquivo . '.txt', 'w');
    fwrite($arquivo, '');
    fclose($arquivo);
    
    escrever($nomeArquivo, 'Arquivo criado com sucesso!');
}

function escrever($nomeArquivo, $texto){
	$arquivo = $nomeArquivo . ".txt";
	$fp = fopen($arquivo, "a+");
	fwrite($fp, $texto);
	fclose($fp);
        
        echo imprimirConteudo($nomeArquivo);
}

function imprimirConteudo($nomeArquivo){
	$arquivo = $nomeArquivo . ".txt";
	$fp = fopen($arquivo, "r");
	while (!feof ($fp)) {
		$valor = fgets($fp, 4096);
		echo $valor . "<br>";
	}
	fclose($fp);
}