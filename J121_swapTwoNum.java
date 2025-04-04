
import java.util.ArrayList;
import java.util.Collections;

public class J121_swapTwoNum {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println("This is the swaped list: "+list);

        //sorting the array using collections class in arraylist 
        Collections.sort(list);  //This will sort the list in ascending order
        System.out.println("This is the sorted list: "+list);

        // to sort in descending order 
        Collections.sort(list, Collections.reverseOrder());
        // Collections.reverseOrder() : this is the comparitor (which is the function and build the logic)
        System.out.println("This list is in descending order: "+list);
    }
}
