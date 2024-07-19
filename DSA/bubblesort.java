package DSA;

public class bubblesort {


    public static void sortList(int[] arrays){

        int length = arrays.length;
        boolean nextPass = true;

       ;
        for( int k = 1; k < length && nextPass; k++ ){
            nextPass =false;
            for(int i = 0; i < length - k; i++){
                if(arrays[i] > arrays[i + 1]){
                    int temp = arrays[i];
                    arrays[i] = arrays[i  +1];
                    arrays[i +1] = temp;
                    nextPass =true;
                }
            }
            
        }

    }
    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2 ,5, 6, 7, 8 ,4 ,0};

        sortList(arrays);
        for(int i =0; i < arrays.length; i++){
            System.out.println(arrays[i]);
        }
    }
    
}
