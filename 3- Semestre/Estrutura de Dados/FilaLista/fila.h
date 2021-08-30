typedef struct fila Fila;
typedef struct listano ListaNo;

struct listano {
    float info;
    ListaNo* prox;
};

struct fila {
    ListaNo* ini;
    ListaNo* fim;
};

Fila *fila_cria(void);
void fila_insere (Fila* f, float v);
float fila_retira (Fila* f);
int fila_vazia (Fila* f);
void fila_libera (Fila* f);
