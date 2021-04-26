#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

int exibeMenu();
void cadastraVenda(double vendas[5][5][4]);
void totais(double vendas[5][5][4]);
unsigned int cp = 1252;

int main(){
    SetConsoleCP(cp);
    SetConsoleOutputCP(cp);
    double vendas[5][5][4] = {0};
    int opcao = 0;

    do{
        opcao = exibeMenu();

        switch(opcao){
            case 1:
                cadastraVenda(vendas);
                system("pause");
            break;
            case 2:
                totais(vendas);
                system("pause");
            break;
        };
    }while(opcao != 3);

}

int exibeMenu(){
    int opcao;
    system("cls");
    printf("-- -- -- Menu de Vendas -- -- -- \n");
    printf("1 - Cadastrar Venda \n");
    printf("2 - Mostrar Relatorio de vendas\n");
    printf("3 - Sair \n");
    printf("-- -- -- -- -- -- -- -- -- -- -- \n");
    printf("Escolha uma opcao \n");
    scanf("%d", &opcao);
    return opcao;
}

void cadastraVenda(double vendas[5][5][4]){
    int vendedor;
    int produto;
    int dia;
    double valor;

    printf("Informe o Vendendor (1 à 4):");
    scanf("%d", &vendedor);
    vendedor = vendedor - 1;
	
    printf("Informe o dia da Venda (1 à 5):");
    scanf("%d", &dia);
    dia = dia - 1;

    printf("Valor da Venda:");
    scanf("%lf", &registroVendas);

    vendas[dia][produto][vendedor] = valor;
}

void totais(double vendas[5][5][4]){
    double totais[6][5] = {0};

    int a;
    int b;
    int y;

    for(a = 0; a < 5; a++){
        for(b = 0; b < 5; b++){
            totais[b][0] += vendas[a][b][0];
            totais[b][1] += vendas[a][b][1];
            totais[b][2] += vendas[a][b][2];
            totais[b][3] += vendas[a][b][3];
        }
    }

        totais[0][4] = totais[0][0] + totais[0][1] + totais[0][2] + totais[0][3];
        totais[1][4] = totais[1][0] + totais[1][1] + totais[1][2] + totais[1][3];
        totais[2][4] = totais[2][0] + totais[2][1] + totais[2][2] + totais[2][3];
        totais[3][4] = totais[3][0] + totais[3][1] + totais[3][2] + totais[3][3];
        totais[4][4] = totais[4][0] + totais[4][1] + totais[4][2] + totais[4][3];

        totais[5][0] = totais[0][0] + totais[1][0] + totais[2][0] + totais[3][0];
        totais[5][1] = totais[0][1] + totais[1][1] + totais[2][1] + totais[3][1];
        totais[5][2] = totais[0][2] + totais[1][2] + totais[2][2] + totais[3][2];
        totais[5][3] = totais[0][3] + totais[1][3] + totais[2][3] + totais[3][3];

    printf("\t1 Equipe\t 2 Equipe\t 3 Equipe\t 4 Equipe\t Totais \n");

        printf("Produto 1: %lf \t %lf \t %lf \t %lf \t %lf \n", totais[0][0], totais[0][1], totais[0][2], totais[0][3], totais[0][4]);
        printf("Produto 2: %lf \t %lf \t %lf \t %lf \t %lf \n", totais[1][0], totais[1][1], totais[1][2], totais[1][3], totais[1][4]);
        printf("Produto 3: %lf \t %lf \t %lf \t %lf \t %lf \n", totais[2][0], totais[2][1], totais[2][2], totais[2][3], totais[2][4]);
        printf("Produto 4: %lf \t %lf \t %lf \t %lf \t %lf \n", totais[3][0], totais[3][1], totais[3][2], totais[3][3], totais[3][4]);


    printf("  Totais: %lf \t %lf \t %lf \t %lf \t %lf \n", totais[5][0], totais[5][1], totais[5][2], totais[5][3], totais[5][4]);
}
