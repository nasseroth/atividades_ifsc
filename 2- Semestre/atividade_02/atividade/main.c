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
Implementar uma aplicação completa que contenha um menu com as
seguintes opções:
1. Inserir
2. Alterar
3. Apagar
4. Listar
5. Pesquisar
6. Sair
A opção 5 deverá pesquisar por nome;
*/
typedef struct {
  char nome[50];
  int idade;
}
ALUNO;
ALUNO al[10];
main() {
  exibirMenu();
}

exibirMenu() {
  int opcao = 0;
  while (opcao != 6) {
    printf("Bem vindo!\n");
    if (obterTotalAlunos() < 10) {
      printf("1 - Inserir\n");
    }
    printf("2 - Alterar\n");
    if (obterTotalAlunos() > 0) {
      printf("3 - Apagar\n");
    }
    printf("4 - Listar\n");
    printf("5 - Pesquisar\n");
    printf("6 - Sair\n");
    printf("Informe a opcao desejada: \n");
    scanf("%d", & opcao);
    limparTela();
    opcaoEscolhida(opcao);
  }
}
opcaoEscolhida(int opcaoSelecionada) {
  if (opcaoSelecionada == 1) {
    inserirAluno();
  } else if (opcaoSelecionada == 2) {
    listarAlunos();
    printf("até aqui ok \n");
    atualizarAluno();
  } else if (opcaoSelecionada == 3) {
    listarAlunos();
    printf("até aqui ok \n");
    removerAluno();
  } else if (opcaoSelecionada == 4) {
    listarAlunos();
  } else if (opcaoSelecionada == 5) {
    pesquisarAluno();
  }
}

inserirAluno() {
  int posicaoVaga = obterPosicaoVaga();
  //Entrada de Dados
  fflush(stdin);
  printf("Informe o nome do aluno: \n");
  scanf("%s", al[posicaoVaga].nome);

  printf("Informe a idade do aluno: \n");
  scanf("%d", & al[posicaoVaga].idade);
  fflush(stdin);
  limparTela();
}
listarAlunos() {
  int contador = 0;
  limparTela();
  for (; contador < 10; contador++) {
    if (al[contador].nome == NULL || strlen(al[contador].nome) == 0) {
      printf("ALUNO ID: N/A - NOME DO ALUNO: N/A - IDADE DO ALUNO: N/A \n");
    } else {
      printf("ALUNO ID: %d - NOME DO ALUNO: %s - IDADE DO ALUNO: %d \n", contador,
        al[contador].nome, al[contador].idade);
    }

  }
}
int obterTotalAlunos() {
  int total = 0;
  int contador = 0;
  for (; contador <= 10; contador++) {
    if (strlen(al[contador].nome) > 0) {
      total = total + 1;
    }
  }
  return total;
}
int obterPosicaoVaga() {
  int contador = 0;
  for (; contador <= 10; contador++) {
    // encontrou posição vaga
    if (strlen(al[contador].nome) == 0) {
      return contador;
    }
  }
}

removerAluno() {
  int alunoSelecionado = 0;
  printf("Informe o ID que deseja excluir: \n");
  scanf("%d", & alunoSelecionado);
  strcpy(al[alunoSelecionado].nome, "");
  limparTela();
  printf("O registro no ID %d foi limpo. \n", alunoSelecionado);
}

pesquisarAluno() {
  char nomePesquisado[50];
  printf("Informe o nome que deseja pesquisar: \n");
  scanf("%s", & nomePesquisado);
  limparTela();
  bool verificador = false;
  int contador = 0;
  for (; contador < 10; contador++) {
    if (!strcmp(al[contador].nome, nomePesquisado)) {
      printf("[ENCONTRADO]: ALUNO ID: %d - NOME DO ALUNO: %s - IDADE DO ALUNO: %d \n", contador,
        al[contador].nome, al[contador].idade);
      verificador = true;
    }
  }
  if (verificador == false) {
    printf("NENHUM VALOR ENCONTRADO\n");
  }
}
atualizarAluno() {
  int alunoSelecionado = 0;
  printf("Informe o ID que deseja alterar: \n");
  scanf("%d", &alunoSelecionado);

  fflush(stdin);
  printf("Informe o nome do aluno: \n");
  scanf("%s", &al[alunoSelecionado].nome);

  printf("Informe a idade do aluno: \n");
  scanf("%d", &al[alunoSelecionado].idade);
  fflush(stdin);
}
limparTela() {
  #ifdef OS_Windows
  /* Codigo Windows */
  system("cls");
  #else
  /* Codigo GNU/Linux */
  system("clear");
  #endif
}
