
import java.util.Scanner;

public class fourtyeight {
    public static void main(String[] args) {
        //reverse of a number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int reverse=0,r;

        while(n>0){
            r=n%10;
            reverse=reverse*10+r;
            n=n/10;
            
        }
        System.out.print(reverse);
    }
}
