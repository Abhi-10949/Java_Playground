
import java.util.Scanner;

public class fourtyfour {
    public static void main(String []args){
        //to find the Factorial of a number-->
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the number "+n+"is :"+fact);
    }
}
