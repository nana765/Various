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

void select(int data[MAX_LENGTH]){
  int i,j,tmp;
  int max_index = 0;  //最大の値が入っている部分を示す　
  for(i = 0;i < MAX_LENGTH-1 ; i++){
      max_index = i;
      for(j = i+1; j < MAX_LENGTH ; j++){
          if(data[max_index] < data[j]){
              max_index = j;
          }
      }
      //  先頭要素より、大きい値があれば、入れ替える。
      if(max_index != i){
              tmp = data[i];
              data[i] = data[max_index];
              data[max_index] = tmp;
      }
  }
}

int main(){
    int data[MAX_LENGTH];
    inputData(data);
    select(data);
    showData(data,MAX_LENGTH);
}
