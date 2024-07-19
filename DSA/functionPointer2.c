#include <stdio.h>
#include <stdlib.h>
#include <string.h>

double array[10] = {2.0,3.3,6.5,4.1,23.0,0.0,2.2,5.5,6.9};
int compare(void* m, void* n);
void bubblesorts(void *p, size_t width, int n);

int main(void){

    putchar('\n');
    int i;
    for(;  i < 10; i++){
        printf("arrays at index %d, is  arr[%d]", i, array[i]);


    }
    bubblesorts(array, sizeof(double), 10);
    putchar('\n');

    for(int i = 0; i< 10; i++){
        printf("array at index %d = arr[%d]\n", i, array[i]);
    }

    return  0;


}

void bubblesorts(void *p, size_t width,  int n){ //done in order not to loose track of the size of the pointers present in the array with no giving data-type

    unsigned char buf[8];
    unsigned char *bp =p; // dereferencing a pointer!

    for(int i = n -1; i >= 0; i--){
        for(int j = 1; j < i; j++){
             unsigned char t = bp[j -1];
            if(compare((void *) (bp + width * (j -1)), (void *) (bp + width * (j)))){
                memcpy(buf, (bp + width* (j -1)), width);
                bp[j -1] = bp[j];
                memcpy(bp + width *(j -1), bp + width * (j), width);
                bp[j] = t;
                memcpy(bp + width * (j), buf, width);

            }
        }
    }


   


}



int compare(void* m, void* n){  //type-compatibility
    double* m1  =   (double*)m;   //pointer-to-pointer!
    double* n1  =   (double*)n;

    return  (*m1    >   *n1);
}