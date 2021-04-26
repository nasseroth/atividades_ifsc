#ifndef JOGADORES_H_INCLUDED
#define JOGADORES_H_INCLUDED

//CRIANDO A ESTRUTURA DAS EQUIPES
typedef struct {
  char Nome[100];
  char Posicao[100];
  int Gols;
}JOGADOR;
JOGADOR jg[11];


int PosicaoJogador() {
  int contador = 0;
  for (; contador <= 11; contador++) {
    if (strlen(jg[contador].Nome) == 0) {
      return contador;
    }
  }
}

int obterTotalJogador() {
  int total = 0;
  int contador;
  for (contador = 0; contador <= 11; contador++) {
    if (strlen(ep[contador].Nome) > 0) {
      total = total + 1;
    }
  }
  return total;
}

//INSER��O DO JOGADOR
inserirJogador() {
    system("cls");
  int posicaoVaga = PosicaoJogador();
  fflush(stdin);
  printf("Nome do Jogador: \n");
  scanf("%s", jg[posicaoVaga].Nome);

  printf("Posicaoo: \n");
  scanf("%s", jg[posicaoVaga].Posicao);

  printf("Gols: \n");
  scanf("%d", &jg[posicaoVaga].Gols);
  fflush(stdin);
}

//LISTAGEM DOS JOGADORES
listarJogadores() {
    system("cls");
  int contador;

  for (contador = 0; contador < 11; contador++) {
    if (jg[contador].Nome != NULL || strlen(jg[contador].Nome) != 0) {
      printf("EQUIPE \n ID: %d - NOME: %s - POSICAO: %s \n   -  GOLS: %d\n", contador,
        jg[contador].Nome, jg[contador].Posicao, jg[contador].Gols);
    }

  }
}

//DELETAR JOGADOR
deleteJogador() {

  int Selecionado = 0;
  printf("Informe o ID que deseja excluir: \n");
  scanf("%d", & Selecionado);
  strcpy(jg[Selecionado].Nome, "");
  strcpy(jg[Selecionado].Posicao, "");
  strcpy(jg[Selecionado].Gols,0);


  printf("O registro no ID %d foi deletado. \n", Selecionado);
}

//PESQUISA DE JOGADOR
pesquisarJogador() {
system("cls");
  char nomePesquisado[50];
  printf("Informe o nome que deseja pesquisar: \n");
  scanf("%s", & nomePesquisado);

  bool verificador = false;
  int contador;
  for (contador = 0; contador < 20; contador++) {
    if (!strcmp(ep[contador].Nome, nomePesquisado)) {
      printf("JOAGDOR ENCONTRADO \n ID: %d - NOME: %s - POSICAO: %s - GOLD: %d\n", contador,
        jg[contador].Nome, jg[contador].Posicao, jg[contador].Gols);

      verificador = true;
    }
  }
  if (verificador == false) {
    printf("JOGADOR N�O ENCONTRADO\n");
  }
}

//ATUALIZA O JOGADOR
atualizarJogador() {

  int Selecionado = 0;
  printf("Informe o ID que deseja alterar: \n");
  scanf("%d", &Selecionado);

  fflush(stdin);
  printf("Nome do Jogador: \n");
  scanf("%s", jg[Selecionado].Nome);

  printf("Posição: \n");
  scanf("%s", jg[Selecionado].Posicao);

  printf("Gols: \n");
  scanf("%d", &jg[Selecionado].Gols);
  fflush(stdin);
}


#endif
