#include <stdio.h> 
#include <stdlib.h>


int main(void){
 int ncols = 5;
 int nrows = 4;

 int row;

 int **rowptr;

rowptr = malloc(nrows *sizeof(int *));
if(rowptr == NULL){
    printf("can't allocate [%d] bytes in memory ", rowptr);
    exit(0);
}

for(row = 0; row < nrows; row++){
    rowptr[row] = malloc(ncols * sizeof(int));
    if(rowptr == NULL){
        printf("\n failure to allocate for row[%d]\n", row);
        exit(0);
    }

printf("\n%d,   %p        %d", row, rowptr[row], rowptr[row]); // print out rows and colums;
if(row > 0){
    printf("  %d ",(int)(rowptr[row] - rowptr[row - 1]));
}
}

  return 0;
}