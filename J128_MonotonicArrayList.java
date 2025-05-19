
import java.util.Arrays;
import java.util.List;


public class J128_MonotonicArrayList {
    public static boolean isMonotonic (List<Integer> nums){
            boolean increment = true;
            boolean decrement = true;

            for(int i = 1;i<nums.size();i++){
                if(nums.get(i)<nums.get(i-1)){
                    increment = false;
                }
                if(nums.get(i)>nums.get(i-1)){
                    decrement = false;
                }
            }
            return increment || decrement;
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,2,3,4,4);
        List<Integer> list2 = Arrays.asList(1,3,2,4);

        System.out.println(isMonotonic(list1));
        System.out.println(isMonotonic(list2));
    }
}
