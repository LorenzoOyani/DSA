#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SIZE 256
#define Table_size 20

typedef struct{
    char name[MAX_SIZE];
    int age;
    struct  person* next;


}person;

person* hash_Table[Table_size];


void initialize_HashTable(){
    for(int i = 0; i < Table_size; i++){
        hash_Table[i] = NULL;
    }
}

unsigned int hash_function(char *name){
    unsigned int index =strnlen(name, MAX_SIZE);
    unsigned int hashvalue = 0;
    for(unsigned int i = 0; i < index; i++){
        hashvalue += (unsigned int) name[i];
        // get the total size of the table;
        hashvalue = hashvalue *(unsigned int)name[i] % Table_size; // modulo ensures hashTable stays within bounds
}
    return hashvalue %Table_size;

}

bool insert_into_hashTable(char * name, int age){
    unsigned int index = hash_function(name);
    unsigned int originalIndex = index;
    
    person *personObject = malloc(sizeof(person));
    if(personObject == NULL){
        return false;
    }

    strncpy( personObject ->name, name, MAX_SIZE);
    personObject ->name[MAX_SIZE -1] = "\0";
    personObject -> age;
    personObject ->next = NULL;

    if(hash_Table[index == NULL]){
        hash_Table[index] = personObject;
    }else{
        person *currentIndex = hash_Table[index];
        while(currentIndex !=NULL){
            currentIndex = currentIndex ->next;
        }
            currentIndex = personObject;

    }
    index = (index + 1) % Table_size;
    if(index == originalIndex){
        return false;
    }
    hash_Table[index] = personObject;
    return true;
}

person* search_person(char* name){
    unsigned int index = hash_function(name);

    person* currentIndex = hash_Table[index];

    while(currentIndex != NULL){
        if(strncmp(currentIndex ->name, name, MAX_SIZE) == 0){
            return currentIndex; // person object found!
        }
        currentIndex = currentIndex -> next;
    }
    return NULL;
}

person* delete_person(char *name){
    unsigned int  index = hash_function(name);

    person* currentIndex = hash_Table[index];
    person* prev = NULL;
    while(currentIndex !=NULL  && strncmpy(currentIndex -> name, name, MAX_SIZE) !=0){
        prev = currentIndex;
        currentIndex = currentIndex -> next;

    }

    if(currentIndex ==NULL){
        return NULL;
    }

    if(prev == NULL){
        hash_Table[index] = currentIndex ->next;
    } else{
        prev ->next = currentIndex -> next;
    }

    currentIndex ->next = NULL;
    return currentIndex;

}

void printTable(){
    for(int i = 0; i < Table_size; i++){
        if(hash_Table[i] == NULL){
            printf("\t\%d\t----\n", i);
        }else{
            person *current = hash_Table[i];
            while (current !=NULL)
            {
            printf("%t%i\t%s\t%d.....\n", i, current ->name, current ->age);
                current = current -> next;
            }
            
        }
    }
}

int main(){
    
initialize_HashTable();

if(insert_into_hashTable("JohnQ", 56 )){
    printf("user with name %s\n inserted into hashTable", "JohnQ");

}else{
    printf("no records of user with name %s\n found", "JohnQ");
}

person* deletePerson = delete_person("JohnQ");

if(deletePerson != NULL){
    printf("username with name JohnQ deleted!");
}else{
    printf("no user with this record found!");
}

    return  0;
}


