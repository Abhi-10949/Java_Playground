import java.util.Scanner;
public class thirtyone{
    public static void main(String[] args){

        /*to find the number is odd or even
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();

        if(n%2==0){
            System.out.println("The number is Even");
        }
        else
        System.out.println("The number is odd");*/


        /* int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Age :");
        age=sc.nextInt();
        if(age>=14 && age<=55){
            System.out.println("The person is Young.");
        }
        else if (age>55) {
            System.out.println("The person is Older.");   
        }
        else if (age<14) {
            System.out.println("Either he or she is Boy or Girl.");
        }  */

        //To find grades for the given marks
        float m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of the three subjects:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg=(float)(m1+m2+m3)/3;
        System.out.println("The average is :"+avg);

        if(avg>=70 && avg<=100){
            System.out.println("Grade: A");
        }
        else if(avg>=60 && avg<70){
            System.out.println("Grade: B");
        }
        else if(avg>=50 && avg<=60){
            System.out.println("Grade: C");
        }
        else if(avg<50 && avg>=40){
            System.out.println("Grade: D");
        }
        else{
            if(avg<40){
                System.out.println("Fail");
            }
        }
    }
}