
import java.util.Scanner;

public class fourtyfive {
    public static void main(String[] args) {
        //display the digits of a number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int r;

        while(n>0){
            r=n%10;  //<=--to find the remainder
            n=n/10;  //<=--to get the remainder as a number
            System.out.println(" "+r+" ");
        }
        
    }
}
