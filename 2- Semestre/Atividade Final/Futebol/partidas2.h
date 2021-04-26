#ifndef PARTIDAS_H_INCLUDED
#define PARTIDAS_H_INCLUDED
typedef struct
{
    char equipeA[100];
    char equipeB[100];
    int situacao;
    int totalGolA;
    int totalGolB;
    int status;
    int equipeVencedora;
    int tipoPartida;
    union
    {
        char nome[50];
        int qtdGols;
    } jogador[50];
} Partidas;

enum situacao {EM_ABERTO=1, REALIZADA=2};
enum tipoPartida {GRUPOS=1, OITAVAS=2, QUARTAS=3, SEMIFINAL=4, FINAL=5};
int exibirMenuPartidas();
int buscarPosicaoVazia(Partidas lista[50]);
void iniciarLista(Partidas lista[50]);
void inserirPartidas(Partidas lista[50]);
void listarPartidas(Partidas lista[50]);
void pesquisarPartidas(Partidas lista[50]);
void imprimirSituacao(int Situacao);
void editarPartidas(Partidas lista[50]);
void removerPartidas(Partidas lista[50]);
void emprestarPartidas(Partidas lista[50]);
void devolverPartidas(Partidas lista[50]);

int exibirMenuPartidas()
{
    int opcao;
    printf("-- MENU --\n");
    printf("1 - Inserir\n");
    printf("2 - Editar\n");
    printf("3 - Remover\n");
    printf("4 - Listar\n");
    printf("5 - Pesquisar\n");
    printf("6 - Emprestar\n");
    printf("7 - Devolver\n");
    printf("8 - Sair\n");

    printf("Informe a opção desejada: \n");
    scanf("%d", &opcao);
    system("cls");
    return opcao;

}

void inserirPartidas(Partidas lista[50])
{
    int posicao = buscarPosicaoVazia(lista);
    if(posicao > -1)
    {
        printf("Informe a Equipe A: \n");
        fflush(stdin);
        gets(lista[posicao].equipeA);

        printf("Informe a Equipe B: \n");
        fflush(stdin);
        gets(lista[posicao].equipeB);

        printf("Informe a Situação: \n (1 - EM ABERTO / 2 - REALIZADA) \n");
        fflush(stdin);
        scanf("%d", &lista[posicao].situacao);

        printf("Informe o total de gols da Equipe %s: \n", lista[posicao].equipeA);
        fflush(stdin);
        scanf("%d", &lista[posicao].totalGolA);

        printf("Informe o total de gols da Equipe %s: \n", lista[posicao].equipeB);
        fflush(stdin);
        scanf("%d", &lista[posicao].totalGolB);

        printf("Quem ganhou a partida? \n(1 - PARA EQUIPE %s / 2 - PARA EQUIPE %s): \n", lista[posicao].equipeA, lista[posicao].equipeB);
        fflush(stdin);
        scanf("%d", &lista[posicao].equipeVencedora);

        printf("Qual o tipo de partida? \n(1 - Grupos, 2 - Oitavas de final, 3 - Quartas de final, 4 - Semifinal, 5 - Final): \n");
        fflush(stdin);
        scanf("%d", &lista[posicao].tipoPartida);


        int opcao = 0;
        printf("Deseja informar os jogadores que fizeram gols?\n(1 - PARA SIM / 2 - PARA NÃO): \n");
        scanf("%d", &opcao);
        int a = 0;
        while(opcao != 2)
        {
            printf("Informe o nome do jogador: \n");
            fflush(stdin);
            gets(lista[posicao].jogador[a].nome);

            printf("Informe a quantidade de gol(s) que o %s fez: \n", lista[posicao].jogador[a].nome);
            scanf("%d", &lista[posicao].jogador[a].qtdGols);

            printf("Deseja cadastrar mais jogadores?\n(1 - PARA SIM / 2 - PARA NÃO): \n");
            scanf("%d", &opcao);
            if(opcao == 1)
            {
                a++;
            }
        }

        fflush(stdin);

        lista[posicao].status = '1';
        system("cls");
        printf("DADOS CADASTRADO COM SUCESSO! \n");
    }
    else
    {
        printf("A LISTA ESTA CHEIA!\n");
    }
}

