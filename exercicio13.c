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



//13- Leia a velocidade de um carro, a distância a ser percorrida e calcule em quanto tempo o carro chegará em seu destino.
int main(int argc, char **argv)
{
        int velocidade;
        int distancia;

        printf("informe sua velocidade ");
        scanf("%d", &velocidade);

        printf("informe sua distancia ");
        scanf("%d", &distancia);

        printf("\n Tempo estimado para chegada: %d horas \n", distancia/velocidade);

}
