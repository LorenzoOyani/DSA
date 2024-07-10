package properHashTable.Objects_classes;

import java.beans.JavaBean;
import java.util.*;

@JavaBean
class StudentCollection implements studentRepository {

private StudentNode studentList; // class composition

public StudentCollection(StudentNode list){
    studentList.setStudentData(list.getStudentRecord());
   
}

StudentCollection(){};    

public void addStudentRecord(StudentRecord record){
    StudentNode newNode = new StudentNode();
    newNode.setStudentData(record);
    newNode.setNext(studentList);
    studentList = newNode;

}

public StudentRecord RecordWithNumber(int num){
    StudentNode listNodes = getStudentNodeList();
    while (listNodes.getStudentRecord().id != num) {
        listNodes = listNodes.getNext();
        
    }
    if(listNodes.getNext() == null){ // a special case of when there is no next student in the list;
        StudentRecord record = new StudentRecord(-1, -1, " "); // returned a dummy list of student instead of ouputting null;

        return record;

    }else{
        return listNodes.getStudentRecord();
    }
}

public  StudentNode getStudentNodeList(){
    return studentList;
}

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
        StudentNode temp = getStudentNodeList();
        while(trailingNode !=null){
            trailingNode.setStudentData(null);
         temp = temp.getNext();

        }
    }

}

void deleteRecord(StudentNode studentList){
     if(studentList != null){
        StudentNode temp = studentList;
        studentList = studentList.getNext();
        temp.setNext(null); 

     }
}

// create a deep copy to assign one object properties to the next to avoid shallow-copy cross-linking

StudentNode copyList(List<StudentNode> list, StudentRecord record){
    if(list == null){
        return null;
    }

    studentList = new StudentNode();
    for(int i = 0; i < list.size(); i++){
        if(list.size() > 0){
            StudentNode listObject = list.get(i);
            listObject.setStudentData(record);
            studentList.setStudentData(record);
            studentList.setNext(listObject);
            StudentNode modifiedStudentNode = studentList;

          StudentNode copiedObject =  deepCopyObject(modifiedStudentNode, record);
            
          return copiedObject;

        } else{
            break;
        }
}
    

    return null;

}

StudentNode deepCopyObject(StudentNode studentList, StudentRecord record){
    while (studentList != null) {
        
    }
    

    return null;
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
