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



//9- Leia um número e exiba: seu dobro, sua metade, seu quadrado e sua raiz quadrada

int main(int argc, char **argv)
{
        int numero;
        int raiz;

        printf("\n Digite um numero ");


        scanf("%d", &numero);

        raiz = sqrt(numero);


        printf("\n dobro: %d \n", numero*2);
        printf("\n metade: %d \n", numero/2);
        printf("\n quadrado: %d \n", numero*numero);
        printf("\n raiz quadrada: %d", raiz);

        

}

//obs: Para usar a função pow, é necessário importar a biblioteca math.h e incluir -lm na linha de comando de compilação
