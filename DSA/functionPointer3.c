#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SIZE 256

double array[10] = {2.0,3.3,6.5,4.1,23.0,0.0,2.2,5.5,6.9};

char arr2[5][20]={
    "Mickey Mouse",
    "Donald Duck",
    "Goofy Spraus",
    "Ted Bundy"

};

int compare(void* m, void* n);
void bubblesorts(void *p, size_t width, int n, int (*fptr)(const void *, const void*));
int compare_string(const void*, const void*);
int compare_double(const void* m, const void* n);

int main(void){

    putchar('\n');
    int i;
    for(;  i < 10; i++){
        printf("arrays at index %d, is  arr[%d]", i, array[i]);


    }
    bubblesorts(array, sizeof(double), 10, compare_double);
    bubblesorts(array, sizeof(double), 10, compare_string);

    putchar('\n');

    for(int i = 0; i< 10; i++){
        printf("array at index %d = arr[%d]\n", i, array[i]);
    }

    return  0;


}

void bubblesorts(void *p, size_t width,  int n, int(*fptr)(const void*, const void*)){
     unsigned char buf[MAX_SIZE];
     unsigned char *bp = p; // dereferencing a pointer!
     int i,  j,  k;

    for(i = n -1;  i >=0; i--){
        for(j=1; j<i; j++){
            
            k =(*fptr)(bp+  width* (j-1), bp+width*(j)); 

            if(k >  0){
                memcpy(buf, bp+width*(j-1), width);
                memcpy(bp + width *(j -1), bp + width * (j), width);
                memcpy(bp + width * (j), buf, width);
            }
        }
    }

}



int compare_string(const void* m, const void* n){

    char *m1 = (char *) m;
    char *n1 = (char *) n;

    return m1 > n1;
}




int compare_double(const void* m, const void* n){

    double *m1 = (double *) m;
    double *n1 = (double *) n;

    return m1 > n1;
}