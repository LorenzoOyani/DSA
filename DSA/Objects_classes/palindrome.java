package DSA.Objects_classes;
import java.io.IOException;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) throws IOException {

     System.out.println("enter a palindrome value:" );

    
     try(Scanner scanner = new Scanner(System.in)){
        while(true){
             String s = scanner.nextLine();

            if(s.equals("end")){

                break;
            }
            System.out.println("is this a palindrome string?: ");

            if(!isPalindrome(s)){
                System.out.println("entered string not a palindrome");
                return;
            }
        }
       

     }

     }

    

   static boolean isPalindrome(String s){
        if(s == null || s.isEmpty()){
            return false;
        }

      String s1 =   filterString(s);

      String s2 =   reverse(s);

      return s1 == s2;

    }

    static String filterString(String s){
        StringBuilder sb = new StringBuilder();

       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
                break;
            }
       }
       return sb.toString();
    }


    static String reverse(String s){

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        return sb.toString();

        

}


}
