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



//11- Leia a idade de uma pessoa e informe quantos anos faltam para ela se aposentar (considere 65 anos a idade de aposentadoria)
int main(int argc, char **argv)
{
        int idade;

        printf("\n Digite sua idade ");


        scanf("%d", &idade);


        printf("\n Falta: %d anos para voce se aposentar \n", 65-idade);


}