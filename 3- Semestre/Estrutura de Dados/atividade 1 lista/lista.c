#include "lista.h"

struct lista{
    ListaNo *prim;
};

struct listano{
    int info;
    ListaNo *prox;
};

Lista* lst_cria(void){
    Lista* l = (Lista*) malloc(sizeof(Lista));
    l->prim = NULL;
    return l;
}

void lst_insere (Lista* l, int v) {
    ListaNo *novo = (ListaNo *) malloc(sizeof(ListaNo));
    novo->info = v;
    novo->prox = l->prim;
    l->prim = novo;
}

void lst_imprime (Lista* l) {
    for ( ListaNo* p=l-> prim; p!= NULL; p=p-> prox)
    printf("info = %d\n", p-> info);
}

int pertence (Lista* l, int v) {
    for ( ListaNo* p=l-> prim; p!= NULL; p=p-> prox) {
    if (p-> info == v)
    return 1;
    }
    return 0; // não encontrou o elemento ∗/
}

void lst_insere_ordenado (Lista* l, int v) {
    ListaNo* ant = NULL; // ponteiro para elemento anterior ∗/
    ListaNo* p = l->prim; // ponteiro para percorrer a lista ∗/
// localiza posição de inserção ∗/
    while (p != NULL && p->info < v) {
        ant = p;
        p = p->prox;
    }
    // cria novo elemento ∗/
    ListaNo* novo = (ListaNo*) malloc(sizeof (ListaNo));
    novo -> info = v; // encadeia elemento ∗/
    if (ant == NULL) { // insere elemento no início ∗/
        novo->prox = l->prim;
    l->prim = novo;
    }else { // insere elemento no meio da lista ∗/
        novo->prox = ant->prox;
        ant->prox = novo;
    }
}

void lst_retira (Lista* l, int v) {
    ListaNo* ant = NULL; //∗ ponteiro para elemento anterior ∗/
    ListaNo* p = l->prim; //∗ ponteiro para percorrer a lista ∗/
    //∗ procura elemento na lista guardando anterior ∗/
    while (p != NULL && p->info != v) {
        ant = p;
        p = p->prox;
    }
    if (p != NULL) { //∗ verifica se achou elemento ∗/
    //∗ retira elemento ∗/
        if (ant == NULL) { //∗ retira elemento do inicio ∗/
            l->prim = p->prox;
        }else { //∗ retira elemento do meio da lista ∗/
            ant->prox = p->prox;
        }
    free(p); //∗ libera elemento (nó) ∗/
    }
}

int lst_vazia (Lista* l) {
    return (l->prim == NULL );
}

void lst_libera (Lista* l) {
    ListaNo* p = l->prim;
    while (p != NULL) {
        ListaNo* t = p->prox; //∗ guarda referência para próx elemento ∗/
        free(p); //∗ libera a memória apontada por p ∗/
        p = t; //∗ faz p apontar para o próximo ∗/
    }
    free(l);
}


int comprimento (Lista* l){
    if (lst_vazia(l)){
        return 0;
    }
    int cont =0;
    ListaNo* p = l->prim;
    while (p != NULL){
        ListaNo* t = p->prox;
        cont++;
        p = t;
    }
    return cont;
}

int maiores (Lista* l, int x){
    if (lst_vazia(l)){
        return 0;
    }
    int cont = 0;
    ListaNo* p= l->prim;
    while (p != NULL){
        ListaNo* t = p->prox;
        if (p->info > x){
            cont++;
        }
        p = t;
    }

    return cont;
}

int ultimo (Lista* l){
    if (lst_vazia(l)){
        return 0;
    }
    int u;
    ListaNo* p = l->prim;
    while (p != NULL){
        ListaNo* t = p->prox;
        u = p->info;
        p = t;
    }
    return u;
}

void retira_n (Lista* l, int x) {
    ListaNo *vet = l->prim;
    while (vet != NULL) {
        ListaNo *ant = NULL; //∗ ponteiro para elemento anterior ∗/
        ListaNo *p = vet; //∗ ponteiro para percorrer a lista ∗/
        //∗ procura elemento na lista guardando anterior ∗/
        while (p != NULL && p->info != x) {
            ant = p;
            p = p->prox;
        }
        if (p != NULL) { //∗ verifica se achou elemento ∗/
            //∗ retira elemento ∗/
            if (ant == NULL) { //∗ retira elemento do inicio ∗/
                l->prim = p->prox;
            } else { //∗ retira elemento do meio da lista ∗/
                ant->prox = p->prox;
            }
            free(p); //∗ libera elemento (nó) ∗/
        }
        ListaNo *t = vet->prox;
        vet = t;
    }
}

void concatena (Lista* l1 , Lista* l2 ){
    ListaNo* cl1 = l1->prim;
    while (cl1->prox != NULL){
      ListaNo* t = cl1->prox;
      cl1 = t;
    }
    cl1->prox = l2->prim;
    l2->prim = NULL;
}
