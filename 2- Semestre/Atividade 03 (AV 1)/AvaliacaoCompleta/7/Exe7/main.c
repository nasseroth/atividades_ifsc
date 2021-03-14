#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

unsigned int cp = 1252;

typedef struct
{
    char modelo[50];
    int cor;
    char placa[10];
    int tipo;
    union
    {
        int qtdPassageiros;
        float carga;
        char seguro[10];
    } caracteristica;
    char status;
} veiculo;

enum {PRETO = 1, BRANCO, VERDE, AZUL, VERMELHO, AMARELO, PRATA, CINZA};

void iniciarLista(veiculo lista[15]);
void inserirVeiculo(veiculo lista[15]);
int exibirMenu();
int buscaPosicaoVazia(veiculo lista[15]);
void listarVeiculos(veiculo lista[15]);
void pesquisarVeiculo(veiculo lista[15]);
void imprimirCor(int cor);
void editarVeiculo(veiculo lista[15]);
void removerVeiculo(veiculo lista[15]);
main()
{
    SetConsoleCP(cp);
    SetConsoleOutputCP(cp);
    int opcao = 0;
    veiculo lista[15];
    iniciarLista(lista);
    do
    {
        opcao = exibirMenu();
        switch(opcao)
        {
        case 1:
            inserirVeiculo(lista);
            break;
        case 2:
            editarVeiculo(lista);
            break;
        case 3:
            //
            removerVeiculo(lista);
            break;
        case 4:
            listarVeiculos(lista);
            //
            break;
        case 5:
            pesquisarVeiculo(lista);
            break;

        }
    }
    while (opcao != 6);
}

int exibirMenu()
{
    int opcao;
    printf("-- MENU --\n");
    printf("1 - Inserir\n");
    printf("2 - Editar\n");
    printf("3 - Remover\n");
    printf("4 - Listar\n");
    printf("5 - Pesquisar\n");
    printf("6 - Sair\n");

    printf("Informe a opção desejada: \n");
    scanf("%d", &opcao);
    system("cls");
    return opcao;

}

void inserirVeiculo(veiculo lista[15])
{
    int posicao = buscaPosicaoVazia(lista);
    if(posicao > -1)
    {
        printf("Informe o modelo: \n");
        fflush(stdin);
        gets(lista[posicao].modelo);

        printf("Informe a cor: \n (1 - Preto, 2 - Branco, 3 - Verde, 4 - Azul, 5 - Vermelho, 6 - Amarelo, 7 - Prata, 8 - Cinza) \n");
        scanf("%d", &lista[posicao].cor);

        printf("Informe a placa: \n");
        fflush(stdin);
        gets(lista[posicao].placa);

        printf("Informe o tipo: \n (1 - Transporte de passageiros, 2 - Transporte de carga, 3 - Passeio)\n");
        fflush(stdin);
        scanf("%d", &lista[posicao].tipo);

        if(lista[posicao].tipo == 1)
        {
            printf("Informe a quantidade de passageiros: \n");
            scanf("%d", &lista[posicao].caracteristica.qtdPassageiros);
        }
        else if (lista[posicao].tipo == 2)
        {
            printf("Informe a capacidade de carga: \n");
            scanf("%f", &lista[posicao].caracteristica.carga);
        }
        else if (lista[posicao].tipo == 3)
        {
            printf("Possui seguro?: \n");
            fflush(stdin);
            gets(lista[posicao].caracteristica.seguro);
        }

        lista[posicao].status = '+';
        system("cls");
        printf("Dados cadastrados com sucesso! \n");
    }
    else
    {
        printf("A lista esta cheia!\n");
    }
}

void iniciarLista(veiculo lista[15])
{
    for(int contador = 0; contador < 15; contador++)
    {
        lista[contador].status = '*';
    }
}

int buscaPosicaoVazia(veiculo lista[15])
{
    for(int contador = 0; contador < 15; contador++)
    {
        if(lista[contador].status == '*')
        {
            return contador;
        }
    }
    return -1;
}

