#ifndef EQUIPE_H_INCLUDED
#define EQUIPE_H_INCLUDED

//CRIANDO A ESTRUTURA DAS EQUIPES
typedef struct {
  char Nome[100];
  char Cidade[100];
  char Treinador[100];
  int Vitorias;
  int Derrotas;
  int Empates;
  int Gols;
}EQUIPE;
EQUIPE ep[20];


int PosicaoEquipe() {
  int contador = 0;
  for (; contador <= 10; contador++) {
    if (strlen(ep[contador].Nome) == 0) {
      return contador;
    }
  }
}

int obterTotalEquipe() {
  int total = 0;
  int contador;
  for (contador = 0; contador <= 20; contador++) {
    if (strlen(ep[contador].Nome) > 0) {
      total = total + 1;
    }
  }
  return total;
}

//INSER��O DA EQUIPE
inserirEquipe() {
  int posicaoVaga = PosicaoEquipe();
  fflush(stdin);
  printf("Nome da Equipe: \n");
  scanf("%s", ep[posicaoVaga].Nome);

  printf("Cidade da Equipe: \n");
  scanf("%s", ep[posicaoVaga].Cidade);

  printf("Treinador da Equipe: \n");
  scanf("%s", ep[posicaoVaga].Treinador);

  /**<
  printf("Vitorias: \n");
  scanf("%d", &ep[posicaoVaga].Vitorias);

  printf("Derrotas: \n");
  scanf("%d", &ep[posicaoVaga].Derrotas);

  printf("Empates: \n");
  scanf("%d", &ep[posicaoVaga].Empates);

  */

  fflush(stdin);
  system("cls");
}

//LISTAGEM DAS EQUIPES
listarEquipe() {

    system("cls");
  int contador;

  for (contador = 0; contador < 10; contador++) {
    if (ep[contador].Nome != NULL || strlen(ep[contador].Nome) != 0) {
      printf("EQUIPE \n ID: %d - NOME: %s - CIDADE: %s \n", contador,
        ep[contador].Nome, ep[contador].Cidade);
      printf("   VIT�RIAS: %d \n   DERROTAS: %d \n    EMPATES: %d\n\n", contador,
        ep[contador].Vitorias, ep[contador].Derrotas, ep[contador].Empates);

    }

  }
}

//DELETAR EQUIPE
deleteEquipe() {
  int Selecionado = 0;
  printf("Informe o ID que deseja excluir: \n");
  scanf("%d", & Selecionado);
  strcpy(ep[Selecionado].Nome, "");
  strcpy(ep[Selecionado].Cidade, "");
  strcpy(ep[Selecionado].Treinador, "");
  strcpy(ep[Selecionado].Vitorias,0);
  strcpy(ep[Selecionado].Derrotas,0);
  strcpy(ep[Selecionado].Empates,0);


  printf("O registro no ID %d foi deletado. \n", Selecionado);
}

//PESQUISA DE EQUIPE
pesquisarEquipe() {

    system("cls");
  char nomePesquisado[50];
  printf("Informe o nome que deseja pesquisar: \n");
  scanf("%s", & nomePesquisado);

  bool verificador = false;
  int contador = 0;
  for (; contador < 20; contador++) {
    if (!strcmp(ep[contador].Nome, nomePesquisado)) {
      printf("EQUIPE ENCONTRADA \n ID: %d - NOME: %s - CIDADE: %S - TREINADOR: %S\n", contador,
        ep[contador].Nome, ep[contador].Cidade, ep[contador].Treinador);
      printf("   VIT�RIAS: %d \n    DERROTAS: %d \n    EMPATES: %d \n    Gols: %d\n\n", contador,
        ep[contador].Vitorias, ep[contador].Derrotas, ep[contador].Empates, ep[contador].Gols);

      verificador = true;
    }
  }
  if (verificador == false) {
    printf("EQUIPE N�O ENCONTRADA\n");
  }
}

//ATUALIZA O EQUIPE
atualizarEquipe() {
    system("cls");
  int Selecionado = 0;
  printf("Informe o ID que deseja alterar: \n");
  scanf("%d", &Selecionado);

  fflush(stdin);
  printf("Nome da Equipe: \n");
  scanf("%s", ep[Selecionado].Nome);

  printf("Cidade da Equipe: \n");
  scanf("%s", ep[Selecionado].Cidade);

  printf("Treinador da Equipe: \n");
  scanf("%s", ep[Selecionado].Treinador);

  printf("Vit�rias: \n");
  scanf("%d", & ep[Selecionado].Vitorias);

  printf("Derrotas: \n");
  scanf("%d", & ep[Selecionado].Derrotas);

  printf("Empates: \n");
  scanf("%d", & ep[Selecionado].Empates);

  printf("Saldo de Gols: \n");
  scanf("%d", & ep[Selecionado].Gols);
  fflush(stdin);
}

#endif
