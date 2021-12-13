<?php

/*
 * Implemente a Classe
 * conforme o diagrama.
 * No método Saque, o
 * valor não pode ser
 * superior à soma do
 * saldo com o limite.
 */
class Conta {

    public $numero;
    private $saldo;
    private $limite;

    public function sacar($valor) {
        if ($valor > ($this->getSaldo() + $this->getLimite())) {
            echo "<p>Saldo insuficiente.</p>";
        } else {
            $this->setSaldo($this->getSaldo() - $valor);
            echo "<p>Saque realizado com sucesso.</p>";
        }
    }
    
    public function depositar($valor) {
        $this->setSaldo($this->getSaldo() + $valor);
        echo "<p>Depósito realizado com sucesso.</p>";
    }
        
    public function imprimirExtrato() {
        $extrato = "Conta: " . $this->getNumero() . " possui um saldo de R$" . $this->getSaldo()
                . " e um limite de R$" . $this->getLimite();
        return $extrato;
    }


    public function __construct() {
        
    }

    function getNumero() {
        return $this->numero;
    }

    function getSaldo() {
        return $this->saldo;
    }

    function getLimite() {
        return $this->limite;
    }

    function setNumero($numero): void {
        $this->numero = $numero;
    }

    function setSaldo($saldo): void {
        $this->saldo = $saldo;
    }

    function setLimite($limite): void {
        $this->limite = $limite;
    }

}
