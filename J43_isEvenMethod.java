import java.util.Scanner;

public class J43_isEvenMethod {

    public static boolean isEven(int n){
        boolean isEven = false;
        if(n % 2 == 0){
            isEven = true;
        }
        else
        System.out.println("Number is Odd.");
        return isEven;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The number "+n +" is "+ isEven(n));
    }
}
