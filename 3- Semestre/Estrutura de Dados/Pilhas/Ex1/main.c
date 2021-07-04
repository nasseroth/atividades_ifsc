#include <stdio.h>
#include <stdlib.h>

main()
{
    // exercicio A - float topo (Pilha *p);
    // topo(lista);

    // exercicio B - void concatena_pilhas(Pilha *p1, Pilha *p2);
    // concatena_pilhas(lista);

    // exercicio C - Pilha* copia_pilha (Pilha *p);
    // pilha = copia_pilha(lista);
}
float topo (Pilha *p)
{
    return p->pElem [p->topo];
};

void concatena_pilhas(Pilha *p1 , Pilha *p2)
{
    Pilha *novo;
    Pilha *aux;
    Pilha *inv;

    while (p2 != NULL)
    {
        inv = (Pilha*) malloc(sizeof(Pilha));
        inv -> valor = p2 -> valor;
        inv -> anterior = aux;
        aux = inv;
        p2 = p2 -> anterior;
    }
    aux = p1;
    while (inv != NULL)
    {
        novo = (Pilha*) malloc(sizeof(Pilha));
        novo -> valor = inv -> valor;
        novo -> anterior = aux;
        aux = novo;
        inv = inv -> anterior;
    }
	p1 = novo;
}

Pilha *copia_pilha (Pilha *p)
{
    Pilha *aux,*pri;
    aux = NULL;
    pri = NULL;
    if(p == NULL)
        return NULL;
    else
    {
        novo = MALLOC(Pilha);
        novo->valor=p->valor;
        aux = novo;
        pri = novo;
    }
    p=p->proximo;
    while(p!=NULL)
    {
        novo = MALLOC(Pilha);
        novo->valor = p->valor;
        aux->proximo = novo;
        aux = novo;
        p = p->proximo;
    }
    aux->proximo = NULL;
    return pri;
};
