<?php

/*
 * Implemente a Classe
 * conforme o diagrama.
 * No método Saque, o
 * valor não pode ser
 * superior à soma do
 * saldo com o limite.
 */

abstract class Conta {

    public int $numero;
    private float $saldo;
    
    abstract public function sacar(float $valor): void;
    
    abstract public function depositar(float $valor): void;
    
    abstract public function transferir(Conta $contaDestino, float $valor): void;
    
    abstract public function verificarSaldo(): float;
            
    function __construct(int $numero, float $saldo) {
        $this->numero = $numero;
        $this->saldo = $saldo;
    }

    function getNumero(): int {
        return $this->numero;
    }

    function getSaldo(): float {
        return $this->saldo;
    }

    function setNumero(int $numero): void {
        $this->numero = $numero;
    }

    function setSaldo(float $saldo): void {
        $this->saldo = $saldo;
    }

}
