
import java.util.ArrayList;

public class J119_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Float> list2 = new ArrayList<>();

        //adding the elemets to the arrayList with the T.C= O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        //Get element 
        // int element = list.get(2);
        // System.out.println(element);

        //Remove Elements
        // list.remove(2);
        // System.out.println(list);

        // Set funtion
        list.set(2, 10);
        System.out.println(list);
    }
}
