#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <stdbool.h>
#include <unistd.h>
#include <windows.h>
#include "equipe.h"
#include "jogadores.h"
#include "partidas.h"
#include "resultados.h"
#include "menu.h"

/**<
unsigned int cp = 1252;

main(){
    SetConsoleCP(cp);
    SetConsoleOutputCP(cp);

    int op = 0;

        system("cls");
        printf("\t  CAMPEONATO DE FUTEBOL \n\n");
        printf("1 - Equipes \n");
        printf("2 - Jogadores \n");
        printf("3 - Resultados \n\n");
        printf("4 - Partidas");
        printf("4 - Fechar \n\n");
        printf("\n \tESCOLHA UMA OP��O");

        scanf("%d", &op);

        //CASO A OP��O 1 FOR ESCOLHIDA, INSERE UM JOGADOR

        Opcao(op){
        if (op == 1) {
          menuEquipe();

       //CASO A OP��O 2 FOR ESCOLHIDA, ALTERA UM JOGADOR
       } else if (op == 2) {
         menuJogadores();

       //CASO A OP��O 3 FOR ESCOLHIDA, DELETA UM JOGADOR
       } else if (op == 3) {
         Resultado();

       //CASO A OP��O 5 FOR ESCOLHIDA, PESQUISA UM JOGADOR
       } else if (op == 5) {
         iniciarPartidas();
       }
    }
    */


unsigned int cp = 1252;

main(){
    SetConsoleCP(cp);
    SetConsoleOutputCP(cp);

    int opcao = 0;

    do{

        system("cls");
        printf("\tCAMPEONATO DE FUTEBOL \n\n");
        printf("1 - Equipes \n");
        printf("2 - Jogadores \n");
        printf("3 - Partidas \n");
        printf("4 - Resultados \n");
        printf("5 - Fechar \n\n");
        printf("\tESCOLHA UMA OPCAO \n");

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
                iniciarPartidas();
                system("pause");
            break;
            case 4:
                menuResultado();
                system("pause");
            break;
        };
    }while(opcao != 5);
}
