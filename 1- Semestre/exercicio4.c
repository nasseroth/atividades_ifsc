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

//4- Exiba um número e seus vizinhos (número anterior e posterior)
int main(int argc, char **argv)
{
        int numero;


        printf("\n Digite um numero ");

        scanf("%d", &numero);

        printf("\n %d", numero -1);
        printf(" , %d", numero);
        printf(" , %d", numero +1);

        //retorna parâmetro
        return 0;

}