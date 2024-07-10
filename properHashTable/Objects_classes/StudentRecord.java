package properHashTable.Objects_classes;

import java.util.Objects;

import javax.management.RuntimeErrorException;


class StudentRecord implements Grades {

    int id;
    int grade;
    String newName;


    // StudentRecord(int id, int grade,  String newName){
    //     setId(id);
    //     setGrades(grade);
    //     setNewName(newName);

    // }

    StudentRecord(int id, int grade,  String newName){
       this.id = id;
       setGrades(grade);
       this.newName = newName;

    }

    StudentRecord(){
        this.id = -1;
        this.grade = 0;
        this.newName = "";
    }

    void setId(int id){
        this.id = id;
    }

  

    void setNewName(String name){
        this.newName = name;
    }

   public void setGrades(int grade){
    if(isvalideGrade(grade)){
        this.grade = grade;
    }else{
        throw new IllegalArgumentException("error: grade must be between 0 and 100");
    }
       
}

   public int grade(){
        return grade;
    }
    

    boolean isvalideGrade(int grade){
        if(grade >0 && grade <=100){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, grade, newName);

    }


    @Override
    public boolean equals(Object o){ // eqaulity between objects checks!!
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        StudentRecord records = (StudentRecord) o;
        
        return id == records.id &&
        grade == records.grade &&
        Objects.equals(newName, records.newName);
}


    String letterGrade(){
        if(!isvalideGrade(grade)){
            throw new RuntimeErrorException(null);
        }
      final int GRADENUMBERCATEGORIES = 11;
      final String[] gradeLetter = new String[]{"F", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
      final int[] gradeScore = new int[]{0, 60, 67, 70, 73, 77, 80, 83, 87, 90, 93};

    //   int category = 0;
    //   while (category < GRADENUMBERCATEGORIES && gradeScore[category]  <= grade ) {
    //     category++;
        
    //   }

    for(int i = 0; i < GRADENUMBERCATEGORIES; i++){
        if(gradeScore[i] <= grade){
           return gradeLetter[i - 1];
        }
    }

        return gradeLetter[GRADENUMBERCATEGORIES -1];
    }
    
}
