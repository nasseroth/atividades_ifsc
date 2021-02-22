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


//15- Leia a base e altura de um triângulo e calcule sua área
int main(int argc, char **argv)
{
        float base;
        float altura;
        float result;
        
        printf("informe a base do triangulo ");
        scanf("%f", &base);
        
        printf("informe a altura do triangulo ")
        scanf("%f", &altura);

        result = (base*altura)/2;

        printf("\n A area total de seu trinagulo é: %f cm² \n", result);

}
