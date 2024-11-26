
import java.util.Scanner;

public class fourtynine {
    public static void main(String[] args) {
        //to check if the number is Palindrome
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int m=n;
        int reverse=0,r;

        while(n>0){
            r=n%10;
            reverse=reverse*10+r;
            n=n/10;

        }

        if(reverse==m){
            System.out.print("The number is Palindrome.");
        }
        else{
            System.out.print("The number is'nt Palindrome.");
        }
    }
}
