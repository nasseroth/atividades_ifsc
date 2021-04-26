#ifndef MENU_H_INCLUDED
#define MENU_H_INCLUDED

//MENUS
menuEquipe() {
  int op = 0;
  while (op != 6) {
    printf("!\n");
    if (obterTotalEquipe() < 20) {
      printf("1 - Inserir Equipe\n");
    }
    printf("2 - Alterar Equipe\n");
    if (obterTotalEquipe() > 0) {
      printf("3 - Apagar\n");
    }
    printf("4 - Listar Equipes\n");
    printf("5 - Pesquisar Equipes\n");
    printf("6 - Voltar\n");
    printf("Informe a opcao desejada: \n");
    scanf("%d", & op);

    Opcao(op);
  }
}

//COLETANDO A OP��O ESCOLHIDA
Opcao(int opcaoSelecionadaEquipe) {

   //CASO A OP��O 1 FOR ESCOLHIDA, INSERE UMA EQUIPE
   if (opcaoSelecionadaEquipe == 1) {
      inserirEquipe();

   //CASO A OP��O 2 FOR ESCOLHIDA, ALTERA UMA EQUIPE
   } else if (opcaoSelecionadaEquipe == 2) {
     listarEquipe();
     atualizarEquipe();

   //CASO A OP��O 3 FOR ESCOLHIDA, DELETA UMA QUIPE
   } else if (opcaoSelecionadaEquipe == 3) {
     listarEquipe();
     deleteEquipe();

   //CASO A OP��O 4 FOR ESCOLHIDA, LISTA AS EQUIPES
   } else if (opcaoSelecionadaEquipe == 4) {
    listarEquipe();

   //CASO A OP��O 5 FOR ESCOLHIDA, PESQUISA UMA EQUIPE
   } else if (opcaoSelecionadaEquipe == 5) {
     pesquisarEquipe();
  }
};

//MENU JOGADORES
menuJogadores(){
int op = 0;

  while (op != 6) {
    printf("!\n");
    if (obterTotalEquipe() < 20) {
      printf("1 - Inserir Jogador\n");
    }
    printf("2 - Alterar Jogador\n");
    if (obterTotalEquipe() > 0) {
      printf("3 - Apagar\n");
    }
    printf("4 - Listar Jogadores\n");
    printf("5 - Pesquisar Jogadores\n");
    printf("6 - Voltar\n");
    printf("Informe a opcao desejada: \n");
    scanf("%d", & op);

    Opcao(op);

//COLETANDO A OP��O ESCOLHIDA

   //CASO A OP��O 1 FOR ESCOLHIDA, INSERE UM JOGADOR
   if (op == 1) {
      inserirJogador();

   //CASO A OP��O 2 FOR ESCOLHIDA, ALTERA UM JOGADOR
   } else if (op == 2) {
     listarJogadores();
     atualizarJogador();

   //CASO A OP��O 3 FOR ESCOLHIDA, DELETA UM JOGADOR
   } else if (op == 3) {
     listarJogadores();
     deleteJogador();

   //CASO A OP��O 4 FOR ESCOLHIDA, LISTA OS JOGADORES
   } else if (op == 4) {
    listarJogadores();

   //CASO A OP��O 5 FOR ESCOLHIDA, PESQUISA UM JOGADOR
   } else if (op == 5) {
     pesquisarJogador();
  }

}
};

//MENU RESULTADOS
menuResultado(){};

#endif
