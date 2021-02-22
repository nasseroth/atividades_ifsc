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


//14- Leia o lado de um quadrado e calcule sua área
int main(int argc, char **argv)
{
        int lado;
        int result;
        
        printf("informe o tamanho do lado do quadrado ");
        scanf("%d", &lado);

        result = lado*lado;

        printf("\n A area total de seu quadrado é: %d cm² \n", result);

}

//15- Leia a base e altura de um triângulo e calcule sua área

//16- Leia o raio de uma circunferência e calcule sua área e seu perímetro

//17- Uma aplicação tem rendimento de 10% ao ano. Leia um valor e calcule seu rendimento após um ano usando juros simples

//18- Uma aplicação tem rendimento de 10% ao ano. Leia um valor e calcule seu rendimento após um ano usando juros compostos