void listarVeiculos(veiculo lista[15])
{
    for(int contador = 0; contador < 15; contador++)
    {
        if(lista[contador].status == '+')
        {
            printf("\nVeículo: %d: %s\t%s\n", contador+1, lista[contador].modelo, lista[contador].placa);
        }
    }
}

void pesquisarVeiculo(veiculo lista[15])
{
    int codigo;

    printf("Informe a posição que deseja listar: \n");
    scanf("%d", &codigo);

    if(lista[codigo].status != '+')
    {
        printf("\nNenhum veículo cadastrado\n");
    }
    else
    {
        printf("\nModelo: %s \n", lista[codigo].modelo);
        printf("\nCor: \n");
        imprimirCor(lista[codigo].cor);
        printf("\nPlaca: %s \n", lista[codigo].placa);
        switch(lista[codigo].tipo)
        {
        case 1:
            printf("Tipo: Transporte de Passageiros\n");
            printf("Quantidade de Passageiros: %d\n", lista[codigo].caracteristica.qtdPassageiros);
            break;
        case 2:
            printf("Tipo: Transporte de carga\n");
            printf("Capacidade de carga: %f\n", lista[codigo].caracteristica.carga);
            break;
        case 3:
            printf("Tipo: Passeio\n");
            printf("Possui Seguro: %s\n", lista[codigo].caracteristica.seguro);
            break;
        }
    }

}

void imprimirCor(int cor)
{
    switch(cor)
    {
    case PRETO:
        printf("PRETO");
        break;
    case BRANCO:
        printf("BRANCO");
        break;
    case VERDE:
        printf("VERDE");
        break;
    case AZUL:
        printf("AZUL");
        break;
    case VERMELHO:
        printf("VERMELHO");
        break;
    case AMARELO:
        printf("AMARELO");
        break;
    case PRATA:
        printf("PRATA");
        break;
    case CINZA:
        printf("CINZA");
        break;
    }
}


void editarVeiculo(veiculo lista[15])
{
    int posicao;
    printf("Informe o veículo que deseja editar: " );
    scanf("%d", &posicao);
    if(lista[posicao].status == '+')
    {
        printf("Informe o modelo: \n");
        fflush(stdin);
        gets(lista[posicao].modelo);

        printf("Informe a cor: \n (1 - Preto, 2 - Branco, 3 - Verde, 4 - Azul, 5 - Vermelho, 6 - Amarelo, 7 - Prata, 8 - Cinza) \n");
        scanf("%d", &lista[posicao].cor);

        printf("Informe a placa: \n");
        fflush(stdin);
        gets(lista[posicao].placa);

        printf("Informe o tipo: \n (1 - Transporte de passageiros, 2 - Transporte de carga, 3 - Passeio)\n");
        fflush(stdin);
        scanf("%d", &lista[posicao].tipo);

        if(lista[posicao].tipo == 1)
        {
            printf("Informe a quantidade de passageiros: \n");
            scanf("%d", &lista[posicao].caracteristica.qtdPassageiros);
        }
        else if (lista[posicao].tipo == 2)
        {
            printf("Informe a capacidade de carga: \n");
            scanf("%f", &lista[posicao].caracteristica.carga);
        }
        else if (lista[posicao].tipo == 3)
        {
            printf("Possui seguro?: \n");
            fflush(stdin);
            gets(lista[posicao].caracteristica.seguro);
        }
        system("cls");
        printf("\nDados atualizados com sucesso! \n");
    }
    else
    {
        printf("\nPosição inexistente!\n");
    }
}

void removerVeiculo(veiculo lista[15]){
    int codigo;
    printf("\nInforme o veículo que deseja remover: \n");
    scanf("%d", &codigo);

    if(lista[codigo].status != '+'){
        printf("O veículo não existe!\n");
    } else {
        lista[codigo].status != '*';
        printf("Veículo removido!\n");
    }
}


