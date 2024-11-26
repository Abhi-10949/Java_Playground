
import java.util.Scanner;

public class fourtyseven {
    public static void main(String[] args) {
        //finding the no. is armstrong or not

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int m,r;
        m=n;
        int sum=0;

        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        System.out.println("Sum is "+sum);

        if(m==sum){
            System.out.print("This is the Armstrong number.");
        }
        else{
            System.out.print("This is not an Armstrong number.");
        }

    }
}
