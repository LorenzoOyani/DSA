package DSA;

public class Quicksort {

    public static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low =first + 1;
        int high = last;


        while(low <= high && list[low] <= pivot){
            low++;
        } 
        while (low <= high && list[high] > pivot) {
                high--;        
        }

        // sort by swapping places with high and low ints

        if(high > low){
            int temp = list[low];
            list[low] = list[high];
            list[high] = temp;
        }

        // check condition for pivot swap;

        while(high > first && list[high] > pivot){
            high--;
        }

        if(pivot > list[high]){
         list[first] = list[high];
         list[high] =   pivot;
         return high; 
        }else{
            return first;
        }
    }

   static void quicksort(int[] list, int low, int high){
        if(high  > low){
            int pivot = partition(list, low, high);
            quicksort(list, low, pivot -1);
            quicksort(list, pivot + 1, high);
        }

    }
    public static void main(String[] args) {
        int[] list = new int[]{4, 0, 9, 2, 1};
        quicksort(list, 0, list.length -1);
    }
    
}
