import java.util.*;

public class J6_TypePromotion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // char a= 'a';
        // char b= 'b';
        // System.out.println((int)(a));
        // System.out.println((int)(b));
        // System.out.println(b-a); //type promotion in expression[+,*,-,/].

        //char c= b-a; //this will be possible lossy conversion form int to char.


        // short a = 5; 
        // byte b  = 25;
        // char c = 'c';
        // byte bt = (byte)(a+b+c);  // this will show the lossy conversion from int to byte
        //because java there is the type promotion in the expression.
        // System.out.println(bt); //type casting can be done to get the original value.


        char a='A';
        int b=20;
        float c = 10.25f;
        double d = 20.00d;
        //int result = a+ b+ c+d; //error: possible lossy conversion from double to int

        double result= a+b+c+d;
        System.out.println(result);

    }
}
