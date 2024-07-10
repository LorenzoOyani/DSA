#include <stdio.h>
#include <string.h>
#include <stdlib.h>
enum modeType  {UPPERCASE, LOWERCASE, PUNCTUATION};
int main(){
    char digits;

    char outputChar;
    char digitChar = scanf(digits);

    do{
        digitChar = gets(digits);
        int number = digitChar - '0';
        while (digitChar !=10 && digitChar != ",")
        {
            number += number * 10 + digitChar - '0';
            digitChar = gets(digits);
        }
      
        


    }while(digitChar != 10);


}