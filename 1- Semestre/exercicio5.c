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


//5- Programa para dividir a conta: defina o valor de uma conta e quantas pessoas estão na mesa. Divida o valor da conta pelo número de pessoas e exiba quanto cada um deve pagar.
int main(int argc, char **argv)
{
        int quant;
        int valor;
        int conta;


        printf("\n Digite o valor da conta ");

        scanf("%d", &valor);

        printf("\n Digite a quantidade de pessoas ");

        scanf("%d", &quant);

        conta = valor/quant;

        printf("\n Valor total a pagar por pessoa: %d,00 reais", conta);


}