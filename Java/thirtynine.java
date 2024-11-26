
import java.util.Scanner;

public class thirtynine {
    public static void main(String[] args) {
        //make a menu driven program for arithmetic operation
        Scanner sc=new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter the two number :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();//to read the options
        System.out.println("Enter Options in words:");
        String option=sc.nextLine();
        option=option.toUpperCase();

        switch(option){
            case "ADD": System.out.println("Sum is :"+(x+y));
            break;

            case "SUB": System.out.println("Subtraction is :"+(x-y));
            break;

            case "MUL": System.out.println("Multiplication is :"+(x*y));
            break;

            case "DIV": System.out.println("Division is :"+(x/y));
            break;
            
            default:System.out.println("Oops!! Enter the menu options only");
            break;
        }
    }
}
