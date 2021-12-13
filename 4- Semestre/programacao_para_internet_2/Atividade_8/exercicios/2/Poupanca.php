<?php

/**
 * Description of Poupanca
 *
 * @author Nasser
 */
require_once './Conta.php';
class Poupanca extends Conta {
    
    public int $juros;
    
    public function sacar(float $valor): void {
        if ($valor > ($this->getSaldo())) {
            echo "<p>Saldo insuficiente.</p>";
        } else {
            $this->setSaldo($this->getSaldo() - $valor);
            echo "<p>Saque realizado com sucesso.</p>";
        }
    }

    public function depositar(float $valor): void {
        $this->setSaldo($this->getSaldo() + $valor);
        echo "<p>Depósito realizado com sucesso.</p>";
    }
    
    public function transferir(Conta $contaDestino, float $valor): void {
        $this->sacar($valor);
        $contaDestino.depositar($valor);
    }
    
    public function verificarSaldo(): float {
        return ($this->getSaldo() + $this->getJuros());
    }
    
    public function atualizarJuros() {
        $this->setJuros($this->getJuros() * 2);
    }

    function __construct(int $juros) {
        $this->juros = $juros;
    }

    function getJuros(): int {
        return $this->juros;
    }

    function setJuros(int $juros): void {
        $this->juros = $juros;
    }

}
