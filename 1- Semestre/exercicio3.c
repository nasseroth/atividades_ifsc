/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Nasser Othman
 *
 * 
 */

//inclusão de biblioteca
#include <stdio.h>
#include <math.h>

//função principal

//3- Programa para calcular o valor de um jantar. Defina o valor do jantar. Calcule a taxa de 10% do garçom. Some a taxa ao valor do jantar. Exiba a taxa e o valor total do jantar.
int main(int argc, char **argv)
{
        int janta;
        int valor;


        printf("\n Digite o preco da janta ");

        scanf("%d", &valor);

        janta = valor+(valor*0.1);

        printf("\n Valor total a pagar: %d", janta);

       

}