import java.util.*;

public class J19_PracticeQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // if(number < 0){
        //     System.out.println("Number is negative.");
        // }
        // else if (number > 0){
        //     System.out.println("Number is positive.");
        // }
        // else{
        //     System.out.println("Default:0");
        // }


        // int weekDay = sc.nextInt();
        // switch (weekDay){
        //     case 1: System.out.println("Sunday");
        //     break;

        //     case 2: System.out.println("Monday");
        //     break;

        //     case 3: System.out.println("Tuesday");
        //     break;

        //     case 4: System.out.println("Wednesday");
        //     break;

        //     case 5: System.out.println("Thrusday");
        //     break;

        //     case 6: System.out.println("Friday");
        //     break;

        //     case 7: System.out.println("Saturday");
        //     break;

        //     default: System.out.println("Enter the day of the week only.");
        // }


        System.out.print("Enter the Year:");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 400) == 0;

        if(x && (y||z)){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
