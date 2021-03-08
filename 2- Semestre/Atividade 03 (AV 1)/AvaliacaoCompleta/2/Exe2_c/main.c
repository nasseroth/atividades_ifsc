#include <stdio.h>
#include <stdlib.h>

main()
{
    float c[12] = {12.5, 0.25, 0.75, 3.40, 5.10, 10.00, 1.20, 3.65, 9.00, 4.00, 2.30, 56.2, 2.00};
    int contador; //variável de controle do loop
    float total;
    for(contador = 1; contador <= 12; contador++)
    {
        total = total + c[contador];
    }
    printf("Total: %.2f ", total);
}
