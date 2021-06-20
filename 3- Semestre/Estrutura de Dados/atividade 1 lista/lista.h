#ifndef ATIVIDADE_1_LISTA_H
#define ATIVIDADE_1_LISTA_H
#include <stdio.h>
#include <stdlib.h>

typedef struct lista Lista;
typedef struct listano ListaNo;

Lista* lst_cria(void);
void lst_libera(Lista *l);
void lst_insere(Lista *l,int v);
void lst_insere_ordenado(Lista *l,int v);
void lst_retira(Lista *l,int v);
int lst_vazia (Lista* l);
int pertence(Lista *l,int v);
void lst_imprime(Lista *l);
int comprimento (Lista* l);
int maiores (Lista* l, int x);
int ultimo (Lista* l);
void retira_n (Lista* l, int x);
void concatena (Lista* l1 , Lista* l2 );

#endif //ATIVIDADE_1_LISTA_H
