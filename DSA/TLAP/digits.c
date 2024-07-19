
#include <stdio.h>


int main(){
    int digits;
    scanf("enter a value between 0- 9" + digits);
    int doubleDigit = digits * 2;
    int sum = 0;
    if(digits >= 10){
        sum += 1 + digits % 10;
    } else{
        sum = digits;
    }



}

