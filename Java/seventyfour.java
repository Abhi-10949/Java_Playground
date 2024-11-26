
import java.util.Arrays;

public class seventyfour {
    //sorting of the array
    public static void main(String[] args) {
        int A[]={3,42,2,52,1,45,23};
        System.out.println("The original array is: ");
        for(int i=0; i<A.length;i++){
            System.out.println(" "+A[i]);
        }
        Arrays.sort(A);   //sorting function for the arrays
        System.out.println("The sorted array is: ");
        for(int i=0; i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
