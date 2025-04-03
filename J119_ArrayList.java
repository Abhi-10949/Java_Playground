
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

        // list.add(1,9); // O(n)
        // System.out.println(list);

        for(int i =list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Get element 
        // int element = list.get(2);
        // System.out.println(element);

        //Remove Elements
        // list.remove(2);
        // System.out.println(list);

        // Set funtion
        // list.set(2, 10);
        // System.out.println(list);

        //contain elements return: true or false 
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }
}
