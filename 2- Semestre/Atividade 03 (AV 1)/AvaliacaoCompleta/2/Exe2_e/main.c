#include <stdio.h>
#include <stdlib.h>
/*
Determine e imprima os maiores e menores valores contidos no array de
ponto flutuante w de 9 elementos
*/
int main()
{
    float w[9];
    float menorValor = 51;

    for(int i = 0; i < 9; i++){
        w[i] = rand() % 50;
        if(w[i] < menorValor){
            menorValor = w[i];
        }
    }
    for(int i = 0; i < 9; i++){
        printf("Valor na posição: %d = %.2f \n", i, w[i]);
    }
    printf("Menor valor encontrado: %.2f\n", menorValor);
    return 0;
}
