#include <stdio.h>
#include <stdlib.h>
typedef struct Lista_Encadeada {
	struct Lista_Encadeada_Node* primeiro;
} Lista_Encadeada;

typedef struct Lista_Encadeada_Node {
	int info;
	struct Lista_Encadeada_Node* prox;
} Lista_Encadeada_Node;

Lista_Encadeada* ListaEncadeada_Criar();
int ListaEncadeada_CalcularComprimento(Lista_Encadeada* listaEncadeada);

int main()
{
    Lista_Encadeada* listaMenores = ListaEncadeada_Criar();
	//Lista_Encadeada* listaMaiores = ListaEncadeada_Criar();
	Lista_Encadeada* lista1 = ListaEncadeada_Criar();
	Lista_Encadeada* lista2 = ListaEncadeada_Criar();
	printf("comprimento: %d\n", ListaEncadeada_CalcularComprimento(lista1));
    printf("Hello world!\n");
    return 0;
}


int ListaEncadeada_CalcularComprimento(Lista_Encadeada* listaEncadeada) {
	int comprimento = 0;
	Lista_Encadeada_Node* node = listaEncadeada->primeiro;
	while (node != NULL) {
		comprimento++;
		node = node->prox;
	}
	return comprimento;
}

Lista_Encadeada* ListaEncadeada_Criar() {
	Lista_Encadeada* ListaEncadeada = (Lista_Encadeada*)malloc(sizeof(Lista_Encadeada));
	ListaEncadeada->primeiro = NULL;
    return ListaEncadeada;
}
