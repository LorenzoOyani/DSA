package DSA;

import java.util.ArrayList;

public class RenewedHeap<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();


    RenewedHeap(E[] objects){
        for(int i= 0; i < objects.length; i++){
            addToHeap(objects[i]);
        }
    }


    void addToHeap(E object){
        list.add(object);

        int currentObjIndex = list.size() -1;

        while(currentObjIndex > 0){
            int parentObjIndex = currentObjIndex - 1 / 2;
            if(list.get(parentObjIndex).compareTo(list.get(currentObjIndex)) > 0){
                E temp = list.get(currentObjIndex);
                list.set(0, list.get(parentObjIndex));
                list.set(parentObjIndex, temp);
            }else{
                break;
            }
          currentObjIndex = parentObjIndex;
        }
    }


    public E remove(){
        if(list.size() == 0){
            return  null;
        }

        E currentIndex = list.getFirst();
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentNodeIndex = 0;
        while(currentNodeIndex > 0){
            int leftCurrentIndex = 2 * currentNodeIndex + 1;
            int rightCurrentIndex = 2 * currentNodeIndex + 2;

            int maxIndex = leftCurrentIndex;

            if(rightCurrentIndex < list.size()){
                if(leftCurrentIndex > list.size()) break;
                if(list.get(maxIndex).compareTo(list.get(rightCurrentIndex)) < 0){
                    maxIndex = rightCurrentIndex;
                }
            }
            
            if(list.get(currentNodeIndex).compareTo(list.get(maxIndex)) < 0){
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentNodeIndex));
                list.set(currentNodeIndex, temp);

            }else{
                break;
            }
        }

        return currentIndex;


    }
    
    
}
