#include<stdio.h>
#include<ctype.h>
#define STACK_MAX 100

typedef struct {
    int data;
} stack_t;
stack_t stack[STACK_MAX]; //スタック用の構造体配列
//スタックポインタの初期化
    int spt=-1;
// ---- データをスタックに入れる ----
int push( int x){
    if( spt >= STACK_MAX-1 ) {
        spt=-1;
    }
    spt++;
    stack[spt].data = x;
   
    return 0;
}
// ---- スタックからデータを取り出す ----
int pop( int *x) {
    if( spt < 0 ) return -1;

    *x = stack[spt].data;
    spt--;
    return *x;
}

//main関数
int main()
{
        int c;
        int x, a, b;
        //control+dで終了
        while ((c=getchar())!=EOF){
                if (isdigit(c)){//数字かどうかの判定
                        ungetc(c, stdin);
                        scanf("%d", &x);
                        push(x);
                }
                else {
                        switch(c) {
                        case '+':
                                b=pop(&x);
                                a=pop(&x);
                                push(a+b);
                                break;
                        case '-':
                                b=pop(&x);
                                a=pop(&x);
                                push(a-b);
                                break;
                        case '*':
                                b=pop(&x);
                                a=pop(&x);
                                push(a*b);
                                break;
                        case '/':
                                b=pop(&x);
                                a=pop(&x);
                                push(a/b);
                                break;
                        case '\n':
                                if (spt==0){
                                        printf(" %d\n", pop(&x));
                                }
                                else {
                                        spt=-1;
                                }
                        case ' ':
                                break;
                        case '\t':
                                break;
                        default:
                                spt=-1;
                                break;
                        }
                }
        }
}
    
