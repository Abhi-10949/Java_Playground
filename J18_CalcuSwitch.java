import java.util.Scanner;

public class J18_CalcuSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'a' :");
        float a = sc.nextFloat();
        System.out.print("Enter 'b' :");
        float b = sc.nextFloat();
        char operation = sc.next().charAt(0);

        switch (operation){
            case '+': System.out.println("Addition:"+(a+b));
            break;

            case '-': System.out.println("Substruction:"+(a-b));
            break;

            case '*': System.out.println("Multipication:"+(a*b));
            break;

            case '/': System.out.println("Division:"+(a/b));
            break;

            case '%': System.out.println("Moudulous:"+(a%b));
            break;

            default: System.out.println("Our calculator is not for higher operation!");
        }
    }
}
