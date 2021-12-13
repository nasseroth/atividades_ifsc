<?php

/**
 * Description of Trabalhador
 *
 * @author Nasser
 */
abstract class Trabalhador {

    public string $nome;
    public string $cargo;
    protected string $endereco;
    private string $telefone;
    private string $rg;

    function __construct() {
        
    }

    public function compara() {
        
    }

    abstract public function mostrar();

    function getNome(): string {
        return $this->nome;
    }

    function getCargo(): string {
        return $this->cargo;
    }

    function getEndereco(): string {
        return $this->endereco;
    }

    function getTelefone(): string {
        return $this->telefone;
    }

    function getRg(): string {
        return $this->rg;
    }

    function setNome(string $nome): void {
        $this->nome = $nome;
    }

    function setCargo(string $cargo): void {
        $this->cargo = $cargo;
    }

    function setEndereco(string $endereco): void {
        $this->endereco = $endereco;
    }

    function setTelefone(string $telefone): void {
        $this->telefone = $telefone;
    }

    function setRg(string $rg): void {
        $this->rg = $rg;
    }

}
