#include <stdio.h>
#include <stdlib.h>
#include "fila.h"

Fila *fila_cria(void) {
    Fila* f = (Fila *) malloc(sizeof (Fila));
    f->ini = f->fim = NULL;
    return f;
}

void fila_insere(Fila *f, float v) {
    ListaNo *n = (ListaNo*) malloc(sizeof (ListaNo ));
    n->info = v; /* armazena informação */
    n->prox = NULL; /* novo nó passa a ser o último */
    if (f->fim != NULL) /* verifica se lista não esta vazia */
        f->fim->prox = n;
    else /* fila esta vazia */
        f->ini = n;
    f->fim = n; /* fila aponta para novo elemento */
}

float fila_retira(Fila *f) {
    ListaNo *t = f->ini;
    float v = t->info;
    f->ini = t->prox;
    if (f->ini == NULL) /* verifica se fila ficou vazia */
        f->fim = NULL;
    free(t);
    return v;
}

int fila_vazia(Fila *f) {
    return(f->ini == NULL );
}

void fila_libera(Fila *f) {
    ListaNo *q = f->ini;
    while (q != NULL) {
            ListaNo *t = q->prox;
            free(q);
            q = t;
    }
    free(f);
}

/* imprime : versão com lista */
void fila_imprime(Fila *f) {
    if (f->ini == NULL)
        printf("Fila vazia!\n");

    for ( ListaNo *q = f->ini; q!= NULL; q = q->prox)
         printf("%f\n", q->info);
}
