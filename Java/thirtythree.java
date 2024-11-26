
import java.util.Scanner;

public class thirtythree {
    public static void main(String[] args){
        //to check wether the year is leap year or not
        
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year :");
        year=sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It's a leap year");
                }
                else{
                    System.out.println("It's not a leap year");
                }
            }
            else{
                System.out.println("It's a leap year");
            }
        }
        else{
            System.out.println("It's not a leap year");
        }
    }
}
