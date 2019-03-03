#include <stdio.h>
#include <stdlib.h>
#define MAX_LENGTH 8

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

void merge_sort(int pData[MAX_LENGTH],int start,int end){
   static int tmp[MAX_LENGTH];
   int middle,i,j,k;
   if(start >= end){
       return;
   }
   //  startとendの中間地点=分割点
   middle = (start + end) / 2;
   //  前半部分整列
   merge_sort(pData,start,middle);
   //  後半部分整列
   merge_sort(pData,middle + 1,end);
   k = 0;
   for(i = start; i <= middle; i++){
       tmp[k] = pData[i];
       k++;
   }
   for(j = end; j >= middle + 1 ; j--){
       tmp[k] = pData[j];
       k++;
   }
   i = 0;
   j = end - start;
   for(k = start; k <= end ; k++){
       if(tmp[i] >= tmp[j]){
           pData[k] = tmp[i];
           i++;
       }else{
           pData[k] = tmp[j];
           j--;
       }
   }
}


int main()
{
    int data[MAX_LENGTH];
    inputData(data);
    merge_sort(data,0,MAX_LENGTH-1);
    showData(data,MAX_LENGTH);
    return 0;
}
