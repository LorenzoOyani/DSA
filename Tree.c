#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>


typedef struct treeNode{
    int value;
    struct treeNode *left;
    struct treeNode* right;

} treeNode;

treeNode* createNode(int value){
    treeNode * new_node = malloc(sizeof(treeNode));
    if(new_node == NULL) return NULL;
    new_node ->left = NULL;
    new_node -> right = NULL;
    new_node -> value = value;

    return new_node;

}

void printTree(treeNode *tree){
    if(tree == NULL){
        printf("empty--\n");
        return; // a return out of an if-block;
    }
    printf("value of the root: %d\n", tree ->value);
    printf("left value: %d\n", (void*) tree ->left);
    printf("right value: %d\n", (void*)tree -> right);
    
}



int main(){

    treeNode* n1 = createNode(10);
    treeNode * n2 = createNode(20);

    if(n1 != NULL && n2 != NULL){
        printf("first node");
        printTree(n1);
        printf("Second node");
        printTree(n2);
    }else{
        printf("can't create tree nodes");
    }

    free(n1);
    free(n2);
    return 0;
 
}
