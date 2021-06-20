#include "lista.h"

int main() {
    Lista *l = lst_cria();
    lst_insere(l,23);
    lst_insere(l,45);
    lst_insere(l,56);
    lst_insere(l,78);

    lst_imprime(l);
    /*

    lst_imprime(l);
    printf("\n");
    lst_retira(l,78);
    lst_imprime(l);
     printf("\n");
    lst_retira(l,45);
    lst_imprime(l);



    int n = comprimento(l);
    printf("\nO tamanho da sua lista de %d\n",n);
    int n2 = maiores(l,24);
    printf("Há um total de %d numeros maiores que o valor passado\n",n2);

    n2 = ultimo(l);
    printf("O ultimo elemento é %d\n",n2);*/
    printf("\n");
    Lista* l2= lst_cria();
    lst_insere(l2,11);
    lst_insere(l2,12);
    lst_insere(l2,13);
    concatena(l,l2);
    lst_imprime(l);

    lst_libera(l);
    lst_libera(l2);
    return 0;
}
