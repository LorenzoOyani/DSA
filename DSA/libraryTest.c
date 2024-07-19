
#include "mycode.h"
#include <stdio.h>

int main(int argc, char **argv){

if(argc >  0){
    printf("\t%s\n", argv[1]);
    printf("%s\n", reverseString(argv[1]));
}
}