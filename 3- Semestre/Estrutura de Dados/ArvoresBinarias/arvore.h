typedef struct arv Arv;
typedef struct arvno ArvNo;

struct arv {
    ArvNo* raiz;
};

struct arvno {
    int info;
    ArvNo *esq;
    ArvNo *dir;
};

Arv *arv_cria(ArvNo* r);
ArvNo *arv_criano(int c, ArvNo *e, ArvNo *d);
void arv_libera(Arv *a);
void arv_imprime(Arv *a);
int arv_pertence(Arv *a, int c);
ArvNo *arv_busca(Arv *a, int c);
