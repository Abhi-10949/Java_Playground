
import java.util.Scanner;

public class sixtynine_mini_project {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //for taking the input from user
        int mynum=(int)(Math.random()*100); //for taking the number b/w 1-100
        int usernum=0;

        do{
            System.out.print("Guess the number (1-100):");
            usernum=sc.nextInt();

            if (usernum==mynum) {
                System.out.println("Correct Number!!");
                break;
            }
            else if (usernum>mynum) {
                System.out.println("Number is too large");
            }
            else{
                System.out.println("Number is too small");
            }
        } while(usernum>=0);  //number entered is always greater than 0 (true)

        System.out.println("My Number was:");
        System.out.println(mynum);  //to print directly mynuber with enterig the -ve value
    }
}