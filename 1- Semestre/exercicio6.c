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


//6- Programa para uma loja: defina o valor de uma compra e exiba o valor a vista e em três vezes.
int main(int argc, char **argv)
{
        int valor;
        int compra;


        printf("\n Digite o valor da compra ");

        scanf("%d", &valor);

        printf("\n Valor a vista: %d reais", valor);

        compra = valor/3;

        printf("\n Valor em parcelamento de 3x: %d reais", compra);


}
