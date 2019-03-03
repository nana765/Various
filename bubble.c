#include <stdio.h>
#define MAX_LENGTH  5


void showData(int data[MAX_LENGTH],int length){
    int i;
    for(i = 0; i < length; i++){
        printf("%d ",data[i]);
    }
    printf("\n");
}


void inputData(int data[MAX_LENGTH]){
  int i;
  for(i=0;i<MAX_LENGTH;i++){
    scanf("%d",&data[i]);
  }
}

void bubble(int data[MAX_LENGTH]){
  int i,j,tmp;
  for(i = 0;i < MAX_LENGTH-1 ; i++){
      for(j = i+1; j < MAX_LENGTH ; j++){
          if(data[i] < data[j]){
              //  値の入れ替え
              tmp = data[i];
              data[i] = data[j];
              data[j] = tmp;
          }
      }
  }
}

int main(){
    int data[MAX_LENGTH];
    inputData(data);
    bubble(data);
    showData(data,MAX_LENGTH); //  配列の表示
}
