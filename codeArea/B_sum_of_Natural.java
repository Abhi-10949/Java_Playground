import java.util.*;
public class B_sum_of_Natural {
    public static void main(String[] args){
        int sum=0;
        System.out.println("Enter the number of terms:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            sum= sum+i;
        }
        System.out.println("The sum of N natural number is:"+sum);
    }
}
