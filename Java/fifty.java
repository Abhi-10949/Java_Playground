
import java.util.Scanner;

public class fifty{
    public static void main(String[] args) {
        //to print the number in words with the tailing zero also

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int r;
        String str="";

        while(n>0){
            r=n%10;
            n=n/10;
            str=str+r;//concatenation of the string
        }

        System.out.println("Reverse of the number is :"+str);

        char c;

        for(int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            System.out.print(" ");
            switch(c){
                case '0':System.out.print("Zero");
                break;

                case '1':System.out.print("One");
                break;

                case '2':System.out.print("Two");
                break;

                case '3':System.out.print("Three");
                break;

                case '4':System.out.print("Four");
                break;

                case '5':System.out.print("Five");
                break;

                case '6':System.out.print("six");
                break;

                case '7':System.out.print("Seven");
                break;

                case '8':System.out.print("Eight");
                break;

                case '9':System.out.print("Nine");
                break;

            }
        }
    }
}