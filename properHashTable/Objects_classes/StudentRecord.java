package properHashTable.Objects_classes;

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


    String letterGrade(){
        if(!isvalideGrade(grade)){
            throw new RuntimeErrorException(null);
        }
      final int NUMBERCATEGORIES = 11;
      final String[] gradeLetter = new String[]{"F", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
      final int[] gradeScore = new int[]{0, 60, 67, 70, 73, 77, 80, 83, 87, 90, 93};

      int category = 0;
      while (category < NUMBERCATEGORIES && gradeScore[category]  <= grade ) {
        category++;
        
      }

        return gradeLetter[category - 1];
    }
    
}
