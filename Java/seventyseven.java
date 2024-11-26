
import java.util.Scanner;

public class seventyseven {
// constant complaxity analysis
    public static void checkEvenOdd(int N){
        
        
        int r=N%2;
        if (r==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int N=sc.nextInt();
        
        checkEvenOdd(N);
    }
}
