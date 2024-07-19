package DSA;

import java.util.ArrayList;

// modelling a  binary tree heap with an arrayList implementation

public class HeapSort<E extends Comparable<E>> {
    private  ArrayList<E> list = new ArrayList<>(); //  a list to store values;


    HeapSort(){};

    HeapSort(E[] objects){
        for(int i = 0; i < objects.length; i++){
            add(objects[i]);
        }
    }

    void add(E object){
        list.add(object); // append to the heap;

        int currentIndex = list.size() - 1; // ELEMENT AT THE END OF THE LIST
        while(currentIndex > 0){
            int parentIndex = currentIndex - 1 / 2;
            if(list.get(parentIndex).compareTo(list.get(currentIndex)) > 0){
                E temp = list.get(currentIndex);
                list.set(0, list.get(parentIndex));
                list.set(parentIndex, temp);
                
        }else{
                break; // return a heap;
            }
            currentIndex = parentIndex;
        }

}


//return  the current  eleement always after deletions or removsl from a list
public E remove(){ // remove anObject
 if(list.size() == 0){
    return null;
 }     
  
 E currentNode = list.getFirst(); 

 list.set(0,  list.get(list.size()-1));
 list.remove(list.size() - 1);

 int currentIndex = 0;
 while(currentIndex > 0){
    int leftCurrentIndex =2*currentIndex  + 1;
    int rightCurrentIndex  =  2 *currentIndex + 2;

    //swapping children to get the maximum
    int maxIndex =  leftCurrentIndex;

    if(rightCurrentIndex < list.size()){
        if(leftCurrentIndex >= list.size())break;
        if(list.get(maxIndex).compareTo(list.get(rightCurrentIndex)) < 0){
            maxIndex = rightCurrentIndex;
     }
}
// swapping nodes
    if(list.get(currentIndex).compareTo(list.get(maxIndex)) < 0){
        E temp = list.get(maxIndex);
        list.set(maxIndex, list.get(currentIndex));
        list.set(currentIndex, temp);


    }else{
        break;
    }

}

return currentNode;
}






    
}
