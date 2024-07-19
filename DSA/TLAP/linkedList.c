#include <stdio.h>

#define ARRAY_SIZE 10

struct node{
    int studentNum;
    int grade;
    struct node *next;
};




typedef struct node studentCollection;


studentCollection sc;

void findHighestGrade(){ // criterion-search!
    studentCollection student[] = {ARRAY_SIZE};
    int highestStudent = student[0].grade;

    for(int i = 1; i <ARRAY_SIZE; i++){
        int averageGrades = student[i].grade;
        if(averageGrades > highestStudent){
            highestStudent = averageGrades;
        }

       
    } 

}

double averageNodes(int grades){
    int count = 0; 
    int sum = 0;
    studentCollection *nodes = grades;
    while(nodes->next !=NULL){
        sum += nodes->grade;
        count++;
        nodes = nodes ->next;
 }
    double avergeStudentGrades = sum / count;

    return avergeStudentGrades;
}

int main(){

}
void createNodes(int num, int grades){
    studentCollection *node1 = malloc(sizeof(studentCollection));
    studentCollection *node2 = malloc(sizeof(studentCollection));
    studentCollection *node3 = malloc(sizeof(studentCollection));

    node1 ->studentNum = num;
    node1 ->grade = grades;
    node1 -> next = NULL;

    node2 ->studentNum = num;
    node2 ->grade = grades;
    node2 -> next = NULL;

    node3 ->studentNum = num;
    node3 ->grade = grades;
    node3 -> next = NULL;

    studentCollection *temp = node1;

    node1 ->next = node2;
    studentCollection *temp1 = node2;
    node2 -> next = node3;
    node1 = node2 = node3 = NULL;

}