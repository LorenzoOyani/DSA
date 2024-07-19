package DSA;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class SortFiles {

    public static void initializeSegments(int segments, String originalFile, String file){
        try{
            DataInputStream inputStream = new DataInputStream
            (new BufferedInputStream(new FileInputStream(originalFile)));
            DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            int[] list = new int[segments];
            
            int numberOfFileSegments = 0;
            while(inputStream.available() > 0){
                numberOfFileSegments++;

                int i = 0;
                for(; inputStream.available() > 0 && i < numberOfFileSegments; i++){

                    list[i] = inputStream.readInt();
                }
                Arrays.sort(list, 0, i); // sort the input file!

                for(int j = 0; j < i; j++){
                    outputStream.writeInt(j);
                    
                }

                copyFirstHalfSegment(segments, inputStream, outputStream);
            }
          inputStream.close();
          outputStream.close();

        }catch(IOException e){
            throw new RuntimeException(e.getMessage());

        }
      


    }

    static void copyFirstHalfSegment(int segments, DataInputStream inputStream, DataOutputStream outputStream) throws IOException{
        int firsthalfSegs = segments /2;
        for(int i = 0; i < firsthalfSegs * segments; i++){ // ensure integrity between array values
            outputStream.writeInt(inputStream.readInt());

        }

    }


    
}
