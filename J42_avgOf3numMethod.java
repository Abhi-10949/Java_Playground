
import java.util.Scanner;


public class J42_avgOf3numMethod {

    public static int avgOfNum(int a, int b , int c){
        int sum = a+ b+ c;
        int average = sum/3;
        
        return average;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("The average of the 3 number: "+avgOfNum(a, b, c));
        }
    }

