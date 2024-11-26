import java.util.Scanner;

public class thirtysix{
    public static void main(String[] args) {
        //Display name of a day based on a number
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day number :");
        int dayNum=sc.nextInt();

        switch(dayNum){
            case 1: System.out.println("Monday");
            break;

            case 2: System.out.println("Tuesday");
            break;

            case 3: System.out.println("Wednesday");
            break;

            case 4: System.out.println("Thrusday");
            break;

            case 5: System.out.println("Friday");
            break;

            case 6: System.out.println("Saturday");
            break;

            case 7: System.out.println("Sunday");
            break;

            default: System.out.println("Oops!! Try Again");
            break;
        }
    }
}