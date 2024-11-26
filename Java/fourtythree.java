
import java.util.Scanner;

public class fourtythree{
    public static void main(String[] args) {
        //sum of n natural number 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of the "+n+ " number is : "+sum);
    }
}