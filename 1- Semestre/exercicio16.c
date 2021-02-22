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


//16- Leia o raio de uma circunferência e calcule sua área e seu perímetro
int main(int argc, char **argv)
{
        float raio;
        float altura;
        float result;
        
        printf("informe a raio do circulo ");
        scanf("%f", &raio);

        result = (raio*raio)*3.14;

        printf("\n A area total de seu circulo é: %d cm² \n", result);

}

//17- Uma aplicação tem rendimento de 10% ao ano. Leia um valor e calcule seu rendimento após um ano usando juros simples

//18- Uma aplicação tem rendimento de 10% ao ano. Leia um valor e calcule seu rendimento após um ano usando juros compostos

