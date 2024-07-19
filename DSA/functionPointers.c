#include <stdio.h>
#include <stdlib.h>


int array[10] = {2,3,6,4,23,0,2,5,6,0};
void  bubblesort(int *p, int n);
int compare(void* m, void* n);
// void bubblesorts(void *p,  size_t  width, int n);

int main(void){

    putchar('\n');
    int i;
    for(;  i <10;i++){
        printf("arrays at   index   %d, is  arr[%d]",   i,  array[i]);


    }
    bubblesort(array,   i);
    bubblesorts(array, sizeof(long), i);
    putchar('\n');

    return  0;


}

void bubblesort(int *p,  int n){
    for(int k =n-1; k >=0;  k--){
        for(int j = (*p+1); j<=k; j++){
            if(compare((void *)&p[j-1],(void *) &p[j])){
                int t = p[j -1];
                p[j]=   p[j-1];
                p[j-1]  =  t;
            }
        }
    }


}



int compare(void* m, void* n){  //type-compatibility
    int* m1  =   (int*)m;   //pointer-to-pointer!
    int* n1  =   (int*)n;

    return  (*m1    >   *n1);
}