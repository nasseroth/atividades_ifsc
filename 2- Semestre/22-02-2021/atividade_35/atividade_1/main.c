#include <stdio.h>
#include <stdlib.h>

int main()
{
    int primeiroValor, segundoValor;
    printf("Digite o primeiro valor a ser somado: \n");
    scanf("%d",&primeiroValor);
    printf("Digite o segundo valor a ser somado: \n");
    scanf("%d",&segundoValor);
    printf("Valor da soma: %d\n", (primeiroValor + segundoValor));
    return 0;
}
