
import java.util.Scanner;

public class thirtytwo{
    public static void main(String[] args) {
        //to find the Radix->[the parameter that specifies the
        // number system to be used. For example, binary = 2, octal = 8,
        // hexadecimal = 16, etc.]of a number given in the String
        String num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        num=sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("Binary radix is:2");
        }
        else if (num.matches("[0-7]+")) {
                System.out.println("Octal radix is:8");
            }
            else if(num.matches("[0-9]+")){
                System.out.println("Decimal radix is:10");
            }
            else if(num.matches("[0-9A-F]+")){
                System.out.println("Hexadecimal radix is:16");
            }
            else 
            System.out.println("This is not a number!!");
    }
}