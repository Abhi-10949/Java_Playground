
import java.util.LinkedList;

public class J130_LL_JCF {
    public static void main(String []args){
        // create - we use objets as link Integer, Float, Character, Boolean
        LinkedList<Integer> ll = new LinkedList<>();
        
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll); 

        // remove 
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
