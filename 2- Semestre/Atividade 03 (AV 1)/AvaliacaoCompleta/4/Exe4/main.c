#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#ifdef __unix__#include <unistd.h>

#include <stdlib.h>

#elif defined(_WIN32) || defined(WIN32)

#define OS_Windows

#include <windows.h>

#endif
/*
Criar um array bidimensional (matriz) de N x M posições do tipo inteiro.
Para este array permita as seguintes operações através de um menu
principal (cada operação deverá ser desenvolvida em uma função):
a) Ler o conteúdo do array
b) Gerar valores aleatórios para o array.
c) Mostrar o maior elemento
d) Mostrar o menor elemento
e) Mostrar a soma de todos os elementos do array
f) Mostrar a soma dos elementos de uma determinada linha
g) Mostrar a soma dos elementos de uma determinada coluna
h) Mostrar a média.
*/
int array[10][10];
unsigned int cp = 1252;
main()
{
    SetConsoleCP(cp);
    SetConsoleOutputCP(cp);
    mostrarMenu();
}

mostrarMenu(){
    int opcao = 0;
    while(opcao != 9){
        printf("=== MENU ===!\n");
        printf("1 - Ler o conteúdo do array\n");
        printf("2 - Gerar valores aleatórios para o array\n");
        printf("3 - Mostrar o maior elemento\n");
        printf("4 - Mostrar o menor elemento\n");
        printf("5 - Mostrar a soma de todos os elementos do array\n");
        printf("6 - Mostrar a soma dos elementos de uma determinada linha\n");
        printf("7 - Mostrar a soma dos elementos de uma determinada coluna\n");
        printf("8 - Mostrar a média\n");
        printf("9 - Sair\n");
        printf("Informe a opcao desejada: \n");
        scanf("%d", &opcao);
        limparTela();
        opcaoEscolhida(opcao);
    }
}
opcaoEscolhida(int opcaoSelecionada) {
  if (opcaoSelecionada == 1) {
        exibirConteudoArray();
  } else if (opcaoSelecionada == 2) {
    gerarValoresAleatorios();
  } else if (opcaoSelecionada == 3) {
    printf("Maior elemento: %d \n", obterMaiorElemento());
  } else if (opcaoSelecionada == 4) {
    printf("Menor elemento: %d \n", obterMenorElemento());
  } else if (opcaoSelecionada == 5) {
    printf("Valor da soma: %d\n", somarElementos());
  } else if (opcaoSelecionada == 6) {
    int linha = 0;
    printf("Informe a linha que deseja somar: \n");
    scanf("%d", &linha);
    printf("Valor da soma: %d\n", somarLinha(linha));
  } else if (opcaoSelecionada == 7) {
    int coluna = 0;
    printf("Informe a coluna que deseja somar: \n");
    scanf("%d", &coluna);
    printf("Valor da soma: %d\n", somarColuna(coluna));
  } else if (opcaoSelecionada == 8) {
    printf("Valor da média: %d\n", obterMedia());
  }
}

exibirConteudoArray(){
    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna < 10; coluna++){
            printf("array[%d][%d]: %d\n", linha, coluna, array[linha][coluna]);
        }
    }
}

gerarValoresAleatorios(){
    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna < 10; coluna++){
            array[linha][coluna] = rand() % 10000;
        }
    }
    printf("Valores gerados\n");
}

int obterMaiorElemento(){
    int maiorElemento = -1;
    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna < 10; coluna++){
            if(array[linha][coluna] > maiorElemento){
                maiorElemento = array[linha][coluna];
            }
        }
    }
    return maiorElemento;
}

int obterMenorElemento(){
    int menorElemento = 10001;
    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna < 10; coluna++){
            if(array[linha][coluna] < menorElemento){
                menorElemento = array[linha][coluna];
            }
        }
    }
    return menorElemento;
}

int somarElementos(){
    int soma = 0;
    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna < 10; coluna++){
            soma += array[linha][coluna];
        }
    }
    return soma;
}

int somarLinha(int linha){
    int soma = 0;
    for(int coluna = 0; coluna < 10; coluna++){
        soma += array[linha][coluna];
    }
    return soma;
}

int somarColuna(int coluna){
    int soma = 0;
    for(int linha = 0; linha < 10; linha++){
        soma += array[linha][coluna];
    }
    return soma;
}

int obterMedia(){
    int media = 0;
    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna < 10; coluna++){
            media += array[linha][coluna];
        }
    }
    return (media/100);
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
