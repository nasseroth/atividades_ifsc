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


//8- Faça um programa que leia a temperatura em graus célsius e transforme para fahrenheit.
int main(int argc, char **argv)
{
        int c;
        int f;
        int result;

        printf("\n Digite a temperatua em C° ");

        scanf("%d", &c);


        result = (1.8*c)+ 32;

        printf("\n Temperatura em °F: %d", result);

        
}
