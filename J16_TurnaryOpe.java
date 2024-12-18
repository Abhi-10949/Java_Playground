
import java.util.Scanner;


public class J16_TurnaryOpe {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int a=sc.nextInt();
        // String check = ((a%2)==0)?"Even":"Odd";
        // System.out.println(check);

        int marks = sc.nextInt();
        String grade = (marks >= 33)?"Pass":"Fail";
        System.out.println(grade);
    }
}
