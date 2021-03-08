#include <stdio.h>
#include <stdlib.h>
/*
Crie 3 arrays de inteiros, a (11 elementos), b (7 elementos) e c (20
elementos). Copie o array a para a primeira parte do array c, e o array b
para a segunda parte do array c. Mostre os valores de cada um dos três
arrays.

*/
main()
{
    int a[11];
    int b[7];
    int c[20];
    for(int i = 0; i < 20; i++)
    {
        if(i < 11){
            a[i] = rand() % 100;
        }
        if(i < 7){
            b[i] = rand() % 100;
        }
    }
    for(int i = 0; i < 20; i++){
        if(i < 11){
            c[i] = a[i];
        } else if(i >= 11 && i < 18) {
            c[i] = b[i];
        } else {
            c[i] = 0;
        }
    }
    for(int i = 0; i < 20; i++)
        printf("Valor na posição %d de C: %d\n", i, c[i]);

}
