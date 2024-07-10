package properHashTable.Objects_classes;

public class StudentNode implements Grades {

    
    private  StudentRecord studentData;  // composition
    private  StudentNode next;

    private int newGradeStructure;

    public StudentNode(StudentRecord studentRecord, StudentNode next){
        this.studentData = studentRecord;
        this.next = next;
    }

    public StudentNode(){
        this.studentData = new StudentRecord();
        this.next = null;
    };

    public void setStudentData(StudentRecord studentRecord){
        this.studentData = studentRecord;
    }

    public void setGrades(int newGrades){
        this.newGradeStructure = newGrades;
        
    }

    public int grade(){
        return newGradeStructure;
        
    }

    public StudentRecord getStudentRecord(){
        return studentData;
    }

    public void setNext(StudentNode next){
        this.next = next;

    }
    public StudentNode getNext(){
        return next;
    }

};