void iniciarLista(Partidas lista[50])
{
    int contador;
    for(contador = 0; contador < 15; contador++)
    {
        lista[contador].status = '0';
    }
}

int buscarPosicaoVazia(Partidas lista[50])
{
    int contador;
    for(contador = 0; contador < 15; contador++)
    {
        if(lista[contador].status == '0')
        {
            return contador;
        }
    }
    return -1;
}

void listarPartidas(Partidas lista[50])
{
    int contador;
    for(contador = 0; contador < 15; contador++)
    {
        if(lista[contador].status == '1')
        {
            printf("\n Listagem de Partidas \n");
            printf("ID: %d - %s VS %s \n", contador+1, lista[contador].equipeA, lista[contador].equipeB);
            if(lista[contador].situacao == 1)
            {
                printf("Situação: EM ABERTO\n");
            }
            else if (lista[contador].situacao == 2)
            {
                printf("Situação: REALIZADA\n");
            }
            printf("Total de GOLs da Equipe: %s = %d | Total de GOLs da Equipe: %s = %d\n", lista[contador].equipeA, lista[contador].totalGolA, lista[contador].equipeB, lista[contador].totalGolB);
            if(lista[contador].equipeVencedora == 1)
            {
                printf("Equipe Vencedora: %s\n", lista[contador].equipeA);
            }
            else if(lista[contador].equipeVencedora == 2)
            {
                printf("Equipe Vencedora: %s\n", lista[contador].equipeB);
            }
            printf("Tipo de Partida: \n");
            switch(lista[contador].tipoPartida)
            {
            case GRUPOS:
                printf("FASE DE GRUPOS\n");
                break;
            case OITAVAS:
                printf("OITAVAS DE FINAL\n");
                break;
            case QUARTAS:
                printf("QUARTAS DE FINAL\n");
                break;
            case SEMIFINAL:
                printf("SEMIFINAL\n");
                break;
            case FINAL:
                printf("FINAL\n");
                break;
            }
            int a;
            for(a = 0; a < 50; a++){
                if(lista[contador].jogador[a].nome != NULL && lista[contador].jogador[a].qtdGols != 0){
                    printf("%s <<\n ", lista[contador].jogador[a].nome[a]);
                    printf("O jogador %s fez %d GOL(s)\n", lista[contador].jogador[a], lista[contador].jogador[a].qtdGols);
                }
            }

        }
    }
}

void pesquisarPartidas(Partidas lista[50])
{
    int codigo;

    printf("Informe a posição que deseja listar: \n");
    fflush(stdin);
    scanf("%d", &codigo);

    if(lista[codigo].status != '1')
    {
        printf("\nNENHUMA PARTIDA CADASTRADA\n");
    }
    else
    {
        printf("\Equipe A: %s \n", lista[codigo].equipeA);
        printf("\nEquipe B: %s \n", lista[codigo].equipeB);
        printf("\nSituacao: %d \n", lista[codigo].situacao);
        printf("\nSituação: ");
        imprimirTipo(lista[codigo].tipoPartida);
        switch(lista[codigo].situacao)
        {
        case 1:
            printf("\n Situação: EM ABERTO\n");
            fflush(stdin);
            break;
        case 2:
            printf("\n Situação: REALIZADA\n");
            fflush(stdin);
            break;
        }
    }

}

