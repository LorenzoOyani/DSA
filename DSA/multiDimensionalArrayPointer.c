#include <stdio.h>
#include <stdlib.h>

int main(void){
    int  **rptr;

    int *ptr;
    int k=0;
    int ncols = 4;
    int nrows = 5;
    int row, col;

    ptr = malloc(nrows * ncols  *sizeof(int));
    if(ptr == NULL){
        printf("\n failure to allocate memory for this array");
        exit(0);
    }

    rptr= malloc(nrows * sizeof(int *));
    if(rptr == NULL){
        printf("\n failure to allocate memory for this array");
        exit(0);
    }

    for(; k < nrows; k++){
      rptr[k]=ptr  + (k * ncols);
        

    }

    //print out the incremented pointers;

    for(row =0; row < nrows; row++){
        printf("  %d\n row[%d]", row, rptr[row]);
        printf(" %d     ",  (rptr[row] - rptr[row -1]));
    }

    for(row = 0; row < nrows; row++){
        for(col = 0; col < ncols; col++){
            rptr[row][col] = row + col;
            printf("rows[%d] and  col[%d] in pointer is", rptr[row][col]);
        }

        putchar('\n');

    }
    puts("\n");

    return 0;
     
}