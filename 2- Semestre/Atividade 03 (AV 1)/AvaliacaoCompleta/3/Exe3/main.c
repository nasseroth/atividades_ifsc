#include <stdio.h>
#include <stdlib.h>

main()
{
    //Considere um array de inteiros 2 por 3 t:
    //Escreva uma declaração para t.
    int t[2][3];

    //b) Quantas linhas têm a matriz t?
    // 2 Linhas

    //c) Quantas colunas ela possui?
    // 3 colunas

    //d) Quantos elementos podem ser armazenados nesta matriz?
    // 6

    for(int linha = 0; linha < 2; linha++) {
        for(int coluna = 0; coluna < 3; coluna++){
            t[linha][coluna] = rand() % 100;
        }
    }
    //e) Escreva a identificação de todos os elementos na terceira coluna de t?
    for(int linha = 0; linha < 2; linha++){
        printf("Elementos na terceira coluna: %d\n", t[linha][3]);
    }
    //f) Escreva a instrução que configura o elemento de t na linha 1 e na coluna 2 como zero.
    t[1][2] = 0;

    //g) Escreva uma série de instruções que inicializam cada elemento de t com o
    //valor zero. Não utilize uma estrutura de repetição
    t[0][0] = 0;
    t[0][1] = 0;
    t[0][2] = 0;
    t[1][0] = 0;
    t[1][1] = 0;
    t[1][2] = 0;

    //h) Escreva uma estrutura for aninhada que inicializa cada elemento de t com o
    //valor “1”
    for(int linha = 0; linha < 2; linha++) {
        for(int coluna = 0; coluna < 3; coluna++){
            t[linha][coluna] = 1;
        }
    }

    //i) Escreva uma instrução que insere os valores para os elementos de t a partir
    //do teclado.
    for(int linha = 0; linha < 2; linha++) {
        for(int coluna = 0; coluna < 3; coluna++){
            printf("Insira o valor da linha %d e da coluna %d: ", linha, coluna);
            scanf("%d", &t[linha][coluna]);
        }
    }

    //j) Escreve uma série de instruções que determina e imprime o menor valor no
    //array t.
    int menorValor = 99999999;
    for(int linha = 0; linha < 2; linha++) {
        for(int coluna = 0; coluna < 3; coluna++){
            if(t[linha][coluna] < menorValor){
                menorValor = t[linha][coluna];
            }
        }
    }

    //k) Escreva uma instrução que exibe os elementos da primeira linha de t.
    for(int coluna = 0; coluna < 3; coluna++){
        printf("Elementos na primeira linha de t: %d\n", t[1][coluna]);
    }

    //l) Escreva uma instrução que soma os elementos da quarta coluna de t.
    // A matriz foi declarada com 2 linhas e 3 colunas, ou seja não temos a quarta coluna.
    printf("Hello world!\n");

}
