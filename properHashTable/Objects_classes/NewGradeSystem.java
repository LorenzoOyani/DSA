package properHashTable.Objects_classes;

import java.util.Scanner;

public class NewGradeSystem  {

  private static   String[] gradeLetters;
   private static int gradeScoreList;
    private static final int MAX_SIZE = 8;


    static boolean validGradeSystem(int grades[]){
        

        return false;
    } 

    public static String activateNewGradingSystem(Integer gradings[],  int gradingCount){
        if(!validGradeSystem(gradings)){
            return "ERROR";
        }
         gradings = new Integer[]{0, 54, 59, 65, 69, 70, 85, 93};
        gradeLetters = new String[]{"F", "C-", "C+", "B-", "B+", "A-", "A+","A++"};


        int gradeCategory = 1;
        for(int i = 1; i <= MAX_SIZE; i++){
            while(gradingCount < MAX_SIZE && gradings[gradeCategory] < gradeScoreList){
                gradingCount++;
            }
            
}

        return gradeLetters[gradeCategory -1];

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer newGradings[] = new Integer[MAX_SIZE];
        int finalGradings = 1;

        try{
                int input = scanner.nextInt();
                while(input != -1){
                    if(input > 0){
                  finalGradings =newGradings[input];
                    }else{
                        break;
                    }
            }
             String finalGrades =    activateNewGradingSystem(newGradings, finalGradings);

        }catch(Exception ignored){
        }
        scanner.close();
    }
    

}
