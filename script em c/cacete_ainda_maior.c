#include <stdio.h>
#include <conio.h>

void main()
{
  FILE *arq;
  char Linha[500];
  char *result;
  int i, j, k;
  // Abre um arquivo TEXTO para LEITURA
  arq = fopen("t.txt", "rt");
  char result2;

  FILE *arq2;
  FILE *arq3;
  FILE *arq4;

  arq4 = fopen("hora.txt", "wt");
  arq2 = fopen("text.txt", "wt");  // Cria um arquivo texto para gravação
  arq3 = fopen("palco.txt", "wt");  // Cria um arquivo texto para gravação

  i = 1;
  j = 1;
  k = 1;
  while (!feof(arq))
  {
    result = fgets(Linha, 500, arq);

    if(j == 1){
      printf("result %d : %s k= %d \n",i,Linha, k);

      switch(k){
        case 1: printf("horario\n\n"); fprintf(arq4, Linha, i); break;
        case 2: printf("text\n\n"); fprintf(arq2, Linha, i); break;
        case 3: printf("palco\n\n"); fprintf(arq3, Linha, i); break;
      }

      k++;
      j = 0;
    } else {
      j = 1;
    }

    if(k == 4) k=1;

    i++;
  }
  fclose(arq);

  fclose(arq4);
  fclose(arq2);
  fclose(arq3);

  getchar();
}