void imprimirTipo(int tipo)
{
    switch(tipo)
    {
    //(1 - Grupos, 2 - Oitavas de
//final, 3 - Quartas de final, 4 - Semifinal, 5 - Final);
    case GRUPOS:
        printf("FASE DE GRUPOS");
        break;
    case OITAVAS:
        printf("OITAVAS DE FINAL");
        break;
    case QUARTAS:
        printf("QUARTAS DE FINAL");
        break;
    case SEMIFINAL:
        printf("SEMIFINAL");
        break;
    case FINAL:
        printf("FINAL");
        break;
    }
}


void editarPartidas(Partidas lista[50])
{

    int posicao = 0;
    printf("Qual o index que você deseja editar? ");
    scanf("%d", &posicao);

    printf("Informe a Equipe A: \n");
    fflush(stdin);
    gets(lista[posicao].equipeA);

    printf("Informe a Equipe B: \n");
    fflush(stdin);
    gets(lista[posicao].equipeB);

    printf("Informe a Situação: \n (1 - EM ABERTO / 2 - REALIZADA) \n");
    fflush(stdin);
    scanf("%d", &lista[posicao].situacao);

    printf("Informe o total de gol(s) da Equipe %s: \n", lista[posicao].equipeA);
    fflush(stdin);
    scanf("%d", &lista[posicao].totalGolA);

    printf("Informe o total de gol(s) da Equipe %s: \n", lista[posicao].equipeB);
    fflush(stdin);
    scanf("%d", &lista[posicao].totalGolB);

    printf("Quem ganhou a partida? \n(1 - PARA EQUIPE %s / 2 - PARA EQUIPE %s): \n", lista[posicao].equipeA, lista[posicao].equipeB);
    fflush(stdin);
    scanf("%d", &lista[posicao].equipeVencedora);

    printf("Qual o tipo de partida? \n(1 - Grupos, 2 - Oitavas de final, 3 - Quartas de final, 4 - Semifinal, 5 - Final): \n");
    fflush(stdin);
    scanf("%d", &lista[posicao].tipoPartida);


    int opcao = 0;
    printf("Deseja informar os jogadores que fizeram gol(s)?\n(1 - PARA SIM / 2 - PARA NÃO): \n");
    scanf("%d", &opcao);
    int a = 0;
    while(opcao != 2)
    {
        printf("Informe o nome do jogador: \n");
        gets(lista[posicao].jogador[a].nome);
        fflush(stdin);

        printf("Informe a quantidade de gol(s) que o %s fez: \n", lista[posicao].jogador[a].nome);
        scanf("%d", &lista[posicao].jogador[a].qtdGols);

        printf("Deseja cadastrar mais jogadores?\n(1 - PARA SIM / 2 - PARA NÃO): \n");
        scanf("%d", &opcao);
        if(opcao == 1)
        {
            a += 1;
        }
    }
    system("cls");
    if(lista[posicao].situacao == 1 || lista[posicao].situacao == 2)
        printf("\nDADOS ATUALIZADO COM SUCESSO! \n");
    else
    {
        printf("\nPOSIÇÃO INEXISTENTE!\n");
    }
}

void removerPartidas(Partidas lista[50])
{
    int codigo;
    printf("\nInforme a Partida que deseja remover (1 a 50): \n");
    fflush(stdin);
    scanf("%d", &codigo);

    if(lista[codigo-1].status != '1')
    {
        printf("A Partida não existe!\n");
    }
    else
    {
        lista[codigo-1].status = '0';
        printf("Partida removida!\n");
    }
}

iniciarPartidas()
{

    int opcao = 0;
    Partidas lista[50];
    iniciarLista(lista);
    do
    {
        opcao = exibirMenuPartidas();
        switch(opcao)
        {
        case 1:
            inserirPartidas(lista);
            break;
        case 2:
            editarPartidas(lista);
            break;
        case 3:
            removerPartidas(lista);
            break;
        case 4:
            listarPartidas(lista);
            break;
        case 5:
            pesquisarPartidas(lista);
            break;
        }
    }
    while (opcao != 8);
}

#endif // PARTIDAS_H_INCLUDED
