
#include <stdio.h>

typedef char  *arrayString;

char appendChar(arrayString s, int position ){
    return s[position];
}

void appendTester(arrayString* s, char c){
    int oldLength = length(s);
    arrayString new_string = malloc(sizeof(arrayString));
    if(new_string == NULL){
        return NULL;
    }

    for(int i = 0; i < oldLength; i++){
        new_string[i] = s[i];
    }

    new_string[oldLength] = c;
    new_string[oldLength + 1] = 0;
    free(new_string); // de-allocate memory from the heap;
    s = new_string;

}
int length(arrayString s){

int count  = 0;
if(s[count] != 0){
    count++;
}
return count;
}

void concatenate(arrayString *s, arrayString k){
    int oldLeftLength = length(s);
    int oldRightLeft = length(k);

    int addedRightAndLeft = oldLeftLength + oldRightLeft;
    arrayString new_length = malloc(sizeof(arrayString));
    if(new_length == NULL){
        return NULL;
    }

    for(int  i= 0; i < oldLeftLength; i++){
        new_length[i] = s[i];
    }

    for(int i = 0; i < oldRightLeft; i++){
        new_length[i] = k[i];
    }

    new_length[addedRightAndLeft] = 0;
    free(s);
    s =new_length;


}

void concatenateTester() {
arrayString a = {5};
a[0] = 't'; a[1] = 'e'; a[2] = 's'; a[3] = 't'; a[4] = 0;
arrayString b = {4};
b[0] = 'b'; b[1] = 'e'; b[2] = 'd'; b[3] = 0;
concatenate(a, b);
}