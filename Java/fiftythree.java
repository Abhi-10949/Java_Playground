
import java.util.Scanner;

public class fiftythree{
    public static void main(String[] args) {
        //Display the fibonacci series:--
        Scanner sc = new Scanner(System.in);
        System.out.println("Displaying the Fibonacci Series:-");
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();

        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
}