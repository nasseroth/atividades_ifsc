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



//12- Leia a altura e o peso de uma pessoa e calcule o índice de massa corporal (IMC)
int main(int argc, char **argv)
{
        float altura;
        float peso;

        printf("informe sua altura ");
        scanf("%f", &altura);

        printf("informe seu peso ");
        scanf("%f", &peso);

        printf("\n Indice de massa corporal: %f \n", peso/(altura*altura));

}