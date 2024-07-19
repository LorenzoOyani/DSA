#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>


#define ARRAYLENGTH 10

int compare(const void *pa, const void *pb){
    int a  = *(int*)pa;
    int b = *(int*)pb;

    return a - b;
}

int main(){

int values[] = {ARRAYLENGTH};

for(int i = 0; i < ARRAYLENGTH; i++){ // create 10 random numbers from 0 - 3000;

    values[i] = rand() % 3000;

}
qsort(values, ARRAYLENGTH, sizeof(int), compare);

for(int i = 0; i < ARRAYLENGTH; i++){

printf("values at %d  = %d\n", i, values[i]);
}
}