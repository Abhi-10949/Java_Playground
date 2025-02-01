
import java.util.Scanner;

public class J92_BitMaskOddEven {
    public static void OddEven(int n){
        int bitmask = 1 ;
        if((n & bitmask)==0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        OddEven(n);
    }
}
