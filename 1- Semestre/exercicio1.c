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
//1 - Exiba um número e o dobro deste número
int main(int argc, char **argv)
{
	int numero;


	printf("\n Digite um numero: ");

	scanf("%d", &numero);

        numero = numero*2;

	printf("\n O dobro de seu numero é: %d", numero);

	
}