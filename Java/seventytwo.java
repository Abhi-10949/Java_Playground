
import java.util.Scanner;

public class seventytwo {
    public static void main(String[] args) {
        //Searching an element
        int A[]={34,23,53,234,143,2535,3};
        System.out.print("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        for(int i=0; i<A.length; i++){
            if(key==A[i]){
                System.out.println("Number found: "+A[i]);
                System.exit(0); //to stop the execution further 
            }
        }
        System.out.println("Not found!!");
    }
}
