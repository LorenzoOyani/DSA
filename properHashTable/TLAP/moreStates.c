#include <stdio.h>

int main(){
    char digits;

    char digitCharacter = scanf(digits);
    int number = (digitCharacter - '0') * 100;
    digitCharacter = gets(digits);

    number += (digitCharacter - '0') * 10;

    digitCharacter  = gets(digits);
    number += digitCharacter - '0';
    digitCharacter = gets(digits);
    if(digitCharacter == 10){
        printf("numbered entered is %d\n", number);
    }else{
        number += number * 10 + digitCharacter - '0';
        printf("number entered is %d\n", number);
    }
}