<?php

/**
 * Description of Consultor
 *
 * @author Nasser
 */
require_once './Trabalhador.php';

class Consultor extends Trabalhador {

    public int $horas;
    private float $tarifa;

    public function mostrar() {
        
    }

    public function calcularCobrar() {
        
    }

    function __construct() {
        
    }

    function getHoras(): int {
        return $this->horas;
    }

    function getTarifa(): float {
        return $this->tarifa;
    }

    function setHoras(int $horas): void {
        $this->horas = $horas;
    }

    function setTarifa(float $tarifa): void {
        $this->tarifa = $tarifa;
    }

}
