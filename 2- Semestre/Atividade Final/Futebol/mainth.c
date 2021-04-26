#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <stdbool.h>
#include <unistd.h>
#include <windows.h>
#include "equipe.h"
#include "jogadores.h"
#include "partidas.h"
#include "resultados.h"
#include "menu.h"

unsigned int cp = 1252;

main(){
    SetConsoleCP(cp);
    SetConsoleOutputCP(cp);

    int opcao = 0;

    do{

        system("cls");
        printf("\t  CAMPEONATO DE FUTEBOL \n\n");
        printf("1 - Equipes \n");
        printf("2 - Jogadores \n");
        printf("3 - Partidas \n");
        printf("4 - Resultados \n\n");
        printf("5 - Fechar \n\n");
        printf("\n \tESCOLHA UMA OPÇÃO");

        scanf("%d", &opcao);

        switch(opcao){
            case 1:
                menuEquipe();
                system("pause");
            break;
            case 2:
                menuJogadores();
                system("pause");
            break;
            case 3:
                menuPartidas();
                system("pause");
            break;
            case 4:
                menuResultado();
                system("pause");
            break;
        };
    }while(opcao != 5);
}
