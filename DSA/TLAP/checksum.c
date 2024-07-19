#include <stdio.h>

int main(){
    char digits;
  char c =   gets(digits);

  int position  = 1;
  char oddLengthCheck = 0;
  char evenLengthCheck = 0;
  int sum;

  while(c != 10){
    if(position % 2 == 0){
        oddLengthCheck = doubleDigitsValue(c - '0');
        evenLengthCheck = c - '0';
    }else{
        oddLengthCheck = c - '0';
        evenLengthCheck = doubleDigitsValue(c - '0');
    }
  }

  int chackSum = 0;
  if(position -1 % 2 == 0){
    chackSum = evenLengthCheck;
  }else{
    chackSum = oddLengthCheck;
  }
  if(chackSum % 10 == 0){
    printf("number is divisible by 10\n");
  }else{
    printf("number is not, hence invalid!");
    
  }




}
int doubleDigitsValue(char c){
    int double_digits = 2 * c -'0';
    int sum = 0;

    if(double_digits > 10){
        sum += 1 + double_digits % 10;

    }else{
        sum = double_digits;
    }

    return sum;
}