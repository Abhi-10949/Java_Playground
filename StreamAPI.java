
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,2);
        // NOTE: Stream is used only once and we can't use it again.
        // Stream<Integer> s1 = nums.stream(); 
        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e)-> c+e);


        Stream<Integer> sortedValues = nums.stream()
                         .filter(n -> n%2 == 0)
                         .sorted();
                        //  .map(n -> n*2)
                        //  .reduce(0, (c,e) -> c+e);

        // System.out.println(sortedValues);
        sortedValues.forEach(n -> System.out.println(n));

        // s1.forEach(n -> System.out.println(n));
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n-> System.out.println(n));
        

        // explaination of forEach with the Consumer
        // Consumer<Integer> con = n -> System.out.println(n); // this is the lambda exp.
        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };
        // nums.forEach(con);

        // nums.forEach(n -> System.out.println(n));// this comes under the List interface.

        // int sum = 0;
        // for(int n : nums){
        //     if(n%2 == 0){
        //         n = n*2;
        //         sum = sum + n;
        //         System.out.print(" "+n+" ");
        //     }
        // }
        // System.out.print(": ");
        // System.out.println(sum);
    }
}
