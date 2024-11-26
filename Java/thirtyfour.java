import java.util.Scanner;

public class thirtyfour {
    public static void main(String[] args) {
        //Display name of a day based on number
        Scanner sc=new Scanner(System.in);
        int dayNum;
        System.out.println("Enter the day number :");
        dayNum=sc.nextInt();

        if(dayNum==1){
            System.out.println("Monday");
        }
        else if (dayNum==2){
            System.out.println("Tuesday");
        }
        else if(dayNum==3){
            System.out.println("Tuesday");
        }
        else if(dayNum==3){
            System.out.println("Wednesday");
        }
        else if(dayNum==4){
            System.out.println("Thrusday");
        }
        else if(dayNum==5){
            System.out.println("Friday");
        }
        else if(dayNum==6){
            System.out.println("Saturday");
        }
        else if(dayNum==7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("Enter the valid number");
        }
    }
}
