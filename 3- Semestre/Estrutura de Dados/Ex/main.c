#include <stdio.h>
#include <stdlib.h>
int pares (int n, int *vet);
void inverte (int n, int *vet);
float minimo (int n, float *v);
int main()
{
    //atividade1(); // ativar para testar atividade 1
    //atividade2(); // ativar para testar atividade 2
    //atividade3(); // ativar para testar atividade 3
    printf("Hello world!\n");
    return 0;
}
/*

Escreva uma função que receba como parâmetro um vetor de números inteiros de tamanho n
e retorne quantos números pares estão armazenados nesse vetor. Essa função deve obedecer
ao protótipo a seguir. Escreva um programa para testar sua função.

*/

void atividade1()
{
    int n = 0;
    printf("Informe o tamanho do vetor: ");
    scanf("%d", &n);
    int vetor[n];
    for(int contador = 0; contador < n; contador++)
    {
        printf("Informe o valor do %d vetor: \n", contador + 1);
        scanf("%d", &vetor[contador]);
    }
    printf("Qtd numeros pares: %d\n", pares(n, vetor));
}
int pares (int n, int *vet)
{
    int j, total = 0;
    for (j = 0; j < n; j++)
    {
        if((vet[j]%2) == 0)
        {
            total++;
        }
    }
    return total;
};
//
/*

Implemente uma função que receba como parâmetro um vetor de números inteiros de
tamanho n e inverta a ordem dos elementos armazenados nesse vetor. Essa função deve
obedecer ao protótipo a seguir. Escreva um programa para testar sua função.

*/
void atividade2()
{
    int n = 0;
    printf("Informe o tamanho do vetor: \n");
    scanf("%d", &n);
    int vetor[n];
    for(int contador = 0; contador < n; contador++)
    {
        printf("Informe o valor do %d vetor: \n", contador + 1);
        scanf("%d", &vetor[contador]);
    }
    inverte(n, vetor);
}

void inverte (int n, int *vet)
{
    for(int contador = n-1; contador >= 0; contador--)
    {
        printf("%d\n", vet[contador]);
    }
}
//
/*

Escreva uma função que retorne o valor mínimo armazenado em um vetor. Essa função deve
obedecer ao protótipo a seguir. Escreva um programa para testar sua função.

*/

void atividade3() {
    int n = 0;
    printf("Informe o tamanho do vetor: \n");
    scanf("%d", &n);
    float vetor[n];
    for(int contador = 0; contador < n; contador++)
    {
        printf("Informe o valor do %d vetor: \n", contador + 1);
        scanf("%f", &vetor[contador]);
    }
    printf("Valor minimo encontrado: %f \n",minimo(n, vetor));
}

float minimo (int n, float *v){
    float minimoEncontrado = 999999;
    for(int contador = 0; contador < n; contador++)
    {
        if(v[contador] < minimoEncontrado){
            minimoEncontrado = v[contador];
        }
    }
    return minimoEncontrado;
};
