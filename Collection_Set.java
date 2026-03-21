
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {
    public static void main(String[] args) {
        /*
        NOTE:
        Set is the collection of "unique-value" 
        Set does not have the index value.
        Set do not have the sorted value (for HashSet but it is for TreeSet)
        */

        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(52);
        nums.add(43);
        nums.add(84);
        nums.add(10);
        nums.add(39);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        // for(int n: nums){
        //     System.out.println(n);
        // }
    }
}
