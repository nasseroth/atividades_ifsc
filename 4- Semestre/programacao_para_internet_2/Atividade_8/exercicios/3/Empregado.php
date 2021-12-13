<?php

/**
 * Description of Empregado
 *
 * @author Nasser
 */
require_once './Trabalhador.php';

class Empregado extends Trabalhador {

    private float $salario;
    private float $imposto;

    public function mostrar() {
        
    }

    public function calcularSalario() {
        
    }

    function __construct() {
        
    }

    function getSalario(): float {
        return $this->salario;
    }

    function getImposto(): float {
        return $this->imposto;
    }

    function setSalario(float $salario): void {
        $this->salario = $salario;
    }

    function setImposto(float $imposto): void {
        $this->imposto = $imposto;
    }

}
