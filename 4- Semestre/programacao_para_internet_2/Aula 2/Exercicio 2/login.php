<?php
if($_GET['login'] == $_GET['loginPadrao'] && $_GET['senha'] == $_GET['senhaPadrao'] ){
$nome= $_GET['login'];
 echo "Bem vindo(a) ". $nome . " o seu login foi efetuado com sucesso!";
 }else{
 echo "Login ou senha inválidos!";
 }
?>