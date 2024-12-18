import java.util.Scanner;

public class J22_ReverseOfNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        for(;n>0;){
            int lastDig = n%10;
            rev = (rev*10)+lastDig; //This is the formula for the reverse of no. .
            n = n/10;
        }
        System.out.println(rev);


        // for(;n>0;){
        //     int lastDigit = n%10;
        //     System.out.print(lastDigit+" ");
        //     n= n/10;
        // }
        // System.out.println();
    }
}
