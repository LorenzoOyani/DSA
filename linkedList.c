#include <stdio.h>
#include <stdlib.h>

 struct node
{
    int value;
    struct node *next;
};

typedef struct node node_t;


void printList(node_t* head){
    node_t *temp = head; // assign the head to a temp to read the value, and print to the console.
    while(temp != NULL){
        printf("\t%d\n", temp ->value);
        temp = temp ->next;
    }
    printf("\n");
}

node_t * createNode(int value){
    node_t *result = malloc(sizeof(node_t));
    result ->value = value;
    result -> next = NULL;


    return result;

}

node_t * insert_at_head(node_t* head, int values){
    node_t * new_node = createNode(values);
    new_node ->next = head;
    return new_node;
}

int main()
{

    node_t *head;
    node_t *temp;

 for(int i = 0; i < 25; i++){
    temp = createNode(i);
    temp -> next = head;
    head = temp;
 }
   

}
