package DSA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scan {

    public static void main(String[] args) {
        
        if(args.length != 2){
            System.out.println("usage; to read from a file");
        }

        File file = new File("scannerFile.txt");
        if(file.exists()){
            System.out.println("this file already exist");
            return;
        }

        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                String firstName = sc.next();
                String lastName = sc.next();
                int age = sc.nextInt();

                sc.next();
                System.out.format("firstname: %s\n, lastname: %s\n, age: %d\n", firstName, lastName, age);
                
            }



            sc.close();

        }catch(FileNotFoundException e){
            e.getMessage();
        }
    }

}
