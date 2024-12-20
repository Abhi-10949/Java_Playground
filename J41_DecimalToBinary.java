import java.util.*;

public class J41_DecimalToBinary {

    public static void DecimalToBin(int n){
        int myNum = n;
        int myBin = 0;
        int power = 0;

        while(n > 0){
            int remainder = n % 2;
            myBin += remainder*Math.pow(10, power);
            power++;
            n/=2;
        }
        System.out.println("Binary form of "+myNum+" is "+myBin);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        DecimalToBin(n);
    }
}
