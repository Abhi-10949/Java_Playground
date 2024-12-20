
import java.util.Scanner;


public class J40_binToDecimal {

    public static void binToDecimal(int binNum){
        int myNum = binNum;
        int decimalNum = 0;
        int power = 0;

        while(binNum > 0){
            int lastDig = binNum % 10;
            decimalNum += lastDig * Math.pow(2, power);
            binNum = binNum / 10;
            power++;
        }
        System.out.println("The decimal number of "+myNum+" is: "+decimalNum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();
        binToDecimal(binNum);
    }
}
