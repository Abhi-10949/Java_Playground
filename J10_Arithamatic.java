
import java.util.Scanner;


public class J10_Arithamatic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Substruction:"+(a-b));
        System.out.println("Multipication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulo:"+(a%b));

        System.out.println(!(4<3)); // logical not operator.
    }
}
