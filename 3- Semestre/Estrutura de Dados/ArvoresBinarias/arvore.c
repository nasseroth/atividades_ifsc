#include <stdio.h>
#include <stdlib.h>
#include "arvore.h"

ArvNo *arv_criano(int c, ArvNo *esq, ArvNo *dir) {
    ArvNo *p = (ArvNo *) malloc(sizeof(ArvNo));
    p->info = c;
    p->esq = esq;
    p->dir = dir;
    return p;
}

Arv *arv_cria(ArvNo *r) {
    Arv *a = (Arv*) malloc(sizeof (Arv));
    a->raiz = r;
    return a;
}

void imprime2(ArvNo* r) {
    if (r != NULL ){
        printf("%d", r->info);  /* mostra informação */
        imprime2(r->esq);        /* imprime sae */
        imprime2(r->dir);        /* imprime sad */
    }
}

void arv_imprime(Arv* a) {
    imprime(a->raiz); /* imprime recursivamente a partir da raiz */
}

void imprime(ArvNo *r) {
    printf("<");
    if (r != NULL ){
        printf("%d", r->info); /* mostra informação */
        imprime(r->esq); /* imprime sae */
        imprime(r->dir); /* imprime sad */
    }
    printf(">");
}

static void libera(ArvNo *r) {
    if (r != NULL) {
        libera(r->esq); /* libera a sae */
        libera(r->dir); /* libera a sad */
        free(r);        /* libera o nó raiz */
    }
}

void arv_libera(Arv *a) {
    libera(a->raiz);    /* libera hierarquia de nós */
    free(a);            /* libera raiz */
}

static int pertence(ArvNo *r, int c) {
    if (r == NULL)
        return 0; /* árvore vazia: não encontrou */
    else
        return c==r->info || pertence(r->esq ,c) || pertence(r->dir,c);
}

int arv_pertence(Arv *a, int c) {
    return pertence(a->raiz ,c);
}

static ArvNo *busca(ArvNo *r, int c) {
    if (r == NULL)
        return NULL; /* árvore vazia: não encontrou */
    else if (c == r->info)
        return r;
    else {
        ArvNo *p = busca(r->esq ,c); /* busca na sae */

        if (p != NULL)
            return p; /* encontrou na sae */
        else return busca(r->dir, c); /* busca na sad */
    }
}

ArvNo *arv_busca(Arv *a, int c) {
    return busca(a->raiz, c);
}

static int max2(int a, int b) {
    return (a > b) ? a : b;
}

static int altura(ArvNo *r) {
    if (r == NULL)
        return -1;
    else
        return 1 + max2(altura(r->esq), altura(r->dir));
}

int arv_altura(Arv *a) {
    return altura(a->raiz);
}
