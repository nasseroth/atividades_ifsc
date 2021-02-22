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

//2- Exiba dois números e a soma destes números
int main(int argc, char **argv)
{
        int numero;
        int numero1;
        int numero2;


        printf("\n Digite o primeiro numero: ");

        scanf("%d", &numero1);

        printf("\n Digite o segundo numero: ");

        scanf("%d", &numero2);

        printf("\n %d", numero1);
        printf("+ %d", numero2);

        numero = numero1+numero2;

        printf("\n A somas dos numero é: %d", numero);


}