#include <stdio.h>
#include <stdlib.h>

int main()
{
    float notas[3];
    float total;
    int contador = 0;
    for( contador = 0 ; contador < 3; contador++)
    {
        printf("Digite a %d nota: \n", contador + 1);
        scanf("%f",&notas[contador]);
        total += notas[contador];
    }
    printf("Valor total: %f\n", (total / contador));
    return 0;
}
