#ifndef PARTIDAS_H_INCLUDED
#define PARTIDAS_H_INCLUDED
int posicao();

//CRIANDO A ESTRUTURA DAS PARTIDAS
typedef struct
{
    char equipeA[100];
    char equipeB[100];
    int situacao;
    int totalGolA;
    int totalGolB;
    int equipeVencedora;
    int tipoPartida;
    union
    {
        char nome[10];
        int qtdGols;
    } jogador[50];
} PARTIDA;
PARTIDA pt[50];
enum situacao {EM_ABERTO=1, REALIZADA=2};
enum tipoPartida {GRUPOS=1, OITAVAS=2, QUARTAS=3, SEMIFINAL=4, FINAL=5};

//CADASTRO DE PARTIDAS
cadastrarPartidas()
{

        int posicaoVaga = posicao();
        printf("Nome da Equipe A: \n");
        fflush(stdin);
        scanf("%s", &pt[posicaoVaga].equipeA);

        printf("Nome da Equipe B: \n");
        fflush(stdin);
        scanf("%s", pt[posicaoVaga].equipeB);

        printf("Situação\n(1 - EM ABERTO / 2 - REALIZADA): \n");
        scanf("%d", &pt[posicaoVaga].situacao);

        printf("Total de Gols da Equipe %s: \n", pt[posicaoVaga].equipeA);
        scanf("%d", &pt[posicaoVaga].totalGolA);

        printf("Total de Gols da Equipe %s: \n", pt[posicaoVaga].equipeB);
        scanf("%d", &pt[posicaoVaga].totalGolB);

        printf("Quem ganhou a partida? \n(1 - PARA EQUIPE %s / 2 - PARA EQUIPE %s): \n",
               pt[posicaoVaga].equipeA, pt[posicaoVaga].equipeB);
        scanf("%d", &pt[posicaoVaga].totalGolB);

        printf("Qual o tipo de partida? \n(1 - Grupos, 2 - Oitavas de final, 3 - Quartas de final, 4 - Semifinal, 5 - Final): \n");
        scanf("%d", &pt[posicaoVaga].totalGolB);

        int opcao = 0;
        printf("Deseja informar os jogadores que fizeram gols?\n(1 - PARA SIM / 2 - PARA NÃO): \n");
        scanf("%d", &opcao);

        while(opcao != 2)
        {
            int a = 0;
            printf("Informe o nome do jogador: \n");
            fflush(stdin);
            scanf("%s", pt[posicaoVaga].jogador[a].nome);

            printf("Informe a quantidade de gols: \n");
            scanf("%d", &pt[posicaoVaga].jogador[a].qtdGols);

            printf("Deseja cadastrar mais jogadores?\n(1 - PARA SIM / 2 - PARA NÃO): \n");
            scanf("%d", &opcao);
            if(opcao == 1){
                a++;
            }
        }

        fflush(stdin);
}

//LISTAR PARTIDAS
listarPartidas()
{
    int contador;

    for (contador = 0; contador < 50; contador++)
    {
        if (pt[contador].equipeA != NULL || strlen(pt[contador].equipeB) != 0)
        {
            printf("Equipe A: %s / Equipe B: %s\n", pt[contador].equipeA, pt[contador].equipeB);
            switch(pt[contador].situacao)
            {
            case 1:
                printf("Situação: EM ABERTO\n");
                break;
            case 2:
                //
                printf("Situação: REALIZADA\n");
                break;
            default:
                printf("Situação: NÃO ENCONTRADA!\n");
            }
            printf("Total de Gols da Equipe %s: %d gols - e da Equipe %s: %d gols\n", pt[contador].equipeA, pt[contador].totalGolA, pt[contador].equipeB,
                   pt[contador].totalGolB);
            if(pt[contador].equipeVencedora == 1)
            {
                printf("Equipe vencedora: %s\n", pt[contador].equipeA);
            }
            else if (pt[contador].equipeVencedora == 2)
            {
                printf("Equipe vencedora: %s\n", pt[contador].equipeB);
            }
            switch(pt[contador].tipoPartida)
            {
            //GRUPOS=1, OITAVAS=2, QUARTAS=3, SEMIFINAL=4, FINAL=5
            case 1:
                printf("FASE DE GRUPOS\n");
                break;
            case 2:
                printf("OITAVAS DE FINAIS\n");
                break;
            case 3:
                printf("QUARTAS DE FINAIS\n");
                break;
            case 4:
                printf("SEMIFINAL\n");
                break;
            case 5:
                printf("FINAL\n");
                break;
            default:
                printf("TIPO DE PARTIDA NÃO DEFINIDA\n");
            }
            int i;
            for(i = 0; i < 50; i++)
            {
                if(pt[contador].jogador[i].nome != NULL && strlen(pt[contador].jogador[i].nome) != 0)
                {
                    printf("Jogador: %s - Total de gols: %d", pt[contador].jogador[i].nome, pt[contador].jogador[i].qtdGols);
                }
            }
        }
    }
}

int posicao()
{
    int contador;

    for (contador = 0; contador <= 50; contador++)
    {
        if (strlen(pt[contador].equipeA) == 0)
        {
            return contador;
        }
    }
}
#endif // PARTIDAS_H_INCLUDED
