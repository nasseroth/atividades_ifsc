#include <stdio.h>
#include <stdlib.h>

int main()
{
    int primeiroValor, segundoValor, terceiroValor;
    printf("Digite o primeiro valor a ser multiplicado: \n");
    scanf("%d",&primeiroValor);
    printf("Digite o segundo valor a ser multiplicado: \n");
    scanf("%d",&segundoValor);
    printf("Digite o segundo valor a ser multiplicado: \n");
    scanf("%d",&terceiroValor);
    printf("Valor da multiplicacao: %d\n", (primeiroValor * segundoValor * terceiroValor));
    return 0;
}
