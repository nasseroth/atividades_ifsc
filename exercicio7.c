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


//7- Programa para calcular a média: forneça duas notas e exiba a média
int main(int argc, char **argv)
{
        int nota1;
        int nota2;
        int media;


        printf("\n Digite a primeira nota ");

        scanf("%d", &nota1);

        printf("\n Digite a segunda nota ");
0
        scanf("%d", &nota2);

        media = (nota1 + nota2)/2;

        printf("\n Média: %d", media);


}
