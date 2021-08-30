#include <stdio.h>
#include <stdlib.h>

typedef struct arv Arv;
typedef struct arvno ArvNo;

struct arv
{
    ArvNo* raiz;
};

struct arvno
{
    int info;
    ArvNo *esq;
    ArvNo *dir;
};

Arv *arv_cria(ArvNo* r);
ArvNo *arv_criano(int c, ArvNo *e, ArvNo *d);
void arv_libera(Arv *a);
void arv_imprime(Arv *a);
int arv_pertence(Arv *a, int c);
ArvNo *arv_busca(Arv *a, int c);
/*--------- exercício 1 ---------*/
static int no_pares(ArvNo *r)
{
    if (!r)
        return 0;

    return !(r->info % 2) + no_pares(r->esq) + no_pares(r->dir);
}

int pares(Arv *a)
{
    return no_pares(a->raiz);
}
/*--------------------------------------*/

/*--------- exercício 2 ---------*/
static int no_folhas(ArvNo *r)
{
    if (!r)
        return 0;

    return (!r->esq && !r->dir) + no_folhas(r->esq) + no_folhas(r->dir);
}

int folhas(Arv *a)
{
    return no_folhas(a->raiz);
}
/*--------------------------------------*/

/*--------- exercício 3 ---------*/
static int arvno_um_filho(ArvNo *r)
{
    if (!r || (!r->dir && !r->esq))
        return 0;

    return !(r->esq && r->dir) + arvno_um_filho(r->esq) + arvno_um_filho(r->dir);
}

int um_filho(Arv *a)
{
    return arvno_um_filho(a->raiz);
}
/*--------------------------------------*/

/*--------- exercício 4 ---------*/
static int arvno_igual(ArvNo *p, ArvNo *q)
{
    if (p && q)
    {
        return p->info == q->info && arvno_igual(p->esq, q->esq)
               && arvno_igual(p->dir, q->dir);
    }
    return p == q;
}

int igual(Arv *a, Arv *b)
{
    return arvno_igual(a->raiz, b->raiz);
}
/*--------------------------------------*/

/*--------- exercício 5 ---------*/
ArvNo *copia_arv(ArvNo *r)
{

    if (r == NULL)
        return NULL;

    return (arv_criano (r->info, copia_arv(r->esq), copia_arv(r->dir)));

}

Arv *copia(Arv *a)
{

    return arv_cria(copia_arv(a->raiz));
}
/*--------------------------------------*/
ArvNo *arv_criano(int c, ArvNo *esq, ArvNo *dir)
{
    ArvNo *p = (ArvNo *) malloc(sizeof(ArvNo));
    p->info = c;
    p->esq = esq;
    p->dir = dir;
    return p;
}

Arv *arv_cria(ArvNo *r)
{
    Arv *a = (Arv*) malloc(sizeof (Arv));
    a->raiz = r;
    return a;
}

void imprime2(ArvNo* r)
{
    if (r != NULL )
    {
        printf("Importante inicio");
        printf("%d", r->info);  /* mostra informação */
        imprime2(r->esq);        /* imprime sae */
        imprime2(r->dir);        /* imprime sad */
        printf("Importante fim");
    }
}

void arv_imprime(Arv* a)
{
    printf("\nimportante inicio\n");
    imprime(a->raiz); /* imprime recursivamente a partir da raiz */
    printf("\nimportante fim\n");
}

void imprime(ArvNo *r)
{
    printf("<");
    if (r != NULL )
    {
        printf("%d", r->info); /* mostra informação */
        imprime(r->esq); /* imprime sae */
        imprime(r->dir); /* imprime sad */
    }
    printf(">");
}

static void libera(ArvNo *r)
{
    if (r != NULL)
    {
        libera(r->esq); /* libera a sae */
        libera(r->dir); /* libera a sad */
        free(r);        /* libera o nó raiz */
    }
}

void arv_libera(Arv *a)
{
    libera(a->raiz);    /* libera hierarquia de nós */
    free(a);            /* libera raiz */
}

static int pertence(ArvNo *r, int c)
{
    if (r == NULL)
        return 0; /* árvore vazia: não encontrou */
    else
        return c==r->info || pertence(r->esq,c) || pertence(r->dir,c);
}

int arv_pertence(Arv *a, int c)
{
    return pertence(a->raiz,c);
}

static ArvNo *busca(ArvNo *r, int c)
{
    if (r == NULL)
        return NULL; /* árvore vazia: não encontrou */
    else if (c == r->info)
        return r;
    else
    {
        ArvNo *p = busca(r->esq,c);  /* busca na sae */

        if (p != NULL)
            return p; /* encontrou na sae */
        else
            return busca(r->dir, c); /* busca na sad */
    }
}

ArvNo *arv_busca(Arv *a, int c)
{
    return busca(a->raiz, c);
}

static int max2(int a, int b)
{
    return (a > b) ? a : b;
}

static int altura(ArvNo *r)
{
    if (r == NULL)
        return -1;
    else
        return 1 + max2(altura(r->esq), altura(r->dir));
}

int arv_altura(Arv *a)
{
    return altura(a->raiz);
}

int main()
{
    Arv *a = arv_cria(arv_criano(1, arv_criano(2, arv_criano(4, arv_criano(8, NULL, NULL), arv_criano(9, NULL, NULL)), arv_criano(5, arv_criano(10, NULL, NULL), arv_criano(11, NULL, NULL))), arv_criano(3, arv_criano(6, arv_criano(12, NULL, NULL), arv_criano(13, NULL, NULL)), arv_criano(7, NULL, NULL))));

    arv_imprime(a);

    return 0;
}
