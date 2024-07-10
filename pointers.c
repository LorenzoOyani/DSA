#include <stdio.h>

int arrays[] = {1, 2 ,3 ,4, 5,6};

int *ptr;

int main(){
    
    int i;

    for(i = 0; i < 6; i++){
        printf("pointer + %d = %d\n", i, *(ptr + 1));
        printf("values of arrays[%d] = %d\n", i, arrays[i]);
    }

    return 0;
}