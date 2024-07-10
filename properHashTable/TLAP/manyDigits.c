#include <stdio.h>




int main(){
    printf("enter as many digit as you want: ");

    char digits;
    char digitChar = scanf(digits);
    int number = digitChar - '0';
    digitChar = gets(digits);

    while(digitChar != 10){
        number += number * 10 + digitChar -'0';
        digitChar = gets(digits);
    }
}