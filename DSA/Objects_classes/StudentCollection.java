package DSA.Objects_classes;

import java.beans.JavaBean;
import java.util.*;

@JavaBean
class StudentCollection implements studentRepository {

private StudentNode studentList; // class composition

public StudentCollection(StudentNode list){
    if(list != null){
        this.studentList = new StudentNode();
        this.studentList.setStudentData(list.getStudentRecord());
        this.studentList.setNext(list.getNext());
        
    }
   
}

StudentCollection(){
    this.studentList = null;
};    

@Override
public void addStudentRecord(StudentRecord record){
    StudentNode newNode = new StudentNode();
    newNode.setStudentData(record);
    newNode.setNext(studentList);
    studentList = newNode;

}
@Override
public StudentRecord RecordWithNumber(int num){
    StudentNode listNodes = getStudentNodeList();
    while (listNodes != null && listNodes.getStudentRecord().id != num) {
        listNodes = listNodes.getNext();
        
    }
    if(listNodes.getNext() == null){ // a special case of when there is no next student in the list;
        StudentRecord record = new StudentRecord(-1, -1, " "); // returned a dummy list of student instead of ouputting null;

        return record;

    }else{
        return listNodes.getStudentRecord();
    }
}

public StudentNode getStudentNodeList(){
       return  this.studentList = new StudentNode();
}
@Override
public void removeRecord(int num){
    StudentNode studentNodeList = getStudentNodeList();
    StudentNode trailingNode = null;
    while (studentNodeList != null && studentNodeList.getStudentRecord().id != num) {
         trailingNode = studentNodeList;
         studentNodeList = studentNodeList.getNext();
    }
    if(studentNodeList ==  null){
        return;
    }
    
    if(trailingNode == null){
        studentNodeList = studentNodeList.getNext();
    }else{
       trailingNode.setNext(studentNodeList.getNext());
    }

}

void deleteRecord(StudentNode studentList){
     if(studentList != null){
        studentList.setStudentData(null);
        studentList.setNext(null); 
        

     }
}

// create a deep copy to assign one object properties to the next to avoid shallow-copy cross-linking

StudentNode copyList(List<StudentNode> list, StudentRecord record){
    if(list == null || list.isEmpty()){
        return null;
    }

    StudentNode dummyNode = new StudentNode();
    StudentNode copyList = dummyNode;
    for(StudentNode node : list){
        StudentNode newNodes = new StudentNode();
        newNodes.setStudentData(new StudentRecord(record.id, record.grade, record.newName));
        copyList.setNext(node);
        copyList = newNodes;
    }
   return dummyNode.getNext();
}

StudentNode deepCopyObject(StudentNode studentList, StudentRecord record){
   if(studentList == null){
    return null;
   }

   StudentNode newNode = new StudentNode();
   newNode.setStudentData(new StudentRecord(studentList.getStudentRecord().id, studentList.getStudentRecord().grade, studentList.getStudentRecord().newName));
   newNode.setNext(deepCopyObject(studentList.getNext(), record));

   return newNode;
}

// test
public static void main(String[] args) {
    StudentCollection s1 = new StudentCollection();
    StudentCollection s2 = new StudentCollection();

    StudentRecord records1 = new StudentRecord(1, 70, "John");
    s2.addStudentRecord(records1);
    StudentRecord records2 = new StudentRecord(2, 65, "Mike");

    s2.addStudentRecord(records2);
    s1 = s2; // A potential dangerous cross-linking waiting to happen!


}

}
