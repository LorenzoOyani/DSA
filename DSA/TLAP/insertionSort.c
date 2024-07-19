#include <stdio.h>

#define ARRAY_SIZE 10

int main(){ // criterion-search!!
    int arrays[] = {1, 2, 3, 4,45,6,7,8,9};
    int highestValue = arrays[0];
    for(int i = 1; i < ARRAY_SIZE; i++){
        if(arrays[i] > highestValue){
            highestValue = arrays[i];
        }

    }

}

void insertIntoArrayList(int num){
    int array[] = {ARRAY_SIZE};
    int start = 0; 
    int end = ARRAY_SIZE-1;

    for(int i = start + 1; i <= end; i++){
        for(int j = i; j > start; j--){
            if(array[j ] < array[j + 1]){
                 num = array[j + 1];
                array[j +1 ] = array[j];
                array[j] = num; 

             }
        }

    } 
    
}