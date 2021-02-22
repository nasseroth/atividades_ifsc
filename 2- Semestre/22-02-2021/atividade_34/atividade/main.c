#include <stdio.h>
#include <stdlib.h>

int main()
{
    char nome[10];
    char nomeNovo[30];
    // atividade 1 da página 34
    printf("Digite um nome de ate 10 caracteres: \n");
    scanf("%s",&nome);
    // atividade 2 da página 34 (optei por fazer junto, pois era semelhante)
    printf("Nome digitado: %s\n", nome);
    printf("Agora digite um nome de ate 30 caracteres: \n");
    scanf("%s",&nomeNovo);
    printf("Tamanho da string: %d\n", strlen(nomeNovo));
    return 0;
}
