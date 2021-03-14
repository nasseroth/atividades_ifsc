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
7) Implemente uma aplicação que realize o cadastro de veículos.
a) Você deve criar uma estrutura para armazenar os dados do veículo
contendo (modelo, cor, placa, tipo, característica e status);
b) Sua aplicação deve conter um menu com as seguintes opções: (inserir,
editar, remover, listar, pesquisar, sair);
c) Utilize uma enumeração para representar a cor do veículo, você deve usar
os seguintes dados: (1 - Preto, 2 - Branco, 3 - Verde, 4 - Azul, 5 - Vermelho,
6 - Amarelo, 7 - Prata, 8 - Cinza);
d) Para cadastro do tipo, deve ser informado se o veículo é (1 - Transporte de
passageiros, 2 - Transporte de Cargas, 3 - Passeio);
e) Conforme o tipo de veículo, deve ser armazenado uma característica
diferente no referido campo. Para isto, você deve criar uma união entre:
quantidade de passageiros (inteiro); carga máxima (float); possui seguro
(texto). Caso o veículo seja do tipo transporte de passageiros deve ser
informado a quantidade de passageiros, caso seja transporte de carga, deve
ser informado a carga máxima e caso contrário, se o mesmo possui seguro
(sim ou não);
f) Deve ser possível armazenar 15 registros de veículos. A cada inserção deve
ser verificado se há posições livres na lista, caso contrário deve ser
informado que a mesma está cheia.
g) Quando selecionada a opção de remover usuário, deve ser informada a
posição que se deseja remover e assim atualizar o status da posição da
lista. ‘*’ indica que o registro está apagado. ‘+’ indica que o registro está em
uso. Qualquer outro símbolo indica que o registro está disponível.
h) Para alteração o usuário deve informar o código desejado, caso a posição
esteja vazia não deve ser possível alterar o conteúdo;
i) A lista deve exibir na tela o Código, modelo, marca e placa dos veículos
cadastrados;
j) Na opção de pesquisa o usuário informa a posição desejada e são
impressos todos os dados do veículo.

*/
typedef struct {
  char nome[50];
  int numeroVendedor;
  int idade;
}
ALUNO;
ALUNO al[10];
main()
{
    printf("Hello world!\n");

}
