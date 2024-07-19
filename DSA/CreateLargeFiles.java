package DSA;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*create and display*/

public class CreateLargeFiles {
public static void main(String[] args) {
    try{
        DataOutputStream outputStream = new DataOutputStream
        (new BufferedOutputStream(new FileOutputStream("file.txt"), 0));

        for(int i = 0; i < 80000004; i++){
            outputStream.write((int) (Math.random() * 1000000));

        }
        outputStream.close();

        // read like 100 files from the txt file;
        DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("file.txt")));
        for(int i =0; i < 100; i++){
            inputStream.readInt();
        }

        inputStream.close();
    }catch( IOException e){
        throw new RuntimeException(e.getMessage());
    }
  
}    
}
