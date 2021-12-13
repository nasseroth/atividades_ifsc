<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        require_once './Poupanca.php';

        $poupanca = new Poupanca(1);
        $poupanca->setNumero(123);
        $poupanca->setSaldo(50.00);
        ?> <p>Saldo antes de depositar: R$<?php echo $poupanca->verificarSaldo() ?></p><?php
        
        $poupanca->depositar(500.00);
        
        ?> <p>Saldo antes de atualizar os juros: R$<?php echo $poupanca->verificarSaldo() ?></p><?php
        
        $poupanca->atualizarJuros();

        ?> <p>Saldo após atualizar os juros: R$<?php echo $poupanca->verificarSaldo() ?></p><?php

        
        ?>
    </body>
</html>
