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


//18- Uma aplicação tem rendimento de 10% ao ano. Leia um valor e calcule seu rendimento após um ano usando juros compostos
int main(int argc, char **argv)
{
        float valor;
        float result;
        
        printf("informe o valor do rendimento ");
        scanf("%f", &valor);

        result = valor*((1+0,10)*1);

        printf("\n Seu rendimento é de: %f reais \n", result);

}
