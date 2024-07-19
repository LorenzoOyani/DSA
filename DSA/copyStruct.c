#include <stdio.h>
#include <stdlib.h>
#include<stdbool.h>


#define NAME_SIZE 256

#define ARRAY_SIZE 10

typedef struct person{
    int id;
    char *name[NAME_SIZE];
    struct person *next;

} person;

person *person_table[ARRAY_SIZE];

void  intializePersonTable(){
    for(int i = 0; i < ARRAY_SIZE; i++){
        person_table[i] = NULL;
    }
}

unsigned int hashFuntion(char *name){
    unsigned int nameLen = strnlen(name, NAME_SIZE);
    unsigned int hashValue = 0;
    for(int i=0; i < nameLen; i++){
        hashValue= (unsigned int) hashValue  * name[i];
        hashValue = (unsigned int) (hashValue * name[i]) % ARRAY_SIZE;
    }

return hashValue % ARRAY_SIZE;


}

bool insertIntoPerson(int id, char * name){

    int hashed = hashFunction(name);

    int originalPtr=hashed;
    person *person_ptr = malloc(sizeof(person));

    if(person_ptr == NULL){
        return false;
    }

    strncpy(person_ptr ->name, name, NAME_SIZE);
        person_ptr->name[NAME_SIZE - 1] = "\0";
        person_ptr ->id;
        person_ptr->next = NULL;

        if(person_table[hashed] == NULL){
            person_table[hashed] = person_ptr;

        }else{
            person *currentIndex = person_table[hashed];
            while(currentIndex !=NULL){
                currentIndex=currentIndex->next;
            }
            currentIndex=person_ptr;
        }
hashed = (hashed +1) % ARRAY_SIZE;

if(hashed == originalPtr){
    return false;
}

person_table[hashed]=person_ptr;
return true;

}

person*  searchPerson(char   *name){
    int hashName=hashFuntion(name);

    person *currentPerson=person_table[hashName];
    while(currentPerson!=NULL){
        if(strncmpy(currentPerson->name, name, NAME_SIZE)){
            return  currentPerson;
        }
        currentPerson =  currentPerson->next;
    }
    return  NULL;   //incase The person is  not found!
}

void  printListOfPersons(){
for(int i  =0; i <ARRAY_SIZE; i++){
    if(person_table[i] =NULL){
        printf("\t\%d\t\------------n", i);
    }else{
        person  *currentPerson  = person_table[i];
        while(currentPerson!=NULL){
            printf("This person id  &   name    is", currentPerson->id,   currentPerson->name);
            currentPerson   =currentPerson->next;

        }
    }
}

}

person* deletePerson(char*name){

}

int main(){
    intializePersonTable();
    person firstPerson = {.id = 1, .name = "john boyega"};
    if(insertIntoPerson(firstPerson.id,  firstPerson.name)){
        printf("inserting %p into table is successful", firstPerson);
    }else{
        printf("no user with these records!");
    }

    printListOfPersons();
  

}