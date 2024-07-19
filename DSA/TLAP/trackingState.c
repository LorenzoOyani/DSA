#include <stdio.h>


int main(){
    char digits;
    int digitChar = scanf(digits);

    printf("enter a valid number of three, four, five.");

    int threeDigits = (digitChar - '0') * 100;
    int fourDigits = (digitChar - '0') * 1000;

    digitChar = scanf(digits);
    int threeDigit = (digitChar - '0');
    int fourDigit = (digitChar - '0') * 10;

    digitChar = scanf(digits);

    if(digitChar == 10){
        printf("number entered is "+ threeDigit);
    }else{
        fourDigit += digitChar - '0';
        printf("number entered is "+ fourDigit);
    }

    


}