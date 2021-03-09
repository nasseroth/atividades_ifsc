#include <stdio.h>

#include <stdlib.h>

#include <ctype.h>

#include <stdbool.h>

#ifdef __unix__#include <unistd.h>

#include <stdlib.h>

#elif defined(_WIN32) || defined(WIN32)

#define OS_Windows

#include <windows.h>

#endif
/*
5) (capacidade: 10
assentos).
a) Seu programa deve exibir o seguinte menu de alternativas:
Pressione 1 para “econômico”
Pressione 2 para “executivo”
b) Se a pessoa digitar 1, seu programa deve atribuir um assento na área
“econômica” (assentos 1-5). Se a pessoa digitar 2, seu programa deve atribuir
um assento na área “executiva” (assentos 6-10). Seu programa, então, deve
imprimir um ticket de embarque indicando o número de assento da pessoa e
se ela está na área “econômica” ou “executiva” do avião.
c) Você deve fazer uso de um array para representar os assentos do avião.
Inicialize os elementos do array com 0 para indicar que os assentos estão
vazios. À medida que cada assento é atribuído, configure os elementos do
array com 1 para indicar que o assento não está mais disponível.
d) Seu programa deve verificar se o assento selecionado já está ocupado antes
da atribuição, nunca deve atribuir um assento já utilizado. Quando a área
“econômica” estiver lotada, seu programa deve solicitar ao atendente se este
deseja acomodar o passageiro na área “executiva” (e vice-versa). Se for, faça
a atribuição apropriada de assento. Se não for, imprima a mensagem
“Aguarde o próximo voo!!!”.

*/
int assentos[10];
unsigned int cp = 1252;
main()
{
    SetConsoleCP(cp);
    SetConsoleOutputCP(cp);
    limparAssentos();
    exibirMenu();
}

exibirMenu()
{
    int opcao = 0;
    while (opcao != 3)
    {
        printf("Bem vindo!\n");
        listarAssentos();
        printf("1 - Econômico\n");
        printf("2 - Executivo\n");
        printf("3 - Sair\n");
        printf("Informe a opcao desejada: \n");
        scanf("%d", & opcao);
        //limparTela();
        opcaoEscolhida(opcao);
    }
}

opcaoEscolhida(int opcaoSelecionada)
{
    atribuirAssento(opcaoSelecionada);
}

limparAssentos()
{
    for (int i = 0; i < 10; i++)
    {
        assentos[i] = 0;
    }
}

listarAssentos()
{
    for (int i = 0; i < 10; i++)
    {
        if (i < 5)
        {
            if (assentos[i] == 0)
            {
                printf("Assento: %d - Econômico - Status: VAGO\n", i);
            }
            else
            {
                printf("Assento: %d - Econômico - Status: OCUPADO\n", i);
            }
        }
        else if (i >= 5 && i < 10)
        {
            if (assentos[i] == 0)
            {
                printf("Assento: %d - Executivo - Status: VAGO\n", i);
            }
            else
            {
                printf("Assento: %d - Executivo - Status: OCUPADO\n", i);
            }
        }
    }
}

bool verificarAssentoDisponivel(int assento)
{
    if (assentos[assento] == 0)
    {
        return true;
    }
    return false;
}
bool verificarAssentoDisponivelPorClasse(int opcao)
{
   if(opcao == 1){
        for(int contador = 0; contador < 5; contador++){
            if(assentos[contador] == 0){
                return true;
            }
        }
    }
    if(opcao == 2){
        for(int contador = 5; contador >= 5 && contador <= 9; contador++){
            if(assentos[contador] == 0){
                return true;
            }
        }
    }
    return false;
}
atribuirAssento(int opcao)
{
    int contador = 0;
    bool naoTemAssentos;
    if (opcao == 1)
    {
        contador = 0;
        for ( ; contador < 5; contador++)
        {
            if (verificarAssentoDisponivel(contador))
            {
                assentos[contador] = 1;
                limparTela();
                naoTemAssentos = false;
                printf("Assento: %d [ECONÔMICO] preenchido\n", contador);
                contador = 5;
            }
            else
            {
                limparTela();
                naoTemAssentos = true;
                printf("Não há assentos econômicos disponíveis\n");
            }
        }
    }
    if (opcao == 2)
    {
        contador = 5;
        for ( ; contador >= 5 && contador <= 9; contador++)
        {
            if (verificarAssentoDisponivel(contador))
            {
                assentos[contador] = 1;
                limparTela();
                printf("Assento: %d [EXECUTIVO] preenchido\n", contador);
                contador = 9;
            } else {
                limparTela();
                printf("Não há assentos executivos disponíveis\n");
            }
        }
    }
    if(naoTemAssentos){
        int opcaoAtribuicao = 0;
        if(opcao == 1 && verificarAssentoDisponivelPorClasse(2)){ // econom
            printf("Deseja atribuir esse passageiro a classe EXECUTIVA? \n");
            printf("1 - SIM\n");
            printf("2 - NÃO\n");
            printf("Informe a opção desejada: \n");
            scanf("%d", &opcaoAtribuicao);
            if(opcaoAtribuicao == 1){
                atribuirAssento(2);
            } else {
                printf("Aguarde o próximo voo!!!\n");
            }
        } else if (opcao == 2 && verificarAssentoDisponivelPorClasse(1)){
            printf("Deseja atribuir esse passageiro a classe ECONOMICA? \n");
            printf("1 - SIM\n");
            printf("2 - NÃO\n");
            printf("Informe a opção desejada: \n");
            scanf("%d", &opcaoAtribuicao);
            if(opcaoAtribuicao == 1){
                atribuirAssento(1);
            } else {
                printf("Aguarde o próximo voo!!!\n");
            }
        }
    }

}
limparTela()
{
#ifdef OS_Windows
    /* Codigo Windows */
    system("cls");
#else
    /* Codigo GNU/Linux */
    system("clear");
#endif
}
