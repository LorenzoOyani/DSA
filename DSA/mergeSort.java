package DSA;

public class mergeSort {

    public static void mergeSorts(int[] arr){
        int firsthalfLength = arr.length; 
        int[] firsthalf = new int[firsthalfLength / 2];

        int secondHalfLength = arr.length - arr.length /2;

        int[] secondhalf = new int[secondHalfLength];

        merge(firsthalf, secondhalf, arr);
    }



    static void merge(int[] firsthalf, int[] secondhalf, int[] returnedList){
        // int[] list1 = new int[firsthalf.length];
        // int[] list2 = new int[secondhalf.length];

        int currentPos1 = 0;
        int currentPos2 = 0;
        int currentPos3 = 0;

        while(currentPos1 < firsthalf.length && currentPos2 < secondhalf.length){
            if(firsthalf[currentPos1] < secondhalf[currentPos2]){
                returnedList[currentPos3] = firsthalf[currentPos1++];
            }else{
                returnedList[currentPos3] = secondhalf[currentPos2++];
            }
        }

        // copy the rest of the half length each into the array;
        while (currentPos1 < firsthalf[currentPos1]) {
            returnedList[currentPos3++] = secondhalf[currentPos1++];
            
        }

        while(currentPos2 < secondhalf[currentPos2]){
            returnedList[currentPos3++] = firsthalf[currentPos2++];
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 0, 1, 7, 9, 4};

        mergeSorts(arr);
        for(int  i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
