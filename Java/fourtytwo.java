
import java.util.Scanner;

public class fourtytwo {
    public static void main(String[] args) {
        //display multiplication table for a number
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        }
    }
