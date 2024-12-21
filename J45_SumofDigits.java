import java.util.Scanner;

public class J45_SumofDigits {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int lastDig = n% 10;
            sum += lastDig;
            n /=10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of "+n+ " is: "+sumOfDigits(n));
    }
}
