#include <stdio.h>
#include <stdlib.h>
#include "fila.h"

int main()
{
    Fila *f1 = fila_cria();
    fila_insere(f1, 2.1);
    fila_insere(f1, 4.5);
    fila_insere(f1, 1.0);

    Fila *f2 = fila_cria();
    fila_insere(f2, 7.2);
    fila_insere(f2, 3.1);
    fila_insere(f2, 9.8);

    Fila *f_res = fila_cria();

    printf(" Configuracao da fila f1:\n");
    fila_imprime(f1);
    printf(" Configuracao da fila f2:\n");
    fila_imprime(f2);
    printf(" Configuracao da fila f_res:\n");
    fila_imprime(f_res);

    combina_filas(f_res, f1, f2);

    printf(" Configuracao da fila f1:\n");
    fila_imprime(f1);
    printf(" Configuracao da fila f2:\n");
    fila_imprime(f2);
    printf(" Configuracao da fila f_res:\n");
    fila_imprime(f_res);

    fila_libera(f1);
    fila_libera(f2);
    return 0;
}

void combina_filas(Fila * f_res, Fila * f1, Fila * f2)
{
	while (!fila_vazia(f1) && !fila_vazia(f2)) {
		fila_insere(f_res, fila_retira(f1));
		fila_insere(f_res, fila_retira(f2));
	}
	while (!fila_vazia(f1)) {
		fila_insere(f_res, fila_retira(f1));
	}
	while (!fila_vazia(f2)) {
		fila_insere(f_res, fila_retira(f2));
	}
}
