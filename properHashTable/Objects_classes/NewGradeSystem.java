package properHashTable.Objects_classes;

import java.util.Scanner;

public class NewGradeSystem  {

    private static   String[] gradeLetters;
    private static int[] gradeScoreList =  {0, 54, 59, 65, 69, 70, 85, 93};
    private static final int MAX_SIZE = 8;


    static boolean validGradeSystem(int grades[]){
        if(grades == null || grades.length != MAX_SIZE){ // check if the grade array is not null && and grades array has a length of MAX-SIZE;
            return false;
        }

        for(int i = 1; i < grades.length; i++){
            if(grades[i] <= grades[i - 1]){
                return false;
            }
        }

        
        return true;
    } 

    public static String activateNewGradingSystem(int gradings[],  int gradingScore){
        if(!validGradeSystem(gradings)){
            throw new IllegalArgumentException("invalide grading system!");
        }
        gradeLetters = new String[]{"F", "C-", "C+", "B-", "B+", "A-", "A+","A++"};


        for(int i = 1; i <= MAX_SIZE; i++){
          if(gradingScore < gradeScoreList[i]){
           return gradeLetters[i - 1];
          }
            
}

        return gradeLetters[MAX_SIZE -1];

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int newGradings[] = new int[MAX_SIZE];
        int finalGradeScore = 1;
        try{
            
                for(int i =0; i < MAX_SIZE; i++){
                    int input = scanner.nextInt();
                    if(input == -1){
                        break;
                }
                newGradings[i] = input;
              
                } 
                if(validGradeSystem(newGradings)){
                System.out.println("Enter your score between 0 to 100 and (type -1) to exit: ");
                    finalGradeScore = scanner.nextInt();
                    if(finalGradeScore > 0 && finalGradeScore <= 100){
                        String finalGrade = activateNewGradingSystem(newGradings, finalGradeScore);
                        System.out.println("your grades: "+ finalGrade);

                    }
                    
                }else{
                    System.out.println("please enter a valid grade ");;
                }

            }catch(Exception ignored){
            System.out.println("invalid input");
        }
        scanner.close();
    }
    

}
