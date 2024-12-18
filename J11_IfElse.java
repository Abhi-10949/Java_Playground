import java.util.*;

public class J11_IfElse {
    public static void main(String args[]){
        System.out.print("Enter the age :");
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        if(age>= 18){
            System.out.println("Adult: vote , drive, etc.");
        }
        if (age >=13 && age <18){
            System.out.println("Teenagers!");
        } 
        else{
            System.out.println("Not adult!");
        }
    }
}
