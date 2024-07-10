

#include "mycode.h"
#include <string.h>



char* reverseString(char * string){
    int stringLength = strnlen(string);

    for(int i = 0; i < stringLength / 2; i++){
        char temp = string[i];
        string[i] = string[stringLength -1 - i];
        string[stringLength -1 -i] = temp;

    }
    return string;
}