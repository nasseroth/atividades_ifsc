<?php

if ($_GET['login'] == $_GET['loginPadrao'] && $_GET['senha'] == $_GET['senhaPadrao']
&& (!isset($_COOKIE['user'])))
{
	setcookie("user", $_GET['login'], time() + 10);
	$nome = $_GET['login'];
	echo "Bem vindo(a) " . $nome . " o seu login foi efetuado com sucesso!";	

}
else
{
    echo "Login ou senha inválidos!";
}
if (!isset($_COOKIE['user'])) {
	setcookie("user");
	echo "<script type='javascript'>alert('Login Expirado!');";
	echo "javascript:window.location='index.html';</script>";
}
?>
